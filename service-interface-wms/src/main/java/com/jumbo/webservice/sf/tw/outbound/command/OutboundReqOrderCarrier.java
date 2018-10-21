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
 *         &lt;element ref="{}Carrier"/>
 *         &lt;element ref="{}CarrierProduct"/>
 *         &lt;element ref="{}WaybillNo"/>
 *         &lt;element ref="{}RouteNumbers"/>
 *         &lt;element ref="{}PaymentOfCharge"/>
 *         &lt;element ref="{}MonthlyAccount"/>
 *         &lt;element ref="{}PaymentDistict"/>
 *         &lt;element ref="{}ReturnService"/>
 *         &lt;element ref="{}ReturnTracking"/>
 *         &lt;element ref="{}IfSelfPickup"/>
 *         &lt;element ref="{}CarrierAddedServices"/>
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
    "carrier",
    "carrierProduct",
    "waybillNo",
    "routeNumbers",
    "paymentOfCharge",
    "monthlyAccount",
    "paymentDistict",
    "returnService",
    "returnTracking",
    "ifSelfPickup",
    "carrierAddedServices"
})
@XmlRootElement(name = "OrderCarrier")
public class OutboundReqOrderCarrier {

    @XmlElement(name = "Carrier", required = true)
    protected String carrier;
    @XmlElement(name = "CarrierProduct", required = true)
    protected String carrierProduct;
    @XmlElement(name = "WaybillNo", required = true)
    protected String waybillNo;
    @XmlElement(name = "RouteNumbers", required = true)
    protected String routeNumbers;
    @XmlElement(name = "PaymentOfCharge", required = true)
    protected String paymentOfCharge;
    @XmlElement(name = "MonthlyAccount", required = true)
    protected String monthlyAccount;
    @XmlElement(name = "PaymentDistict", required = true)
    protected String paymentDistict;
    @XmlElement(name = "ReturnService", required = true)
    protected String returnService;
    @XmlElement(name = "ReturnTracking", required = true)
    protected String returnTracking;
    @XmlElement(name = "IfSelfPickup", required = true)
    protected String ifSelfPickup;
    @XmlElement(name = "CarrierAddedServices", required = true)
    protected OutboundReqCarrierAddedServices carrierAddedServices;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the carrierProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierProduct() {
        return carrierProduct;
    }

    /**
     * Sets the value of the carrierProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierProduct(String value) {
        this.carrierProduct = value;
    }

    /**
     * Gets the value of the waybillNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaybillNo() {
        return waybillNo;
    }

    /**
     * Sets the value of the waybillNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaybillNo(String value) {
        this.waybillNo = value;
    }

    /**
     * Gets the value of the routeNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNumbers() {
        return routeNumbers;
    }

    /**
     * Sets the value of the routeNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteNumbers(String value) {
        this.routeNumbers = value;
    }

    /**
     * Gets the value of the paymentOfCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOfCharge() {
        return paymentOfCharge;
    }

    /**
     * Sets the value of the paymentOfCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOfCharge(String value) {
        this.paymentOfCharge = value;
    }

    /**
     * Gets the value of the monthlyAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyAccount() {
        return monthlyAccount;
    }

    /**
     * Sets the value of the monthlyAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyAccount(String value) {
        this.monthlyAccount = value;
    }

    /**
     * Gets the value of the paymentDistict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDistict() {
        return paymentDistict;
    }

    /**
     * Sets the value of the paymentDistict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDistict(String value) {
        this.paymentDistict = value;
    }

    /**
     * Gets the value of the returnService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnService() {
        return returnService;
    }

    /**
     * Sets the value of the returnService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnService(String value) {
        this.returnService = value;
    }

    /**
     * Gets the value of the returnTracking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnTracking() {
        return returnTracking;
    }

    /**
     * Sets the value of the returnTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnTracking(String value) {
        this.returnTracking = value;
    }

    /**
     * Gets the value of the ifSelfPickup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfSelfPickup() {
        return ifSelfPickup;
    }

    /**
     * Sets the value of the ifSelfPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfSelfPickup(String value) {
        this.ifSelfPickup = value;
    }

    /**
     * Gets the value of the carrierAddedServices property.
     * 
     * @return
     *     possible object is
     *     {@link OutboundReqCarrierAddedServices }
     *     
     */
    public OutboundReqCarrierAddedServices getCarrierAddedServices() {
        return carrierAddedServices;
    }

    /**
     * Sets the value of the carrierAddedServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutboundReqCarrierAddedServices }
     *     
     */
    public void setCarrierAddedServices(OutboundReqCarrierAddedServices value) {
        this.carrierAddedServices = value;
    }

}
