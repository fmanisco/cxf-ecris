
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType400Chars;


/**
 * Information on the competent authority within a requesting Member State
 *                 that is at the origin of the request and before which the proceedings are pending.
 * 
 * <p>Java class for RequestingAuthorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestingAuthorityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestingAuthorityTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestingAuthorityTypeExternalReferenceType"/>
 *         &lt;element name="RequestingAuthorityCode" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars" minOccurs="0"/>
 *         &lt;element name="RequestingAuthorityName" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestingAuthorityType", propOrder = {
    "requestingAuthorityTypeReference",
    "requestingAuthorityCode",
    "requestingAuthorityName"
})
public class RequestingAuthorityType {

    @XmlElement(name = "RequestingAuthorityTypeReference", required = true)
    protected String requestingAuthorityTypeReference;
    @XmlElement(name = "RequestingAuthorityCode")
    protected String requestingAuthorityCode;
    @XmlElement(name = "RequestingAuthorityName", required = true)
    protected MultilingualTextType400Chars requestingAuthorityName;

    /**
     * Gets the value of the requestingAuthorityTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingAuthorityTypeReference() {
        return requestingAuthorityTypeReference;
    }

    /**
     * Sets the value of the requestingAuthorityTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingAuthorityTypeReference(String value) {
        this.requestingAuthorityTypeReference = value;
    }

    /**
     * Gets the value of the requestingAuthorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingAuthorityCode() {
        return requestingAuthorityCode;
    }

    /**
     * Sets the value of the requestingAuthorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingAuthorityCode(String value) {
        this.requestingAuthorityCode = value;
    }

    /**
     * Gets the value of the requestingAuthorityName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public MultilingualTextType400Chars getRequestingAuthorityName() {
        return requestingAuthorityName;
    }

    /**
     * Sets the value of the requestingAuthorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public void setRequestingAuthorityName(MultilingualTextType400Chars value) {
        this.requestingAuthorityName = value;
    }

}
