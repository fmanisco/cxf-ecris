
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type of message allows a Member State to transmit the response to the
 *                 request. It can contain: (1) information on convictions extracted from the national criminal records
 *                 register (if any) in the case that the request could be processed and that a single person matching the
 *                 identification data has been found, (2) the request denial code if the request has been considered as
 *                 not valid by the requested Member State or (3) a request problem code if a business issue occurred
 *                 during the processing of the request.
 * 
 * <p>Java class for RequestResponseMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestResponseMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractMessageType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}CorrelatingMessageMetaDataType"/>
 *         &lt;element name="MessageData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}RequestResponseMessageDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestResponseMessageType")
public class RequestResponseMessageType
    extends AbstractMessageType
{


}
