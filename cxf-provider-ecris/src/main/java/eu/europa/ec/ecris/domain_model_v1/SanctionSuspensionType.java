
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import eu.europa.ec.ecris.commons_v1.PositiveDecimalType;
import eu.europa.ec.ecris.commons_v1.UncollapsedMultilingualTextType;


/**
 * The specific terms of the suspension of all or part of the execution of a sanction.
 * 
 * <p>Java class for SanctionSuspensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionSuspensionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/domain-model-v1.0}AbstractPeriodType">
 *       &lt;sequence>
 *         &lt;element name="SanctionSuspensionTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionTypeOfSuspensionExternalReferenceType"/>
 *         &lt;element name="SanctionDurationSuspendedPart" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DurationType" minOccurs="0"/>
 *         &lt;element name="SanctionProbationDuration" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DurationType" minOccurs="0"/>
 *         &lt;element name="SanctionSuspensionPartiallySuspendedAmount" type="{http://ec.europa.eu/ECRIS/commons-v1.0}PositiveDecimalType" minOccurs="0"/>
 *         &lt;element name="SanctionSuspensionRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionSuspensionType", propOrder = {
    "sanctionSuspensionTypeReference",
    "sanctionDurationSuspendedPart",
    "sanctionProbationDuration",
    "sanctionSuspensionPartiallySuspendedAmount",
    "sanctionSuspensionRemarks"
})
public class SanctionSuspensionType
    extends AbstractPeriodType
{

    @XmlElement(name = "SanctionSuspensionTypeReference", required = true, defaultValue = "S-00-Z")
    protected String sanctionSuspensionTypeReference;
    @XmlElement(name = "SanctionDurationSuspendedPart")
    protected Duration sanctionDurationSuspendedPart;
    @XmlElement(name = "SanctionProbationDuration")
    protected Duration sanctionProbationDuration;
    @XmlElement(name = "SanctionSuspensionPartiallySuspendedAmount")
    protected PositiveDecimalType sanctionSuspensionPartiallySuspendedAmount;
    @XmlElement(name = "SanctionSuspensionRemarks")
    protected UncollapsedMultilingualTextType sanctionSuspensionRemarks;

    /**
     * Gets the value of the sanctionSuspensionTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionSuspensionTypeReference() {
        return sanctionSuspensionTypeReference;
    }

    /**
     * Sets the value of the sanctionSuspensionTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionSuspensionTypeReference(String value) {
        this.sanctionSuspensionTypeReference = value;
    }

    /**
     * Gets the value of the sanctionDurationSuspendedPart property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSanctionDurationSuspendedPart() {
        return sanctionDurationSuspendedPart;
    }

    /**
     * Sets the value of the sanctionDurationSuspendedPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSanctionDurationSuspendedPart(Duration value) {
        this.sanctionDurationSuspendedPart = value;
    }

    /**
     * Gets the value of the sanctionProbationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSanctionProbationDuration() {
        return sanctionProbationDuration;
    }

    /**
     * Sets the value of the sanctionProbationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSanctionProbationDuration(Duration value) {
        this.sanctionProbationDuration = value;
    }

    /**
     * Gets the value of the sanctionSuspensionPartiallySuspendedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveDecimalType }
     *     
     */
    public PositiveDecimalType getSanctionSuspensionPartiallySuspendedAmount() {
        return sanctionSuspensionPartiallySuspendedAmount;
    }

    /**
     * Sets the value of the sanctionSuspensionPartiallySuspendedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveDecimalType }
     *     
     */
    public void setSanctionSuspensionPartiallySuspendedAmount(PositiveDecimalType value) {
        this.sanctionSuspensionPartiallySuspendedAmount = value;
    }

    /**
     * Gets the value of the sanctionSuspensionRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public UncollapsedMultilingualTextType getSanctionSuspensionRemarks() {
        return sanctionSuspensionRemarks;
    }

    /**
     * Sets the value of the sanctionSuspensionRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public void setSanctionSuspensionRemarks(UncollapsedMultilingualTextType value) {
        this.sanctionSuspensionRemarks = value;
    }

}
