
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType400Chars;
import eu.europa.ec.ecris.commons_v1.UncollapsedMultilingualTextType;


/**
 * The abstract base definition for entities supporting national categories (i.e. offences and sanctions).
 * 
 * <p>Java class for AbstractNationalCategoriesSupportingEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractNationalCategoriesSupportingEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NationalCategoryCode" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars" minOccurs="0"/>
 *         &lt;element name="NationalCategoryTitle" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars"/>
 *         &lt;element name="Remarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractNationalCategoriesSupportingEntityType", propOrder = {
    "nationalCategoryCode",
    "nationalCategoryTitle",
    "remarks"
})
@XmlSeeAlso({
    SanctionType.class,
    OffenceType.class
})
public abstract class AbstractNationalCategoriesSupportingEntityType {

    @XmlElement(name = "NationalCategoryCode")
    protected String nationalCategoryCode;
    @XmlElement(name = "NationalCategoryTitle", required = true)
    protected MultilingualTextType400Chars nationalCategoryTitle;
    @XmlElement(name = "Remarks")
    protected UncollapsedMultilingualTextType remarks;

    /**
     * Gets the value of the nationalCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalCategoryCode() {
        return nationalCategoryCode;
    }

    /**
     * Sets the value of the nationalCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalCategoryCode(String value) {
        this.nationalCategoryCode = value;
    }

    /**
     * Gets the value of the nationalCategoryTitle property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public MultilingualTextType400Chars getNationalCategoryTitle() {
        return nationalCategoryTitle;
    }

    /**
     * Sets the value of the nationalCategoryTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public void setNationalCategoryTitle(MultilingualTextType400Chars value) {
        this.nationalCategoryTitle = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public UncollapsedMultilingualTextType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public void setRemarks(UncollapsedMultilingualTextType value) {
        this.remarks = value;
    }

}
