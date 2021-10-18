package it.beccaria.soapws.cxf.ecris.provider.deliver.server;

import java.util.Date;

import org.springframework.stereotype.Service;

import eu.europa.ec.ecris.contract.EcrisServicePortTypeV10Impl;
import eu.europa.ec.ecris.messages_v1.AbstractMessageType;
import eu.europa.ec.ecris.messages_v1.RequestMessageDataType;

/**
 *
 * @author francescoDOTmanisco
 *
 * intercetta tutti i metodi del server (tramite estensione)
 * e li espone al runtime spring
 *
 * ogni motodo e' senza return type ma generalmente
 *    // se va a buon fine // mostra quanto inviato
 *
 */
@Service
public class DeliverServer extends EcrisServicePortTypeV10Impl {


    @Override
	public void deliverRequestPush(eu.europa.ec.ecris.messages_v1.RequestMessagePushType body) {

		super.deliverRequestPush(body);

    }


    @Override
	public void deliverRequestAdditionalInfo(eu.europa.ec.ecris.messages_v1.RequestAdditionalInfoMessageType body) {

		super.deliverRequestAdditionalInfo(body);

    }


    @Override
	public void deliverNotification(eu.europa.ec.ecris.messages_v1.NotificationMessageType body) {

		super.deliverNotification(body);

    }


    @Override
	public void deliverRequestResponsePush(eu.europa.ec.ecris.messages_v1.RequestResponseMessagePushType body) {

		super.deliverRequestResponsePush(body);

    }


    @Override
	public void deliverFunctionalError(eu.europa.ec.ecris.messages_v1.FunctionalErrorMessageType body) {

		super.deliverFunctionalError(body);

    }


    @Override
	public void deliverNotificationResponse(eu.europa.ec.ecris.messages_v1.NotificationResponseMessageType body) {

		super.deliverNotificationResponse(body);

    }


    @Override
	public void deliverRequestAdditionalInfoResponsePush(eu.europa.ec.ecris.messages_v1.RequestAdditionalInfoResponseMessagePushType body) {

		super.deliverRequestAdditionalInfoResponsePush(body);

    }


    @Override
	public void deliverRequest(eu.europa.ec.ecris.messages_v1.RequestMessageType body) {

    	printPrequel(body);

    	super.deliverRequest(body);

    	printSequel(body);

    	// qui verificare se  bisogna usare qualche costrutto JAXB

    	try {
	    	var data = (RequestMessageDataType) body.getMessageData();
	    	var deadline = data.getMessageDataDeadline();

	    	System.out.println("last but not least");
	    	System.out.println("(RequestMessageDataType) body.getMessageData().getMessageDataDeadline()");

	    	System.out.println(deadline);
    	}
    	catch(java.lang.ClassCastException e) {

	    	System.out.println("last");
	    	System.out.println("qui verificare se  bisogna usare qualche costrutto JAXB");

//	    	//var messagesObjectFactory = new eu.europa.ec.ecris.messages_v1.ObjectFactory();
//	    	JAXBElement<RequestMessageDataType> a = (JAXBElement<RequestMessageDataType>) body.getMessageData();

//	    	ElementNSImpl  element = (ElementNSImpl ) body.getMessageData();

    	}




    }


    @Override
	public void deliverRequestAdditionalInfoResponse(eu.europa.ec.ecris.messages_v1.RequestAdditionalInfoResponseMessageType body) {

    	super.deliverRequestAdditionalInfoResponse(body);
    }


    @Override
	public void isAlive(javax.xml.ws.Holder<eu.europa.ec.ecris.messages_v1.IsAliveMessageType> body) {
       	//se va a buon fine restituisce quanto inviato

    	printPrequel(body.value);

    	super.isAlive(body);

        printSequel(body.value);

    }


    @Override
	public void deliverRequestDeadline(eu.europa.ec.ecris.messages_v1.RequestDeadlineMessageType body) {

    	super.deliverRequestDeadline(body);
    }


    @Override
	public void deliverNotificationPush(eu.europa.ec.ecris.messages_v1.NotificationMessagePushType body) {

    	super.deliverNotificationPush(body);

    }


    @Override
	public void deliverNotificationResponsePush(eu.europa.ec.ecris.messages_v1.NotificationResponseMessagePushType body) {

    	super.deliverNotificationResponsePush(body);

    }


    @Override
	public void deliverRequestResponse(eu.europa.ec.ecris.messages_v1.RequestResponseMessageType body) {

    	super.deliverRequestResponse(body);

    }


    @Override
	public void deliverCancellation(eu.europa.ec.ecris.messages_v1.CancellationMessageType body) {

    	super.deliverCancellation(body);

    }




///////////////////////////////////

    // utlity

    private void printPrequel(AbstractMessageType body) {

    	System.out.println();
    	System.out.println("-----------------------------------------------------------------------------------");
    	System.out.println("=== START esecuzione WS....:" + new Date());
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
    	System.out.println("= END esecuzione WS........:" + new Date());
    	System.out.println("====================================================================================");
    	System.out.println();

    }

}
