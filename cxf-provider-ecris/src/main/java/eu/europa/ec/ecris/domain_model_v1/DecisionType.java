
package eu.europa.ec.ecris.domain_model_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.europa.ec.ecris.commons_v1.UncollapsedMultilingualTextType;
import eu.europa.ec.ecris.commons_v1.YesNoUnknownStringEnumerationType;


/**
 * This entity contains the specific information on a decision of a competent authority relative to the conviction of a natural person, which can be the decision of the original conviction itself or subsequent decisions modifying the conviction. It may relate to several offences and several sanctions..
 * 
 * <p>Java class for DecisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DecisionID" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}DecisionIDType"/>
 *         &lt;element name="DecisionChangeTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}DecisionChangeTypeExternalReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DecisionDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType" minOccurs="0"/>
 *         &lt;element name="DecisionFinalDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType" minOccurs="0"/>
 *         &lt;element name="DecisionDecidingAuthority" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}DecidingAuthorityType" minOccurs="0"/>
 *         &lt;element name="DecisionDeleteConvictionFromRegister" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType"/>
 *         &lt;element name="DecisionRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionType", propOrder = {
    "decisionID",
    "decisionChangeTypeReference",
    "decisionDate",
    "decisionFinalDate",
    "decisionDecidingAuthority",
    "decisionDeleteConvictionFromRegister",
    "decisionRemarks"
})
public class DecisionType {

    @XmlElement(name = "DecisionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String decisionID;
    @XmlElement(name = "DecisionChangeTypeReference")
    protected List<String> decisionChangeTypeReference;
    @XmlElement(name = "DecisionDate", defaultValue = "1800-01-01")
    protected XMLGregorianCalendar decisionDate;
    @XmlElement(name = "DecisionFinalDate", defaultValue = "1800-01-01")
    protected XMLGregorianCalendar decisionFinalDate;
    @XmlElement(name = "DecisionDecidingAuthority")
    protected DecidingAuthorityType decisionDecidingAuthority;
    @XmlElement(name = "DecisionDeleteConvictionFromRegister", required = true)
    protected YesNoUnknownStringEnumerationType decisionDeleteConvictionFromRegister;
    @XmlElement(name = "DecisionRemarks")
    protected UncollapsedMultilingualTextType decisionRemarks;

    /**
     * Gets the value of the decisionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionID() {
        return decisionID;
    }

    /**
     * Sets the value of the decisionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionID(String value) {
        this.decisionID = value;
    }

    /**
     * Gets the value of the decisionChangeTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisionChangeTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisionChangeTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDecisionChangeTypeReference() {
        if (decisionChangeTypeReference == null) {
            decisionChangeTypeReference = new ArrayList<String>();
        }
        return this.decisionChangeTypeReference;
    }

    /**
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the decisionFinalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionFinalDate() {
        return decisionFinalDate;
    }

    /**
     * Sets the value of the decisionFinalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecisionFinalDate(XMLGregorianCalendar value) {
        this.decisionFinalDate = value;
    }

    /**
     * Gets the value of the decisionDecidingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link DecidingAuthorityType }
     *     
     */
    public DecidingAuthorityType getDecisionDecidingAuthority() {
        return decisionDecidingAuthority;
    }

    /**
     * Sets the value of the decisionDecidingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecidingAuthorityType }
     *     
     */
    public void setDecisionDecidingAuthority(DecidingAuthorityType value) {
        this.decisionDecidingAuthority = value;
    }

    /**
     * Gets the value of the decisionDeleteConvictionFromRegister property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public YesNoUnknownStringEnumerationType getDecisionDeleteConvictionFromRegister() {
        return decisionDeleteConvictionFromRegister;
    }

    /**
     * Sets the value of the decisionDeleteConvictionFromRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public void setDecisionDeleteConvictionFromRegister(YesNoUnknownStringEnumerationType value) {
        this.decisionDeleteConvictionFromRegister = value;
    }

    /**
     * Gets the value of the decisionRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public UncollapsedMultilingualTextType getDecisionRemarks() {
        return decisionRemarks;
    }

    /**
     * Sets the value of the decisionRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public void setDecisionRemarks(UncollapsedMultilingualTextType value) {
        this.decisionRemarks = value;
    }

}
