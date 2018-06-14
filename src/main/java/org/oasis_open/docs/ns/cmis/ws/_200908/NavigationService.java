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
 * 2018-06-13T13:40:11.712+02:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "NavigationService",
                  wsdlLocation = "file:alfresco.wsdl",
                  targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/")
public class NavigationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "NavigationService");
    public final static QName NavigationServicePort = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "NavigationServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:alfresco.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(NavigationService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:alfresco.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public NavigationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public NavigationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NavigationService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public NavigationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public NavigationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public NavigationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns NavigationServicePort
     */
    @WebEndpoint(name = "NavigationServicePort")
    public NavigationServicePort getNavigationServicePort() {
        return super.getPort(NavigationServicePort, NavigationServicePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NavigationServicePort
     */
    @WebEndpoint(name = "NavigationServicePort")
    public NavigationServicePort getNavigationServicePort(WebServiceFeature... features) {
        return super.getPort(NavigationServicePort, NavigationServicePort.class, features);
    }

}
