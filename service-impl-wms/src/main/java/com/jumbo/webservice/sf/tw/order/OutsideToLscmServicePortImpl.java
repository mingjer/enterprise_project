/**
 * Please modify this class to meet your needs This class is not complete
 */

package com.jumbo.webservice.sf.tw.order;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

import com.jumbo.wms.manager.task.sf.tw.SfTwDigest;

/**
 * This class was generated by Apache CXF 3.0.3 2016-01-21T15:24:15.798+08:00 Generated source
 * version: 3.0.3
 * 
 */

@javax.jws.WebService(serviceName = "OutsideToLscmServiceService", portName = "OutsideToLscmServicePort", targetNamespace = "http://service.warehouse.integration.sf.com/", wsdlLocation = "http://bsp.sit.sf-express.com:8080/bsp-wms/ws/OutsideToLscmServiceImpl?wsdl", endpointInterface = "com.jumbo.webservice.sf.tw.order.IOutsideToLscmService")
public class OutsideToLscmServicePortImpl implements IOutsideToLscmService {

    private static final Logger LOG = Logger.getLogger(OutsideToLscmServicePortImpl.class.getName());
    protected static final org.slf4j.Logger log = LoggerFactory.getLogger(SfTwDigest.class);

    /*
     * (non-Javadoc)
     * 
     * @see com.jumbo.webservice.sf.tw.order.IOutsideToLscmService#yxToLscmService(java.lang.String
     * arg0 )*
     */
    public java.lang.String yxToLscmService(java.lang.String arg0) {
        LOG.info("Executing operation yxToLscmService");
        System.out.println(arg0);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            if (log.isErrorEnabled()) {
                log.error("yxToLscmService Exception:" + arg0, ex);
            }
            throw new RuntimeException(ex);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.jumbo.webservice.sf.tw.order.IOutsideToLscmService#jyToLscmService(java.lang.String
     * arg0 )*
     */
    public java.lang.String jyToLscmService(java.lang.String arg0) {
        LOG.info("Executing operation jyToLscmService");
        System.out.println(arg0);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            if (log.isErrorEnabled()) {
                log.error("jyToLscmService Exception:" + arg0, ex);
            }
            throw new RuntimeException(ex);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.jumbo.webservice.sf.tw.order.IOutsideToLscmService#outsideToLscmService(java.lang.String
     * arg0 )*
     */
    public java.lang.String outsideToLscmService(java.lang.String arg0) {
        LOG.info("Executing operation outsideToLscmService");
        System.out.println(arg0);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            if (log.isErrorEnabled()) {
                log.error("outsideToLscmService Exception:" + arg0, ex);
            }
            throw new RuntimeException(ex);
        }
    }

}
