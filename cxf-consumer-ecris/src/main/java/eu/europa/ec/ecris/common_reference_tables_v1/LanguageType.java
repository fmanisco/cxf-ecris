
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A representation of the official languages of the Member States.
 * 
 * <p>Java class for LanguageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="LanguageISO639-1Code" type="{http://ec.europa.eu/ECRIS/commons-v1.0}LanguageISO639-1CodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageType", propOrder = {
    "languageISO6391Code"
})
public class LanguageType
    extends EntityType
{

    @XmlElement(name = "LanguageISO639-1Code", required = true)
    protected String languageISO6391Code;

    /**
     * Gets the value of the languageISO6391Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageISO6391Code() {
        return languageISO6391Code;
    }

    /**
     * Sets the value of the languageISO6391Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageISO6391Code(String value) {
        this.languageISO6391Code = value;
    }

}
