package com.jumbo.webservice.pda.uploadInventoryCheck;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.jumbo.webservice.base.AuthRequest;
import com.jumbo.webservice.base.AuthRequestHeader;


/**
 * <p>
 * uploadInventoryCheckRequest complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="uploadInventoryCheckRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequestHeader" type="{http://webservice.jumbo.com/pda/}authRequestHeader"/>
 *         &lt;element name="uploadInventoryCheckRequestBody" type="{http://webservice.jumbo.com/pda/}uploadInventoryCheckRequestBody"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadInventoryCheckRequest", propOrder = {"authRequestHeader", "uploadInventoryCheckRequestBody"})
public class UploadInventoryCheckRequest implements AuthRequest, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6693105262845969234L;
    @XmlElement(required = true)
    protected AuthRequestHeader authRequestHeader;
    @XmlElement(required = true)
    protected UploadInventoryCheckRequestBody uploadInventoryCheckRequestBody;

    /**
     * 获取authRequestHeader属性的值。
     * 
     * @return possible object is {@link AuthRequestHeader }
     * 
     */
    @Override
    public AuthRequestHeader getAuthRequestHeader() {
        return authRequestHeader;
    }

    /**
     * 设置authRequestHeader属性的值。
     * 
     * @param value allowed object is {@link AuthRequestHeader }
     * 
     */
    public void setAuthRequestHeader(AuthRequestHeader value) {
        this.authRequestHeader = value;
    }

    /**
     * 获取uploadInventoryCheckRequestBody属性的值。
     * 
     * @return possible object is {@link UploadInventoryCheckRequestBody }
     * 
     */
    public UploadInventoryCheckRequestBody getUploadInventoryCheckRequestBody() {
        return uploadInventoryCheckRequestBody;
    }

    /**
     * 设置uploadInventoryCheckRequestBody属性的值。
     * 
     * @param value allowed object is {@link UploadInventoryCheckRequestBody }
     * 
     */
    public void setUploadInventoryCheckRequestBody(UploadInventoryCheckRequestBody value) {
        this.uploadInventoryCheckRequestBody = value;
    }

}
