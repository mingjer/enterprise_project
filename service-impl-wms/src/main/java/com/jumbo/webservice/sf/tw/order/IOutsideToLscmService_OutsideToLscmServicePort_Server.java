
package com.jumbo.webservice.sf.tw.order;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-01-21T15:24:15.819+08:00
 * Generated source version: 3.0.3
 * 
 */
 
public class IOutsideToLscmService_OutsideToLscmServicePort_Server{

    protected IOutsideToLscmService_OutsideToLscmServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new OutsideToLscmServicePortImpl();
        String address = "http://bsp.sit.sf-express.com:8080/bsp-wms/ws/OutsideToLscmServiceImpl";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new IOutsideToLscmService_OutsideToLscmServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}