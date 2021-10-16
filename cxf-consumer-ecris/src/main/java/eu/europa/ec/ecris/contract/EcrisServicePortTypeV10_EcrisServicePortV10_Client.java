
package eu.europa.ec.ecris.contract;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2021-10-14T19:05:05.280+02:00
 * Generated source version: 2.4.6
 *
 */
public final class EcrisServicePortTypeV10_EcrisServicePortV10_Client {

    private static final QName SERVICE_NAME = new QName("http://ec.europa.eu/ECRIS/contract", "ecrisService-v1.0_nofp");

    private EcrisServicePortTypeV10_EcrisServicePortV10_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EcrisServiceV10Nofp.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        EcrisServiceV10Nofp ss = new EcrisServiceV10Nofp(wsdlURL, SERVICE_NAME);
        EcrisServicePortTypeV10 port = ss.getEcrisServicePortV10();

        {
        System.out.println("Invoking deliverRequestPush...");
        eu.europa.ec.ecris.messages_v1.RequestMessagePushType _deliverRequestPush_body = null;
        port.deliverRequestPush(_deliverRequestPush_body);


        }
        {
        System.out.println("Invoking deliverRequestAdditionalInfo...");
        eu.europa.ec.ecris.messages_v1.RequestAdditionalInfoMessageType _deliverRequestAdditionalInfo_body = null;
        port.deliverRequestAdditionalInfo(_deliverRequestAdditionalInfo_body);


        }
        {
        System.out.println("Invoking deliverNotification...");
        eu.europa.ec.ecris.messages_v1.NotificationMessageType _deliverNotification_body = null;
        port.deliverNotification(_deliverNotification_body);


        }
        {
        System.out.println("Invoking deliverRequestResponsePush...");
        eu.europa.ec.ecris.messages_v1.RequestResponseMessagePushType _deliverRequestResponsePush_body = null;
        port.deliverRequestResponsePush(_deliverRequestResponsePush_body);


        }
        {
        System.out.println("Invoking deliverFunctionalError...");
        eu.europa.ec.ecris.messages_v1.FunctionalErrorMessageType _deliverFunctionalError_body = null;
        port.deliverFunctionalError(_deliverFunctionalError_body);


        }
        {
        System.out.println("Invoking deliverNotificationResponse...");
        eu.europa.ec.ecris.messages_v1.NotificationResponseMessageType _deliverNotificationResponse_body = null;
        port.deliverNotificationResponse(_deliverNotificationResponse_body);


        }
        {
        System.out.println("Invoking deliverRequestAdditionalInfoResponsePush...");
        eu.europa.ec.ecris.messages_v1.RequestAdditionalInfoResponseMessagePushType _deliverRequestAdditionalInfoResponsePush_body = null;
        port.deliverRequestAdditionalInfoResponsePush(_deliverRequestAdditionalInfoResponsePush_body);


        }
        {
        System.out.println("Invoking deliverRequest...");
        eu.europa.ec.ecris.messages_v1.RequestMessageType _deliverRequest_body = null;
        port.deliverRequest(_deliverRequest_body);


        }
        {
        System.out.println("Invoking deliverRequestAdditionalInfoResponse...");
        eu.europa.ec.ecris.messages_v1.RequestAdditionalInfoResponseMessageType _deliverRequestAdditionalInfoResponse_body = null;
        port.deliverRequestAdditionalInfoResponse(_deliverRequestAdditionalInfoResponse_body);


        }
        {
        System.out.println("Invoking isAlive...");
        eu.europa.ec.ecris.messages_v1.IsAliveMessageType _isAlive_bodyVal = null;
        javax.xml.ws.Holder<eu.europa.ec.ecris.messages_v1.IsAliveMessageType> _isAlive_body = new javax.xml.ws.Holder<eu.europa.ec.ecris.messages_v1.IsAliveMessageType>(_isAlive_bodyVal);
        port.isAlive(_isAlive_body);

        System.out.println("isAlive._isAlive_body=" + _isAlive_body.value);

        }
        {
        System.out.println("Invoking deliverRequestDeadline...");
        eu.europa.ec.ecris.messages_v1.RequestDeadlineMessageType _deliverRequestDeadline_body = null;
        port.deliverRequestDeadline(_deliverRequestDeadline_body);


        }
        {
        System.out.println("Invoking deliverNotificationPush...");
        eu.europa.ec.ecris.messages_v1.NotificationMessagePushType _deliverNotificationPush_body = null;
        port.deliverNotificationPush(_deliverNotificationPush_body);


        }
        {
        System.out.println("Invoking deliverNotificationResponsePush...");
        eu.europa.ec.ecris.messages_v1.NotificationResponseMessagePushType _deliverNotificationResponsePush_body = null;
        port.deliverNotificationResponsePush(_deliverNotificationResponsePush_body);


        }
        {
        System.out.println("Invoking deliverRequestResponse...");
        eu.europa.ec.ecris.messages_v1.RequestResponseMessageType _deliverRequestResponse_body = null;
        port.deliverRequestResponse(_deliverRequestResponse_body);


        }
        {
        System.out.println("Invoking deliverCancellation...");
        eu.europa.ec.ecris.messages_v1.CancellationMessageType _deliverCancellation_body = null;
        port.deliverCancellation(_deliverCancellation_body);


        }

        System.exit(0);
    }

}