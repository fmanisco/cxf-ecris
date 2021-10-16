
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the sanctions categories as contained in the ANNEX A of the Council Decision 2009/316/JHA
 * 
 * <p>Java class for SanctionCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionCategoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}AbstractCommonCategoryType">
 *       &lt;sequence>
 *         &lt;element name="SanctionTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionTechnicalIdentifierType"/>
 *         &lt;element name="SanctionCategory">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://ec.europa.eu/ECRIS/commons-v1.0}StringType">
 *               &lt;pattern value="[0-9]{4,5}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionCategoryType", propOrder = {
    "sanctionTechnicalIdentifier",
    "sanctionCategory"
})
public class SanctionCategoryType
    extends AbstractCommonCategoryType
{

    @XmlElement(name = "SanctionTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String sanctionTechnicalIdentifier;
    @XmlElement(name = "SanctionCategory", required = true)
    protected String sanctionCategory;

    /**
     * Gets the value of the sanctionTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionTechnicalIdentifier() {
        return sanctionTechnicalIdentifier;
    }

    /**
     * Sets the value of the sanctionTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionTechnicalIdentifier(String value) {
        this.sanctionTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the sanctionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionCategory() {
        return sanctionCategory;
    }

    /**
     * Sets the value of the sanctionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionCategory(String value) {
        this.sanctionCategory = value;
    }

}
