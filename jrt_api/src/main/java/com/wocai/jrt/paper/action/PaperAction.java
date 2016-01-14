package com.wocai.jrt.paper.action;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.vteba.utils.common.PropUtils;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.impl.InvestorServiceImpl;
import com.wocai.jrt.paper.bean.AnswerBean;
import com.wocai.jrt.paper.bean.AnswerReqBean;
import com.wocai.jrt.paper.bean.AnswerResBean;
import com.wocai.jrt.paper.bean.PaperDetailBean;
import com.wocai.jrt.paper.bean.QuesDetailBean;
import com.wocai.jrt.paper.bean.TestSignReqBean;
import com.wocai.jrt.paper.model.Answer;
import com.wocai.jrt.paper.model.Options;
import com.wocai.jrt.paper.model.Paper;
import com.wocai.jrt.paper.model.Question;
import com.wocai.jrt.paper.service.impl.AnswerServiceImpl;
import com.wocai.jrt.paper.service.spi.OptionsService;
import com.wocai.jrt.paper.service.spi.PaperService;
import com.wocai.jrt.paper.service.spi.QuestionService;
import com.wocai.jrt.utils.ImgType;
import com.wocai.jrt.utils.MyFileUtils;

/**
 * 测评试卷控制器
 * 
 * @author yinlei
 * @date 2015-11-9 16:40:03
 */
@Controller
@RequestMapping("/paper")
public class PaperAction extends GenericAction<Paper> {
	private static final Logger LOGGER = LoggerFactory.getLogger(PaperAction.class);
	@Inject
	private PaperService paperServiceImpl;
	@Inject
	private OptionsService optionsServiceImpl;
	@Inject
	private QuestionService questionServiceImpl;
	@Inject
	private InvestorServiceImpl investorServiceImpl;
	@Inject
	private AnswerServiceImpl answerServiceImpl;
	
	private static final Pattern IMAGE = Pattern.compile("^(.*)+.(jpg|jpeg|gif|png|bmp)$");
	
	public static final String IMAGES_URL = PropUtils.get("images.url");
	
