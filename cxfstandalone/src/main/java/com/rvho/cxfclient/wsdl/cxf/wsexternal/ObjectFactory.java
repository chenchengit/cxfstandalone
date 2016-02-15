
package com.rvho.cxfclient.wsdl.cxf.wsexternal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rvho.cxfclient.wsdl.cxf.wsexternal package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetImOutbandwidth_QNAME = new QName("http://ws.easy.dnion.com/", "getImOutbandwidth");
    private final static QName _GetImOutbandwidthResponse_QNAME = new QName("http://ws.easy.dnion.com/", "getImOutbandwidthResponse");
    private final static QName _GetIpInfo_QNAME = new QName("http://ws.easy.dnion.com/", "getIpInfo");
    private final static QName _GetIpInfoResponse_QNAME = new QName("http://ws.easy.dnion.com/", "getIpInfoResponse");
    private final static QName _GetIpOutbandwidth_QNAME = new QName("http://ws.easy.dnion.com/", "getIpOutbandwidth");
    private final static QName _GetIpOutbandwidthResponse_QNAME = new QName("http://ws.easy.dnion.com/", "getIpOutbandwidthResponse");
    private final static QName _GetOutbandwidth_QNAME = new QName("http://ws.easy.dnion.com/", "getOutbandwidth");
    private final static QName _GetOutbandwidthResponse_QNAME = new QName("http://ws.easy.dnion.com/", "getOutbandwidthResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rvho.cxfclient.wsdl.cxf.wsexternal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetImOutbandwidth }
     * 
     */
    public GetImOutbandwidth createGetImOutbandwidth() {
        return new GetImOutbandwidth();
    }

    /**
     * Create an instance of {@link GetImOutbandwidthResponse }
     * 
     */
    public GetImOutbandwidthResponse createGetImOutbandwidthResponse() {
        return new GetImOutbandwidthResponse();
    }

    /**
     * Create an instance of {@link GetIpInfo }
     * 
     */
    public GetIpInfo createGetIpInfo() {
        return new GetIpInfo();
    }

    /**
     * Create an instance of {@link GetIpInfoResponse }
     * 
     */
    public GetIpInfoResponse createGetIpInfoResponse() {
        return new GetIpInfoResponse();
    }

    /**
     * Create an instance of {@link GetIpOutbandwidth }
     * 
     */
    public GetIpOutbandwidth createGetIpOutbandwidth() {
        return new GetIpOutbandwidth();
    }

    /**
     * Create an instance of {@link GetIpOutbandwidthResponse }
     * 
     */
    public GetIpOutbandwidthResponse createGetIpOutbandwidthResponse() {
        return new GetIpOutbandwidthResponse();
    }

    /**
     * Create an instance of {@link GetOutbandwidth }
     * 
     */
    public GetOutbandwidth createGetOutbandwidth() {
        return new GetOutbandwidth();
    }

    /**
     * Create an instance of {@link GetOutbandwidthResponse }
     * 
     */
    public GetOutbandwidthResponse createGetOutbandwidthResponse() {
        return new GetOutbandwidthResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImOutbandwidth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easy.dnion.com/", name = "getImOutbandwidth")
    public JAXBElement<GetImOutbandwidth> createGetImOutbandwidth(GetImOutbandwidth value) {
        return new JAXBElement<GetImOutbandwidth>(_GetImOutbandwidth_QNAME, GetImOutbandwidth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImOutbandwidthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easy.dnion.com/", name = "getImOutbandwidthResponse")
    public JAXBElement<GetImOutbandwidthResponse> createGetImOutbandwidthResponse(GetImOutbandwidthResponse value) {
        return new JAXBElement<GetImOutbandwidthResponse>(_GetImOutbandwidthResponse_QNAME, GetImOutbandwidthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIpInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easy.dnion.com/", name = "getIpInfo")
    public JAXBElement<GetIpInfo> createGetIpInfo(GetIpInfo value) {
        return new JAXBElement<GetIpInfo>(_GetIpInfo_QNAME, GetIpInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIpInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easy.dnion.com/", name = "getIpInfoResponse")
    public JAXBElement<GetIpInfoResponse> createGetIpInfoResponse(GetIpInfoResponse value) {
        return new JAXBElement<GetIpInfoResponse>(_GetIpInfoResponse_QNAME, GetIpInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIpOutbandwidth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easy.dnion.com/", name = "getIpOutbandwidth")
    public JAXBElement<GetIpOutbandwidth> createGetIpOutbandwidth(GetIpOutbandwidth value) {
        return new JAXBElement<GetIpOutbandwidth>(_GetIpOutbandwidth_QNAME, GetIpOutbandwidth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIpOutbandwidthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easy.dnion.com/", name = "getIpOutbandwidthResponse")
    public JAXBElement<GetIpOutbandwidthResponse> createGetIpOutbandwidthResponse(GetIpOutbandwidthResponse value) {
        return new JAXBElement<GetIpOutbandwidthResponse>(_GetIpOutbandwidthResponse_QNAME, GetIpOutbandwidthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutbandwidth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easy.dnion.com/", name = "getOutbandwidth")
    public JAXBElement<GetOutbandwidth> createGetOutbandwidth(GetOutbandwidth value) {
        return new JAXBElement<GetOutbandwidth>(_GetOutbandwidth_QNAME, GetOutbandwidth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutbandwidthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.easy.dnion.com/", name = "getOutbandwidthResponse")
    public JAXBElement<GetOutbandwidthResponse> createGetOutbandwidthResponse(GetOutbandwidthResponse value) {
        return new JAXBElement<GetOutbandwidthResponse>(_GetOutbandwidthResponse_QNAME, GetOutbandwidthResponse.class, null, value);
    }

}
