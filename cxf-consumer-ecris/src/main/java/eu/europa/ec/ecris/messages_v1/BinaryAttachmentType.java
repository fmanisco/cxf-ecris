
package eu.europa.ec.ecris.messages_v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType400Chars;
import eu.europa.ec.ecris.commons_v1.UncollapsedMultilingualTextType;


/**
 * Meta-data information on the binary file attached to a message. In this
 *                 version of the specifications, it is only expected to exchange NIST files using this mechanism.
 * 
 * <p>Java class for BinaryAttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryAttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BinaryAttachmentID" type="{http://ec.europa.eu/ECRIS/messages-v1.0}BinaryAttachmentIDType"/>
 *         &lt;element name="BinaryAttachmentMimeType" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars"/>
 *         &lt;element name="BinaryAttachmentFileName" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType200Chars"/>
 *         &lt;element name="BinaryAttachmentTitle" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars" minOccurs="0"/>
 *         &lt;element name="BinaryAttachmentFileSize" type="{http://ec.europa.eu/ECRIS/commons-v1.0}PositiveIntegerType" minOccurs="0"/>
 *         &lt;element name="BinaryAttachmentComment" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *         &lt;element name="BinaryAttachmentMD5Hash" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryAttachmentType", propOrder = {
    "binaryAttachmentID",
    "binaryAttachmentMimeType",
    "binaryAttachmentFileName",
    "binaryAttachmentTitle",
    "binaryAttachmentFileSize",
    "binaryAttachmentComment",
    "binaryAttachmentMD5Hash"
})
@XmlSeeAlso({
    BinaryAttachmentPushType.class
})
public class BinaryAttachmentType {

    @XmlElement(name = "BinaryAttachmentID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String binaryAttachmentID;
    @XmlElement(name = "BinaryAttachmentMimeType", required = true, defaultValue = "application/nist")
    protected String binaryAttachmentMimeType;
    @XmlElement(name = "BinaryAttachmentFileName", required = true, defaultValue = "UNKNOWN")
    protected String binaryAttachmentFileName;
    @XmlElement(name = "BinaryAttachmentTitle")
    protected MultilingualTextType400Chars binaryAttachmentTitle;
    @XmlElement(name = "BinaryAttachmentFileSize")
    protected BigInteger binaryAttachmentFileSize;
    @XmlElement(name = "BinaryAttachmentComment")
    protected UncollapsedMultilingualTextType binaryAttachmentComment;
    @XmlElement(name = "BinaryAttachmentMD5Hash")
    protected String binaryAttachmentMD5Hash;

    /**
     * Gets the value of the binaryAttachmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryAttachmentID() {
        return binaryAttachmentID;
    }

    /**
     * Sets the value of the binaryAttachmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryAttachmentID(String value) {
        this.binaryAttachmentID = value;
    }

    /**
     * Gets the value of the binaryAttachmentMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryAttachmentMimeType() {
        return binaryAttachmentMimeType;
    }

    /**
     * Sets the value of the binaryAttachmentMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryAttachmentMimeType(String value) {
        this.binaryAttachmentMimeType = value;
    }

    /**
     * Gets the value of the binaryAttachmentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryAttachmentFileName() {
        return binaryAttachmentFileName;
    }

    /**
     * Sets the value of the binaryAttachmentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryAttachmentFileName(String value) {
        this.binaryAttachmentFileName = value;
    }

    /**
     * Gets the value of the binaryAttachmentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public MultilingualTextType400Chars getBinaryAttachmentTitle() {
        return binaryAttachmentTitle;
    }

    /**
     * Sets the value of the binaryAttachmentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public void setBinaryAttachmentTitle(MultilingualTextType400Chars value) {
        this.binaryAttachmentTitle = value;
    }

    /**
     * Gets the value of the binaryAttachmentFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBinaryAttachmentFileSize() {
        return binaryAttachmentFileSize;
    }

    /**
     * Sets the value of the binaryAttachmentFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBinaryAttachmentFileSize(BigInteger value) {
        this.binaryAttachmentFileSize = value;
    }

    /**
     * Gets the value of the binaryAttachmentComment property.
     * 
     * @return
     *     possible object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public UncollapsedMultilingualTextType getBinaryAttachmentComment() {
        return binaryAttachmentComment;
    }

    /**
     * Sets the value of the binaryAttachmentComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public void setBinaryAttachmentComment(UncollapsedMultilingualTextType value) {
        this.binaryAttachmentComment = value;
    }

    /**
     * Gets the value of the binaryAttachmentMD5Hash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryAttachmentMD5Hash() {
        return binaryAttachmentMD5Hash;
    }

    /**
     * Sets the value of the binaryAttachmentMD5Hash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryAttachmentMD5Hash(String value) {
        this.binaryAttachmentMD5Hash = value;
    }

}
