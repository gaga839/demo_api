package com.wocai.jrt.investor.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.vteba.tx.jdbc.sequence.HexademicalKeyGenerator;
import com.vteba.utils.id.ObjectId;
import com.vteba.web.action.JsonBean;
import com.wocai.jrt.employee.bean.GetMyGroupBean;
import com.wocai.jrt.investor.bean.InvestorCountBean;
import com.wocai.jrt.investor.bean.InvestorReqBean;
import com.wocai.jrt.investor.bean.InvestorResBean;
import com.wocai.jrt.investor.dao.InvestorDao;
import com.wocai.jrt.investor.model.Investor;
import com.wocai.jrt.investor.model.InvestorBean;
import com.wocai.jrt.investor.service.spi.InvestorService;
import com.wocai.jrt.orders.bean.SortClass;
import com.wocai.jrt.utils.IDCardUtil;
import com.wocai.jrt.utils.ImgType;
import com.wocai.jrt.utils.MyFileUtils;

/**
 * 投资人相关的service业务实现。
 * 
 * @author zhangyz
 * @date 2015-7-24 17:10:45
 */
@Named
public class InvestorServiceImpl extends MyBatisServiceImpl<Investor, InvestorBean, String>
		implements InvestorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(InvestorServiceImpl.class);
	
	private InvestorDao investorDao;
	
	private static final Pattern IMAGE = Pattern.compile("^(.*)+.(jpg|jpeg|gif|png|bmp)$");
	
	private static String[] stringArray = {"身份证","护照","港澳通行证","军官证","台胞证"};
	
	private static final List<String> tempList = Arrays.asList(stringArray);
	@Inject
	private HexademicalKeyGenerator hexademicalKeyGenerator;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<Investor, InvestorBean, String> investorDao) {
		this.baseDao = investorDao;
		this.investorDao = (InvestorDao) investorDao;
	}

	/**
	 * 根据投资人(姓名、身份证、手机号)、在指定注册时间内来查询客户列表信息
	 * 
	 * @param InvestorReqBean
	 * @return List<InvestorResBean>
	 */
	@Override
	public List<InvestorResBean> factor(InvestorReqBean investorReqBean) {
		List<InvestorResBean> investorslList = investorDao.factor(investorReqBean);
		return investorslList;
	}

	/**
	 * 根据投资人id逻辑删除投资人
	 * 
	 * @param employeeId
	 *            员工id
	 * @return 1 成功 0 失败
	 */
	@Override
	public int deleteLogic(String id) {
		int i = investorDao.deleteLogic(id);
		return i;
	}

	/**
	 * 根据员工id查询其所有客户列表信息
	 * 
	 * @param InvestorReqBean
	 * @return List<InvestorResBean>
	 */
	@Override
	public List<InvestorResBean> queryList(InvestorReqBean investorReqBean) {
		List<InvestorResBean> investorslList = investorDao.queryList(investorReqBean);
		return investorslList;
	}

	/**
	 * 根据员工id统计该员工下所有投资人信息
	 * 
	 * @param InvestorReqBean
	 * @return JsonBean
	 */
	@Override
	public List<InvestorCountBean> count(InvestorReqBean investorReqBean) {
		List<InvestorResBean> investorslList = investorDao.queryList(investorReqBean);
		Map<String, Integer> map = new HashMap<String, Integer>();
		String dateString = "";
		List<InvestorCountBean> list = new ArrayList<InvestorCountBean>();
		try {
			SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
			for (int i = 0; i < investorslList.size(); i++) {
				Date regist = investorslList.get(i).getRegisterTime();
				if(regist != null){
					dateString = sdFormat.format(regist);
					if (map.containsKey(dateString)) {
						map.put(dateString, 1 + map.get(dateString));
					} else {
						map.put(dateString, 1);
					}
				}
			}
			Iterator<?> it = map.entrySet().iterator();
			while (it.hasNext()) {
				InvestorCountBean bean = new InvestorCountBean();
				Entry<?, ?> entry = (Entry<?, ?>) it.next();
				bean.setCount(Integer.parseInt(entry.getValue().toString()));
				bean.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(entry.getKey().toString()));
				list.add(bean);
			}
			//客户数量统计List按时间升序排列
			Collections.sort(list, new SortClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 查询团队长下所有下级员工的客户信息
	 * 
	 * @param InvestorReqBean
	 * @return List<investorslList>
	 */
	@Override
	public List<InvestorResBean> leader(InvestorReqBean investorReqBean) {
		List<InvestorResBean> investorslList = investorDao.leader(investorReqBean);
		return investorslList;
	}

	@Override
	public List<Investor> getMyGroupInvestor(GetMyGroupBean getMyGroupBean) {
		return investorDao.getMyGroupInvestor(getMyGroupBean);
	}

	/**
	 * 根据投资人id查询投资人详情页信息
	 * 
	 * @author zhangyz
	 * @param InvestorReqBean
	 *            investorReqBean
	 * @return JsonBean
	 */
	@Override
	public InvestorResBean getDeatilPageInfo(InvestorReqBean investorReqBean) {
		InvestorResBean bean = investorDao.getDeatilPageInfo(investorReqBean);
		return bean;
	}

	/**
	 * 根据投资人id查询投资人所有详情信息
	 * 
	 * @author zhangyz
	 * @param InvestorReqBean
	 *            investorReqBean
	 * @return Investor
	 */
	@Override
	public List<Investor> getDeatilInfo(InvestorReqBean investorReqBean) {
		return investorDao.getDeatilInfo(investorReqBean);
	}

	@Override
	public List<InvestorResBean> fecthList(InvestorReqBean investorReqBean) {
		return investorDao.fecthList(investorReqBean);
	}
	
	/**
	 * 新增投资人
	 * @param Investor model
	 * @return JsonBean
	 * @ps： 头像文件放在 avatarFile字段中
	 */
	@Override
	public JsonBean doAddInvestor(Investor model){
		String idString = ObjectId.get().toString();
		model.setId(idString);
		model.setDeleted(false);
		model.setRegisterTime(new Date());
		model.setInvitationCode(hexademicalKeyGenerator.next());
		JsonBean bean = new JsonBean();
		try {
			if (StringUtils.isBlank(model.getOrgId())) {
				bean.setCode(0);
				bean.setMessage("机构id不能为空");
				return bean;
			}
			if (StringUtils.isBlank(model.getEmployeeId())) {
				bean.setCode(0);
				bean.setMessage("员工id不能为空");
				return bean;
			}
			if (StringUtils.isBlank(model.getName())) {
				bean.setCode(0);
				bean.setMessage("投资人姓名不能为空");
				return bean;
			}
			String mobile = model.getMobile();
			if (StringUtils.isBlank(mobile)) {
				bean.setCode(0);
				bean.setMessage("用户联系电话不能为空");
				return bean;
			}
			if (!Pattern.compile("^[1][3,4,5,8][0-9]{9}$").matcher(mobile).matches()
					&& !Pattern.compile("[0]{1}[0-9]{2,3}[0-9]{7,8}$").matcher(mobile).matches()) {
				bean.setCode(0);
				bean.setMessage("联系电话输入有误！");
				return bean;
			}
			if (null != model.getMobile() && this.isMobile(model.getMobile(), model.getOrgId())) {
				bean.setCode(0);
				bean.setMessage("该联系电话已被注册");
				return bean;
			}
			if (StringUtils.isBlank(model.getName())) {
				bean.setCode(0);
				bean.setMessage("用户名不能为空");
				return bean;
			}
			if(StringUtils.isBlank(model.getIdType()) && !StringUtils.isBlank(model.getIdcard())){
				bean.setCode(0);
				bean.setMessage("请选择您的证件类型");
				return bean;
			}
			if( null != model.getIdType() && !tempList.contains(model.getIdType())){
				bean.setCode(0);
				bean.setMessage("证件类型错误.");
				return bean;
			}
			if (null != model.getIdcard() && this.isIdcard(model.getIdcard(), model.getOrgId())) {
				bean.setCode(0);
				bean.setMessage("该证件号码已被注册");
				return bean;
			}
			if (null != model.getIdcard() && "身份证".equals(model.getIdType()) && !IDCardUtil.IDCardValidate(model.getIdcard())) {
				bean.setCode(0);
				bean.setMessage("身份证号码信息输入有误,请检查.");
				return bean;
			}
			// 判断文件大小
			MultipartFile file = model.getAvatarFile();
			if (file != null) {
				if (file.getSize() > (1024 * 1024 * 1024 * 2L)) {
					bean.setCode(0);
					bean.setMessage("头像文件不能大于2M！");
					return bean;
				}
				String fileName = file.getOriginalFilename().toLowerCase();

				// 正则判断图片
				if (!IMAGE.matcher(fileName).matches()) {
					bean.setCode(0);
					bean.setMessage("头像文件格式不正确");
					return bean;
				}
				LOGGER.info("request avatar file upload, filename=[{}]", file.getOriginalFilename());
				// 上传头像
				String filePath = MyFileUtils.uploadImg(file, ImgType.values()[0]);
				model.setAvatar(filePath);
			}
			int result = this.save(model);
			model.setAvatarFile(null);
			LOGGER.info("request investor save,param=[{}]", JSON.toJSONString(model.getMobile()));
			if (result == 1) {
				bean.setCode(1);
				bean.setMessage("新增投资人成功.");
				bean.setData(idString);//投资人id信息返回
			} else {
				bean.setCode(0);
				bean.setMessage("新增投资人失败.");
			}
			return bean;
		} catch (Exception e) {
			LOGGER.error("user add error,msg=[{}].", e.getMessage());
			bean.setCode(0);
			bean.setMessage("新增投资人失败");
			return bean;
		}
	}
	
	/**
	 * 检查当前机构下投资人身份证信息是否已注册
	 * 
	 * @param userNickname
	 * @return
	 */
	private boolean isIdcard(String idcard, String orgId) {
		Investor vestor = new Investor();
		vestor.setOrgId(orgId);
		vestor.setIdcard(idcard);
		LOGGER.info("check investor idcard,param=[{}]", JSON.toJSONString(idcard + ";" + orgId));
		List<Investor> investor = this.pagedList(vestor);
		if (investor.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 检查当前机构下投资人联系电话信息是否已注册
	 * 
	 * @param userNickname
	 * @return
	 */
	private boolean isMobile(String mobile, String orgId) {
		Investor vestor = new Investor();
		vestor.setOrgId(orgId);
		vestor.setMobile(mobile);
		LOGGER.info("check investor mobile,param=[{}]", JSON.toJSONString(mobile + ";" + orgId));
		List<Investor> investor = this.pagedList(vestor);
		if (investor.size() > 0) {
			return true;
		} else {
			return false;
		}
	}
}
