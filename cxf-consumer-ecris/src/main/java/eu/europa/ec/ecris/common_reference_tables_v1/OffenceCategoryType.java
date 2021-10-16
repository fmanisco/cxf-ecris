
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the offences categories as contained in the ANNEX A of the Council Decision 2009/316/JHA
 * 
 * <p>Java class for OffenceCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffenceCategoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}AbstractCommonCategoryType">
 *       &lt;sequence>
 *         &lt;element name="OffenceTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceTechnicalIdentifierType"/>
 *         &lt;element name="OffenceCategoryCode" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceCategoryCodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffenceCategoryType", propOrder = {
    "offenceTechnicalIdentifier",
    "offenceCategoryCode"
})
public class OffenceCategoryType
    extends AbstractCommonCategoryType
{

    @XmlElement(name = "OffenceTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String offenceTechnicalIdentifier;
    @XmlElement(name = "OffenceCategoryCode", required = true)
    protected String offenceCategoryCode;

    /**
     * Gets the value of the offenceTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenceTechnicalIdentifier() {
        return offenceTechnicalIdentifier;
    }

    /**
     * Sets the value of the offenceTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenceTechnicalIdentifier(String value) {
        this.offenceTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the offenceCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenceCategoryCode() {
        return offenceCategoryCode;
    }

    /**
     * Sets the value of the offenceCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenceCategoryCode(String value) {
        this.offenceCategoryCode = value;
    }

}
