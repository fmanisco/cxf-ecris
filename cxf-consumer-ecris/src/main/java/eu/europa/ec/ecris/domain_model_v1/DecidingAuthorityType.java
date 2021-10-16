
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType400Chars;


/**
 * The authority issuing a conviction.
 * 
 * <p>Java class for DecidingAuthorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecidingAuthorityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DecidingAuthorityCode" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars" minOccurs="0"/>
 *         &lt;element name="DecidingAuthorityName" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecidingAuthorityType", propOrder = {
    "decidingAuthorityCode",
    "decidingAuthorityName"
})
public class DecidingAuthorityType {

    @XmlElement(name = "DecidingAuthorityCode")
    protected String decidingAuthorityCode;
    @XmlElement(name = "DecidingAuthorityName", required = true)
    protected MultilingualTextType400Chars decidingAuthorityName;

    /**
     * Gets the value of the decidingAuthorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecidingAuthorityCode() {
        return decidingAuthorityCode;
    }

    /**
     * Sets the value of the decidingAuthorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecidingAuthorityCode(String value) {
        this.decidingAuthorityCode = value;
    }

    /**
     * Gets the value of the decidingAuthorityName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public MultilingualTextType400Chars getDecidingAuthorityName() {
        return decidingAuthorityName;
    }

    /**
     * Sets the value of the decidingAuthorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public void setDecidingAuthorityName(MultilingualTextType400Chars value) {
        this.decidingAuthorityName = value;
    }

}
