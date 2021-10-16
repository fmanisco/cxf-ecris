
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The "isAlive" message is used as output of he "isAlive" operation and
 *                 informs the caller that the end-point is functional and able to respond to calls.
 * 
 * <p>Java class for IsAliveMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsAliveMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractMessageType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}MessageMetaDataType"/>
 *         &lt;element name="MessageData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}IsAliveMessageDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsAliveMessageType")
public class IsAliveMessageType
    extends AbstractMessageType
{


}
