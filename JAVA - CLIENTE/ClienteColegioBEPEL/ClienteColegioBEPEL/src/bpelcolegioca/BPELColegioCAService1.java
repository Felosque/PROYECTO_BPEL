
package bpelcolegioca;

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
 * JAX-WS RI 2.2.10-b140319.1121
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "BPELColegioCAService1", targetNamespace = "BPELColegioCA",
                  wsdlLocation =
                  "http://192.168.16.12:9080/BPELColegioCAService1/casaPort1?wsdl#%7BBPELColegioCA%7DBPELColegioCAService1")
public class BPELColegioCAService1 extends Service {

    private final static URL BPELCOLEGIOCASERVICE1_WSDL_LOCATION;
    private final static WebServiceException BPELCOLEGIOCASERVICE1_EXCEPTION;
    private final static QName BPELCOLEGIOCASERVICE1_QNAME = new QName("BPELColegioCA", "BPELColegioCAService1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://192.168.16.12:9080/BPELColegioCAService1/casaPort1?wsdl#%7BBPELColegioCA%7DBPELColegioCAService1");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BPELCOLEGIOCASERVICE1_WSDL_LOCATION = url;
        BPELCOLEGIOCASERVICE1_EXCEPTION = e;
    }

    public BPELColegioCAService1() {
        super(__getWsdlLocation(), BPELCOLEGIOCASERVICE1_QNAME);
    }

    public BPELColegioCAService1(WebServiceFeature... features) {
        super(__getWsdlLocation(), BPELCOLEGIOCASERVICE1_QNAME, features);
    }

    public BPELColegioCAService1(URL wsdlLocation) {
        super(wsdlLocation, BPELCOLEGIOCASERVICE1_QNAME);
    }

    public BPELColegioCAService1(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BPELCOLEGIOCASERVICE1_QNAME, features);
    }

    public BPELColegioCAService1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BPELColegioCAService1(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns InvokeColegioEstudiantePortType
     */
    @WebEndpoint(name = "casaPort1")
    public InvokeColegioEstudiantePortType getCasaPort1() {
        return super.getPort(new QName("BPELColegioCA", "casaPort1"), InvokeColegioEstudiantePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InvokeColegioEstudiantePortType
     */
    @WebEndpoint(name = "casaPort1")
    public InvokeColegioEstudiantePortType getCasaPort1(WebServiceFeature... features) {
        return super.getPort(new QName("BPELColegioCA", "casaPort1"), InvokeColegioEstudiantePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BPELCOLEGIOCASERVICE1_EXCEPTION != null) {
            throw BPELCOLEGIOCASERVICE1_EXCEPTION;
        }
        return BPELCOLEGIOCASERVICE1_WSDL_LOCATION;
    }

}
