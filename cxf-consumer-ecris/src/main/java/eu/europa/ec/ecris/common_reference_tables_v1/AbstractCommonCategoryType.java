
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract parent element of all common category types supporting an "open" category and sub-categories
 * 
 * <p>Java class for AbstractCommonCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCommonCategoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="CategoryIsOpen" type="{http://ec.europa.eu/ECRIS/commons-v1.0}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCommonCategoryType", propOrder = {
    "categoryIsOpen"
})
@XmlSeeAlso({
    SanctionCategoryType.class,
    OffenceCategoryType.class,
    RequestPurposeCategoryType.class
})
public abstract class AbstractCommonCategoryType
    extends EntityType
{

    @XmlElement(name = "CategoryIsOpen")
    protected boolean categoryIsOpen;

    /**
     * Gets the value of the categoryIsOpen property.
     * 
     */
    public boolean isCategoryIsOpen() {
        return categoryIsOpen;
    }

    /**
     * Sets the value of the categoryIsOpen property.
     * 
     */
    public void setCategoryIsOpen(boolean value) {
        this.categoryIsOpen = value;
    }

}
