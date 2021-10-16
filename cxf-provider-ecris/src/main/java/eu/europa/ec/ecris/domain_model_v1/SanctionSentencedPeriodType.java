
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.YesNoUnknownStringEnumerationType;


/**
 * This type represents the sentenced time-related terms of the execution of a sanction.
 * 
 * <p>Java class for SanctionSentencedPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionSentencedPeriodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/domain-model-v1.0}AbstractPeriodType">
 *       &lt;sequence>
 *         &lt;element name="DurationExact" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionSentencedPeriodType", propOrder = {
    "durationExact"
})
public class SanctionSentencedPeriodType
    extends AbstractPeriodType
{

    @XmlElement(name = "DurationExact", required = true)
    protected YesNoUnknownStringEnumerationType durationExact;

    /**
     * Gets the value of the durationExact property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public YesNoUnknownStringEnumerationType getDurationExact() {
        return durationExact;
    }

    /**
     * Sets the value of the durationExact property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public void setDurationExact(YesNoUnknownStringEnumerationType value) {
        this.durationExact = value;
    }

}
