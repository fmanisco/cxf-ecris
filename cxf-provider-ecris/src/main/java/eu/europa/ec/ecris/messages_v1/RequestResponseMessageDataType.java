
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents the data content of the "Request Response" message. It
 *                 combines in a single type of message the following business responses: request denial, request problem
 *                 and request response. The response type indicates the resulting response.
 * 
 * <p>Java class for RequestResponseMessageDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestResponseMessageDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractBusinessMessageDataType">
 *       &lt;sequence>
 *         &lt;element name="MessageDataContactPerson" type="{http://ec.europa.eu/ECRIS/messages-v1.0}ContactPersonType" minOccurs="0"/>
 *         &lt;element name="MessageDataPerson" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PersonType"/>
 *         &lt;element name="MessageDataRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *         &lt;element name="MessageDataConviction" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}ConvictionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageDataOtherMemberState" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}MemberStateCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageDataRequestResponseTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestResponseTypeExternalReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestResponseMessageDataType")
public class RequestResponseMessageDataType
    extends AbstractBusinessMessageDataType
{


}
