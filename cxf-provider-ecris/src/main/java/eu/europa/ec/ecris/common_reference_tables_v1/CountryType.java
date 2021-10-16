
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType400Chars;


/**
 * A representation of Countries based on ISO-3166
 * 
 * <p>Java class for CountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="CountryTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryTechnicalIdentifierType"/>
 *         &lt;element name="CountryISO3166-2Code" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryISO3166-2CodeType"/>
 *         &lt;element name="CountryISO3166-2Number" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryISO3166-2NumberType"/>
 *         &lt;element name="CountryRemark" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars" minOccurs="0"/>
 *         &lt;element name="CountryUsedForNationality" type="{http://ec.europa.eu/ECRIS/commons-v1.0}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryType", propOrder = {
    "countryTechnicalIdentifier",
    "countryISO31662Code",
    "countryISO31662Number",
    "countryRemark",
    "countryUsedForNationality"
})
public class CountryType
    extends EntityType
{

    @XmlElement(name = "CountryTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String countryTechnicalIdentifier;
    @XmlElement(name = "CountryISO3166-2Code", required = true)
    protected String countryISO31662Code;
    @XmlElement(name = "CountryISO3166-2Number", required = true)
    protected String countryISO31662Number;
    @XmlElement(name = "CountryRemark")
    protected MultilingualTextType400Chars countryRemark;
    @XmlElement(name = "CountryUsedForNationality")
    protected boolean countryUsedForNationality;

    /**
     * Gets the value of the countryTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryTechnicalIdentifier() {
        return countryTechnicalIdentifier;
    }

    /**
     * Sets the value of the countryTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryTechnicalIdentifier(String value) {
        this.countryTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the countryISO31662Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISO31662Code() {
        return countryISO31662Code;
    }

    /**
     * Sets the value of the countryISO31662Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISO31662Code(String value) {
        this.countryISO31662Code = value;
    }

    /**
     * Gets the value of the countryISO31662Number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISO31662Number() {
        return countryISO31662Number;
    }

    /**
     * Sets the value of the countryISO31662Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISO31662Number(String value) {
        this.countryISO31662Number = value;
    }

    /**
     * Gets the value of the countryRemark property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public MultilingualTextType400Chars getCountryRemark() {
        return countryRemark;
    }

    /**
     * Sets the value of the countryRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public void setCountryRemark(MultilingualTextType400Chars value) {
        this.countryRemark = value;
    }

    /**
     * Gets the value of the countryUsedForNationality property.
     * 
     */
    public boolean isCountryUsedForNationality() {
        return countryUsedForNationality;
    }

    /**
     * Sets the value of the countryUsedForNationality property.
     * 
     */
    public void setCountryUsedForNationality(boolean value) {
        this.countryUsedForNationality = value;
    }

}
