package com.jumbo.webservice.etam.client;

/**
 * Please modify this class to meet your needs This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class was generated by Apache CXF 2.2.9 Mon May 07 14:37:11 CST 2012 Generated source
 * version: 2.2.9
 * 
 */

public final class ScaleAppSoap_ScaleAppSoap_Client {
    protected static final Logger log = LoggerFactory.getLogger(ScaleAppSoap_ScaleAppSoap_Client.class);
    private static final QName SERVICE_NAME = new QName("http://www.bpl.com.cn/", "ScaleApp");

    private ScaleAppSoap_ScaleAppSoap_Client() {}

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ScaleApp.WSDL_LOCATION;
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

        ScaleApp ss = new ScaleApp(wsdlURL, SERVICE_NAME);
        ss.setHandlerResolver(new HandlerResolver() {

            @SuppressWarnings("rawtypes")
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
                // 添加认证信息
                handlerList.add(new SecurityHeaderImpl());
                return handlerList;
            }
        });
        ScaleAppSoap port = ss.getScaleAppSoap();



        {
            System.out.println("Invoking orderCancel...");
            java.lang.String _orderCancel_orderCode = "";
            java.lang.String _orderCancel__return = port.orderCancel(_orderCancel_orderCode);
            System.out.println("orderCancel.result=" + _orderCancel__return);

        }

        System.exit(0);
    }

}
