//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.03.13 at 03:51:01 PM CST
//

package com.jumbo.webservice.ids.command;

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
 *         &lt;element name="order" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = {"batchId", "batchType", "status", "order"})
@XmlRootElement(name = "orderListConfirm")
public class OrderListConfirm implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8396033798469992676L;
    @XmlElement(required = true)
    protected String batchId = "";
    @XmlElement(required = true)
    protected String batchType = "";
    @XmlElement(required = true)
    protected String status = "";
    protected List<OrderListConfirm.Order> order;

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
     * Gets the value of the order property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the order property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
	 * getOrder().add(newItem);
	 * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link OrderListConfirm.Order }
     * 
     * 
     */
    public List<OrderListConfirm.Order> getOrder() {
        if (order == null) {
            order = new ArrayList<OrderListConfirm.Order>();
        }
        return this.order;
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
	 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {"code", "result"})
    public static class Order implements Serializable {

        /**
		 * 
		 */
		private static final long serialVersionUID = -8541860473566007604L;
		@XmlElement(required = true)
        protected String code = "";
        @XmlElement(required = true)
        protected String result = "";

        /**
         * Gets the value of the code property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setCode(String value) {
            this.code = value;
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