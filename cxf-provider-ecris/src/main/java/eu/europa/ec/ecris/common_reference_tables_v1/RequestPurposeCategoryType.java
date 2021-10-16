
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the categories of purposes of requests
 * 
 * <p>Java class for RequestPurposeCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestPurposeCategoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}AbstractCommonCategoryType">
 *       &lt;sequence>
 *         &lt;element name="RequestPurposeTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestPurposeTechnicalIdentifierType"/>
 *         &lt;element name="RequestPurposeCategoryCode" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestPurposeCategoryCodeType"/>
 *         &lt;element name="RequestPurposeSubcategoryCode" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestPurposeCategoryCodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestPurposeCategoryType", propOrder = {
    "requestPurposeTechnicalIdentifier",
    "requestPurposeCategoryCode",
    "requestPurposeSubcategoryCode"
})
public class RequestPurposeCategoryType
    extends AbstractCommonCategoryType
{

    @XmlElement(name = "RequestPurposeTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String requestPurposeTechnicalIdentifier;
    @XmlElement(name = "RequestPurposeCategoryCode", required = true)
    protected String requestPurposeCategoryCode;
    @XmlElement(name = "RequestPurposeSubcategoryCode", required = true)
    protected String requestPurposeSubcategoryCode;

    /**
     * Gets the value of the requestPurposeTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestPurposeTechnicalIdentifier() {
        return requestPurposeTechnicalIdentifier;
    }

    /**
     * Sets the value of the requestPurposeTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestPurposeTechnicalIdentifier(String value) {
        this.requestPurposeTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the requestPurposeCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestPurposeCategoryCode() {
        return requestPurposeCategoryCode;
    }

    /**
     * Sets the value of the requestPurposeCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestPurposeCategoryCode(String value) {
        this.requestPurposeCategoryCode = value;
    }

    /**
     * Gets the value of the requestPurposeSubcategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestPurposeSubcategoryCode() {
        return requestPurposeSubcategoryCode;
    }

    /**
     * Sets the value of the requestPurposeSubcategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestPurposeSubcategoryCode(String value) {
        this.requestPurposeSubcategoryCode = value;
    }

}
