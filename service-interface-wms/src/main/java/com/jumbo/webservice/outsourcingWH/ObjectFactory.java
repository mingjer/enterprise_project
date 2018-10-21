package com.jumbo.webservice.outsourcingWH;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the cn.baozun.sync package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation
 * for XML content. The Java representation of XML content can consist of schema derived interfaces
 * and classes representing the binding of schema type definitions, element declarations and model
 * groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory implements Serializable {


    /**
     * 
     */
    private static final long serialVersionUID = -9030077292746345307L;

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes
     * for package: cn.baozun.sync
     * 
     */
    public ObjectFactory() {}

    /**
     * Create an instance of {@link BhSyncResponse }
     * 
     */
    public BhSyncResponse createBhSyncResponse() {
        return new BhSyncResponse();
    }

    /**
     * Create an instance of {@link BhSyncRequest }
     * 
     */
    public BhSyncRequest createBhSyncRequest() {
        return new BhSyncRequest();
    }

}