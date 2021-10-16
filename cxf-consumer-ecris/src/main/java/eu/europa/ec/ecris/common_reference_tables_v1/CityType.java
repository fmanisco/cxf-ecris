
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the most important/common cities in the 27 Member States
 * 
 * <p>Java class for CityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="CityTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CityTechnicalIdentifierType"/>
 *         &lt;element name="CityCountry" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityType", propOrder = {
    "cityTechnicalIdentifier",
    "cityCountry"
})
public class CityType
    extends EntityType
{

    @XmlElement(name = "CityTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String cityTechnicalIdentifier;
    @XmlElement(name = "CityCountry", required = true)
    @XmlIDREF
    protected Object cityCountry;

    /**
     * Gets the value of the cityTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityTechnicalIdentifier() {
        return cityTechnicalIdentifier;
    }

    /**
     * Sets the value of the cityTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityTechnicalIdentifier(String value) {
        this.cityTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the cityCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCityCountry() {
        return cityCountry;
    }

    /**
     * Sets the value of the cityCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCityCountry(Object value) {
        this.cityCountry = value;
    }

}
