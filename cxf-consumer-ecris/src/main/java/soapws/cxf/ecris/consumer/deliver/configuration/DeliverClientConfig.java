package soapws.cxf.ecris.consumer.deliver.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import soapws.cxf.ecris.consumer.deliver.client.DeliverClient;


//@Slf4j
@Configuration
public class DeliverClientConfig {

	//@Value("${server.ws.uri}")
	private String defaultUri = "http://localhost:8380/cxf/ecris";

	@Bean
	@Qualifier("deliverMarshaller")
	public Jaxb2Marshaller deliverMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("eu.europa.ec.ecris.service_v1");
		return marshaller;
	}

	@Bean
	public DeliverClient getClientInstance(@Qualifier("deliverMarshaller") Jaxb2Marshaller marshaller) {

//		log.debug("defaultUri ");
//		log.debug( defaultUri);

		System.out.println("defaultUri ");
		System.out.println(defaultUri);

		var deliverClient = new DeliverClient();

		deliverClient.setDefaultUri(defaultUri);
		deliverClient.setMarshaller(marshaller);
		deliverClient.setUnmarshaller(marshaller);

		return deliverClient;
	}

}
