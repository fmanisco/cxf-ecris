
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.ec.ecris.commons_v1.DateType;
import eu.europa.ec.ecris.commons_v1.YesNoUnknownStringEnumerationType;


/**
 * This type contains all the information on the offence that has been committed by the convicted person.
 * 
 * <p>Java class for OffenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/domain-model-v1.0}AbstractNationalCategoriesSupportingEntityType">
 *       &lt;sequence>
 *         &lt;element name="OffenceID" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}OffenceIDType"/>
 *         &lt;element name="OffenceCommonCategoryReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceExternalReferenceType"/>
 *         &lt;element name="OffenceApplicableLegalProvisions" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType400Chars"/>
 *         &lt;element name="OffenceStartDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DateType" minOccurs="0"/>
 *         &lt;element name="OffenceEndDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DateType" minOccurs="0"/>
 *         &lt;element name="OffencePlace" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PlaceType" minOccurs="0"/>
 *         &lt;element name="OffenceNumberOfOccurrences" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedPositiveIntegerType3Digits" minOccurs="0"/>
 *         &lt;element name="OffenceIsContinuous" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType"/>
 *         &lt;element name="OffenceLevelOfCompletionReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceLevelOfCompletionExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="OffenceLevelOfParticipationReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceLevelOfParticipationExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="OffenceResponsibilityExemption" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType"/>
 *         &lt;element name="OffenceRecidivism" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceType", propOrder = {
    "offenceID",
    "offenceCommonCategoryReference",
    "offenceApplicableLegalProvisions",
    "offenceStartDate",
    "offenceEndDate",
    "offencePlace",
    "offenceNumberOfOccurrences",
    "offenceIsContinuous",
    "offenceLevelOfCompletionReference",
    "offenceLevelOfParticipationReference",
    "offenceResponsibilityExemption",
    "offenceRecidivism"
})
public class OffenceType
    extends AbstractNationalCategoriesSupportingEntityType
{

    @XmlElement(name = "OffenceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String offenceID;
    @XmlElement(name = "OffenceCommonCategoryReference", required = true, defaultValue = "O-00-270000")
    protected String offenceCommonCategoryReference;
    @XmlElement(name = "OffenceApplicableLegalProvisions", required = true, defaultValue = "UNKNOWN")
    protected String offenceApplicableLegalProvisions;
    @XmlElement(name = "OffenceStartDate")
    protected DateType offenceStartDate;
    @XmlElement(name = "OffenceEndDate")
    protected DateType offenceEndDate;
    @XmlElement(name = "OffencePlace")
    protected PlaceType offencePlace;
    @XmlElement(name = "OffenceNumberOfOccurrences")
    protected Integer offenceNumberOfOccurrences;
    @XmlElement(name = "OffenceIsContinuous", required = true)
    protected YesNoUnknownStringEnumerationType offenceIsContinuous;
    @XmlElement(name = "OffenceLevelOfCompletionReference")
    protected String offenceLevelOfCompletionReference;
    @XmlElement(name = "OffenceLevelOfParticipationReference")
    protected String offenceLevelOfParticipationReference;
    @XmlElement(name = "OffenceResponsibilityExemption", required = true)
    protected YesNoUnknownStringEnumerationType offenceResponsibilityExemption;
    @XmlElement(name = "OffenceRecidivism", required = true)
    protected YesNoUnknownStringEnumerationType offenceRecidivism;

    /**
     * Gets the value of the offenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenceID() {
        return offenceID;
    }

    /**
     * Sets the value of the offenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenceID(String value) {
        this.offenceID = value;
    }

    /**
     * Gets the value of the offenceCommonCategoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenceCommonCategoryReference() {
        return offenceCommonCategoryReference;
    }

    /**
     * Sets the value of the offenceCommonCategoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenceCommonCategoryReference(String value) {
        this.offenceCommonCategoryReference = value;
    }

    /**
     * Gets the value of the offenceApplicableLegalProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenceApplicableLegalProvisions() {
        return offenceApplicableLegalProvisions;
    }

    /**
     * Sets the value of the offenceApplicableLegalProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenceApplicableLegalProvisions(String value) {
        this.offenceApplicableLegalProvisions = value;
    }

    /**
     * Gets the value of the offenceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getOffenceStartDate() {
        return offenceStartDate;
    }

    /**
     * Sets the value of the offenceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setOffenceStartDate(DateType value) {
        this.offenceStartDate = value;
    }

    /**
     * Gets the value of the offenceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getOffenceEndDate() {
        return offenceEndDate;
    }

    /**
     * Sets the value of the offenceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setOffenceEndDate(DateType value) {
        this.offenceEndDate = value;
    }

    /**
     * Gets the value of the offencePlace property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceType }
     *     
     */
    public PlaceType getOffencePlace() {
        return offencePlace;
    }

    /**
     * Sets the value of the offencePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceType }
     *     
     */
    public void setOffencePlace(PlaceType value) {
        this.offencePlace = value;
    }

    /**
     * Gets the value of the offenceNumberOfOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffenceNumberOfOccurrences() {
        return offenceNumberOfOccurrences;
    }

    /**
     * Sets the value of the offenceNumberOfOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffenceNumberOfOccurrences(Integer value) {
        this.offenceNumberOfOccurrences = value;
    }

    /**
     * Gets the value of the offenceIsContinuous property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public YesNoUnknownStringEnumerationType getOffenceIsContinuous() {
        return offenceIsContinuous;
    }

    /**
     * Sets the value of the offenceIsContinuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public void setOffenceIsContinuous(YesNoUnknownStringEnumerationType value) {
        this.offenceIsContinuous = value;
    }

    /**
     * Gets the value of the offenceLevelOfCompletionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenceLevelOfCompletionReference() {
        return offenceLevelOfCompletionReference;
    }

    /**
     * Sets the value of the offenceLevelOfCompletionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenceLevelOfCompletionReference(String value) {
        this.offenceLevelOfCompletionReference = value;
    }

    /**
     * Gets the value of the offenceLevelOfParticipationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenceLevelOfParticipationReference() {
        return offenceLevelOfParticipationReference;
    }

    /**
     * Sets the value of the offenceLevelOfParticipationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenceLevelOfParticipationReference(String value) {
        this.offenceLevelOfParticipationReference = value;
    }

    /**
     * Gets the value of the offenceResponsibilityExemption property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public YesNoUnknownStringEnumerationType getOffenceResponsibilityExemption() {
        return offenceResponsibilityExemption;
    }

    /**
     * Sets the value of the offenceResponsibilityExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public void setOffenceResponsibilityExemption(YesNoUnknownStringEnumerationType value) {
        this.offenceResponsibilityExemption = value;
    }

    /**
     * Gets the value of the offenceRecidivism property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public YesNoUnknownStringEnumerationType getOffenceRecidivism() {
        return offenceRecidivism;
    }

    /**
     * Sets the value of the offenceRecidivism property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public void setOffenceRecidivism(YesNoUnknownStringEnumerationType value) {
        this.offenceRecidivism = value;
    }

}
