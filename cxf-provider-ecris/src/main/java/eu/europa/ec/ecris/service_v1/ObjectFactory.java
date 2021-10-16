
package eu.europa.ec.ecris.service_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import eu.europa.ec.ecris.messages_v1.CancellationMessageType;
import eu.europa.ec.ecris.messages_v1.FunctionalErrorMessageType;
import eu.europa.ec.ecris.messages_v1.IsAliveMessageType;
import eu.europa.ec.ecris.messages_v1.NotificationMessagePushType;
import eu.europa.ec.ecris.messages_v1.NotificationMessageType;
import eu.europa.ec.ecris.messages_v1.NotificationResponseMessagePushType;
import eu.europa.ec.ecris.messages_v1.NotificationResponseMessageType;
import eu.europa.ec.ecris.messages_v1.RequestAdditionalInfoMessageType;
import eu.europa.ec.ecris.messages_v1.RequestAdditionalInfoResponseMessagePushType;
import eu.europa.ec.ecris.messages_v1.RequestAdditionalInfoResponseMessageType;
import eu.europa.ec.ecris.messages_v1.RequestDeadlineMessageType;
import eu.europa.ec.ecris.messages_v1.RequestMessagePushType;
import eu.europa.ec.ecris.messages_v1.RequestMessageType;
import eu.europa.ec.ecris.messages_v1.RequestResponseMessagePushType;
import eu.europa.ec.ecris.messages_v1.RequestResponseMessageType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.ec.ecris.service_v1 package. 
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

    private final static QName _IsAliveMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "IsAliveMessage");
    private final static QName _RequestAdditionalInfoResponseMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "RequestAdditionalInfoResponseMessage");
    private final static QName _NotificationMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "NotificationMessage");
    private final static QName _RequestMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "RequestMessage");
    private final static QName _RequestPushMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "RequestPushMessage");
    private final static QName _RequestResponseMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "RequestResponseMessage");
    private final static QName _CancellationMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "CancellationMessage");
    private final static QName _NotificationResponseMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "NotificationResponseMessage");
    private final static QName _RequestAdditionalInfoResponsePushMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "RequestAdditionalInfoResponsePushMessage");
    private final static QName _RequestDeadlineMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "RequestDeadlineMessage");
    private final static QName _FunctionalErrorMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "FunctionalErrorMessage");
    private final static QName _NotificationResponsePushMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "NotificationResponsePushMessage");
    private final static QName _RequestAdditionalInfoMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "RequestAdditionalInfoMessage");
    private final static QName _RequestResponsePushMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "RequestResponsePushMessage");
    private final static QName _NotificationPushMessage_QNAME = new QName("http://ec.europa.eu/ECRIS/service-v1.0", "NotificationPushMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.ec.ecris.service_v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAliveMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "IsAliveMessage")
    public JAXBElement<IsAliveMessageType> createIsAliveMessage(IsAliveMessageType value) {
        return new JAXBElement<IsAliveMessageType>(_IsAliveMessage_QNAME, IsAliveMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestAdditionalInfoResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "RequestAdditionalInfoResponseMessage")
    public JAXBElement<RequestAdditionalInfoResponseMessageType> createRequestAdditionalInfoResponseMessage(RequestAdditionalInfoResponseMessageType value) {
        return new JAXBElement<RequestAdditionalInfoResponseMessageType>(_RequestAdditionalInfoResponseMessage_QNAME, RequestAdditionalInfoResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "NotificationMessage")
    public JAXBElement<NotificationMessageType> createNotificationMessage(NotificationMessageType value) {
        return new JAXBElement<NotificationMessageType>(_NotificationMessage_QNAME, NotificationMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "RequestMessage")
    public JAXBElement<RequestMessageType> createRequestMessage(RequestMessageType value) {
        return new JAXBElement<RequestMessageType>(_RequestMessage_QNAME, RequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessagePushType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "RequestPushMessage")
    public JAXBElement<RequestMessagePushType> createRequestPushMessage(RequestMessagePushType value) {
        return new JAXBElement<RequestMessagePushType>(_RequestPushMessage_QNAME, RequestMessagePushType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "RequestResponseMessage")
    public JAXBElement<RequestResponseMessageType> createRequestResponseMessage(RequestResponseMessageType value) {
        return new JAXBElement<RequestResponseMessageType>(_RequestResponseMessage_QNAME, RequestResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellationMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "CancellationMessage")
    public JAXBElement<CancellationMessageType> createCancellationMessage(CancellationMessageType value) {
        return new JAXBElement<CancellationMessageType>(_CancellationMessage_QNAME, CancellationMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "NotificationResponseMessage")
    public JAXBElement<NotificationResponseMessageType> createNotificationResponseMessage(NotificationResponseMessageType value) {
        return new JAXBElement<NotificationResponseMessageType>(_NotificationResponseMessage_QNAME, NotificationResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestAdditionalInfoResponseMessagePushType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "RequestAdditionalInfoResponsePushMessage")
    public JAXBElement<RequestAdditionalInfoResponseMessagePushType> createRequestAdditionalInfoResponsePushMessage(RequestAdditionalInfoResponseMessagePushType value) {
        return new JAXBElement<RequestAdditionalInfoResponseMessagePushType>(_RequestAdditionalInfoResponsePushMessage_QNAME, RequestAdditionalInfoResponseMessagePushType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDeadlineMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "RequestDeadlineMessage")
    public JAXBElement<RequestDeadlineMessageType> createRequestDeadlineMessage(RequestDeadlineMessageType value) {
        return new JAXBElement<RequestDeadlineMessageType>(_RequestDeadlineMessage_QNAME, RequestDeadlineMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionalErrorMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "FunctionalErrorMessage")
    public JAXBElement<FunctionalErrorMessageType> createFunctionalErrorMessage(FunctionalErrorMessageType value) {
        return new JAXBElement<FunctionalErrorMessageType>(_FunctionalErrorMessage_QNAME, FunctionalErrorMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationResponseMessagePushType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "NotificationResponsePushMessage")
    public JAXBElement<NotificationResponseMessagePushType> createNotificationResponsePushMessage(NotificationResponseMessagePushType value) {
        return new JAXBElement<NotificationResponseMessagePushType>(_NotificationResponsePushMessage_QNAME, NotificationResponseMessagePushType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestAdditionalInfoMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "RequestAdditionalInfoMessage")
    public JAXBElement<RequestAdditionalInfoMessageType> createRequestAdditionalInfoMessage(RequestAdditionalInfoMessageType value) {
        return new JAXBElement<RequestAdditionalInfoMessageType>(_RequestAdditionalInfoMessage_QNAME, RequestAdditionalInfoMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResponseMessagePushType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "RequestResponsePushMessage")
    public JAXBElement<RequestResponseMessagePushType> createRequestResponsePushMessage(RequestResponseMessagePushType value) {
        return new JAXBElement<RequestResponseMessagePushType>(_RequestResponsePushMessage_QNAME, RequestResponseMessagePushType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationMessagePushType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/service-v1.0", name = "NotificationPushMessage")
    public JAXBElement<NotificationMessagePushType> createNotificationPushMessage(NotificationMessagePushType value) {
        return new JAXBElement<NotificationMessagePushType>(_NotificationPushMessage_QNAME, NotificationMessagePushType.class, null, value);
    }

}
