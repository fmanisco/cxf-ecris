
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the types of sanction alternatives as contained in the ANNEX B of the Council Decision 2009/316/JHA
 * 
 * <p>Java class for SanctionAlternativeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionAlternativeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}AbstractCategorisedType">
 *       &lt;sequence>
 *         &lt;element name="SanctionAlternativeTypeTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionAlternativeTypeTechnicalIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionAlternativeType", propOrder = {
    "sanctionAlternativeTypeTechnicalIdentifier"
})
public class SanctionAlternativeType
    extends AbstractCategorisedType
{

    @XmlElement(name = "SanctionAlternativeTypeTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String sanctionAlternativeTypeTechnicalIdentifier;

    /**
     * Gets the value of the sanctionAlternativeTypeTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionAlternativeTypeTechnicalIdentifier() {
        return sanctionAlternativeTypeTechnicalIdentifier;
    }

    /**
     * Sets the value of the sanctionAlternativeTypeTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionAlternativeTypeTechnicalIdentifier(String value) {
        this.sanctionAlternativeTypeTechnicalIdentifier = value;
    }

}
