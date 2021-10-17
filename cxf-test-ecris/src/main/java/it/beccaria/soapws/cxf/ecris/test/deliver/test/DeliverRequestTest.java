package it.beccaria.soapws.cxf.ecris.test.deliver.test;

import java.time.LocalDate;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import it.beccaria.soapws.cxf.ecris.consumer.deliver.client.DeliverClient;
import it.beccaria.soapws.cxf.ecris.consumer.deliver.configuration.DeliverClientConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DeliverClientConfig.class, loader = AnnotationConfigContextLoader.class)
public class DeliverRequestTest {

	@Autowired
	DeliverClient client;

	@Test
	public void testDeliverRequest() {

		var messagesObjectFactory = new eu.europa.ec.ecris.messages_v1.ObjectFactory();

		var serviceObjectFactory = new eu.europa.ec.ecris.service_v1.ObjectFactory();

		var data = messagesObjectFactory.createRequestMessageDataType();

		var type = messagesObjectFactory.createRequestMessageType();

		type.setMessageData(data);

		///// qui interveniamo per verificare invio
		//qualche set

		LocalDate localDate = LocalDate.of(1960, 11, 9);

		try {
			XMLGregorianCalendar xmlGregorianCalendar =
			  DatatypeFactory.newInstance().newXMLGregorianCalendar(localDate.toString());

			data.setMessageDataDeadline(xmlGregorianCalendar);


		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		var invoke = serviceObjectFactory.createRequestMessage(type);

		//RequestMessageType body = new RequestMessageType();
		var body = invoke.getValue();

		client.deliverRequest(body);
	}

}
