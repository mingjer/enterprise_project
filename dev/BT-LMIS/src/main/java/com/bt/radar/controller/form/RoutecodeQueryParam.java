package com.bt.radar.controller.form;
import com.bt.lmis.page.QueryParameter;

public class RoutecodeQueryParam extends QueryParameter {
	
	
	private String transport_name;     //物理服务商名称
	private String orderCondition;
		return transport_name;
	}
	public void setTransport_name(String transport_name) {
		this.transport_name = transport_name;
	}
	public String getId() {
	public String getOrderCondition() {
		return orderCondition;
	}
	public void setOrderCondition(String orderCondition) {
		this.orderCondition = orderCondition;
	}
	
}