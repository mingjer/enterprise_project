
/*
 * 
 */

package com.jumbo.webservice.sf.order;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import com.jumbo.webservice.biaogan.client.base.PushExpressInfo;

/**
 * This class was generated by Apache CXF 2.2.9
 * Fri May 30 11:27:55 CST 2014
 * Generated source version: 2.2.9
 * 
 */


@WebServiceClient(name = "OutsideToLscmServiceService", 
                  wsdlLocation = "file:OutsideToLscmServiceImpl.wsdl",
                  targetNamespace = "http://service.warehouse.integration.sf.com/") 
public class OutsideToLscmServiceService2 extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://service.warehouse.integration.sf.com/", "OutsideToLscmServiceService");
    public final static QName OutsideToLscmServicePort = new QName("http://service.warehouse.integration.sf.com/", "OutsideToLscmServicePort");

	static {
        URL url = PushExpressInfo.class.getResource("/wsdl/OutsideToLscmServiceImpl2.wsdl");
		WSDL_LOCATION = url;
	}
    
    public OutsideToLscmServiceService2(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OutsideToLscmServiceService2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OutsideToLscmServiceService2() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns IOutsideToLscmService
     */
    @WebEndpoint(name = "OutsideToLscmServicePort")
    public IOutsideToLscmService getOutsideToLscmServicePort() {
        return super.getPort(OutsideToLscmServicePort, IOutsideToLscmService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IOutsideToLscmService
     */
    @WebEndpoint(name = "OutsideToLscmServicePort")
    public IOutsideToLscmService getOutsideToLscmServicePort(WebServiceFeature... features) {
        return super.getPort(OutsideToLscmServicePort, IOutsideToLscmService.class, features);
    }

}