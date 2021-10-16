package it.beccaria.soapws.cxf.ecris.provider.deliver.server;

import java.util.Date;

import org.springframework.stereotype.Service;

import eu.europa.ec.ecris.contract.EcrisServicePortTypeV10Impl;

@Service
public class DeliverServer extends EcrisServicePortTypeV10Impl {


    @Override
	public void isAlive(javax.xml.ws.Holder<eu.europa.ec.ecris.messages_v1.IsAliveMessageType> body) {

    	//se va a buon fine restituisce quanto inviato

    	System.out.println();
    	System.out.println("-----------------------------------------------------------------------------------");
    	System.out.println();
    	System.out.println("=== START esecuzione ws" + new Date());
    	System.out.println(" corpo-del-messaggio ");
    	System.out.println(" pre operation isAlive");
    	System.out.println("                       body:" + body);
        System.out.println("                 body.value:" + body.value);
        System.out.println("body.value.getMessageData():" + body.value.getMessageData());
    	System.out.println();
    	System.out.println("chiamata super.operation");
    	System.out.println();

    		super.isAlive(body);

    	System.out.println();
    	System.out.println("post operation isAlive");
    	System.out.println("                       body:" + body);
        System.out.println("                 body.value:" + body.value);
        System.out.println("body.value.getMessageData():" + body.value.getMessageData());
    	System.out.println("= END esecuzione ws........:" + new Date());
    	System.out.println();
    	System.out.println("====================================================================================");
    	System.out.println();

    }

}
