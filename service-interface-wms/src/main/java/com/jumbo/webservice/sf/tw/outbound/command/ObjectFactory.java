//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.03 at 03:18:44 ���� CST 
//


package com.jumbo.webservice.sf.tw.outbound.command;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jumbo.webservice.sf.tw.outbound.command package. 
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

    private final static QName _Result_QNAME = new QName("", "Result");
    private final static QName _Head_QNAME = new QName("", "Head");
    private final static QName _ErpOrder_QNAME = new QName("", "ErpOrder");
    private final static QName _Note_QNAME = new QName("", "Note");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jumbo.webservice.sf.tw.outbound.command
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OutboundCancelRespSaleOrders }
     * 
     */
    public OutboundCancelRespSaleOrders createSaleOrders() {
        return new OutboundCancelRespSaleOrders();
    }

    /**
     * Create an instance of {@link OutboundCancelResponse }
     * 
     */
    public OutboundCancelResponse createResponse() {
        return new OutboundCancelResponse();
    }

    /**
     * Create an instance of {@link OutboundCancelRespBody }
     * 
     */
    public OutboundCancelRespBody createBody() {
        return new OutboundCancelRespBody();
    }

    /**
     * Create an instance of {@link OutboundCancelSaleOrderResponse }
     * 
     */
    public OutboundCancelSaleOrderResponse createCancelSaleOrderResponse() {
        return new OutboundCancelSaleOrderResponse();
    }

    /**
     * Create an instance of {@link OutboundCancelRespSaleOrder }
     * 
     */
    public OutboundCancelRespSaleOrder createSaleOrder() {
        return new OutboundCancelRespSaleOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result")
    public JAXBElement<String> createResult(String value) {
        return new JAXBElement<String>(_Result_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Head")
    public JAXBElement<String> createHead(String value) {
        return new JAXBElement<String>(_Head_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "Note")
    public JAXBElement<String> createNote(String value) {
        return new JAXBElement<String>(_Note_QNAME, String.class, null, value);
    }

}
