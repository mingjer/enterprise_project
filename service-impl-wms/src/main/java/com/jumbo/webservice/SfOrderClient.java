//package com.jumbo.webservice;
//
///**
// * Please modify this class to meet your needs This class is not complete
// */
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import javax.xml.namespace.QName;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.jumbo.webservice.sfOrder.B2CCustomizeServiceService;
//import com.jumbo.webservice.sfOrder.IB2CCustomizeService;
//
///**
// * This class was generated by Apache CXF 2.2.9 Fri Dec 21 11:28:00 CST 2012 Generated source
// * version: 2.2.9
// * 
// */
//
//public final class SfOrderClient {
//    protected static final Logger log = LoggerFactory.getLogger(SfOrderClient.class);
//    private static final QName SERVICE_NAME = new QName("http://service.serviceprovide.module.sf.com/", "B2CCustomizeServiceService");
//
//    private SfOrderClient() {}
//
//    public static void main(String args[]) throws Exception {
//        URL wsdlURL = B2CCustomizeServiceService.WSDL_LOCATION;
//        if (args.length > 0) {
//            File wsdlFile = new File(args[0]);
//            try {
//                if (wsdlFile.exists()) {
//                    wsdlURL = wsdlFile.toURI().toURL();
//                } else {
//                    wsdlURL = new URL(args[0]);
//                }
//            } catch (MalformedURLException e) {
//                log.error("",e);
//            }
//        }
//        StringBuffer b = new StringBuffer();
//        File f = new File("D:\\comfirmOrder.xml");
//        FileReader r = new FileReader(f);
//        BufferedReader rd = new BufferedReader(r);
//        while (true) {
//            String tmp = rd.readLine();
//            if (tmp != null) {
//                b.append(tmp);
//            } else {
//                break;
//            }
//        }
//        // System.out.println(b.toString());
//        // System.out.println("===============");
//
//
//        B2CCustomizeServiceService ss = new B2CCustomizeServiceService(wsdlURL, SERVICE_NAME);
//        IB2CCustomizeService port = ss.getB2CCustomizeServicePort();
//        // {
//        // System.out.println("Invoking filterOrderServiceForB2C...");
//        // java.lang.String _filterOrderServiceForB2C_xml = b.toString();
//        // java.lang.String _filterOrderServiceForB2C__return =
//        // port.filterOrderServiceForB2C(_filterOrderServiceForB2C_xml);
//        // System.out.println("filterOrderServiceForB2C.result=" +
//        // _filterOrderServiceForB2C__return);
//        // }
//
//        // System.out.println("Invoking confirmOrderService...");
//        java.lang.String _confirmOrderService_xml = b.toString();;
//        java.lang.String _confirmOrderService__return = port.confirmOrderService(_confirmOrderService_xml);
//        System.out.println("confirmOrderService.result=" + _confirmOrderService__return);
//        System.exit(0);
//    }
//
//}
