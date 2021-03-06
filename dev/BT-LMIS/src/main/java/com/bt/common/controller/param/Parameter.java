package com.bt.common.controller.param;

import java.util.Map;

import com.bt.lmis.model.Employee;
import com.bt.lmis.page.QueryParameter;
import com.bt.utils.BaseConst;

/** 
 * @ClassName: Parameter
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ian.Huang
 * @date 2017年5月23日 下午2:15:50 
 * 
 */
public class Parameter extends QueryParameter {
	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */
	private static final long serialVersionUID = -7266163690075230243L;
	// 当前账号
	private Employee currentAccount;
	// 参数内容
	private Map<String, Object> param;
	public Parameter() {};
	public Parameter(Employee currentAccount, Map<String, Object> param) {
		this.currentAccount = currentAccount;
		//page pageSize赋值
		this.setPage(
		param.get("page")==null?0:Integer.parseInt(param.get("page").toString()));
		this.setPageSize(param.get("page")==null? BaseConst.pageSize : Integer.parseInt(param.get("pageSize").toString()));
		this.param = param;
		
	}
	public Employee getCurrentAccount() {
		return currentAccount;
	}
	public void setCurrentAccount(Employee currentAccount) {
		this.currentAccount = currentAccount;
	}
	public Map<String, Object> getParam() {
		return param;
	}
	public void setParam(Map<String, Object> param) {
		this.param = param;
	}
	
}