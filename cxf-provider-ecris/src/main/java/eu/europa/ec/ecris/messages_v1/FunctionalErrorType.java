
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.ec.ecris.commons_v1.UncollapsedMultilingualTextType;


/**
 * This type defines a functional error, being composed of a code and
 *                 additional textual information relating to this functional error.
 * 
 * <p>Java class for FunctionalErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionalErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FunctionalErrorCode" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}FunctionalErrorCodeType"/>
 *         &lt;element name="FunctionalErrorAdditionalInformation" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionalErrorType", propOrder = {
    "functionalErrorCode",
    "functionalErrorAdditionalInformation"
})
public class FunctionalErrorType {

    @XmlElement(name = "FunctionalErrorCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String functionalErrorCode;
    @XmlElement(name = "FunctionalErrorAdditionalInformation")
    protected UncollapsedMultilingualTextType functionalErrorAdditionalInformation;

    /**
     * Gets the value of the functionalErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalErrorCode() {
        return functionalErrorCode;
    }

    /**
     * Sets the value of the functionalErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalErrorCode(String value) {
        this.functionalErrorCode = value;
    }

    /**
     * Gets the value of the functionalErrorAdditionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public UncollapsedMultilingualTextType getFunctionalErrorAdditionalInformation() {
        return functionalErrorAdditionalInformation;
    }

    /**
     * Sets the value of the functionalErrorAdditionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public void setFunctionalErrorAdditionalInformation(UncollapsedMultilingualTextType value) {
        this.functionalErrorAdditionalInformation = value;
    }

}
