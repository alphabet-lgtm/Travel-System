
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetIP4Travel", targetNamespace = "http://servicer/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetIP4Travel {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIP4Travel", targetNamespace = "http://servicer/", className = "client.GetIP4Travel_Type")
    @ResponseWrapper(localName = "getIP4TravelResponse", targetNamespace = "http://servicer/", className = "client.GetIP4TravelResponse")
    @Action(input = "http://servicer/GetIP4Travel/getIP4TravelRequest", output = "http://servicer/GetIP4Travel/getIP4TravelResponse")
    public String getIP4Travel(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
