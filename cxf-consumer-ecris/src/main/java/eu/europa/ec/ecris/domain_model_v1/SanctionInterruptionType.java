
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.UncollapsedMultilingualTextType;


/**
 * The specific terms of the interruption/postponement of the execution of a sanction.
 * 
 * <p>Java class for SanctionInterruptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionInterruptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/domain-model-v1.0}AbstractPeriodType">
 *       &lt;sequence>
 *         &lt;element name="SanctionInterruptionRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionInterruptionType", propOrder = {
    "sanctionInterruptionRemarks"
})
public class SanctionInterruptionType
    extends AbstractPeriodType
{

    @XmlElement(name = "SanctionInterruptionRemarks")
    protected UncollapsedMultilingualTextType sanctionInterruptionRemarks;

    /**
     * Gets the value of the sanctionInterruptionRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public UncollapsedMultilingualTextType getSanctionInterruptionRemarks() {
        return sanctionInterruptionRemarks;
    }

    /**
     * Sets the value of the sanctionInterruptionRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public void setSanctionInterruptionRemarks(UncollapsedMultilingualTextType value) {
        this.sanctionInterruptionRemarks = value;
    }

}
