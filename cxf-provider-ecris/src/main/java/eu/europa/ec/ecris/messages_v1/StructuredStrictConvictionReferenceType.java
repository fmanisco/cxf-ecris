
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.europa.ec.ecris.domain_model_v1.DecidingAuthorityType;


/**
 * This type allows providing a reference to conviction included in a structured
 *                 form, wether this conviction has been sent through ECRIS, NJR or any other means of communication.
 * 
 * <p>Java class for StructuredStrictConvictionReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredStrictConvictionReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ECRISConvictionReference" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}ConvictionReferenceType"/>
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
@XmlType(name = "StructuredStrictConvictionReferenceType", propOrder = {
    "ecrisConvictionReference",
    "njrConvictionReference",
    "externalConviction"
})
public class StructuredStrictConvictionReferenceType {

    @XmlElement(name = "ECRISConvictionReference")
    @XmlIDREF
    protected Object ecrisConvictionReference;
    @XmlElement(name = "NJRConvictionReference")
    protected String njrConvictionReference;
    @XmlElement(name = "ExternalConviction")
    protected StructuredStrictConvictionReferenceType.ExternalConviction externalConviction;

    /**
     * Gets the value of the ecrisConvictionReference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getECRISConvictionReference() {
        return ecrisConvictionReference;
    }

    /**
     * Sets the value of the ecrisConvictionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setECRISConvictionReference(Object value) {
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
     *     {@link StructuredStrictConvictionReferenceType.ExternalConviction }
     *     
     */
    public StructuredStrictConvictionReferenceType.ExternalConviction getExternalConviction() {
        return externalConviction;
    }

    /**
     * Sets the value of the externalConviction property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredStrictConvictionReferenceType.ExternalConviction }
     *     
     */
    public void setExternalConviction(StructuredStrictConvictionReferenceType.ExternalConviction value) {
        this.externalConviction = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ConvictingAuthority" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}DecidingAuthorityType"/>
     *         &lt;element name="ConvictionFileNumber" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars"/>
     *         &lt;element name="ConvictionDecisionFinalDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "convictingAuthority",
        "convictionFileNumber",
        "convictionDecisionFinalDate"
    })
    public static class ExternalConviction {

        @XmlElement(name = "ConvictingAuthority", required = true)
        protected DecidingAuthorityType convictingAuthority;
        @XmlElement(name = "ConvictionFileNumber", required = true)
        protected String convictionFileNumber;
        @XmlElement(name = "ConvictionDecisionFinalDate", required = true)
        protected XMLGregorianCalendar convictionDecisionFinalDate;

        /**
         * Gets the value of the convictingAuthority property.
         * 
         * @return
         *     possible object is
         *     {@link DecidingAuthorityType }
         *     
         */
        public DecidingAuthorityType getConvictingAuthority() {
            return convictingAuthority;
        }

        /**
         * Sets the value of the convictingAuthority property.
         * 
         * @param value
         *     allowed object is
         *     {@link DecidingAuthorityType }
         *     
         */
        public void setConvictingAuthority(DecidingAuthorityType value) {
            this.convictingAuthority = value;
        }

        /**
         * Gets the value of the convictionFileNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConvictionFileNumber() {
            return convictionFileNumber;
        }

        /**
         * Sets the value of the convictionFileNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConvictionFileNumber(String value) {
            this.convictionFileNumber = value;
        }

        /**
         * Gets the value of the convictionDecisionFinalDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getConvictionDecisionFinalDate() {
            return convictionDecisionFinalDate;
        }

        /**
         * Sets the value of the convictionDecisionFinalDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setConvictionDecisionFinalDate(XMLGregorianCalendar value) {
            this.convictionDecisionFinalDate = value;
        }

    }

}
