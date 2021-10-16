
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the categories of the level of completion of the offence as contained in the ANNEX B of the Council Decision 2009/316/JHA
 * 
 * <p>Java class for OffenceLevelOfCompletionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenceLevelOfCompletionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}AbstractCategorisedType">
 *       &lt;sequence>
 *         &lt;element name="OffenceLevelOfCompletionTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceLevelOfCompletionTechnicalIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceLevelOfCompletionType", propOrder = {
    "offenceLevelOfCompletionTechnicalIdentifier"
})
public class OffenceLevelOfCompletionType
    extends AbstractCategorisedType
{

    @XmlElement(name = "OffenceLevelOfCompletionTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String offenceLevelOfCompletionTechnicalIdentifier;

    /**
     * Gets the value of the offenceLevelOfCompletionTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenceLevelOfCompletionTechnicalIdentifier() {
        return offenceLevelOfCompletionTechnicalIdentifier;
    }

    /**
     * Sets the value of the offenceLevelOfCompletionTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenceLevelOfCompletionTechnicalIdentifier(String value) {
        this.offenceLevelOfCompletionTechnicalIdentifier = value;
    }

}
