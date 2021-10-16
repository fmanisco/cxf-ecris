
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
 * A representation of the Member States subdivisions based on ISO 3166-2 standard
 * 
 * <p>Java class for CountrySubdivisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountrySubdivisionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="CountrySubdivisionTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountrySubdivisionTechnicalIdentifierType"/>
 *         &lt;element name="CountrySubdivisionCode" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountrySubdivisionCodeType"/>
 *         &lt;element name="CountrySubdivisionType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://ec.europa.eu/ECRIS/commons-v1.0}StringType">
 *               &lt;enumeration value="Autonomous Region"/>
 *               &lt;enumeration value="Autonomous City"/>
 *               &lt;enumeration value="Autonomous Community"/>
 *               &lt;enumeration value="Council Area"/>
 *               &lt;enumeration value="Country"/>
 *               &lt;enumeration value="Department"/>
 *               &lt;enumeration value="District"/>
 *               &lt;enumeration value="District Council Area"/>
 *               &lt;enumeration value="Federal Land"/>
 *               &lt;enumeration value="Local Council"/>
 *               &lt;enumeration value="Metropolitan Department"/>
 *               &lt;enumeration value="Municipality"/>
 *               &lt;enumeration value="Province"/>
 *               &lt;enumeration value="Region"/>
 *               &lt;enumeration value="State"/>
 *               &lt;enumeration value="Unitary Authority"/>
 *               &lt;enumeration value="County"/>
 *               &lt;enumeration value="Administrative Region"/>
 *               &lt;enumeration value="Overseas Department"/>
 *               &lt;enumeration value="Overseas Territory"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountrySubdivisionMemberState" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}MemberStateCodeType"/>
 *         &lt;element name="CountrySubdivisionToCountry" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountrySubdivisionType", propOrder = {
    "countrySubdivisionTechnicalIdentifier",
    "countrySubdivisionCode",
    "countrySubdivisionType",
    "countrySubdivisionMemberState",
    "countrySubdivisionToCountry"
})
public class CountrySubdivisionType
    extends EntityType
{

    @XmlElement(name = "CountrySubdivisionTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String countrySubdivisionTechnicalIdentifier;
    @XmlElement(name = "CountrySubdivisionCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String countrySubdivisionCode;
    @XmlElement(name = "CountrySubdivisionType", required = true)
    protected String countrySubdivisionType;
    @XmlElement(name = "CountrySubdivisionMemberState", required = true)
    protected String countrySubdivisionMemberState;
    @XmlElement(name = "CountrySubdivisionToCountry", required = true)
    @XmlIDREF
    protected Object countrySubdivisionToCountry;

    /**
     * Gets the value of the countrySubdivisionTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivisionTechnicalIdentifier() {
        return countrySubdivisionTechnicalIdentifier;
    }

    /**
     * Sets the value of the countrySubdivisionTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivisionTechnicalIdentifier(String value) {
        this.countrySubdivisionTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the countrySubdivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivisionCode() {
        return countrySubdivisionCode;
    }

    /**
     * Sets the value of the countrySubdivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivisionCode(String value) {
        this.countrySubdivisionCode = value;
    }

    /**
     * Gets the value of the countrySubdivisionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivisionType() {
        return countrySubdivisionType;
    }

    /**
     * Sets the value of the countrySubdivisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivisionType(String value) {
        this.countrySubdivisionType = value;
    }

    /**
     * Gets the value of the countrySubdivisionMemberState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivisionMemberState() {
        return countrySubdivisionMemberState;
    }

    /**
     * Sets the value of the countrySubdivisionMemberState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivisionMemberState(String value) {
        this.countrySubdivisionMemberState = value;
    }

    /**
     * Gets the value of the countrySubdivisionToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCountrySubdivisionToCountry() {
        return countrySubdivisionToCountry;
    }

    /**
     * Sets the value of the countrySubdivisionToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCountrySubdivisionToCountry(Object value) {
        this.countrySubdivisionToCountry = value;
    }

}
