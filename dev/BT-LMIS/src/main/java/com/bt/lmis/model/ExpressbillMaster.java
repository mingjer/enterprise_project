package com.bt.lmis.model;

/**
* @ClassName: ExpressbillMaster
* @Description: TODO(ExpressbillMaster)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class ExpressbillMaster {
	
	
	private String express_name;
	private String contract_name;
	private String bf_flag;        //备份标识作业
	private String bf_reason;      //备份标识作业失败原因
	
		return bf_flag;
	}
	public void setBf_flag(String bf_flag) {
		this.bf_flag = bf_flag;
	}
	public String getBf_reason() {
		return bf_reason;
	}
	public void setBf_reason(String bf_reason) {
		this.bf_reason = bf_reason;
	}
	public String getExpress_name() {
		return express_name;
	}
	public void setExpress_name(String express_name) {
		this.express_name = express_name;
	}
	public String getContract_name() {
		return contract_name;
	}
	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}
	public Integer getId() {
		return con_id;
	}
	public void setCon_id(Integer con_id) {
		this.con_id = con_id;
	}
	public String getBillingCycle() {
}