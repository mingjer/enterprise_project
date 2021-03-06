package com.jumbo.webservice.sf.tw.order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-01-21T15:24:15.812+08:00
 * Generated source version: 3.0.3
 * 
 */
@WebService(targetNamespace = "http://service.warehouse.integration.sf.com/", name = "IOutsideToLscmService")
@XmlSeeAlso({ObjectFactory.class})
public interface IOutsideToLscmService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "yxToLscmService", targetNamespace = "http://service.warehouse.integration.sf.com/", className = "com.jumbo.webservice.sf.tw.order.YxToLscmService")
    @WebMethod
    @ResponseWrapper(localName = "yxToLscmServiceResponse", targetNamespace = "http://service.warehouse.integration.sf.com/", className = "com.jumbo.webservice.sf.tw.order.YxToLscmServiceResponse")
    public java.lang.String yxToLscmService(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "jyToLscmService", targetNamespace = "http://service.warehouse.integration.sf.com/", className = "com.jumbo.webservice.sf.tw.order.JyToLscmService")
    @WebMethod
    @ResponseWrapper(localName = "jyToLscmServiceResponse", targetNamespace = "http://service.warehouse.integration.sf.com/", className = "com.jumbo.webservice.sf.tw.order.JyToLscmServiceResponse")
    public java.lang.String jyToLscmService(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "outsideToLscmService", targetNamespace = "http://service.warehouse.integration.sf.com/", className = "com.jumbo.webservice.sf.tw.order.OutsideToLscmService")
    @WebMethod
    @ResponseWrapper(localName = "outsideToLscmServiceResponse", targetNamespace = "http://service.warehouse.integration.sf.com/", className = "com.jumbo.webservice.sf.tw.order.OutsideToLscmServiceResponse")
    public java.lang.String outsideToLscmService(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
