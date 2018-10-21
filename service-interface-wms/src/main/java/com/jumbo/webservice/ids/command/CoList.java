//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.03.23 at 06:24:34 PM CST
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
 *         &lt;element name="totalQty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="co" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="actionflag" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = {"batchId", "totalQty", "co"})
@XmlRootElement(name = "coList")
public class CoList implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8088187097907364823L;
    @XmlElement(required = true)
    protected String batchId;
    @XmlElement(required = true)
    protected String totalQty = "";
    @XmlElement(required = true)
    protected List<CoList.Co> co;


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
     * Gets the value of the totalQty property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTotalQty() {
        return totalQty;
    }

    /**
     * Sets the value of the totalQty property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTotalQty(String value) {
        this.totalQty = value;
    }

    /**
     * Gets the value of the co property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the co property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
	 * getCo().add(newItem);
	 * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CoList.Co }
     * 
     * 
     */
    public List<CoList.Co> getCo() {
        if (co == null) {
            co = new ArrayList<CoList.Co>();
        }
        return this.co;
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
	 *         &lt;element name="actionflag" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"code", "actionflag"})
    public static class Co implements Serializable{

        /**
		 * 
		 */
		private static final long serialVersionUID = -6425947678007089927L;
		@XmlElement(required = true)
        protected String code = "";
        @XmlElement(required = true)
        protected String actionflag = "";

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
         * Gets the value of the actionflag property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getActionflag() {
            return actionflag;
        }

        /**
         * Sets the value of the actionflag property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setActionflag(String value) {
            this.actionflag = value;
        }

    }

}
