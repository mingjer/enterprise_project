package com.jumbo.wms.model.warehouse;

import java.io.Serializable;

public class VMIFlittingCommand implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4205466032205402311L;

	/**
     * sku id
     */
    private Long id;

    /**
     * sku 条形码/code
     */
    private String code;
    /**
     * 条形码
     */
    private String barCode;

    /**
     * 商品编码
     */
    private String jmCode;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 扩展属性
     */
    private String keyProperties;

    /**
     * 移动数量
     */
    private Long moveQuantity;

    /**
     * 源头仓库
     */
    private Long startWarehouseId;

    /**
     * 目标仓库
     */
    private Long endWarehouseId;

    /**
     * 库存状态
     */
    private Long invStatusId;

    private Long staId;

    /**
     * 原始店铺
     */
    private String owner;

    /**
     * 目标店铺
     */
    private String addOwner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getJmCode() {
        return jmCode;
    }

    public void setJmCode(String jmCode) {
        this.jmCode = jmCode;
    }

    public Long getStaId() {
        return staId;
    }

    public void setStaId(Long staId) {
        this.staId = staId;
    }

    public Long getInvStatusId() {
        return invStatusId;
    }

    public void setInvStatusId(Long invStatusId) {
        this.invStatusId = invStatusId;
    }

    public Long getStartWarehouseId() {
        return startWarehouseId;
    }

    public void setStartWarehouseId(Long starWarehouseId) {
        this.startWarehouseId = starWarehouseId;
    }

    public Long getEndWarehouseId() {
        return endWarehouseId;
    }

    public void setEndWarehouseId(Long endWarehouseId) {
        this.endWarehouseId = endWarehouseId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyProperties() {
        return keyProperties;
    }

    public void setKeyProperties(String keyProperties) {
        this.keyProperties = keyProperties;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Long getMoveQuantity() {
        return moveQuantity;
    }

    public void setMoveQuantity(Long moveQuantity) {
        this.moveQuantity = moveQuantity;
    }

    public String getAddOwner() {
        return addOwner;
    }

    public void setAddOwner(String addOwner) {
        this.addOwner = addOwner;
    }

}
