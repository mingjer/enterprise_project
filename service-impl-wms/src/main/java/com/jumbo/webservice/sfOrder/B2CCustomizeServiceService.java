/*
 * 
 */

package com.jumbo.webservice.sfOrder;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jumbo.webservice.biaogan.client.base.PushExpressInfo;


/**
 * This class was generated by Apache CXF 2.2.9 Wed Jan 09 14:21:07 CST 2013 Generated source
 * version: 2.2.9
 * 
 */


@WebServiceClient(name = "B2CCustomizeServiceService", wsdlLocation = "http://bsp.sf-express.com/bsp-oip/ws/B2CCustomizeService?wsdl", targetNamespace = "http://service.serviceprovide.module.sf.com/")
public class B2CCustomizeServiceService extends Service {

    protected static final Logger logger = LoggerFactory.getLogger(B2CCustomizeServiceService.class);
    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://service.serviceprovide.module.sf.com/", "B2CCustomizeServiceService");
    public final static QName B2CCustomizeServicePort = new QName("http://service.serviceprovide.module.sf.com/", "B2CCustomizeServicePort");
    
	static {
		URL url = PushExpressInfo.class.getResource("/wsdl/sf_B2CCustomizeService.wsdl");
		WSDL_LOCATION = url;
	}

    public B2CCustomizeServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public B2CCustomizeServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public B2CCustomizeServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }


    /**
     * 
     * @return returns IB2CCustomizeService
     */
    @WebEndpoint(name = "B2CCustomizeServicePort")
    public IB2CCustomizeService getB2CCustomizeServicePort() {
        return super.getPort(B2CCustomizeServicePort, IB2CCustomizeService.class);
    }

    /**
     * 
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.
     *        Supported features not in the <code>features</code> parameter will have their default
     *        values.
     * @return returns IB2CCustomizeService
     */
    @WebEndpoint(name = "B2CCustomizeServicePort")
    public IB2CCustomizeService getB2CCustomizeServicePort(WebServiceFeature... features) {
        return super.getPort(B2CCustomizeServicePort, IB2CCustomizeService.class, features);
    }

}
