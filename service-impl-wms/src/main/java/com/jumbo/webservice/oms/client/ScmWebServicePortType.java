package com.jumbo.webservice.oms.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.9 Fri Apr 20 15:02:47 CST 2012 Generated source
 * version: 2.2.9
 * 
 */

@WebService(targetNamespace = "http://scm.webservice.service.erry.com", name = "ScmWebServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface ScmWebServicePortType {

    @WebResult(name = "return", targetNamespace = "http://scm.webservice.service.erry.com")
    @Action(input = "urn:approveRAForOuterWMS", output = "urn:approveRAForOuterWMSResponse")
    @RequestWrapper(localName = "approveRAForOuterWMS", targetNamespace = "http://scm.webservice.service.erry.com", className = "com.jumbo.webservice.oms.client.ApproveRAForOuterWMS")
    @WebMethod(action = "urn:approveRAForOuterWMS")
    @ResponseWrapper(localName = "approveRAForOuterWMSResponse", targetNamespace = "http://scm.webservice.service.erry.com", className = "com.jumbo.webservice.oms.client.ApproveRAForOuterWMSResponse")
    public java.lang.String approveRAForOuterWMS(@WebParam(name = "args0", targetNamespace = "http://scm.webservice.service.erry.com") java.lang.String args0);
}
