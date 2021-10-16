
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents the data content of the "Request Additional Info
 *                 Response" message. It combines in a single type of message the following business responses: additional
 *                 ID info available and additional ID info unavailable. The response type indicates the result of the
 *                 response.
 * 
 * <p>Java class for RequestAdditionalInfoResponseMessageDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestAdditionalInfoResponseMessageDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractBusinessMessageDataType">
 *       &lt;sequence>
 *         &lt;element name="MessageDataContactPerson" type="{http://ec.europa.eu/ECRIS/messages-v1.0}ContactPersonType" minOccurs="0"/>
 *         &lt;element name="MessageDataPerson" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PersonType" minOccurs="0"/>
 *         &lt;element name="MessageDataRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *         &lt;element name="MessageDataRequestPurpose" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars" minOccurs="0"/>
 *         &lt;element name="MessageDataRequestAdditionalInfoResponseTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestAdditionalInfoTypeExternalReferenceType"/>
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
@XmlType(name = "RequestAdditionalInfoResponseMessageDataType")
public class RequestAdditionalInfoResponseMessageDataType
    extends AbstractBusinessMessageDataType
{


}
