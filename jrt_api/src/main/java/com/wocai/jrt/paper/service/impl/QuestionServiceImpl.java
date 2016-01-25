package com.wocai.jrt.paper.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.paper.bean.QuestionDetailBean;
import com.wocai.jrt.paper.dao.QuestionDao;
import com.wocai.jrt.paper.model.Answer;
import com.wocai.jrt.paper.model.Options;
import com.wocai.jrt.paper.model.Paper;
import com.wocai.jrt.paper.model.Question;
import com.wocai.jrt.paper.model.QuestionBean;
import com.wocai.jrt.paper.service.spi.AnswerService;
import com.wocai.jrt.paper.service.spi.OptionsService;
import com.wocai.jrt.paper.service.spi.PaperService;
import com.wocai.jrt.paper.service.spi.QuestionService;

/**
 * 题库题目相关的service业务实现。
 * @author yinlei
 * @date 2015-11-9 16:40:03
 */
@Named
public class QuestionServiceImpl extends MyBatisServiceImpl<Question, QuestionBean, String> implements QuestionService {
	// 添加了方法后，记得改为private
	protected QuestionDao questionDao;
	@Inject
	private AnswerService answerServiceImpl;
	@Inject
	private InvestorService investorServiceImpl;
	@Inject
	private PaperService paperServiceImpl;
	@Inject
	private OptionsService optionsServiceImpl;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Question, QuestionBean, String> questionDao) {
		this.baseDao = questionDao;
		this.questionDao = (QuestionDao) questionDao;
	}

	@Override
	public Map<String, Object> getEvulaDetail(String id) {
		Map<String, Object> maps = new HashMap<String, Object>();
		Answer answer = new Answer();
		answer.setInvestorId(id);
		List<Answer> ansList = answerServiceImpl.pagedList(answer);
		Map<String, Answer> ansMaps = new HashMap<String, Answer>();
		for (Answer ans : ansList) {
			ansMaps.put(ans.getQuestionId(), ans);
		}
		Investor investor = investorServiceImpl.get(id);
		if (ansList.size() > 0) {
			Paper p = new Paper();
			p = paperServiceImpl.get(ansList.get(0).getPaperId());
			// 获取试题列表
			Question ques = new Question();
			ques.setPaperId(ansList.get(0).getPaperId());
			ques.setOrderBy("no asc");
			List<Question> quesList = questionDao.pagedList(ques);
			List<QuestionDetailBean> quesDetailList = new ArrayList<QuestionDetailBean>();
			for (Question question : quesList) {
				QuestionDetailBean tempBean = new QuestionDetailBean();
				Answer tempAns = ansMaps.get(question.getId());
				String ansStr = "";
				if(tempAns !=null && tempAns.getAnswerOption() != null){
					ansStr = tempAns.getAnswerOption();
				}
				question.setAnswer(ansStr);
				tempBean.setQuestion(question);
				Options opt = new Options();
				opt.setQuestionId(question.getId());
				opt.setOrderBy("no asc");
				List<Options> optList = optionsServiceImpl.pagedList(opt);
				for (Options options : optList) {
					tempBean.addOptions(options);
				}
				quesDetailList.add(tempBean);
			}
			maps.put("quesDetailList", quesDetailList);
			maps.put("paperName", p);
			maps.put("investor", investor);
		}
		return maps;
	}
}
