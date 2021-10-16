
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type of message allows a Member State to inform the convicting Member
 *                 State of the outcome of the processing of the notification. It can contain: (1) a success message and
 *                 optionally the identification information under which the notificationhas been processed or (2) a
 *                 problem code if a business issue occurred during the processing of the notification. It possibly
 *                 includes the fingerprints binary file (i.e. "push" implementation of the message).
 * 
 * <p>Java class for NotificationResponseMessagePushType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationResponseMessagePushType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractMessageType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}CorrelatingMessageMetaDataType"/>
 *         &lt;element name="MessageData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}NotificationResponseMessageDataPushType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationResponseMessagePushType")
public class NotificationResponseMessagePushType
    extends AbstractMessageType
{


}
