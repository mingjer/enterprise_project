package com.bt.lmis.model;

/**
* @ClassName: NvitationRealuseanmountData
* @Description: TODO(NvitationRealuseanmountData)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class NvitationRealuseanmountData {
	
	
	private String store_name;			//店铺名称
	private String epistatic_order;		//前置单据号
	private String express_number;		//运单号
	private String end_time;
	
	private String warehouse_code;
	private String warehouse_name;
	private String park_code;
	private String park_name;
	private String park_cost_center;
	
	private Integer firstResult;
	private Integer maxResult;
	
	public Integer getId() {
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
	public String getExpress_number() {
		return express_number;
	}
	public void setExpress_number(String express_number) {
		this.express_number = express_number;
	}
	public String getEpistatic_order() {
		return epistatic_order;
	}
	public void setEpistatic_order(String epistatic_order) {
		this.epistatic_order = epistatic_order;
	}
	public Integer getFirstResult() {
		return firstResult;
	}
	public void setFirstResult(Integer firstResult) {
		this.firstResult = firstResult;
	}
	public Integer getMaxResult() {
		return maxResult;
	}
	public void setMaxResult(Integer maxResult) {
		this.maxResult = maxResult;
	}
	public String getWarehouse_code() {
		return warehouse_code;
	}
	public void setWarehouse_code(String warehouse_code) {
		this.warehouse_code = warehouse_code;
	}
	public String getWarehouse_name() {
		return warehouse_name;
	}
	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}
	public String getPark_code() {
		return park_code;
	}
	public void setPark_code(String park_code) {
		this.park_code = park_code;
	}
	public String getPark_name() {
		return park_name;
	}
	public void setPark_name(String park_name) {
		this.park_name = park_name;
	}
	public String getPark_cost_center() {
		return park_cost_center;
	}
	public void setPark_cost_center(String park_cost_center) {
		this.park_cost_center = park_cost_center;
	}
}