
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the most common categories of identification documents used in the 27 Member States
 * 
 * <p>Java class for IdentificationDocumentCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationDocumentCategoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="IdentificationDocumentCategoryTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}IdentificationDocumentCategoryTechnicalIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationDocumentCategoryType", propOrder = {
    "identificationDocumentCategoryTechnicalIdentifier"
})
public class IdentificationDocumentCategoryType
    extends EntityType
{

    @XmlElement(name = "IdentificationDocumentCategoryTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String identificationDocumentCategoryTechnicalIdentifier;

    /**
     * Gets the value of the identificationDocumentCategoryTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationDocumentCategoryTechnicalIdentifier() {
        return identificationDocumentCategoryTechnicalIdentifier;
    }

    /**
     * Sets the value of the identificationDocumentCategoryTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationDocumentCategoryTechnicalIdentifier(String value) {
        this.identificationDocumentCategoryTechnicalIdentifier = value;
    }

}
