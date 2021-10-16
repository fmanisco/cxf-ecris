
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType400Chars;


/**
 * This is the base entity from which all other entities for common reference tables are derived. This entity is by definition abstract, thus no instances can be created.
 * 
 * <p>Java class for EntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidFrom" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType"/>
 *         &lt;element name="ValidTo" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType"/>
 *         &lt;element name="Name" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityType", propOrder = {
    "validFrom",
    "validTo",
    "name"
})
@XmlSeeAlso({
    FunctionalErrorType.class,
    SanctionToSanctionsRelationshipType.class,
    CountryType.class,
    CentralAuthorityType.class,
    CurrencyType.class,
    IdentificationDocumentCategoryType.class,
    RequestAdditionalInfoResponseType.class,
    CityType.class,
    RequestResponseType.class,
    FaultType.class,
    LanguageType.class,
    CountrySubdivisionType.class,
    NotificationResponseType.class,
    AbstractCategorisedType.class,
    AbstractCommonCategoryType.class
})
public abstract class EntityType {

    @XmlElement(name = "ValidFrom", required = true, defaultValue = "1800-01-01")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "ValidTo", required = true, defaultValue = "2999-12-31")
    protected XMLGregorianCalendar validTo;
    @XmlElement(name = "Name", required = true)
    protected MultilingualTextType400Chars name;

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public MultilingualTextType400Chars getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public void setName(MultilingualTextType400Chars value) {
        this.name = value;
    }

}
