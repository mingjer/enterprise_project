package com.jumbo.webservice.sfNew;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jumbo.webservice.biaogan.client.base.PushExpressInfo;


/**
 * This class was generated by Apache CXF 2.7.8 2014-01-03T14:43:45.946+08:00 Generated source
 * version: 2.7.8
 * 
 */
@WebServiceClient(name = "CommonServiceService", wsdlLocation = "http://bsp-test.sf-express.com:9090/bsp-ois/ws/expressService?wsdl", targetNamespace = "http://service.expressservice.integration.sf.com/")
public class CommonServiceService2 extends Service {
    protected static final Logger logger = LoggerFactory.getLogger(CommonServiceService2.class);
    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.expressservice.integration.sf.com/", "CommonServiceService");
    public final static QName CommonServicePort = new QName("http://service.expressservice.integration.sf.com/", "CommonServicePort");
    
	static {
        URL url = PushExpressInfo.class.getResource("/wsdl/sf_2.6.wsdl");
		WSDL_LOCATION = url;
	}

    public CommonServiceService2(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CommonServiceService2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CommonServiceService2() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return returns IService
     */
    @WebEndpoint(name = "CommonServicePort")
    public IService2 getCommonServicePort() {
        return super.getPort(CommonServicePort, IService2.class);
    }

    /**
     * 
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.
     *        Supported features not in the <code>features</code> parameter will have their default
     *        values.
     * @return returns IService
     */
    @WebEndpoint(name = "CommonServicePort")
    public IService2 getCommonServicePort(WebServiceFeature... features) {
        return super.getPort(CommonServicePort, IService2.class, features);
    }

}
