package eu.europa.ec.ecris.contract;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * The ECRIS DeliverEX v1.0
 *
 * This class was generated by Apache CXF 2.4.6
 * 2021-10-14T19:05:05.335+02:00
 * Generated source version: 2.4.6
 * 
 */
@WebServiceClient(name = "ecrisService-v1.0_nofp", 
                  wsdlLocation = "file:/C:/Users/franc/AppData/Local/Temp/tempdir7831344323384713658.tmp/ecris-service-v1.0_1.wsdl",
                  targetNamespace = "http://ec.europa.eu/ECRIS/contract") 
public class EcrisServiceV10Nofp extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ec.europa.eu/ECRIS/contract", "ecrisService-v1.0_nofp");
    public final static QName EcrisServicePortV10 = new QName("http://ec.europa.eu/ECRIS/contract", "ecrisServicePort-v1.0");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/franc/AppData/Local/Temp/tempdir7831344323384713658.tmp/ecris-service-v1.0_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EcrisServiceV10Nofp.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/franc/AppData/Local/Temp/tempdir7831344323384713658.tmp/ecris-service-v1.0_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EcrisServiceV10Nofp(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EcrisServiceV10Nofp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EcrisServiceV10Nofp() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EcrisServiceV10Nofp(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EcrisServiceV10Nofp(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public EcrisServiceV10Nofp(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns EcrisServicePortTypeV10
     */
    @WebEndpoint(name = "ecrisServicePort-v1.0")
    public EcrisServicePortTypeV10 getEcrisServicePortV10() {
        return super.getPort(EcrisServicePortV10, EcrisServicePortTypeV10.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EcrisServicePortTypeV10
     */
    @WebEndpoint(name = "ecrisServicePort-v1.0")
    public EcrisServicePortTypeV10 getEcrisServicePortV10(WebServiceFeature... features) {
        return super.getPort(EcrisServicePortV10, EcrisServicePortTypeV10.class, features);
    }

}
