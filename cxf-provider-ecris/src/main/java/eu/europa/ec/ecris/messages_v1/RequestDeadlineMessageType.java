
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type of message allows a Member State to transmit the legal deadline
 *                 for the response to the requesting Member State.
 * 
 * <p>Java class for RequestDeadlineMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestDeadlineMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractMessageType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}CorrelatingMessageMetaDataType"/>
 *         &lt;element name="MessageData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}RequestDeadlineMessageDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDeadlineMessageType")
public class RequestDeadlineMessageType
    extends AbstractMessageType
{


}
