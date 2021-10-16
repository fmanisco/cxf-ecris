package it.beccaria.soapws.cxf.ecris.test.deliver.test;

import static org.junit.Assert.assertNotNull;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.Holder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import eu.europa.ec.ecris.messages_v1.IsAliveMessageType;
import it.beccaria.soapws.cxf.ecris.consumer.deliver.client.DeliverClient;
import it.beccaria.soapws.cxf.ecris.consumer.deliver.configuration.DeliverClientConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DeliverClientConfig.class, loader = AnnotationConfigContextLoader.class)
public class ClientIsAliveTest {

	@Autowired
	DeliverClient client;

	@Test
    public void testIsAlive() {



		eu.europa.ec.ecris.messages_v1.ObjectFactory
		messagesObjectFactory = new eu.europa.ec.ecris.messages_v1.ObjectFactory();

	eu.europa.ec.ecris.service_v1.ObjectFactory
		serviceObjectFactory = new eu.europa.ec.ecris.service_v1.ObjectFactory();

	var data = messagesObjectFactory.createIsAliveMessageDataType();
	System.out.println(" data.isIsAlive() 1 " + data.isIsAlive());

	var type = messagesObjectFactory.createIsAliveMessageType();

	type.setMessageData(data);

	data.setIsAlive(true);
	System.out.println(" data.isIsAlive() 2 " + data.isIsAlive());


	var invoke = serviceObjectFactory.createIsAliveMessage(type);

	System.out.println(" invoke.getValue() " + invoke.getValue());

	JAXBElement<IsAliveMessageType> jAXBElement = serviceObjectFactory.createIsAliveMessage(type);

	System.out.println(" jAXBElement " + jAXBElement);
	System.out.println(" jAXBElement.getValue() " + jAXBElement.getValue());

	System.out.println(" *** invoke.getValue().getMessageData() " + invoke.getValue().getMessageData());

		Holder<IsAliveMessageType> body = new Holder<>(type);
		client.isAlive(body);

		assertNotNull(body);
    }

}
