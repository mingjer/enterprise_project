package com.bt.orderPlatform.controller.form;

import java.util.Date;


import com.bt.orderPlatform.page.QueryParameter;

public class WaybilMasterDetailQueryParam extends QueryParameter{
	
	
	private String remark;			//序列号
	private String view_area_address;			//序列号
	private String view_area_fromaddress;			//序列号
	private Date print_time;
	private String amount_flag;
	private String sendcode;
	private String is_docall;
	private Integer new_source;
	private  String custid;   //月结卡号
	private  String pay_path;   //支付方式
	private  String cost_center;   //成本中心
	private  java.math.BigDecimal insured;   //
	private  String store_code;   //店铺code
	public java.math.BigDecimal getInsured() {
		return insured;
	}
	public void setInsured(java.math.BigDecimal insured) {
		this.insured = insured;
	}
	public String getStore_code() {
		return store_code;
	}
	public void setStore_code(String store_code) {
		this.store_code = store_code;
	}
	public String getPay_path() {
		return pay_path;
	}
	public void setPay_path(String pay_path) {
		this.pay_path = pay_path;
	}
	public String getCost_center() {
		return cost_center;
	}
	public void setCost_center(String cost_center) {
		this.cost_center = cost_center;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public Integer getNew_source() {
		return new_source;
	}
	public void setNew_source(Integer new_source) {
		this.new_source = new_source;
	}
	public String getIs_docall() {
		return is_docall;
	}
	public void setIs_docall(String is_docall) {
		this.is_docall = is_docall;
	}
	public String getSendcode() {
		return sendcode;
	}
	public void setSendcode(String sendcode) {
		this.sendcode = sendcode;
	}
	public String getAmount_flag() {
		return amount_flag;
	}
	public void setAmount_flag(String amount_flag) {
		this.amount_flag = amount_flag;
	}
	public Date getPrint_time() {
		return print_time;
	}
	public void setPrint_time(Date print_time) {
		this.print_time = print_time;
	}
	public String getView_area_fromaddress() {
		return view_area_fromaddress;
	}
	public void setView_area_fromaddress(String view_area_fromaddress) {
		this.view_area_fromaddress = view_area_fromaddress;
	}
	public String getView_area_address() {
		return view_area_address;
	}
	public void setView_area_address(String view_area_address) {
		this.view_area_address = view_area_address;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getBat_id() {
		return bat_id;
	}
	public String getId() {
		this.bat_id = bat_id;
	}
	public String getDescribes() {
	
}