package soapws.cxf.ecris.provider.deliver.configuration;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import soapws.cxf.ecris.provider.deliver.server.DeliverServer;

@Configuration
public class DeliverServerConfig {

	@Value("${server.ws.path}")
	private String wsPath;

	@Value("${server.ws.address}")
	private String wsAddress;

	@Bean
	public ServletRegistrationBean<CXFServlet> cxfServlet() {
		return new ServletRegistrationBean<>(new CXFServlet(), wsPath);
	}


	@Bean
	@Primary
	public DispatcherServletPath dispatcherServletPathProvider() {
	    return () -> "";
	}

	/**
	 * la classe implementor 'locale' estende la impl prodotta da cxf su soapui
	 * e viene resa accessibile dal runtime di spring
	 * ha nel nome il riferimento alla nostra implementazione
	 *
	 * @author francescoDOTmanisco
	 *
	 */	@Bean
	public Endpoint endpoint(Bus bus, DeliverServer implementor) {

		var endpoint = new EndpointImpl(bus, implementor);

        endpoint.publish(wsAddress);

		return endpoint;
	}


}