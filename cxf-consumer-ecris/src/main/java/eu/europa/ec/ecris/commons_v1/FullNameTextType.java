
package eu.europa.ec.ecris.commons_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A type used for full names, limiting their size to 600 characters
 * 
 * <p>Java class for FullNameTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullNameTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://ec.europa.eu/ECRIS/commons-v1.0>FullNameRestrictedStringType">
 *       &lt;attribute name="languageCode" type="{http://ec.europa.eu/ECRIS/commons-v1.0}LanguageISO639-1CodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullNameTextType", propOrder = {
    "value"
})
public class FullNameTextType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;

    /**
     * A restriction for the basic StringType, used to enforce the limit of 600 maximum characters for full names
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

}
