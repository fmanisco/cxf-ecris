
package eu.europa.ec.ecris.domain_model_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.ec.ecris.commons_v1.PositiveDecimalType;
import eu.europa.ec.ecris.commons_v1.YesNoUnknownStringEnumerationType;


/**
 * This type contains all the information on the sanction to which the convicted person has been sentenced. In particular, it contains the specific terms of the sanction but carries also information about the enforcement of its execution.
 * 
 * <p>Java class for SanctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/domain-model-v1.0}AbstractNationalCategoriesSupportingEntityType">
 *       &lt;sequence>
 *         &lt;element name="SanctionID" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SanctionIDType"/>
 *         &lt;element name="SanctionTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionNatureExternalReferenceType"/>
 *         &lt;element name="SanctionCommonCategoryReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionExternalReferenceType"/>
 *         &lt;element name="SanctionAlternativeTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionAlternativeTypeExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="SanctionMultiplier" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedPositiveIntegerType3Digits"/>
 *         &lt;element name="SanctionIsSpecificToMinor" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType"/>
 *         &lt;element name="SanctionSentencedPeriod" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SanctionSentencedPeriodType" minOccurs="0"/>
 *         &lt;element name="SanctionExecutionPeriod" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SanctionPeriodType" minOccurs="0"/>
 *         &lt;element name="SanctionNumberOfFines" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedPositiveIntegerType3Digits" minOccurs="0"/>
 *         &lt;element name="SanctionAmountOfIndividualFine" type="{http://ec.europa.eu/ECRIS/commons-v1.0}PositiveDecimalType" minOccurs="0"/>
 *         &lt;element name="SanctionCurrencyOfFineReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CurrencyExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="SanctionSuspension" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SanctionSuspensionType" minOccurs="0"/>
 *         &lt;element name="SanctionInterruption" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SanctionInterruptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionType", propOrder = {
    "sanctionID",
    "sanctionTypeReference",
    "sanctionCommonCategoryReference",
    "sanctionAlternativeTypeReference",
    "sanctionMultiplier",
    "sanctionIsSpecificToMinor",
    "sanctionSentencedPeriod",
    "sanctionExecutionPeriod",
    "sanctionNumberOfFines",
    "sanctionAmountOfIndividualFine",
    "sanctionCurrencyOfFineReference",
    "sanctionSuspension",
    "sanctionInterruption"
})
public class SanctionType
    extends AbstractNationalCategoriesSupportingEntityType
{

    @XmlElement(name = "SanctionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String sanctionID;
    @XmlElement(name = "SanctionTypeReference", required = true, defaultValue = "N-00-Z")
    protected String sanctionTypeReference;
    @XmlElement(name = "SanctionCommonCategoryReference", required = true, defaultValue = "S-00-012000")
    protected String sanctionCommonCategoryReference;
    @XmlElement(name = "SanctionAlternativeTypeReference")
    protected String sanctionAlternativeTypeReference;
    @XmlElement(name = "SanctionMultiplier", defaultValue = "1")
    protected int sanctionMultiplier;
    @XmlElement(name = "SanctionIsSpecificToMinor", required = true)
    protected YesNoUnknownStringEnumerationType sanctionIsSpecificToMinor;
    @XmlElement(name = "SanctionSentencedPeriod")
    protected SanctionSentencedPeriodType sanctionSentencedPeriod;
    @XmlElement(name = "SanctionExecutionPeriod")
    protected SanctionPeriodType sanctionExecutionPeriod;
    @XmlElement(name = "SanctionNumberOfFines")
    protected Integer sanctionNumberOfFines;
    @XmlElement(name = "SanctionAmountOfIndividualFine")
    protected PositiveDecimalType sanctionAmountOfIndividualFine;
    @XmlElement(name = "SanctionCurrencyOfFineReference")
    protected String sanctionCurrencyOfFineReference;
    @XmlElement(name = "SanctionSuspension")
    protected SanctionSuspensionType sanctionSuspension;
    @XmlElement(name = "SanctionInterruption")
    protected List<SanctionInterruptionType> sanctionInterruption;

    /**
     * Gets the value of the sanctionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionID() {
        return sanctionID;
    }

    /**
     * Sets the value of the sanctionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionID(String value) {
        this.sanctionID = value;
    }

    /**
     * Gets the value of the sanctionTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionTypeReference() {
        return sanctionTypeReference;
    }

    /**
     * Sets the value of the sanctionTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionTypeReference(String value) {
        this.sanctionTypeReference = value;
    }

    /**
     * Gets the value of the sanctionCommonCategoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionCommonCategoryReference() {
        return sanctionCommonCategoryReference;
    }

    /**
     * Sets the value of the sanctionCommonCategoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionCommonCategoryReference(String value) {
        this.sanctionCommonCategoryReference = value;
    }

    /**
     * Gets the value of the sanctionAlternativeTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionAlternativeTypeReference() {
        return sanctionAlternativeTypeReference;
    }

    /**
     * Sets the value of the sanctionAlternativeTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionAlternativeTypeReference(String value) {
        this.sanctionAlternativeTypeReference = value;
    }

    /**
     * Gets the value of the sanctionMultiplier property.
     * 
     */
    public int getSanctionMultiplier() {
        return sanctionMultiplier;
    }

    /**
     * Sets the value of the sanctionMultiplier property.
     * 
     */
    public void setSanctionMultiplier(int value) {
        this.sanctionMultiplier = value;
    }

    /**
     * Gets the value of the sanctionIsSpecificToMinor property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public YesNoUnknownStringEnumerationType getSanctionIsSpecificToMinor() {
        return sanctionIsSpecificToMinor;
    }

    /**
     * Sets the value of the sanctionIsSpecificToMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public void setSanctionIsSpecificToMinor(YesNoUnknownStringEnumerationType value) {
        this.sanctionIsSpecificToMinor = value;
    }

    /**
     * Gets the value of the sanctionSentencedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link SanctionSentencedPeriodType }
     *     
     */
    public SanctionSentencedPeriodType getSanctionSentencedPeriod() {
        return sanctionSentencedPeriod;
    }

    /**
     * Sets the value of the sanctionSentencedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanctionSentencedPeriodType }
     *     
     */
    public void setSanctionSentencedPeriod(SanctionSentencedPeriodType value) {
        this.sanctionSentencedPeriod = value;
    }

    /**
     * Gets the value of the sanctionExecutionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link SanctionPeriodType }
     *     
     */
    public SanctionPeriodType getSanctionExecutionPeriod() {
        return sanctionExecutionPeriod;
    }

    /**
     * Sets the value of the sanctionExecutionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanctionPeriodType }
     *     
     */
    public void setSanctionExecutionPeriod(SanctionPeriodType value) {
        this.sanctionExecutionPeriod = value;
    }

    /**
     * Gets the value of the sanctionNumberOfFines property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSanctionNumberOfFines() {
        return sanctionNumberOfFines;
    }

    /**
     * Sets the value of the sanctionNumberOfFines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSanctionNumberOfFines(Integer value) {
        this.sanctionNumberOfFines = value;
    }

    /**
     * Gets the value of the sanctionAmountOfIndividualFine property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveDecimalType }
     *     
     */
    public PositiveDecimalType getSanctionAmountOfIndividualFine() {
        return sanctionAmountOfIndividualFine;
    }

    /**
     * Sets the value of the sanctionAmountOfIndividualFine property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveDecimalType }
     *     
     */
    public void setSanctionAmountOfIndividualFine(PositiveDecimalType value) {
        this.sanctionAmountOfIndividualFine = value;
    }

    /**
     * Gets the value of the sanctionCurrencyOfFineReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionCurrencyOfFineReference() {
        return sanctionCurrencyOfFineReference;
    }

    /**
     * Sets the value of the sanctionCurrencyOfFineReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionCurrencyOfFineReference(String value) {
        this.sanctionCurrencyOfFineReference = value;
    }

    /**
     * Gets the value of the sanctionSuspension property.
     * 
     * @return
     *     possible object is
     *     {@link SanctionSuspensionType }
     *     
     */
    public SanctionSuspensionType getSanctionSuspension() {
        return sanctionSuspension;
    }

    /**
     * Sets the value of the sanctionSuspension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanctionSuspensionType }
     *     
     */
    public void setSanctionSuspension(SanctionSuspensionType value) {
        this.sanctionSuspension = value;
    }

    /**
     * Gets the value of the sanctionInterruption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanctionInterruption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanctionInterruption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanctionInterruptionType }
     * 
     * 
     */
    public List<SanctionInterruptionType> getSanctionInterruption() {
        if (sanctionInterruption == null) {
            sanctionInterruption = new ArrayList<SanctionInterruptionType>();
        }
        return this.sanctionInterruption;
    }

}
