
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the possible types of responses to transmitted requests for additional information
 * 
 * <p>Java class for RequestAdditionalInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestAdditionalInfoResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="RequestAdditionalInfoTypeTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestAdditionalInfoTypeTechnicalIdentifierType"/>
 *         &lt;element name="RequestAdditionalInfoTypeCode" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestAdditionalInfoTypeCodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestAdditionalInfoResponseType", propOrder = {
    "requestAdditionalInfoTypeTechnicalIdentifier",
    "requestAdditionalInfoTypeCode"
})
public class RequestAdditionalInfoResponseType
    extends EntityType
{

    @XmlElement(name = "RequestAdditionalInfoTypeTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String requestAdditionalInfoTypeTechnicalIdentifier;
    @XmlElement(name = "RequestAdditionalInfoTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String requestAdditionalInfoTypeCode;

    /**
     * Gets the value of the requestAdditionalInfoTypeTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAdditionalInfoTypeTechnicalIdentifier() {
        return requestAdditionalInfoTypeTechnicalIdentifier;
    }

    /**
     * Sets the value of the requestAdditionalInfoTypeTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAdditionalInfoTypeTechnicalIdentifier(String value) {
        this.requestAdditionalInfoTypeTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the requestAdditionalInfoTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAdditionalInfoTypeCode() {
        return requestAdditionalInfoTypeCode;
    }

    /**
     * Sets the value of the requestAdditionalInfoTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAdditionalInfoTypeCode(String value) {
        this.requestAdditionalInfoTypeCode = value;
    }

}
