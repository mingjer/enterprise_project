package com.bt.radar.controller.form;
import com.bt.lmis.page.QueryParameter;

public class ExpressinfoMasterQueryParam extends QueryParameter {
	
	
	private String status;			//运单状态
	private String warning_category;
	private String initial_level;
	private String  warining_status;
	private String start_time;
	private String end_time;
	private String del_flag;
	private String ebc_timestart;
	private String ebc_timeend;
	private String r_timestart;
	private String r_timeend;
	private String sr_timestart;
	private String sr_timeend;
	private String physical_warehouse_code;
	private String delivery_failure_reason;
	private java.util.Date delivery_failure_time;
	private String new_waybill;
	private String delivery_failure_start_time;
	public String getDelivery_failure_start_time() {
		return delivery_failure_start_time;
	}
	public void setDelivery_failure_start_time(String delivery_failure_start_time) {
		this.delivery_failure_start_time = delivery_failure_start_time;
	}
	public String getDelivery_failure_end_time() {
		return delivery_failure_end_time;
	}
	public void setDelivery_failure_end_time(String delivery_failure_end_time) {
		this.delivery_failure_end_time = delivery_failure_end_time;
	}
	private String delivery_failure_end_time;
	public String getPhysical_warehouse_code() {
		return physical_warehouse_code;
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
	public void setPhysical_warehouse_code(String physical_warehouse_code) {
		this.physical_warehouse_code = physical_warehouse_code;
	}
	public String getDel_flag() {
		return del_flag;
	}
	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getWarining_status() {
		return warining_status;
	}
	public void setWarining_status(String warining_status) {
		this.warining_status = warining_status;
	}
	public String getWarning_category() {
		return warning_category;
	}
	public String getInitial_level() {
		return initial_level;
	}
	public void setInitial_level(String initial_level) {
		this.initial_level = initial_level;
	}
	public void setWarning_category(String warning_category) {
		this.warning_category = warning_category;
	}
	public String getId() {
		return warntype_code;
	}
	public void setWarntype_code(String warntype_code) {
		this.warntype_code = warntype_code;
	}
	public void setId(String id) {
	public String getEbc_timestart() {
		return ebc_timestart;
	}
	public void setEbc_timestart(String ebc_timestart) {
		this.ebc_timestart = ebc_timestart;
	}
	public String getEbc_timeend() {
		return ebc_timeend;
	}
	public void setEbc_timeend(String ebc_timeend) {
		this.ebc_timeend = ebc_timeend;
	}
	public String getR_timestart() {
		return r_timestart;
	}
	public void setR_timestart(String r_timestart) {
		this.r_timestart = r_timestart;
	}
	public String getR_timeend() {
		return r_timeend;
	}
	public void setR_timeend(String r_timeend) {
		this.r_timeend = r_timeend;
	}
	public String getSr_timestart() {
		return sr_timestart;
	}
	public void setSr_timestart(String sr_timestart) {
		this.sr_timestart = sr_timestart;
	}
	public String getSr_timeend() {
		return sr_timeend;
	}
	public void setSr_timeend(String sr_timeend) {
		this.sr_timeend = sr_timeend;
	}
	
}