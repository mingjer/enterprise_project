package com.jumbo.webservice.pda;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * libraryMovementInOut complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="libraryMovementInOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="libraryMovementInOutDetails" type="{http://webservice.jumbo.com/pda/}inventory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryMovementInOut", propOrder = {"libraryMovementInOutDetails"})
public class LibraryMovementInOut implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1602319107687054114L;
    protected List<Inventory> libraryMovementInOutDetails;

    /**
     * Gets the value of the libraryMovementInOutDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the libraryMovementInOutDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     *    getLibraryMovementInOutDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Inventory }
     * 
     * 
     */
    public List<Inventory> getLibraryMovementInOutDetails() {
        if (libraryMovementInOutDetails == null) {
            libraryMovementInOutDetails = new ArrayList<Inventory>();
        }
        return this.libraryMovementInOutDetails;
    }

}
