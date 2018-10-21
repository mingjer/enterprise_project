package com.bt.radar.model;

import java.math.BigDecimal;

/**
* @ClassName: ExpressinfoMaster
* @Description: TODO(ExpressinfoMaster)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class ExpressinfoMaster {
	
	
	private String transport_name;
	private String product_type_name;
	private String store_name;
	private String warehouse_name;
	private String warningtype_name;
	private String del_flag;
	private String express_name;
	private String producttype_name;
	private String systemwh_name;
	private BigDecimal order_amount;
	private String related_number;
	private String bat_id;
	private String delivery_failure_reason;
	private java.util.Date delivery_failure_time;
	private String new_waybill;
	public String getBat_id() {
		return bat_id;
	}
	public void setBat_id(String bat_id) {
		this.bat_id = bat_id;
	}
	public String getExpress_name() {
		return express_name;
	}
	public void setExpress_name(String express_name) {
		this.express_name = express_name;
	}
	public String getProducttype_name() {
		return producttype_name;
	}
	public void setProducttype_name(String producttype_name) {
		this.producttype_name = producttype_name;
	}
	public String getSystemwh_name() {
		return systemwh_name;
	}
	public void setSystemwh_name(String systemwh_name) {
		this.systemwh_name = systemwh_name;
	}
	public String getDel_flag() {
		return del_flag;
	}
	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}
	public String getWarningtype_name() {
		return warningtype_name;
	}
	public void setWarningtype_name(String warningtype_name) {
		this.warningtype_name = warningtype_name;
	}
	public String getTransport_name() {
		return transport_name;
	}
	public void setTransport_name(String transport_name) {
		this.transport_name = transport_name;
	}
	public String getProduct_type_name() {
		return product_type_name;
	}
	public void setProduct_type_name(String product_type_name) {
		this.product_type_name = product_type_name;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getWarehouse_name() {
		return warehouse_name;
	}
	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}
	public String getProvice_name() {
		return provice_name;
	}
	public void setProvice_name(String provice_name) {
		this.provice_name = provice_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	private String provice_name;
	private String city_name;
	private String state_name;
	private String street_name;
	public String getHid() {
		return hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}
	public String getId(){
	public BigDecimal getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(BigDecimal order_amount) {
		this.order_amount = order_amount;
	}
	public String getRelated_number() {
		return related_number;
	}
	public void setRelated_number(String related_number) {
		this.related_number = related_number;
	}
	public String getDelivery_failure_reason() {
		return delivery_failure_reason;
	}
	public void setDelivery_failure_reason(String delivery_failure_reason) {
		this.delivery_failure_reason = delivery_failure_reason;
	}
	public java.util.Date getDelivery_failure_time() {
		return delivery_failure_time;
	}
	public void setDelivery_failure_time(java.util.Date delivery_failure_time) {
		this.delivery_failure_time = delivery_failure_time;
	}
	public String getNew_waybill() {
		return new_waybill;
	}
	public void setNew_waybill(String new_waybill) {
		this.new_waybill = new_waybill;
	}
}