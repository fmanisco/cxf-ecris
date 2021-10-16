package it.beccaria.soapws.cxf.ecris.consumer.deliver.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import eu.europa.ec.ecris.contract.EcrisServicePortTypeV10;
import eu.europa.ec.ecris.contract.EcrisServiceV10Nofp;
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

@Service
public class DeliverClient extends WebServiceGatewaySupport implements EcrisServicePortTypeV10 {


	//da mettere in un builder locale

	QName SERVICE_NAME = new QName("http://ec.europa.eu/ECRIS/contract", "ecrisService-v1.0_nofp");
    URL wsdlURL = getUrlInstance("http://localhost:8380/cxf/ecris?wsdl");

    EcrisServiceV10Nofp ss = new EcrisServiceV10Nofp(wsdlURL, SERVICE_NAME);
    EcrisServicePortTypeV10 port = ss.getEcrisServicePortV10();



	@Override
	public void deliverRequestPush(RequestMessagePushType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverRequestAdditionalInfo(RequestAdditionalInfoMessageType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverNotification(NotificationMessageType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverRequestResponsePush(RequestResponseMessagePushType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverFunctionalError(FunctionalErrorMessageType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverNotificationResponse(NotificationResponseMessageType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverRequestAdditionalInfoResponsePush(RequestAdditionalInfoResponseMessagePushType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverRequest(RequestMessageType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverRequestAdditionalInfoResponse(RequestAdditionalInfoResponseMessageType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void isAlive(Holder<IsAliveMessageType> body) {

		System.out.println("ZANZIBAR");
		port.isAlive(body);
		System.out.println("=== final body " + body.value.getMessageData());

	}

	@Override
	public void deliverRequestDeadline(RequestDeadlineMessageType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverNotificationPush(NotificationMessagePushType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverNotificationResponsePush(NotificationResponseMessagePushType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverRequestResponse(RequestResponseMessageType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

	@Override
	public void deliverCancellation(CancellationMessageType body) {
		// TODO Auto-generated method stub
		System.out.println(body);
	}

    URL getUrlInstance(String uri) {
    	try {
			return new URL("http://localhost:8380/cxf/ecris?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }

}
