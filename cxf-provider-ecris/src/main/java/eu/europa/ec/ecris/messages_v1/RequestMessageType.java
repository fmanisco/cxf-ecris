
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type of message allows a Member State to transmit a request to another
 *                 Member State for information and related data to be extracted from the criminal record of a person.
 * 
 * <p>Java class for RequestMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractMessageType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}MessageMetaDataType"/>
 *         &lt;element name="MessageData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}RequestMessageDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageType")
public class RequestMessageType
    extends AbstractMessageType
{


}
