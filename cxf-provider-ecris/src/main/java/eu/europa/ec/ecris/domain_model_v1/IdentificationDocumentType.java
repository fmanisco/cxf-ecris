
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.DateType;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType400Chars;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType50Chars;


/**
 * This type represents the information of an identification document of a person.
 * 
 * <p>Java class for IdentificationDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificationDocumentCategoryReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}IdentificationDocumentCategoryExternalReferenceType"/>
 *         &lt;element name="IdentificationDocumentType" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType50Chars"/>
 *         &lt;element name="IdentificationDocumentNumber" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars"/>
 *         &lt;element name="IdentificationDocumentIssuingAuthority" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars" minOccurs="0"/>
 *         &lt;element name="IdentificationDocumentIssuingDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DateType" minOccurs="0"/>
 *         &lt;element name="IdentificationDocumentValidUntil" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationDocumentType", propOrder = {
    "identificationDocumentCategoryReference",
    "identificationDocumentType",
    "identificationDocumentNumber",
    "identificationDocumentIssuingAuthority",
    "identificationDocumentIssuingDate",
    "identificationDocumentValidUntil"
})
public class IdentificationDocumentType {

    @XmlElement(name = "IdentificationDocumentCategoryReference", required = true)
    protected String identificationDocumentCategoryReference;
    @XmlElement(name = "IdentificationDocumentType", required = true)
    protected MultilingualTextType50Chars identificationDocumentType;
    @XmlElement(name = "IdentificationDocumentNumber", required = true, defaultValue = "UNKNOWN")
    protected String identificationDocumentNumber;
    @XmlElement(name = "IdentificationDocumentIssuingAuthority")
    protected MultilingualTextType400Chars identificationDocumentIssuingAuthority;
    @XmlElement(name = "IdentificationDocumentIssuingDate")
    protected DateType identificationDocumentIssuingDate;
    @XmlElement(name = "IdentificationDocumentValidUntil")
    protected DateType identificationDocumentValidUntil;

    /**
     * Gets the value of the identificationDocumentCategoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationDocumentCategoryReference() {
        return identificationDocumentCategoryReference;
    }

    /**
     * Sets the value of the identificationDocumentCategoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationDocumentCategoryReference(String value) {
        this.identificationDocumentCategoryReference = value;
    }

    /**
     * Gets the value of the identificationDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType50Chars }
     *     
     */
    public MultilingualTextType50Chars getIdentificationDocumentType() {
        return identificationDocumentType;
    }

    /**
     * Sets the value of the identificationDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType50Chars }
     *     
     */
    public void setIdentificationDocumentType(MultilingualTextType50Chars value) {
        this.identificationDocumentType = value;
    }

    /**
     * Gets the value of the identificationDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationDocumentNumber() {
        return identificationDocumentNumber;
    }

    /**
     * Sets the value of the identificationDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationDocumentNumber(String value) {
        this.identificationDocumentNumber = value;
    }

    /**
     * Gets the value of the identificationDocumentIssuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public MultilingualTextType400Chars getIdentificationDocumentIssuingAuthority() {
        return identificationDocumentIssuingAuthority;
    }

    /**
     * Sets the value of the identificationDocumentIssuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public void setIdentificationDocumentIssuingAuthority(MultilingualTextType400Chars value) {
        this.identificationDocumentIssuingAuthority = value;
    }

    /**
     * Gets the value of the identificationDocumentIssuingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getIdentificationDocumentIssuingDate() {
        return identificationDocumentIssuingDate;
    }

    /**
     * Sets the value of the identificationDocumentIssuingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setIdentificationDocumentIssuingDate(DateType value) {
        this.identificationDocumentIssuingDate = value;
    }

    /**
     * Gets the value of the identificationDocumentValidUntil property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getIdentificationDocumentValidUntil() {
        return identificationDocumentValidUntil;
    }

    /**
     * Sets the value of the identificationDocumentValidUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setIdentificationDocumentValidUntil(DateType value) {
        this.identificationDocumentValidUntil = value;
    }

}
