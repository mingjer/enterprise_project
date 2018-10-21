package com.jumbo.webservice.sfOrder;

/**
 * Please modify this class to meet your needs This class is not complete
 */

import java.io.File;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This class was generated by Apache CXF 2.2.9 Wed Jan 09 14:23:37 CST 2013 Generated source
 * version: 2.2.9
 * 
 */

public final class IB2CCustomizeService_B2CCustomizeServicePort_Client implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -7208665536474188875L;
    protected static final Logger log = LoggerFactory.getLogger(IB2CCustomizeService_B2CCustomizeServicePort_Client.class);
    private static final QName SERVICE_NAME = new QName("http://service.serviceprovide.module.sf.com/", "B2CCustomizeServiceService");

    private IB2CCustomizeService_B2CCustomizeServicePort_Client() {}

    public static void main(String args[]) throws Exception {
        URL wsdlURL = B2CCustomizeServiceService.WSDL_LOCATION;
        if (args.length > 0) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                log.error("", e);
            }
        }

        B2CCustomizeServiceService ss = new B2CCustomizeServiceService(wsdlURL, SERVICE_NAME);
        IB2CCustomizeService port = ss.getB2CCustomizeServicePort();

        {
            System.out.println("Invoking confirmOrderService...");
            java.lang.String _confirmOrderService_xml = "";
            java.lang.String _confirmOrderService__return = port.confirmOrderService(_confirmOrderService_xml);
            System.out.println("confirmOrderService.result=" + _confirmOrderService__return);


        }
        {
            System.out.println("Invoking filterOrderServiceForB2C...");
            java.lang.String _filterOrderServiceForB2C_xml = "";
            java.lang.String _filterOrderServiceForB2C__return = port.filterOrderServiceForB2C(_filterOrderServiceForB2C_xml);
            System.out.println("filterOrderServiceForB2C.result=" + _filterOrderServiceForB2C__return);


        }

        System.exit(0);
    }

}
