
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An extension to the abstract meta data type. It is used for all messages
 *                 which are not entry points for business processes and which MUST correlate to previously sent messages.
 * 
 * <p>Java class for CorrelatingMessageMetaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrelatingMessageMetaDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractMessageMetaDataType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaDataMessageID" type="{http://ec.europa.eu/ECRIS/messages-v1.0}CorrelatingMessageIDType"/>
 *         &lt;element name="MessageMetaDataTimestamp" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DateTimeType"/>
 *         &lt;element name="MessageMetaDataResponseTo" type="{http://ec.europa.eu/ECRIS/messages-v1.0}CorrelatedMessageIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrelatingMessageMetaDataType")
public class CorrelatingMessageMetaDataType
    extends AbstractMessageMetaDataType
{


}
