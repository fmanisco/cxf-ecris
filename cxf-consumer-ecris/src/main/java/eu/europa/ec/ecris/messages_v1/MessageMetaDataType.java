
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The base message meta data type. It is used for all messages which are
 *                 entry points for business processes and which do not correlate to previously send messages.
 * 
 * <p>Java class for MessageMetaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageMetaDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractMessageMetaDataType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaDataMessageID" type="{http://ec.europa.eu/ECRIS/messages-v1.0}InitiatingMessageIDType"/>
 *         &lt;element name="MessageMetaDataTimestamp" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DateTimeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageMetaDataType")
public class MessageMetaDataType
    extends AbstractMessageMetaDataType
{


}
