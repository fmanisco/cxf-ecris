
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents the data content of the "Request Additional Info"
 *                 message.
 * 
 * <p>Java class for RequestAdditionalInfoMessageDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestAdditionalInfoMessageDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractBusinessMessageDataType">
 *       &lt;sequence>
 *         &lt;element name="MessageDataContactPerson" type="{http://ec.europa.eu/ECRIS/messages-v1.0}ContactPersonType" minOccurs="0"/>
 *         &lt;element name="MessageDataRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *         &lt;element name="MessageDataAdditionalInformationRequested" type="{http://ec.europa.eu/ECRIS/messages-v1.0}AdditionalInformationRequestedEnumeration" maxOccurs="unbounded"/>
 *         &lt;element name="MessageDataBinaryIDRequested" type="{http://ec.europa.eu/ECRIS/messages-v1.0}BinaryAttachmentIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestAdditionalInfoMessageDataType")
public class RequestAdditionalInfoMessageDataType
    extends AbstractBusinessMessageDataType
{


}
