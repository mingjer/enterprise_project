package com.bt.orderPlatform.model;

import java.math.BigDecimal;

/**
* @ClassName: WaybilDetail
* @Description: TODO(WaybilDetail)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class WaybilDetail {
	
	
	private String serial_number;			//金额
	private String describe;			//描述
	
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getId() {
		
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public void setSku_code(String sku_code) {
}