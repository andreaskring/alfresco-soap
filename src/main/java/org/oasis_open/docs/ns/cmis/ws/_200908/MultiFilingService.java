package org.oasis_open.docs.ns.cmis.ws._200908;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-13T13:40:11.691+02:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "MultiFilingService",
                  wsdlLocation = "file:alfresco.wsdl",
                  targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/")
public class MultiFilingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "MultiFilingService");
    public final static QName MultiFilingServicePort = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "MultiFilingServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:alfresco.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MultiFilingService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:alfresco.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MultiFilingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MultiFilingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MultiFilingService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MultiFilingService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MultiFilingService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MultiFilingService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns MultiFilingServicePort
     */
    @WebEndpoint(name = "MultiFilingServicePort")
    public MultiFilingServicePort getMultiFilingServicePort() {
        return super.getPort(MultiFilingServicePort, MultiFilingServicePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MultiFilingServicePort
     */
    @WebEndpoint(name = "MultiFilingServicePort")
    public MultiFilingServicePort getMultiFilingServicePort(WebServiceFeature... features) {
        return super.getPort(MultiFilingServicePort, MultiFilingServicePort.class, features);
    }

}