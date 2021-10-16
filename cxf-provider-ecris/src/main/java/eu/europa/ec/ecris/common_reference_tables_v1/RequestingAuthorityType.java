
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the requesting authority types with their descriptions
 * 
 * <p>Java class for RequestingAuthorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestingAuthorityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}AbstractCategorisedType">
 *       &lt;sequence>
 *         &lt;element name="RequestingAuthorityTypeTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestingAuthorityTypeTechnicalIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestingAuthorityType", propOrder = {
    "requestingAuthorityTypeTechnicalIdentifier"
})
public class RequestingAuthorityType
    extends AbstractCategorisedType
{

    @XmlElement(name = "RequestingAuthorityTypeTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String requestingAuthorityTypeTechnicalIdentifier;

    /**
     * Gets the value of the requestingAuthorityTypeTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingAuthorityTypeTechnicalIdentifier() {
        return requestingAuthorityTypeTechnicalIdentifier;
    }

    /**
     * Sets the value of the requestingAuthorityTypeTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingAuthorityTypeTechnicalIdentifier(String value) {
        this.requestingAuthorityTypeTechnicalIdentifier = value;
    }

}
