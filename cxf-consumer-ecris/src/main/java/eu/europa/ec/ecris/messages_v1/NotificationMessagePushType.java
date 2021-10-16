
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type of message allows a Member State to transmit a notification the
 *                 Member State of the convicted person's nationality, carrying information on the conviction as well as
 *                 information on subsequent alterations and deletions. It possibly includes the fingerprints binary file
 *                 (i.e. "push" implementation of the message).
 * 
 * <p>Java class for NotificationMessagePushType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationMessagePushType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractMessageType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}MessageMetaDataType"/>
 *         &lt;element name="MessageData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}NotificationMessageDataPushType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessagePushType")
public class NotificationMessagePushType
    extends AbstractMessageType
{


}
