//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.28 at 04:21:57 ���� CST 
//


package com.jumbo.webservice.sf.tw.outbound.command;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ErpOrderLineNum"/>
 *         &lt;element ref="{}SkuNo"/>
 *         &lt;element ref="{}ItemName"/>
 *         &lt;element ref="{}ItemUom"/>
 *         &lt;element ref="{}ItemQuantity"/>
 *         &lt;element ref="{}ItemPrice"/>
 *         &lt;element ref="{}ItemDiscount"/>
 *         &lt;element ref="{}CheckPrepardNo"/>
 *         &lt;element ref="{}CustomsPrepardNo"/>
 *         &lt;element ref="{}HsCode"/>
 *         &lt;element ref="{}ItemBrand"/>
 *         &lt;element ref="{}ItemSpecifications"/>
 *         &lt;element ref="{}BomAction"/>
 *         &lt;element ref="{}IsPresent"/>
 *         &lt;element ref="{}IsVirtualProduct"/>
 *         &lt;element ref="{}InventoryStatus"/>
 *         &lt;element ref="{}Lot"/>
 *         &lt;element ref="{}Note"/>
 *         &lt;element ref="{}LotAttr1"/>
 *         &lt;element ref="{}LotAttr2"/>
 *         &lt;element ref="{}LotAttr3"/>
 *         &lt;element ref="{}LotAttr4"/>
 *         &lt;element ref="{}LotAttr5"/>
 *         &lt;element ref="{}LotAttr6"/>
 *         &lt;element ref="{}UserDef1"/>
 *         &lt;element ref="{}UserDef2"/>
 *         &lt;element ref="{}UserDef3"/>
 *         &lt;element ref="{}UserDef4"/>
 *         &lt;element ref="{}UserDef5"/>
 *         &lt;element ref="{}UserDef6"/>
 *         &lt;element ref="{}UserDef7"/>
 *         &lt;element ref="{}UserDef8"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "erpOrderLineNum",
    "skuNo",
    "itemName",
    "itemUom",
    "itemQuantity",
    "itemPrice",
    "itemDiscount",
    "checkPrepardNo",
    "customsPrepardNo",
    "hsCode",
    "itemBrand",
    "itemSpecifications",
    "bomAction",
    "isPresent",
    "isVirtualProduct",
    "inventoryStatus",
    "lot",
    "note",
    "lotAttr1",
    "lotAttr2",
    "lotAttr3",
    "lotAttr4",
    "lotAttr5",
    "lotAttr6",
    "userDef1",
    "userDef2",
    "userDef3",
    "userDef4",
    "userDef5",
    "userDef6",
    "userDef7",
    "userDef8"
})
@XmlRootElement(name = "OrderItem")
public class OutboundReqOrderItem {

