package com.jumbo.webservice.etam.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.9 Mon May 07 14:37:11 CST 2012 Generated source
 * version: 2.2.9
 * 
 */

@WebService(targetNamespace = "http://www.bpl.com.cn/", name = "ScaleAppSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ScaleAppSoap {

    @WebResult(name = "OrderCancelResult", targetNamespace = "http://www.bpl.com.cn/")
    @RequestWrapper(localName = "OrderCancel", targetNamespace = "http://www.bpl.com.cn/", className = "com.jumbo.webservice.etam.client.OrderCancel")
    @WebMethod(operationName = "OrderCancel", action = "http://www.bpl.com.cn/OrderCancel")
    @ResponseWrapper(localName = "OrderCancelResponse", targetNamespace = "http://www.bpl.com.cn/", className = "com.jumbo.webservice.etam.client.OrderCancelResponse")
    public java.lang.String orderCancel(@WebParam(name = "order_code", targetNamespace = "http://www.bpl.com.cn/") java.lang.String orderCode);
}
