
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type of message allows a Member State to transmit a request to another
 *                 Member State for information and related data to be extracted from the criminal record of a person. It
 *                 possibly includes the fingerprints binary file (i.e. "push" implementation of the message).
 * 
 * <p>Java class for RequestMessagePushType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessagePushType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractMessageType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}MessageMetaDataType"/>
 *         &lt;element name="MessageData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}RequestMessageDataPushType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessagePushType")
public class RequestMessagePushType
    extends AbstractMessageType
{


}
