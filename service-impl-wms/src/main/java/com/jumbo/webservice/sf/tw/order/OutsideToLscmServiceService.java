package com.jumbo.webservice.sf.tw.order;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-01-21T15:24:15.823+08:00
 * Generated source version: 3.0.3
 * 
 * @author lichuan
 * 
 */
@WebServiceClient(name = "OutsideToLscmServiceService", 
                  wsdlLocation = "http://bsp.sit.sf-express.com:8080/bsp-wms/ws/OutsideToLscmServiceImpl?wsdl",
                  targetNamespace = "http://service.warehouse.integration.sf.com/") 
public class OutsideToLscmServiceService extends Service {

    private static final Logger log = LoggerFactory.getLogger(OutsideToLscmServiceService.class);
    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.warehouse.integration.sf.com/", "OutsideToLscmServiceService");
    public final static QName OutsideToLscmServicePort = new QName("http://service.warehouse.integration.sf.com/", "OutsideToLscmServicePort");
    static {
        URL url = null;
        try {
            //url = new URL("http://bsp.sit.sf-express.com:8080/bsp-wms/ws/OutsideToLscmServiceImpl?wsdl");
             url = OutsideToLscmServiceService.class.getResource("/wsdl/OutsideToLscmServiceImpl_tw.wsdl");
        } catch (Exception e) {
            log.error("Can not initialize the default wsdl from {0}", "/wsdl/OutsideToLscmServiceImpl_tw.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OutsideToLscmServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OutsideToLscmServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OutsideToLscmServiceService() {
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
