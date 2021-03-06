
package client;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GetIP4TravelService", targetNamespace = "http://servicer/", wsdlLocation = "http://localhost:8085/getIP4Travel?wsdl")
public class GetIP4TravelService
    extends Service
{

    private final static URL GETIP4TRAVELSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETIP4TRAVELSERVICE_EXCEPTION;
    private final static QName GETIP4TRAVELSERVICE_QNAME = new QName("http://servicer/", "GetIP4TravelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/getIP4Travel?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETIP4TRAVELSERVICE_WSDL_LOCATION = url;
        GETIP4TRAVELSERVICE_EXCEPTION = e;
    }

    public GetIP4TravelService() {
        super(__getWsdlLocation(), GETIP4TRAVELSERVICE_QNAME);
    }

    public GetIP4TravelService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETIP4TRAVELSERVICE_QNAME, features);
    }

    public GetIP4TravelService(URL wsdlLocation) {
        super(wsdlLocation, GETIP4TRAVELSERVICE_QNAME);
    }

    public GetIP4TravelService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETIP4TRAVELSERVICE_QNAME, features);
    }

    public GetIP4TravelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetIP4TravelService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetIP4Travel
     */
    @WebEndpoint(name = "GetIP4TravelPort")
    public GetIP4Travel getGetIP4TravelPort() {
        return super.getPort(new QName("http://servicer/", "GetIP4TravelPort"), GetIP4Travel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetIP4Travel
     */
    @WebEndpoint(name = "GetIP4TravelPort")
    public GetIP4Travel getGetIP4TravelPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicer/", "GetIP4TravelPort"), GetIP4Travel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETIP4TRAVELSERVICE_EXCEPTION!= null) {
            throw GETIP4TRAVELSERVICE_EXCEPTION;
        }
        return GETIP4TRAVELSERVICE_WSDL_LOCATION;
    }

}
