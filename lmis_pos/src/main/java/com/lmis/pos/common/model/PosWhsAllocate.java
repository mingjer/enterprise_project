package com.lmis.pos.common.model;

import java.util.List;

import com.lmis.framework.baseModel.PersistentObject;

import io.swagger.annotations.ApiModelProperty;

/** 
 * @ClassName: PosWhsAllocate
 * @Description: TODO(PO分仓结果)
 * @author codeGenerator
 * @date 2018-05-30 13:26:28
 * 
 */
public class PosWhsAllocate extends PersistentObject {

    /** 
	 * @Fields serialVersionUID : TODO(序列号) 
	 */
	private static final long serialVersionUID = 1L;
	
    public static long getSerialversionuid() {
    	return serialVersionUID;	
    }
    
    @ApiModelProperty(value = "原PO单号（处理后）")
	private String poSource;
	public String getPoSource() {
		return poSource;
	}
	public void setPoSource(String poSource) {
		this.poSource = poSource;
	}
	
	@ApiModelProperty(value = "原PO单号（处理前）")
	private String poSource1;
	public String getPoSource1() {
		return poSource1;
	}
	public void setPoSource1(String poSource1) {
		this.poSource1 = poSource1;
	}
	
    @ApiModelProperty(value = "销售平台")
	private String soldTo;
	public String getSoldTo() {
		return soldTo;
	}
	public void setSoldTo(String soldTo) {
		this.soldTo = soldTo;
	}
	
    @ApiModelProperty(value = "Ship to")
	private String shipTo;
	public String getShipTo() {
		return shipTo;
	}
	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}
	
    @ApiModelProperty(value = "订单类型")
	private String orderType;
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
    @ApiModelProperty(value = "")
	private String door;
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	
    @ApiModelProperty(value = "源最早到货日期")
	private String crdSource;
	public String getCrdSource() {
		return crdSource;
	}
	public void setCrdSource(String crdSource) {
		this.crdSource = crdSource;
	}
	
    @ApiModelProperty(value = "最早到货日期")
	private String crd;
	public String getCrd() {
		return crd;
	}
	public void setCrd(String crd) {
		this.crd = crd;
	}
	
    @ApiModelProperty(value = "")
	private String cancelDate;
	public String getCancelDate() {
		return cancelDate;
	}
	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}
	
    @ApiModelProperty(value = "")
	private String salesOrg;
	public String getSalesOrg() {
		return salesOrg;
	}
	public void setSalesOrg(String salesOrg) {
		this.salesOrg = salesOrg;
	}
	
    @ApiModelProperty(value = "")
	private String plant;
	public String getPlant() {
		return plant;
	}
	public void setPlant(String plant) {
		this.plant = plant;
	}
	
    @ApiModelProperty(value = "新PO号")
	private String poAllocated;
	public String getPoAllocated() {
		return poAllocated;
	}
	public void setPoAllocated(String poAllocated) {
		this.poAllocated = poAllocated;
	}
	
    @ApiModelProperty(value = "仓库编码")
	private String whsCode;
	public String getWhsCode() {
		return whsCode;
	}
	public void setWhsCode(String whsCode) {
		this.whsCode = whsCode;
	}
	
    @ApiModelProperty(value = "")
	private String contract;
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	
	
    @ApiModelProperty(value = "商品款号和颜色")
	private String prodCode;
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	
    @ApiModelProperty(value = "到货日期")
	private String launchDate;
	public String getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}
	
    @ApiModelProperty(value = "尺码")
	private String size;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
    @ApiModelProperty(value = "sku编码 prod_code + '-' + size")
	private String skuCode;
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	
    @ApiModelProperty(value = " 源数量")
	private Integer qtySource;
	public Integer getQtySource() {
		return qtySource;
	}
	public void setQtySource(Integer qtySource) {
		this.qtySource = qtySource;
	}
	
    @ApiModelProperty(value = "数量")
	private Integer qty;
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
    @ApiModelProperty(value = "po类型 L/F")
	private String poType;
	public String getPoType() {
		return poType;
	}
	public void setPoType(String poType) {
		this.poType = poType;
	}
	
    @ApiModelProperty(value = "商品类型 10-鞋、20-服饰、30-配饰")
	private String bu;
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	
	@ApiModelProperty(value = "是否为分仓数据")
	private Boolean isWhsAllocate;
	public Boolean getIsWhsAllocate() {
		return isWhsAllocate;
	}
	public void setIsWhsAllocate(Boolean isWhsAllocate) {
		this.isWhsAllocate = isWhsAllocate;
	}
	
	@ApiModelProperty(value = "是否存在分仓比例")
	private Boolean isWhsAllocateRate;
	public Boolean getIsWhsAllocateRate() {
		return isWhsAllocateRate;
	}
	public void setIsWhsAllocateRate(Boolean isWhsAllocateRate) {
		this.isWhsAllocateRate = isWhsAllocateRate;
	}
	
    @ApiModelProperty(value = "批次号")
	private String batId;
	public String getBatId() {
		return batId;
	}
	public void setBatId(String batId) {
		this.batId = batId;
	}
    
    @ApiModelProperty(value = "文件编号")
	private List<String> fileNo;
	public List<String> getFileNo() {
		return fileNo;
	}
	public void setFileNo(List<String> fileNo) {
		this.fileNo = fileNo;
	}
    
	
}
