package com.jumbo.webservice.oms.client;

/**
 * Please modify this class to meet your needs This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class was generated by Apache CXF 2.2.9 Fri Apr 20 15:02:47 CST 2012 Generated source
 * version: 2.2.9
 * 
 */

public final class ScmWebServicePortType_ScmWebServiceHttpSoap11Endpoint_Client {
    protected static final Logger log = LoggerFactory.getLogger(ScmWebServicePortType_ScmWebServiceHttpSoap11Endpoint_Client.class);
    private static final QName SERVICE_NAME = new QName("http://scm.webservice.service.erry.com", "ScmWebService");

    private ScmWebServicePortType_ScmWebServiceHttpSoap11Endpoint_Client() {}

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ScmWebService.WSDL_LOCATION;
        if (args.length > 0) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                log.error("",e);
            }
        }

        ScmWebService ss = new ScmWebService(wsdlURL, SERVICE_NAME);
        ScmWebServicePortType port = ss.getScmWebServiceHttpSoap11Endpoint();

        {
            System.out.println("Invoking approveRAForOuterWMS...");
            java.lang.String _approveRAForOuterWMS_args0 = "";
            java.lang.String _approveRAForOuterWMS__return = port.approveRAForOuterWMS(_approveRAForOuterWMS_args0);
            System.out.println("approveRAForOuterWMS.result=" + _approveRAForOuterWMS__return);


        }

        System.exit(0);
    }

}
