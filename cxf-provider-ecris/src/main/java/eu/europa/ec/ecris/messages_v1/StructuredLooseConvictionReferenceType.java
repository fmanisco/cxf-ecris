
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type allows providing a reference to a previously sent conviction in a structured
 *                 form, wether this conviction has been sent through ECRIS, NJR or any other means of communication.
 * 
 * <p>Java class for StructuredLooseConvictionReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredLooseConvictionReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ECRISConvictionReference" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}ConvictionExternalReferenceType"/>
 *         &lt;group ref="{http://ec.europa.eu/ECRIS/messages-v1.0}NonEcrisConvictionReferencesGroup"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredLooseConvictionReferenceType", propOrder = {
    "ecrisConvictionReference",
    "njrConvictionReference",
    "externalConviction"
})
public class StructuredLooseConvictionReferenceType {

    @XmlElement(name = "ECRISConvictionReference")
    protected String ecrisConvictionReference;
    @XmlElement(name = "NJRConvictionReference")
    protected String njrConvictionReference;
    @XmlElement(name = "ExternalConviction")
    protected eu.europa.ec.ecris.messages_v1.StructuredStrictConvictionReferenceType.ExternalConviction externalConviction;

    /**
     * Gets the value of the ecrisConvictionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECRISConvictionReference() {
        return ecrisConvictionReference;
    }

    /**
     * Sets the value of the ecrisConvictionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECRISConvictionReference(String value) {
        this.ecrisConvictionReference = value;
    }

    /**
     * Gets the value of the njrConvictionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNJRConvictionReference() {
        return njrConvictionReference;
    }

    /**
     * Sets the value of the njrConvictionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNJRConvictionReference(String value) {
        this.njrConvictionReference = value;
    }

    /**
     * Gets the value of the externalConviction property.
     * 
     * @return
     *     possible object is
     *     {@link eu.europa.ec.ecris.messages_v1.StructuredStrictConvictionReferenceType.ExternalConviction }
     *     
     */
    public eu.europa.ec.ecris.messages_v1.StructuredStrictConvictionReferenceType.ExternalConviction getExternalConviction() {
        return externalConviction;
    }

    /**
     * Sets the value of the externalConviction property.
     * 
     * @param value
     *     allowed object is
     *     {@link eu.europa.ec.ecris.messages_v1.StructuredStrictConvictionReferenceType.ExternalConviction }
     *     
     */
    public void setExternalConviction(eu.europa.ec.ecris.messages_v1.StructuredStrictConvictionReferenceType.ExternalConviction value) {
        this.externalConviction = value;
    }

}
