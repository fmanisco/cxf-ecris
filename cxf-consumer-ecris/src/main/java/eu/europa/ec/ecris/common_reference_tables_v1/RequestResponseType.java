
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the possible types of responses to transmitted requests
 * 
 * <p>Java class for RequestResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="RequestResponseTypeTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestResponseTypeTechnicalIdentifierType"/>
 *         &lt;element name="RequestResponseTypeCode" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestResponseTypeCodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestResponseType", propOrder = {
    "requestResponseTypeTechnicalIdentifier",
    "requestResponseTypeCode"
})
public class RequestResponseType
    extends EntityType
{

    @XmlElement(name = "RequestResponseTypeTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String requestResponseTypeTechnicalIdentifier;
    @XmlElement(name = "RequestResponseTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String requestResponseTypeCode;

    /**
     * Gets the value of the requestResponseTypeTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestResponseTypeTechnicalIdentifier() {
        return requestResponseTypeTechnicalIdentifier;
    }

    /**
     * Sets the value of the requestResponseTypeTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestResponseTypeTechnicalIdentifier(String value) {
        this.requestResponseTypeTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the requestResponseTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestResponseTypeCode() {
        return requestResponseTypeCode;
    }

    /**
     * Sets the value of the requestResponseTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestResponseTypeCode(String value) {
        this.requestResponseTypeCode = value;
    }

}
