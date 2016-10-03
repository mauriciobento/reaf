
package com.reafmarketing.giftcardmanagement;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GiftCardManagementWSService", targetNamespace = "http://www.reafmarketing.com/GiftCardManagement/", wsdlLocation = "http://localhost:8080/ReafMarketing-core-1.0-SNAPSHOT/GiftCardManagement?wsdl")
public class GiftCardManagementWSService
    extends Service
{

    private final static URL GIFTCARDMANAGEMENTWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException GIFTCARDMANAGEMENTWSSERVICE_EXCEPTION;
    private final static QName GIFTCARDMANAGEMENTWSSERVICE_QNAME = new QName("http://www.reafmarketing.com/GiftCardManagement/", "GiftCardManagementWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ReafMarketing-core-1.0-SNAPSHOT/GiftCardManagement?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GIFTCARDMANAGEMENTWSSERVICE_WSDL_LOCATION = url;
        GIFTCARDMANAGEMENTWSSERVICE_EXCEPTION = e;
    }

    public GiftCardManagementWSService() {
        super(__getWsdlLocation(), GIFTCARDMANAGEMENTWSSERVICE_QNAME);
    }

    public GiftCardManagementWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GIFTCARDMANAGEMENTWSSERVICE_QNAME, features);
    }

    public GiftCardManagementWSService(URL wsdlLocation) {
        super(wsdlLocation, GIFTCARDMANAGEMENTWSSERVICE_QNAME);
    }

    public GiftCardManagementWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GIFTCARDMANAGEMENTWSSERVICE_QNAME, features);
    }

    public GiftCardManagementWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GiftCardManagementWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GiftCardManagement
     */
    @WebEndpoint(name = "GiftCardManagementPort")
    public GiftCardManagement getGiftCardManagementPort() {
        return super.getPort(new QName("http://www.reafmarketing.com/GiftCardManagement/", "GiftCardManagementPort"), GiftCardManagement.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GiftCardManagement
     */
    @WebEndpoint(name = "GiftCardManagementPort")
    public GiftCardManagement getGiftCardManagementPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.reafmarketing.com/GiftCardManagement/", "GiftCardManagementPort"), GiftCardManagement.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GIFTCARDMANAGEMENTWSSERVICE_EXCEPTION!= null) {
            throw GIFTCARDMANAGEMENTWSSERVICE_EXCEPTION;
        }
        return GIFTCARDMANAGEMENTWSSERVICE_WSDL_LOCATION;
    }

}