
package com.jumbo.wms.webservice.pda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWarehousesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWarehousesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authResponseHeader" type="{http://webservice.jumbo.com/pda/}authResponseHeader"/>
 *         &lt;element name="getWarehousesResponseBody" type="{http://webservice.jumbo.com/pda/}getWarehousesResponseBody"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWarehousesResponse", propOrder = {
    "authResponseHeader",
    "getWarehousesResponseBody"
})
public class GetWarehousesResponse {

    @XmlElement(required = true)
    protected AuthResponseHeader authResponseHeader;
    @XmlElement(required = true)
    protected GetWarehousesResponseBody getWarehousesResponseBody;

    /**
     * Gets the value of the authResponseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link AuthResponseHeader }
     *     
     */
    public AuthResponseHeader getAuthResponseHeader() {
        return authResponseHeader;
    }

    /**
     * Sets the value of the authResponseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthResponseHeader }
     *     
     */
    public void setAuthResponseHeader(AuthResponseHeader value) {
        this.authResponseHeader = value;
    }

    /**
     * Gets the value of the getWarehousesResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetWarehousesResponseBody }
     *     
     */
    public GetWarehousesResponseBody getGetWarehousesResponseBody() {
        return getWarehousesResponseBody;
    }

    /**
     * Sets the value of the getWarehousesResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetWarehousesResponseBody }
     *     
     */
    public void setGetWarehousesResponseBody(GetWarehousesResponseBody value) {
        this.getWarehousesResponseBody = value;
    }

}
