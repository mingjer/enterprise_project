//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vJAXB 2.1.3 in JDK 1.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.09.12 at 02:30:36 ���� CST
//


package com.jumbo.webservice.outsourcingWH.command;

import java.io.Serializable;
import java.util.ArrayList;
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
 *         &lt;element name="batchId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="batchType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sku" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"batchId", "batchType", "status", "sku"})
@XmlRootElement(name = "skuListConfirm")
public class SkuListConfirm implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 897918154393539327L;
    @XmlElement(required = true)
    protected String batchId;
    @XmlElement(required = true)
    protected String batchType;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(name = "Sku", required = true)
    protected List<SkuListConfirm.Sku> sku;

    /**
     * Gets the value of the batchId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the batchType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBatchType() {
        return batchType;
    }

    /**
     * Sets the value of the batchType property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setBatchType(String value) {
        this.batchType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the sku property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     *    getSku().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SkuListConfirm.Sku }
     * 
     * 
     */
    public List<SkuListConfirm.Sku> getSku() {
        if (sku == null) {
            sku = new ArrayList<SkuListConfirm.Sku>();
        }
        return this.sku;
    }


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
     *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"sku", "result"})
    public static class Sku implements Serializable{

        /**
		 * 
		 */
		private static final long serialVersionUID = -7223671785951946169L;
		@XmlElement(required = true)
        protected String sku;
        @XmlElement(required = true)
        protected String result;

        /**
         * Gets the value of the sku property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getSku() {
            return sku;
        }

        /**
         * Sets the value of the sku property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setSku(String value) {
            this.sku = value;
        }

        /**
         * Gets the value of the result property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setResult(String value) {
            this.result = value;
        }

    }

}
