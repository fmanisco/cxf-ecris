
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The abstract message meta data type.
 * 
 * <p>Java class for AbstractMessageMetaDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMessageMetaDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageMetaDataMessageID" type="{http://ec.europa.eu/ECRIS/messages-v1.0}BaseMessageIDType"/>
 *         &lt;element name="MessageMetaDataTimestamp" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DateTimeType"/>
 *         &lt;element name="MessageMetaDataResponseTo" type="{http://ec.europa.eu/ECRIS/messages-v1.0}BaseMessageIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMessageMetaDataType", propOrder = {
    "messageMetaDataMessageID",
    "messageMetaDataTimestamp",
    "messageMetaDataResponseTo"
})
@XmlSeeAlso({
    CorrelatingMessageMetaDataType.class,
    MessageMetaDataType.class,
    CancellationMessageMetaDataType.class
})
public abstract class AbstractMessageMetaDataType {

    @XmlElement(name = "MessageMetaDataMessageID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String messageMetaDataMessageID;
    @XmlElement(name = "MessageMetaDataTimestamp", required = true)
    protected XMLGregorianCalendar messageMetaDataTimestamp;
    @XmlElement(name = "MessageMetaDataResponseTo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String messageMetaDataResponseTo;

    /**
     * Gets the value of the messageMetaDataMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageMetaDataMessageID() {
        return messageMetaDataMessageID;
    }

    /**
     * Sets the value of the messageMetaDataMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageMetaDataMessageID(String value) {
        this.messageMetaDataMessageID = value;
    }

    /**
     * Gets the value of the messageMetaDataTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageMetaDataTimestamp() {
        return messageMetaDataTimestamp;
    }

    /**
     * Sets the value of the messageMetaDataTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageMetaDataTimestamp(XMLGregorianCalendar value) {
        this.messageMetaDataTimestamp = value;
    }

    /**
     * Gets the value of the messageMetaDataResponseTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageMetaDataResponseTo() {
        return messageMetaDataResponseTo;
    }

    /**
     * Sets the value of the messageMetaDataResponseTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageMetaDataResponseTo(String value) {
        this.messageMetaDataResponseTo = value;
    }

}