	/**
	 * 获得测评试卷List，Json格式。
	 * 
	 * @param model
	 *            参数
	 * @return 测评试卷List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public JsonBean list(Paper model) {
		JsonBean bean = new JsonBean();
		String paperId = model.getId();
		String orgId = model.getOrgId();
		try {
			if (StringUtils.isBlank(orgId)) {
				bean.setCode(0);
				bean.setMessage("机构id不能为空");
				return bean;
			}
			if (StringUtils.isBlank(paperId)) {
				bean.setCode(0);
				bean.setMessage("投资人id不能为空");
				return bean;
			}
			Paper paper = new Paper();
			paper.setOrgId(orgId);
			paper.setCurrent(true);
			List<Paper> paperList = paperServiceImpl.pagedList(paper);
			if (paperList.size() == 0) {
				bean.setCode(2);
				bean.setMessage("当前机构暂未设置测评试卷.");
				return bean;
			}
			if (paperList.size() > 1) {
				bean.setCode(0);
				bean.setMessage("获取机构测评试卷出错");
				return bean;
			}
			// 获取试题列表
			Question ques = new Question();
			ques.setPaperId(paperList.get(0).getId());
			ques.setOrderBy("no asc");
			List<Question> quesList = questionServiceImpl.pagedList(ques);
			List<QuesDetailBean> quesDetailList = new ArrayList<QuesDetailBean>();
			for (Question question : quesList) {
				QuesDetailBean tempBean = new QuesDetailBean();
				tempBean.setId(question.getId());
				tempBean.setNo(question.getNo());
				tempBean.setOptions(question.getOptions());
				tempBean.setTitle(question.getTitle());
				Options opt = new Options();
				opt.setOrderBy("no asc");
				opt.setQuestionId(question.getId());
				List<Options> optList = optionsServiceImpl.pagedList(opt);
				for (Options options : optList) {
					tempBean.addOptions(options);
				}
				quesDetailList.add(tempBean);
			}
			PaperDetailBean paperDetail = new PaperDetailBean();
			paperDetail.setId(paperList.get(0).getId());
			paperDetail.setOrgId(orgId);
			paperDetail.setQuestionList(quesDetailList);
			paperDetail.setTitle(paperList.get(0).getTitle());
			bean.setCode(1);
			bean.setData(paperDetail);
			bean.setMessage("获取机构测评试卷成功.");
		} catch (Exception e) {
			bean.setCode(0);
			bean.setMessage("获取机构测评试卷出错.");
			LOGGER.error("get paper  error, errorMsg=[{}].", e.getMessage());
		}
		return bean;
	}

	/**
	 * 风险测评提交
	 * @param TestSignReqBean
	 */
	@ResponseBody
	@RequestMapping("/submit")
	public JsonBean submit(@RequestBody AnswerReqBean model) {
		JsonBean bean = new JsonBean();
		try {
			if (StringUtils.isBlank(model.getOrgId()) || StringUtils.isBlank(model.getId())
					|| StringUtils.isBlank(model.getPaperId())) {
				bean.setCode(0);
				bean.setMessage("参数异常.");
				return bean;
			}
			if (model.getAnswerList().size() == 0) {
				bean.setCode(0);
				bean.setMessage("答案不能为空.");
				return bean;
			}
			AnswerResBean aResBean = new AnswerResBean();
			aResBean.setFlag(1);
			aResBean.setScore(0);
			List<AnswerBean> answerBeanList = model.getAnswerList();
			List<Answer> answerList = new ArrayList<Answer>();
			String paperId = model.getPaperId();
			String orgId  = model.getOrgId();
			String investorId = model.getId();
			Paper p = paperServiceImpl.get(paperId);
			Question ques = new Question();
			ques.setPaperId(paperId);
			ques.setOrderBy("no asc");
			for (AnswerBean answer : answerBeanList) {
				Answer ans = new Answer();
				ans.setId(ObjectId.get().toString());
				ans.setInvestorId(investorId);
				ans.setOrgId(orgId);
				ans.setQuestionId(answer.getQuestionId());
				ans.setPaperId(paperId);
				StringBuilder strs = new StringBuilder();
				List <String> strList = answer.getOptionsList();
				for (int i = 0; i <strList.size(); i++) {
					strs.append(strList.get(i).toUpperCase());
				}
				ans.setAnswerOption(strs.toString());
				ans.setScore(0);
				// 获取该试题所有选项
				Options optReq = new Options();
				optReq.setQuestionId(answer.getQuestionId());
				List<Options> options = optionsServiceImpl.pagedList(optReq);
				//把所有选项按照选项次序保存到map中
				Map<String, Options> maps = new HashMap<String, Options>();
				for (Options opt : options) {
					maps.put(opt.getNo(), opt);
				}
				List<String> optionsList = answer.getOptionsList();
				for (String str : optionsList) {
					Options optTem = maps.get(str.toUpperCase());
					if(optTem != null){
						int tempScore = aResBean.getScore()+optTem.getScore();
						aResBean.setScore(tempScore);
						ans.setScore(tempScore);
						if (optTem.getUnqualified()) {
							aResBean.setFlag(0);
							aResBean.setScore(0);
							ans.setScore(0);
							break;
						}
					}
				}
				if(aResBean.getFlag() == 0){
					aResBean.setScore(0);
				}
				//添加该题得分情况到答案列表中
				answerList.add(ans);
			}
			if(aResBean.getScore()< Integer.parseInt(p.getQualified())){
				aResBean.setFlag(0);
			}
			Investor investor = new Investor();
			investor.setId(model.getId());
			investor.setScore(aResBean.getScore());
			investor.setEvaluationTime(new Date());
			investor.setSignImage("");
			investor.setRiskPass(false);
			investor.setEvaluaState(3);
			if (aResBean.getFlag() == 1) {
				bean.setData(aResBean);
				bean.setMessage("恭喜你通过风险测评");
				bean.setCode(1);
			} else {
				bean.setData(aResBean);
				bean.setMessage("你的风险测评未通过");
				investor.setRiskPass(false);
				investor.setEvaluaState(2);
				bean.setCode(1);
			}
			//更新投资人测评通过状态
			int result = investorServiceImpl.updateById(investor);
			if(result != 1){
				bean.setMessage("风险测评结果保存失败.");
				bean.setCode(0);
			}
			//删除投资人当前测评答案
			Answer answer = new Answer();
			answer.setInvestorId(investorId);
			answerServiceImpl.deleteBulks(answer);
			//保存投资人本次测评答案
			for (Answer anss : answerList) {
				answerServiceImpl.save(anss);
			}
		} catch (Exception e) {
			LOGGER.error("submit riskEvalution result error, errorMsg=[{}].", e.getMessage());
			bean.setCode(0);
			bean.setMessage("风险测评出错.");
		}
		return bean;
	}

