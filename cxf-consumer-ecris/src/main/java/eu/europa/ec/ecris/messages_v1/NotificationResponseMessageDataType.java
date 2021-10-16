
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents the data content of the "Notification Response"
 *                 message. It combines in a single type of message the following business responses: notification problem
 *                 and notification receipt. The response type indicates the result of the response.
 * 
 * <p>Java class for NotificationResponseMessageDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationResponseMessageDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractBusinessMessageDataType">
 *       &lt;sequence>
 *         &lt;element name="MessageDataContactPerson" type="{http://ec.europa.eu/ECRIS/messages-v1.0}ContactPersonType" minOccurs="0"/>
 *         &lt;element name="MessageDataPerson" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PersonType" minOccurs="0"/>
 *         &lt;element name="MessageDataRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *         &lt;element name="MessageDataNotificationResponseTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}NotificationResponseTypeExternalReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationResponseMessageDataType")
public class NotificationResponseMessageDataType
    extends AbstractBusinessMessageDataType
{


}
