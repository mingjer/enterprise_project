//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vJAXB 2.1.3 in JDK 1.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.01.28 at 04:21:57 ���� CST
//


package com.jumbo.webservice.sf.tw.outbound.command;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CarrierAddedService"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"carrierAddedService"})
@XmlRootElement(name = "CarrierAddedServices")
public class OutboundReqCarrierAddedServices {

    @XmlElement(name = "CarrierAddedService", required = true)
    protected List<OutboundReqCarrierAddedService> carrierAddedService;

    /**
     * Gets the value of the carrierAddedService property.
     * 
     * @return possible object is {@link OutboundReqCarrierAddedService }
     * 
     */
    public List<OutboundReqCarrierAddedService> getCarrierAddedService() {
        return carrierAddedService;
    }

    /**
     * Sets the value of the carrierAddedService property.
     * 
     * @param value allowed object is {@link OutboundReqCarrierAddedService }
     * 
     */
    public void setCarrierAddedService(List<OutboundReqCarrierAddedService> value) {
        this.carrierAddedService = value;
    }

}