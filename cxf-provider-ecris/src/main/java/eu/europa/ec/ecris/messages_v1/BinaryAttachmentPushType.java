
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Meta-data and actual binary content of the attached fingerprints file (i.e.
 *                 NIST file). This type is used to actually carry the binary file in a message.
 * 
 * <p>Java class for BinaryAttachmentPushType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryAttachmentPushType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/messages-v1.0}BinaryAttachmentType">
 *       &lt;sequence>
 *         &lt;element name="BinaryAttachmentContent" type="{http://ec.europa.eu/ECRIS/commons-v1.0}Base64BinaryType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryAttachmentPushType", propOrder = {
    "binaryAttachmentContent"
})
public class BinaryAttachmentPushType
    extends BinaryAttachmentType
{

    @XmlElement(name = "BinaryAttachmentContent", required = true)
    protected byte[] binaryAttachmentContent;

    /**
     * Gets the value of the binaryAttachmentContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryAttachmentContent() {
        return binaryAttachmentContent;
    }

    /**
     * Sets the value of the binaryAttachmentContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryAttachmentContent(byte[] value) {
        this.binaryAttachmentContent = value;
    }

}
