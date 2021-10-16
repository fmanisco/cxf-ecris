
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the sanction suspension types as contained in the ANNEX B of the Council Decision 2009/316/JHA
 * 
 * <p>Java class for SanctionTypeOfSuspensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionTypeOfSuspensionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}AbstractCategorisedType">
 *       &lt;sequence>
 *         &lt;element name="SanctionTypeOfSuspensionTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionTypeOfSuspensionTechnicalIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionTypeOfSuspensionType", propOrder = {
    "sanctionTypeOfSuspensionTechnicalIdentifier"
})
public class SanctionTypeOfSuspensionType
    extends AbstractCategorisedType
{

    @XmlElement(name = "SanctionTypeOfSuspensionTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String sanctionTypeOfSuspensionTechnicalIdentifier;

    /**
     * Gets the value of the sanctionTypeOfSuspensionTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionTypeOfSuspensionTechnicalIdentifier() {
        return sanctionTypeOfSuspensionTechnicalIdentifier;
    }

    /**
     * Sets the value of the sanctionTypeOfSuspensionTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionTypeOfSuspensionTechnicalIdentifier(String value) {
        this.sanctionTypeOfSuspensionTechnicalIdentifier = value;
    }

}
