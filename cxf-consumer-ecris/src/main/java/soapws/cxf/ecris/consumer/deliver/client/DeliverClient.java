package soapws.cxf.ecris.consumer.deliver.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import eu.europa.ec.ecris.contract.EcrisServicePortTypeV10;
import eu.europa.ec.ecris.contract.EcrisServiceV10Nofp;
import eu.europa.ec.ecris.messages_v1.AbstractMessageType;
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
import eu.europa.ec.ecris.messages_v1.RequestMessageDataType;
import eu.europa.ec.ecris.messages_v1.RequestMessagePushType;
import eu.europa.ec.ecris.messages_v1.RequestMessageType;
import eu.europa.ec.ecris.messages_v1.RequestResponseMessagePushType;
import eu.europa.ec.ecris.messages_v1.RequestResponseMessageType;

@Service
public class DeliverClient extends WebServiceGatewaySupport implements EcrisServicePortTypeV10 {

    //questa prima parte e' stata estrapolata dalle classi generate da cxf
	//da mettere in un builder locale

	QName SERVICE_NAME = new QName("http://ec.europa.eu/ECRIS/contract", "ecrisService-v1.0_nofp");
    URL wsdlURL = getUrlInstance("http://localhost:8380/cxf/ecris?wsdl");

    EcrisServiceV10Nofp ss = new EcrisServiceV10Nofp(wsdlURL, SERVICE_NAME);
    EcrisServicePortTypeV10 port = ss.getEcrisServicePortV10();

    URL getUrlInstance(String uri) {
    	try {

    		var result = new URL("http://localhost:8380/cxf/ecris?wsdl");

			return result;

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }


    //quello che segue è stato copiato come STUB dove inserire
    // AT LEAST port.metodo(argomento body)
    // ed eventuale debug (no logica se non per estrarre info)

	@Override
	public void deliverRequestPush(RequestMessagePushType body) {
		printPrequel(body);
		port.deliverRequestPush(body);
		printSequel(body);
	}

	@Override
	public void deliverRequestAdditionalInfo(RequestAdditionalInfoMessageType body) {
		printPrequel(body);
		port.deliverRequestAdditionalInfo(body);
		printSequel(body);
	}

	@Override
	public void deliverNotification(NotificationMessageType body) {

		printPrequel(body);
		port.deliverNotification(body);
		printSequel(body);
	}

	@Override
	public void deliverRequestResponsePush(RequestResponseMessagePushType body) {
	   	printPrequel(body);
			port.deliverRequestResponsePush(body);
	    	printSequel(body);
	}

	@Override
	public void deliverFunctionalError(FunctionalErrorMessageType body) {

    	printPrequel(body);
		port.deliverFunctionalError(body);
    	printSequel(body);
	}

	@Override
	public void deliverNotificationResponse(NotificationResponseMessageType body) {

    	printPrequel(body);
		port.deliverNotificationResponse(body);
    	printSequel(body);
	}

	@Override
	public void deliverRequestAdditionalInfoResponsePush(RequestAdditionalInfoResponseMessagePushType body) {

	   	printPrequel(body);
			port.deliverRequestAdditionalInfoResponsePush(body);
	    	printSequel(body);
	}

	@Override
	public void deliverRequest(RequestMessageType body) {

    	printPrequel(body);
		port.deliverRequest(body);
    	printSequel(body);

		/////////////////////////////////////////////////////

    	var data = (RequestMessageDataType) body.getMessageData();
    	var deadline = data.getMessageDataDeadline();



    	System.out.println("CLIENT invia >>>");
    	System.out.println("(RequestMessageDataType) body.getMessageData().getMessageDataDeadline()");
    	System.out.println(deadline);

	}

	@Override
	public void deliverRequestAdditionalInfoResponse(RequestAdditionalInfoResponseMessageType body) {

    	printPrequel(body);
		port.deliverRequestAdditionalInfoResponse(body);
    	printSequel(body);
	}

	@Override
	public void isAlive(Holder<IsAliveMessageType> body) {

    	printPrequel(body.value);
		port.isAlive(body);
    	printSequel(body.value);

	}

	@Override
	public void deliverRequestDeadline(RequestDeadlineMessageType body) {

    	printPrequel(body);
		port.deliverRequestDeadline(body);
    	printSequel(body);

	}

	@Override
	public void deliverNotificationPush(NotificationMessagePushType body) {

    	printPrequel(body);
		port.deliverNotificationPush(body);
    	printSequel(body);

	}

	@Override
	public void deliverNotificationResponsePush(NotificationResponseMessagePushType body) {

    	printPrequel(body);
		port.deliverNotificationResponsePush(body);
    	printSequel(body);

	}

	@Override
	public void deliverRequestResponse(RequestResponseMessageType body) {
    	printPrequel(body);
		port.deliverRequestResponse(body);
    	printSequel(body);

	}

	@Override
	public void deliverCancellation(CancellationMessageType body) {
    	printPrequel(body);
		port.deliverCancellation(body);
    	printSequel(body);

	}

	//util

	   private void printPrequel(AbstractMessageType body) {

	    	System.out.println();
	    	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	    	System.out.println("=== START CLIENT WS" + new Date());
	    	System.out.println(" corpo-del-messaggio ");
	    	System.out.println(" pre operation");
	    	System.out.println("                body:" + body);
	        System.out.println(" body.getMessageData:" + body.getMessageData());
	     	System.out.println("chiamata super.operation");
	    	System.out.println("...");

	    }

	    private void printSequel(AbstractMessageType body) {

	    	System.out.println("...");
	    	System.out.println("post operation");
	    	System.out.println("                body:" + body);
	        System.out.println(" body.getMessageData:" + body.getMessageData());
	    	System.out.println("= END CLIENT WS........:" + new Date());
	    	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	    	System.out.println();

	    }

}
