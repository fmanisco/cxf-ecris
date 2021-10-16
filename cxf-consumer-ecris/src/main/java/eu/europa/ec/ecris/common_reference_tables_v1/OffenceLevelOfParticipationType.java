
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the categories of the level of participation of the offence as contained in the ANNEX A of the Council Decision 2009/316/JHA
 * 
 * <p>Java class for OffenceLevelOfParticipationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenceLevelOfParticipationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}AbstractCategorisedType">
 *       &lt;sequence>
 *         &lt;element name="OffenceLevelOfParticipationTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceLevelOfParticipationTechnicalIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceLevelOfParticipationType", propOrder = {
    "offenceLevelOfParticipationTechnicalIdentifier"
})
public class OffenceLevelOfParticipationType
    extends AbstractCategorisedType
{

    @XmlElement(name = "OffenceLevelOfParticipationTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String offenceLevelOfParticipationTechnicalIdentifier;

    /**
     * Gets the value of the offenceLevelOfParticipationTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenceLevelOfParticipationTechnicalIdentifier() {
        return offenceLevelOfParticipationTechnicalIdentifier;
    }

    /**
     * Sets the value of the offenceLevelOfParticipationTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenceLevelOfParticipationTechnicalIdentifier(String value) {
        this.offenceLevelOfParticipationTechnicalIdentifier = value;
    }

}
