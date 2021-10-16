
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents the data content of the "Notification" message.
 * 
 * <p>Java class for NotificationMessageDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationMessageDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractBusinessMessageDataType">
 *       &lt;sequence>
 *         &lt;element name="MessageDataContactPerson" type="{http://ec.europa.eu/ECRIS/messages-v1.0}ContactPersonType" minOccurs="0"/>
 *         &lt;element name="MessageDataPerson" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PersonType"/>
 *         &lt;element name="MessageDataRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *         &lt;element name="MessageDataConviction" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}ConvictionType"/>
 *         &lt;element name="MessageDataUpdatedConvictionReference" type="{http://ec.europa.eu/ECRIS/messages-v1.0}StructuredStrictConvictionReferenceType" minOccurs="0"/>
 *         &lt;element name="MessageDataOtherAffectedConviction" type="{http://ec.europa.eu/ECRIS/messages-v1.0}ConvictionToConvictionsRelationshipType" minOccurs="0"/>
 *         &lt;element name="MessageDataFingerprints" type="{http://ec.europa.eu/ECRIS/messages-v1.0}BinaryAttachmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessageDataType")
public class NotificationMessageDataType
    extends AbstractBusinessMessageDataType
{


}
