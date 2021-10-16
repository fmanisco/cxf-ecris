
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract base definition for all ECRIS messages. It contains the
 *                 message meta-data and message data.
 * 
 * <p>Java class for AbstractMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaData" type="{http://ec.europa.eu/ECRIS/messages-v1.0}AbstractMessageMetaDataType"/>
 *         &lt;element name="MessageData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMessageType", propOrder = {
    "messageMetaData",
    "messageData"
})
@XmlSeeAlso({
    NotificationMessageType.class,
    RequestAdditionalInfoResponseMessageType.class,
    NotificationResponseMessagePushType.class,
    RequestResponseMessageType.class,
    RequestMessagePushType.class,
    CancellationMessageType.class,
    RequestDeadlineMessageType.class,
    RequestMessageType.class,
    RequestResponseMessagePushType.class,
    RequestAdditionalInfoMessageType.class,
    FunctionalErrorMessageType.class,
    IsAliveMessageType.class,
    NotificationMessagePushType.class,
    NotificationResponseMessageType.class,
    RequestAdditionalInfoResponseMessagePushType.class
})
public abstract class AbstractMessageType {

    @XmlElement(name = "MessageMetaData", required = true)
    protected AbstractMessageMetaDataType messageMetaData;
    @XmlElement(name = "MessageData")
    protected Object messageData;

    /**
     * Gets the value of the messageMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractMessageMetaDataType }
     *     
     */
    public AbstractMessageMetaDataType getMessageMetaData() {
        return messageMetaData;
    }

    /**
     * Sets the value of the messageMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractMessageMetaDataType }
     *     
     */
    public void setMessageMetaData(AbstractMessageMetaDataType value) {
        this.messageMetaData = value;
    }

    /**
     * Gets the value of the messageData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMessageData(Object value) {
        this.messageData = value;
    }

}
