package com.bt.lmis.balance.model;

import java.math.BigDecimal;

import com.bt.lmis.model.PerationfeeData;

/**
* @ClassName: OperationfeeDataDetail
* 对应表tb_operationfee_data_detail
* @Description: TODO(OperationfeeDataDetail)
* @author jindong.lin
*
*/
public class OperationfeeDataDetail {
	
	
	private Integer op_id;			//tb_operationfee_data表id主键
	private Integer bat_id;
	private Integer sku_count;
    private String start_time;
    private String end_time;
    private BigDecimal expenses;		//费用明细
    private String type;				//对应原始数据结算类型
    
    private String warehouse_type;
    private String warehouse_name;
    private String warehouse_code;
    private String platform_order;
    
    private String brand_docking_code;
    private String barcode;
    private String epistatic_order;
    
    private String park_code;
    private String park_name;
    private String park_cost_center;
    
    private Integer firstResult;
    private Integer maxResult;
    
    public OperationfeeDataDetail(){
    	
    }
    
    public OperationfeeDataDetail(PerationfeeData perationfeeData){
    	this.op_id = perationfeeData.getId();
    	this.bat_id = perationfeeData.getBat_id();
    	this.create_time = perationfeeData.getCreate_time();
    	this.create_user = perationfeeData.getCreate_user();
    	this.update_time = perationfeeData.getUpdate_time();
    	this.update_user = perationfeeData.getUpdate_user();
    	this.order_type = perationfeeData.getOrder_type();
    	this.operation_time = perationfeeData.getOperation_time();
    	this.store_name = perationfeeData.getStore_name();
    	this.job_orderno = perationfeeData.getJob_orderno();
    	this.related_orderno = perationfeeData.getRelated_orderno();
    	this.job_type = perationfeeData.getJob_type();
    	this.storaggelocation_code = perationfeeData.getStoraggelocation_code();
    	this.in_num = perationfeeData.getIn_num();
    	this.out_num = perationfeeData.getOut_num();
    	this.item_number = perationfeeData.getItem_number();
    	this.sku_number = perationfeeData.getSku_number();
    	this.art_no = perationfeeData.getArt_no();
    	this.item_name = perationfeeData.getItem_name();
    	this.item_size = perationfeeData.getItem_size();
    	this.inventory_status = perationfeeData.getInventory_status();
    	this.operator = perationfeeData.getOperator();
    	this.store_id = perationfeeData.getStore_id();
    	this.settle_flag = perationfeeData.getSettle_flag();
    	this.sku_count = perationfeeData.getSku_count();
    	this.start_time = perationfeeData.getStart_time();
    	this.end_time = perationfeeData.getEnd_time();
    	this.firstResult  = perationfeeData.getFirstResult();
    	this.maxResult = perationfeeData.getMaxResult();
    	this.warehouse_code = perationfeeData.getWarehouse_code();
    	this.warehouse_name = perationfeeData.getWarehouse_name();
    	this.warehouse_type = perationfeeData.getWarehouse_type();
    	this.platform_order = perationfeeData.getPlatform_order();
    	this.brand_docking_code = perationfeeData.getBrand_docking_code();
    	this.barcode = perationfeeData.getBarcode();
    	this.epistatic_order = perationfeeData.getEpistatic_order();
    	this.park_code = perationfeeData.getPark_code();
    	this.park_name = perationfeeData.getPark_name();
    	this.park_cost_center = perationfeeData.getPark_cost_center();
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
	public Integer getSku_count() {
		return sku_count;
	}
	public void setSku_count(Integer sku_count) {
		this.sku_count = sku_count;
	}
	public Integer getId() {
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
	public BigDecimal getExpenses() {
		return expenses;
	}
	public void setExpenses(BigDecimal expenses) {
		this.expenses = expenses;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Integer getOp_id() {
		return op_id;
	}

	public void setOp_id(Integer op_id) {
		this.op_id = op_id;
	}
	
	public Integer getBat_id() {
		return bat_id;
	}

	public void setBat_id(Integer bat_id) {
		this.bat_id = bat_id;
	}

	public String getWarehouse_type() {
		return warehouse_type;
	}

	public void setWarehouse_type(String warehouse_type) {
		this.warehouse_type = warehouse_type;
	}

	public String getWarehouse_name() {
		return warehouse_name;
	}

	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}

	public String getWarehouse_code() {
		return warehouse_code;
	}

	public void setWarehouse_code(String warehouse_code) {
		this.warehouse_code = warehouse_code;
	}

	public String getPlatform_order() {
		return platform_order;
	}

	public void setPlatform_order(String platform_order) {
		this.platform_order = platform_order;
	}

	public String getBrand_docking_code() {
		return brand_docking_code;
	}

	public void setBrand_docking_code(String brand_docking_code) {
		this.brand_docking_code = brand_docking_code;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getEpistatic_order() {
		return epistatic_order;
	}

	public void setEpistatic_order(String epistatic_order) {
		this.epistatic_order = epistatic_order;
	}

	public void setOperationfeeData(PerationfeeData perationfeeData){
    	this.op_id = perationfeeData.getId();
    	this.bat_id = perationfeeData.getBat_id();
    	this.create_time = perationfeeData.getCreate_time();
    	this.create_user = perationfeeData.getCreate_user();
    	this.update_time = perationfeeData.getUpdate_time();
    	this.update_user = perationfeeData.getUpdate_user();
    	this.order_type = perationfeeData.getOrder_type();
    	this.operation_time = perationfeeData.getOperation_time();
    	this.store_name = perationfeeData.getStore_name();
    	this.job_orderno = perationfeeData.getJob_orderno();
    	this.related_orderno = perationfeeData.getRelated_orderno();
    	this.job_type = perationfeeData.getJob_type();
    	this.storaggelocation_code = perationfeeData.getStoraggelocation_code();
    	this.in_num = perationfeeData.getIn_num();
    	this.out_num = perationfeeData.getOut_num();
    	this.item_number = perationfeeData.getItem_number();
    	this.sku_number = perationfeeData.getSku_number();
    	this.art_no = perationfeeData.getArt_no();
    	this.item_name = perationfeeData.getItem_name();
    	this.item_size = perationfeeData.getItem_size();
    	this.inventory_status = perationfeeData.getInventory_status();
    	this.operator = perationfeeData.getOperator();
    	this.store_id = perationfeeData.getStore_id();
    	this.settle_flag = perationfeeData.getSettle_flag();
    	this.sku_count = perationfeeData.getSku_count();
    	this.start_time = perationfeeData.getStart_time();
    	this.end_time = perationfeeData.getEnd_time();
    	this.firstResult  = perationfeeData.getFirstResult();
    	this.maxResult = perationfeeData.getMaxResult();
    	this.warehouse_code = perationfeeData.getWarehouse_code();
    	this.warehouse_name = perationfeeData.getWarehouse_name();
    	this.warehouse_type = perationfeeData.getWarehouse_type();
    	this.platform_order = perationfeeData.getPlatform_order();
    	this.brand_docking_code = perationfeeData.getBrand_docking_code();
    	this.barcode = perationfeeData.getBarcode();
    	this.epistatic_order = perationfeeData.getEpistatic_order();
    	this.park_code = perationfeeData.getPark_code();
    	this.park_name = perationfeeData.getPark_name();
    	this.park_cost_center = perationfeeData.getPark_cost_center();
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