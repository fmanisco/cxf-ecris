
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the possible types of sanction to sanctions relationships
 * 
 * <p>Java class for SanctionToSanctionsRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionToSanctionsRelationshipType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="SanctionToSanctionsRelationTypeTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionToSanctionsRelationTypeTechnicalIdentifierType"/>
 *         &lt;element name="SanctionToSanctionsRelationTypeCode" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionToSanctionsRelationTypeCodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionToSanctionsRelationshipType", propOrder = {
    "sanctionToSanctionsRelationTypeTechnicalIdentifier",
    "sanctionToSanctionsRelationTypeCode"
})
public class SanctionToSanctionsRelationshipType
    extends EntityType
{

    @XmlElement(name = "SanctionToSanctionsRelationTypeTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String sanctionToSanctionsRelationTypeTechnicalIdentifier;
    @XmlElement(name = "SanctionToSanctionsRelationTypeCode", required = true)
    protected String sanctionToSanctionsRelationTypeCode;

    /**
     * Gets the value of the sanctionToSanctionsRelationTypeTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionToSanctionsRelationTypeTechnicalIdentifier() {
        return sanctionToSanctionsRelationTypeTechnicalIdentifier;
    }

    /**
     * Sets the value of the sanctionToSanctionsRelationTypeTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionToSanctionsRelationTypeTechnicalIdentifier(String value) {
        this.sanctionToSanctionsRelationTypeTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the sanctionToSanctionsRelationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionToSanctionsRelationTypeCode() {
        return sanctionToSanctionsRelationTypeCode;
    }

    /**
     * Sets the value of the sanctionToSanctionsRelationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionToSanctionsRelationTypeCode(String value) {
        this.sanctionToSanctionsRelationTypeCode = value;
    }

}
