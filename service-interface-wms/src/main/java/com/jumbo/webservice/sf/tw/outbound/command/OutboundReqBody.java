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
 *         &lt;element ref="{}SaleOrderRequest"/>
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
    "saleOrderRequest"
})
@XmlRootElement(name = "Body")
public class OutboundReqBody {

    @XmlElement(name = "SaleOrderRequest", required = true)
    protected OutboundSaleOrderRequest saleOrderRequest;

    /**
     * Gets the value of the saleOrderRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OutboundSaleOrderRequest }
     *     
     */
    public OutboundSaleOrderRequest getSaleOrderRequest() {
        return saleOrderRequest;
    }

    /**
     * Sets the value of the saleOrderRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutboundSaleOrderRequest }
     *     
     */
    public void setSaleOrderRequest(OutboundSaleOrderRequest value) {
        this.saleOrderRequest = value;
    }

}
