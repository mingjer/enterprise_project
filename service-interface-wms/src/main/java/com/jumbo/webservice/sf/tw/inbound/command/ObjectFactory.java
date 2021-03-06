//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.27 at 10:54:18 ���� CST 
//


package com.jumbo.webservice.sf.tw.inbound.command;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jumbo.webservice.sf.tw.inbound.command package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WarehouseCode_QNAME = new QName("", "WarehouseCode");
    private final static QName _CompanyCode_QNAME = new QName("", "CompanyCode");
    private final static QName _Lot_QNAME = new QName("", "Lot");
    private final static QName _ErpOrder_QNAME = new QName("", "ErpOrder");
    private final static QName _LotAttr6_QNAME = new QName("", "LotAttr6");
    private final static QName _ErpOrderLineNum_QNAME = new QName("", "ErpOrderLineNum");
    private final static QName _ErpOrderType_QNAME = new QName("", "ErpOrderType");
    private final static QName _LotAttr3_QNAME = new QName("", "LotAttr3");
    private final static QName _LotAttr2_QNAME = new QName("", "LotAttr2");
    private final static QName _LotAttr5_QNAME = new QName("", "LotAttr5");
    private final static QName _LotAttr4_QNAME = new QName("", "LotAttr4");
    private final static QName _ExpirationDate_QNAME = new QName("", "ExpirationDate");
    private final static QName _SerialNumber_QNAME = new QName("", "SerialNumber");
    private final static QName _LotAttr1_QNAME = new QName("", "LotAttr1");
    private final static QName _ReceiptTime_QNAME = new QName("", "ReceiptTime");
    private final static QName _VendorCode_QNAME = new QName("", "VendorCode");
    private final static QName _InventoryStatus_QNAME = new QName("", "InventoryStatus");
    private final static QName _Status_QNAME = new QName("", "Status");
    private final static QName _ReceiptId_QNAME = new QName("", "ReceiptId");
    private final static QName _SkuNo_QNAME = new QName("", "SkuNo");
    private final static QName _UserDef1_QNAME = new QName("", "UserDef1");
    private final static QName _ActualQty_QNAME = new QName("", "ActualQty");
    private final static QName _Price_QNAME = new QName("", "Price");
    private final static QName _UserDef3_QNAME = new QName("", "UserDef3");
    private final static QName _UserDef2_QNAME = new QName("", "UserDef2");
    private final static QName _UserDef5_QNAME = new QName("", "UserDef5");
    private final static QName _PlanQty_QNAME = new QName("", "PlanQty");
    private final static QName _CloseDate_QNAME = new QName("", "CloseDate");
    private final static QName _UserDef4_QNAME = new QName("", "UserDef4");
    private final static QName _UserDef7_QNAME = new QName("", "UserDef7");
    private final static QName _UserDef6_QNAME = new QName("", "UserDef6");
    private final static QName _UserDef8_QNAME = new QName("", "UserDef8");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jumbo.webservice.sf.tw.inbound.command
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InboundRtnReqItem }
     * 
     */
    public InboundRtnReqItem createItem() {
        return new InboundRtnReqItem();
    }

    /**
     * Create an instance of {@link InboundRtnReqItems }
     * 
     */
    public InboundRtnReqItems createItems() {
        return new InboundRtnReqItems();
    }

    /**
     * Create an instance of {@link InboundRtnPurchaseOrderInboundRequest }
     * 
     */
    public InboundRtnPurchaseOrderInboundRequest createPurchaseOrderInboundRequest() {
        return new InboundRtnPurchaseOrderInboundRequest();
    }

    /**
     * Create an instance of {@link InboundRtnRequest }
     * 
     */
    public InboundRtnRequest createRequest() {
        return new InboundRtnRequest();
    }

    /**
     * Create an instance of {@link InboundRtnReqSerialNumbers }
     * 
     */
    public InboundRtnReqSerialNumbers createSerialNumbers() {
        return new InboundRtnReqSerialNumbers();
    }

    /**
     * Create an instance of {@link InboundRtnReqPurchaseOrders }
     * 
     */
    public InboundRtnReqPurchaseOrders createPurchaseOrders() {
        return new InboundRtnReqPurchaseOrders();
    }

    /**
     * Create an instance of {@link InboundRtnReqPurchaseOrder }
     * 
     */
    public InboundRtnReqPurchaseOrder createPurchaseOrder() {
        return new InboundRtnReqPurchaseOrder();
    }

    /**
     * Create an instance of {@link InboundRtnReqBody }
     * 
     */
    public InboundRtnReqBody createBody() {
        return new InboundRtnReqBody();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WarehouseCode")
    public JAXBElement<String> createWarehouseCode(String value) {
        return new JAXBElement<String>(_WarehouseCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CompanyCode")
    public JAXBElement<String> createCompanyCode(String value) {
        return new JAXBElement<String>(_CompanyCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Lot")
    public JAXBElement<String> createLot(String value) {
        return new JAXBElement<String>(_Lot_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErpOrder")
    public JAXBElement<String> createErpOrder(String value) {
        return new JAXBElement<String>(_ErpOrder_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LotAttr6")
    public JAXBElement<String> createLotAttr6(String value) {
        return new JAXBElement<String>(_LotAttr6_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErpOrderLineNum")
    public JAXBElement<String> createErpOrderLineNum(String value) {
        return new JAXBElement<String>(_ErpOrderLineNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ErpOrderType")
    public JAXBElement<String> createErpOrderType(String value) {
        return new JAXBElement<String>(_ErpOrderType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LotAttr3")
    public JAXBElement<String> createLotAttr3(String value) {
        return new JAXBElement<String>(_LotAttr3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LotAttr2")
    public JAXBElement<String> createLotAttr2(String value) {
        return new JAXBElement<String>(_LotAttr2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LotAttr5")
    public JAXBElement<String> createLotAttr5(String value) {
        return new JAXBElement<String>(_LotAttr5_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LotAttr4")
    public JAXBElement<String> createLotAttr4(String value) {
        return new JAXBElement<String>(_LotAttr4_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExpirationDate")
    public JAXBElement<String> createExpirationDate(String value) {
        return new JAXBElement<String>(_ExpirationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SerialNumber")
    public JAXBElement<String> createSerialNumber(String value) {
        return new JAXBElement<String>(_SerialNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LotAttr1")
    public JAXBElement<String> createLotAttr1(String value) {
        return new JAXBElement<String>(_LotAttr1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ReceiptTime")
    public JAXBElement<String> createReceiptTime(String value) {
        return new JAXBElement<String>(_ReceiptTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VendorCode")
    public JAXBElement<String> createVendorCode(String value) {
        return new JAXBElement<String>(_VendorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InventoryStatus")
    public JAXBElement<String> createInventoryStatus(String value) {
        return new JAXBElement<String>(_InventoryStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ReceiptId")
    public JAXBElement<String> createReceiptId(String value) {
        return new JAXBElement<String>(_ReceiptId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SkuNo")
    public JAXBElement<String> createSkuNo(String value) {
        return new JAXBElement<String>(_SkuNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserDef1")
    public JAXBElement<String> createUserDef1(String value) {
        return new JAXBElement<String>(_UserDef1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ActualQty")
    public JAXBElement<String> createActualQty(String value) {
        return new JAXBElement<String>(_ActualQty_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Price")
    public JAXBElement<String> createPrice(String value) {
        return new JAXBElement<String>(_Price_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserDef3")
    public JAXBElement<String> createUserDef3(String value) {
        return new JAXBElement<String>(_UserDef3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserDef2")
    public JAXBElement<String> createUserDef2(String value) {
        return new JAXBElement<String>(_UserDef2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserDef5")
    public JAXBElement<String> createUserDef5(String value) {
        return new JAXBElement<String>(_UserDef5_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PlanQty")
    public JAXBElement<String> createPlanQty(String value) {
        return new JAXBElement<String>(_PlanQty_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CloseDate")
    public JAXBElement<String> createCloseDate(String value) {
        return new JAXBElement<String>(_CloseDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserDef4")
    public JAXBElement<String> createUserDef4(String value) {
        return new JAXBElement<String>(_UserDef4_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserDef7")
    public JAXBElement<String> createUserDef7(String value) {
        return new JAXBElement<String>(_UserDef7_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserDef6")
    public JAXBElement<String> createUserDef6(String value) {
        return new JAXBElement<String>(_UserDef6_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserDef8")
    public JAXBElement<String> createUserDef8(String value) {
        return new JAXBElement<String>(_UserDef8_QNAME, String.class, null, value);
    }

}