    @XmlElement(name = "ErpOrderLineNum", required = true)
    protected String erpOrderLineNum;
    @XmlElement(name = "SkuNo", required = true)
    protected String skuNo;
    @XmlElement(name = "ItemName", required = true)
    protected String itemName;
    @XmlElement(name = "ItemUom", required = true)
    protected String itemUom;
    @XmlElement(name = "ItemQuantity", required = true)
    protected String itemQuantity;
    @XmlElement(name = "ItemPrice", required = true)
    protected String itemPrice;
    @XmlElement(name = "ItemDiscount", required = true)
    protected String itemDiscount;
    @XmlElement(name = "CheckPrepardNo", required = true)
    protected String checkPrepardNo;
    @XmlElement(name = "CustomsPrepardNo", required = true)
    protected String customsPrepardNo;
    @XmlElement(name = "HsCode", required = true)
    protected String hsCode;
    @XmlElement(name = "ItemBrand", required = true)
    protected String itemBrand;
    @XmlElement(name = "ItemSpecifications", required = true)
    protected String itemSpecifications;
    @XmlElement(name = "BomAction", required = true)
    protected String bomAction;
    @XmlElement(name = "IsPresent", required = true)
    protected String isPresent;
    @XmlElement(name = "IsVirtualProduct", required = true)
    protected String isVirtualProduct;
    @XmlElement(name = "InventoryStatus", required = true)
    protected String inventoryStatus;
    @XmlElement(name = "Lot", required = true)
    protected String lot;
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "LotAttr1", required = true)
    protected String lotAttr1;
    @XmlElement(name = "LotAttr2", required = true)
    protected String lotAttr2;
    @XmlElement(name = "LotAttr3", required = true)
    protected String lotAttr3;
    @XmlElement(name = "LotAttr4", required = true)
    protected String lotAttr4;
    @XmlElement(name = "LotAttr5", required = true)
    protected String lotAttr5;
    @XmlElement(name = "LotAttr6", required = true)
    protected String lotAttr6;
    @XmlElement(name = "UserDef1", required = true)
    protected String userDef1;
    @XmlElement(name = "UserDef2", required = true)
    protected String userDef2;
    @XmlElement(name = "UserDef3", required = true)
    protected String userDef3;
    @XmlElement(name = "UserDef4", required = true)
    protected String userDef4;
    @XmlElement(name = "UserDef5", required = true)
    protected String userDef5;
    @XmlElement(name = "UserDef6", required = true)
    protected String userDef6;
    @XmlElement(name = "UserDef7", required = true)
    protected String userDef7;
    @XmlElement(name = "UserDef8", required = true)
    protected String userDef8;

    /**
     * Gets the value of the erpOrderLineNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErpOrderLineNum() {
        return erpOrderLineNum;
    }

    /**
     * Sets the value of the erpOrderLineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErpOrderLineNum(String value) {
        this.erpOrderLineNum = value;
    }

    /**
     * Gets the value of the skuNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuNo() {
        return skuNo;
    }

    /**
     * Sets the value of the skuNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuNo(String value) {
        this.skuNo = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemUom() {
        return itemUom;
    }

    /**
     * Sets the value of the itemUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemUom(String value) {
        this.itemUom = value;
    }

    /**
     * Gets the value of the itemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the value of the itemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemQuantity(String value) {
        this.itemQuantity = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPrice(String value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDiscount() {
        return itemDiscount;
    }

    /**
     * Sets the value of the itemDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDiscount(String value) {
        this.itemDiscount = value;
    }

    /**
     * Gets the value of the checkPrepardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPrepardNo() {
        return checkPrepardNo;
    }

    /**
     * Sets the value of the checkPrepardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPrepardNo(String value) {
        this.checkPrepardNo = value;
    }

    /**
     * Gets the value of the customsPrepardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsPrepardNo() {
        return customsPrepardNo;
    }

    /**
     * Sets the value of the customsPrepardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsPrepardNo(String value) {
        this.customsPrepardNo = value;
    }

    /**
     * Gets the value of the hsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsCode() {
        return hsCode;
    }

    /**
     * Sets the value of the hsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsCode(String value) {
        this.hsCode = value;
    }

    /**
     * Gets the value of the itemBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBrand() {
        return itemBrand;
    }

    /**
     * Sets the value of the itemBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBrand(String value) {
        this.itemBrand = value;
    }

    /**
     * Gets the value of the itemSpecifications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSpecifications() {
        return itemSpecifications;
    }

    /**
     * Sets the value of the itemSpecifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSpecifications(String value) {
        this.itemSpecifications = value;
    }

    /**
     * Gets the value of the bomAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomAction() {
        return bomAction;
    }

    /**
     * Sets the value of the bomAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomAction(String value) {
        this.bomAction = value;
    }

    /**
     * Gets the value of the isPresent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPresent() {
        return isPresent;
    }

    /**
     * Sets the value of the isPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPresent(String value) {
        this.isPresent = value;
    }

    /**
     * Gets the value of the isVirtualProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVirtualProduct() {
        return isVirtualProduct;
    }

    /**
     * Sets the value of the isVirtualProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVirtualProduct(String value) {
        this.isVirtualProduct = value;
    }

    /**
     * Gets the value of the inventoryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryStatus() {
        return inventoryStatus;
    }

    /**
     * Sets the value of the inventoryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryStatus(String value) {
        this.inventoryStatus = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLot(String value) {
        this.lot = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the lotAttr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotAttr1() {
        return lotAttr1;
    }

    /**
     * Sets the value of the lotAttr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotAttr1(String value) {
        this.lotAttr1 = value;
    }

    /**
     * Gets the value of the lotAttr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotAttr2() {
        return lotAttr2;
    }

    /**
     * Sets the value of the lotAttr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotAttr2(String value) {
        this.lotAttr2 = value;
    }

    /**
     * Gets the value of the lotAttr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotAttr3() {
        return lotAttr3;
    }

    /**
     * Sets the value of the lotAttr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotAttr3(String value) {
        this.lotAttr3 = value;
    }

    /**
     * Gets the value of the lotAttr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotAttr4() {
        return lotAttr4;
    }

    /**
     * Sets the value of the lotAttr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotAttr4(String value) {
        this.lotAttr4 = value;
    }

    /**
     * Gets the value of the lotAttr5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotAttr5() {
        return lotAttr5;
    }

    /**
     * Sets the value of the lotAttr5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotAttr5(String value) {
        this.lotAttr5 = value;
    }

    /**
     * Gets the value of the lotAttr6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotAttr6() {
        return lotAttr6;
    }

    /**
     * Sets the value of the lotAttr6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotAttr6(String value) {
        this.lotAttr6 = value;
    }

    /**
     * Gets the value of the userDef1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef1() {
        return userDef1;
    }

    /**
     * Sets the value of the userDef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef1(String value) {
        this.userDef1 = value;
    }

    /**
     * Gets the value of the userDef2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef2() {
        return userDef2;
    }

    /**
     * Sets the value of the userDef2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef2(String value) {
        this.userDef2 = value;
    }

    /**
     * Gets the value of the userDef3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef3() {
        return userDef3;
    }

    /**
     * Sets the value of the userDef3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef3(String value) {
        this.userDef3 = value;
    }

    /**
     * Gets the value of the userDef4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef4() {
        return userDef4;
    }

    /**
     * Sets the value of the userDef4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef4(String value) {
        this.userDef4 = value;
    }

    /**
     * Gets the value of the userDef5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef5() {
        return userDef5;
    }

    /**
     * Sets the value of the userDef5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef5(String value) {
        this.userDef5 = value;
    }

    /**
     * Gets the value of the userDef6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef6() {
        return userDef6;
    }

    /**
     * Sets the value of the userDef6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef6(String value) {
        this.userDef6 = value;
    }

    /**
     * Gets the value of the userDef7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef7() {
        return userDef7;
    }

    /**
     * Sets the value of the userDef7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef7(String value) {
        this.userDef7 = value;
    }

    /**
     * Gets the value of the userDef8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDef8() {
        return userDef8;
    }

    /**
     * Sets the value of the userDef8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDef8(String value) {
        this.userDef8 = value;
    }

}
