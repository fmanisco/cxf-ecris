
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the official central authorities of the Member States.
 * 
 * <p>Java class for CentralAuthorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentralAuthorityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="CentralAuthorityTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CentralAuthorityTechnicalIdentifierType"/>
 *         &lt;element name="CentralAuthorityMemberStateCode" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}MemberStateCodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentralAuthorityType", propOrder = {
    "centralAuthorityTechnicalIdentifier",
    "centralAuthorityMemberStateCode"
})
public class CentralAuthorityType
    extends EntityType
{

    @XmlElement(name = "CentralAuthorityTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String centralAuthorityTechnicalIdentifier;
    @XmlElement(name = "CentralAuthorityMemberStateCode", required = true)
    protected String centralAuthorityMemberStateCode;

    /**
     * Gets the value of the centralAuthorityTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralAuthorityTechnicalIdentifier() {
        return centralAuthorityTechnicalIdentifier;
    }

    /**
     * Sets the value of the centralAuthorityTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralAuthorityTechnicalIdentifier(String value) {
        this.centralAuthorityTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the centralAuthorityMemberStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralAuthorityMemberStateCode() {
        return centralAuthorityMemberStateCode;
    }

    /**
     * Sets the value of the centralAuthorityMemberStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralAuthorityMemberStateCode(String value) {
        this.centralAuthorityMemberStateCode = value;
    }

}
