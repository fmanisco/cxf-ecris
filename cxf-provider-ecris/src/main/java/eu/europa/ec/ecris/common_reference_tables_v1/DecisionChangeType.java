
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the possible types of changes brought by a decisionon a conviction
 * 
 * <p>Java class for DecisionChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionChangeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}AbstractCategorisedType">
 *       &lt;sequence>
 *         &lt;element name="DecisionChangeTypeTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}DecisionChangeTypeTechnicalIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionChangeType", propOrder = {
    "decisionChangeTypeTechnicalIdentifier"
})
public class DecisionChangeType
    extends AbstractCategorisedType
{

    @XmlElement(name = "DecisionChangeTypeTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String decisionChangeTypeTechnicalIdentifier;

    /**
     * Gets the value of the decisionChangeTypeTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionChangeTypeTechnicalIdentifier() {
        return decisionChangeTypeTechnicalIdentifier;
    }

    /**
     * Sets the value of the decisionChangeTypeTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionChangeTypeTechnicalIdentifier(String value) {
        this.decisionChangeTypeTechnicalIdentifier = value;
    }

}