	/**
	 * 上传测评签名
	 * @param TestSignReqBean
	 */
	@ResponseBody
	@RequestMapping("/uploadTestSign")
	public JsonBean uploadTestSign(TestSignReqBean model) {
		JsonBean bean = new JsonBean();
		try {
			if (StringUtils.isBlank(model.getOrgId()) || StringUtils.isBlank(model.getId()) || StringUtils.isBlank(model.getPaperId()) ||model.getSignImage() == null) {
				bean.setCode(0);
				bean.setMessage("参数异常.");
				return bean;
			}
			Paper p = paperServiceImpl.get(model.getPaperId());
			Investor i = investorServiceImpl.get(model.getId());
			// 判断文件大小
			MultipartFile file = model.getSignImage();
			if (file != null) {
				if (file.getSize() > (1024 * 1024 * 1024 * 2L)) {
					bean.setCode(0);
					bean.setMessage("测评签名文件不能大于2M！");
					return bean;
				}
				String fileName = file.getOriginalFilename().toLowerCase();
				// 正则判断图片
				if (!IMAGE.matcher(fileName).matches()) {
					bean.setCode(0);
					bean.setMessage("测评签名文件格式不正确");
					return bean;
				}
				LOGGER.info("request uploadTestSign file upload, filename=[{}]",
						file.getOriginalFilename());
				// 上传测评签名文件
				String oldPath = investorServiceImpl.get(model.getId()).getSignImage();
				String filePath = MyFileUtils.uploadImg(file, ImgType.values()[0]);
				Investor investor = new Investor();
				investor.setId(model.getId());
				investor.setSignImage(filePath);
				Integer score = i.getScore();
				//上传测评通过
				if(score >= Integer.parseInt(p.getQualified())){
					investor.setRiskPass(true);
					investor.setEvaluaState(1);
				}else{
					investor.setRiskPass(false);
					investor.setEvaluaState(2);
				}
				investorServiceImpl.updateById(investor);
				// 删除旧测评签名文件
				if (null != oldPath && !StringUtils.isBlank(oldPath)) {
					oldPath = IMAGES_URL + oldPath;
					File files = new File(oldPath);
					MyFileUtils.deleteFileDir(files);
					if (null != file) {
						files.delete();
					}
				}
				bean.setCode(1);
				bean.setMessage("上传测评签名文件成功.");
			}else{
				bean.setCode(0);
				bean.setMessage("上传测评签名文件不能为空.");
			}
		} catch (Exception e) {
			LOGGER.error("uploadTestSign for Test, errorMsg=[{}].", e.getMessage());
			bean.setCode(0);
			bean.setMessage("上传测评签名文件出错.");
		}
		return bean;
	}

}
