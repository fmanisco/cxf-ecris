
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents the data content of the "Request" message possibly
 *                 including the fingerprints binary file (i.e. "push" implementation of the message).
 * 
 * <p>Java class for RequestMessageDataPushType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessageDataPushType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractBusinessMessageDataType">
 *       &lt;sequence>
 *         &lt;element name="MessageDataContactPerson" type="{http://ec.europa.eu/ECRIS/messages-v1.0}ContactPersonType" minOccurs="0"/>
 *         &lt;element name="MessageDataPerson" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PersonType"/>
 *         &lt;element name="MessageDataRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *         &lt;element name="MessageDataRequestPurposeCategoryReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestPurposeExternalReferenceType"/>
 *         &lt;element name="MessageDataRequestPurpose" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars"/>
 *         &lt;element name="MessageDataAccusationOffenceCategoryReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceExternalReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageDataAccusation" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars" minOccurs="0"/>
 *         &lt;element name="MessageDataRequestingAuthority" type="{http://ec.europa.eu/ECRIS/messages-v1.0}RequestingAuthorityType"/>
 *         &lt;element name="MessageDataCaseReferenceNumber" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars" minOccurs="0"/>
 *         &lt;element name="MessageDataConcernedPersonConsent" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType"/>
 *         &lt;element name="MessageDataUrgency" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType"/>
 *         &lt;element name="MessageDataFingerprintsPush" type="{http://ec.europa.eu/ECRIS/messages-v1.0}BinaryAttachmentPushType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageDataPushType")
public class RequestMessageDataPushType
    extends AbstractBusinessMessageDataType
{


}
