
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract parent element of all cimple category types, using a category code.
 * 
 * <p>Java class for AbstractCategorisedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCategorisedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="Category">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://ec.europa.eu/ECRIS/commons-v1.0}StringType">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *               &lt;pattern value="[0A-Za-z]{1,3}"/>
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
@XmlType(name = "AbstractCategorisedType", propOrder = {
    "category"
})
@XmlSeeAlso({
    RequestingAuthorityType.class,
    SanctionNatureType.class,
    DecisionChangeType.class,
    OffenceLevelOfCompletionType.class,
    OffenceLevelOfParticipationType.class,
    SanctionAlternativeType.class,
    SanctionTypeOfSuspensionType.class
})
public abstract class AbstractCategorisedType
    extends EntityType
{

    @XmlElement(name = "Category", required = true)
    protected String category;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
