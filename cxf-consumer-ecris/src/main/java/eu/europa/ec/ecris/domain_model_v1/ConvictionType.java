
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
import eu.europa.ec.ecris.commons_v1.AbstractRelationshipType;
import eu.europa.ec.ecris.commons_v1.UncollapsedMultilingualTextType;
import eu.europa.ec.ecris.commons_v1.YesNoUnknownStringEnumerationType;


/**
 * This type contains all the information on the decision of a competent authority relative to the conviction of a natural person, including the offences committed and the sanctions to which the person has been sentenced.
 * 
 * <p>Java class for ConvictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvictionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConvictionID" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}ConvictionIDType"/>
 *         &lt;element name="ConvictionConvictingCountryReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryExternalReferenceType"/>
 *         &lt;element name="ConvictionFileNumber" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars"/>
 *         &lt;element name="ConvictionDecisionDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType"/>
 *         &lt;element name="ConvictionDecisionFinalDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType"/>
 *         &lt;element name="ConvictionDecidingAuthority" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}DecidingAuthorityType"/>
 *         &lt;element name="ConvictionNonCriminalRuling" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType"/>
 *         &lt;element name="ConvictionRetentionPeriodEndDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType" minOccurs="0"/>
 *         &lt;element name="ConvictionIsTransmittable" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType"/>
 *         &lt;element name="ConvictionRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *         &lt;element name="ConvictionDecision" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}DecisionType" maxOccurs="unbounded"/>
 *         &lt;element name="ConvictionOffence" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}OffenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConvictionSanction" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SanctionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConvictionRelationship" type="{http://ec.europa.eu/ECRIS/commons-v1.0}AbstractRelationshipType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvictionType", propOrder = {
    "convictionID",
    "convictionConvictingCountryReference",
    "convictionFileNumber",
    "convictionDecisionDate",
    "convictionDecisionFinalDate",
    "convictionDecidingAuthority",
    "convictionNonCriminalRuling",
    "convictionRetentionPeriodEndDate",
    "convictionIsTransmittable",
    "convictionRemarks",
    "convictionDecision",
    "convictionOffence",
    "convictionSanction",
    "convictionRelationship"
})
public class ConvictionType {

    @XmlElement(name = "ConvictionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String convictionID;
    @XmlElement(name = "ConvictionConvictingCountryReference", required = true)
    protected String convictionConvictingCountryReference;
    @XmlElement(name = "ConvictionFileNumber", required = true, defaultValue = "UNKNOWN")
    protected String convictionFileNumber;
    @XmlElement(name = "ConvictionDecisionDate", required = true, defaultValue = "1800-01-01")
    protected XMLGregorianCalendar convictionDecisionDate;
    @XmlElement(name = "ConvictionDecisionFinalDate", required = true, defaultValue = "1800-01-01")
    protected XMLGregorianCalendar convictionDecisionFinalDate;
    @XmlElement(name = "ConvictionDecidingAuthority", required = true)
    protected DecidingAuthorityType convictionDecidingAuthority;
    @XmlElement(name = "ConvictionNonCriminalRuling", required = true)
    protected YesNoUnknownStringEnumerationType convictionNonCriminalRuling;
    @XmlElement(name = "ConvictionRetentionPeriodEndDate")
    protected XMLGregorianCalendar convictionRetentionPeriodEndDate;
    @XmlElement(name = "ConvictionIsTransmittable", required = true)
    protected YesNoUnknownStringEnumerationType convictionIsTransmittable;
    @XmlElement(name = "ConvictionRemarks")
    protected UncollapsedMultilingualTextType convictionRemarks;
    @XmlElement(name = "ConvictionDecision", required = true)
    protected List<DecisionType> convictionDecision;
    @XmlElement(name = "ConvictionOffence")
    protected List<OffenceType> convictionOffence;
    @XmlElement(name = "ConvictionSanction")
    protected List<SanctionType> convictionSanction;
    @XmlElement(name = "ConvictionRelationship")
    protected List<AbstractRelationshipType> convictionRelationship;

    /**
     * Gets the value of the convictionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvictionID() {
        return convictionID;
    }

    /**
     * Sets the value of the convictionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvictionID(String value) {
        this.convictionID = value;
    }

    /**
     * Gets the value of the convictionConvictingCountryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvictionConvictingCountryReference() {
        return convictionConvictingCountryReference;
    }

    /**
     * Sets the value of the convictionConvictingCountryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvictionConvictingCountryReference(String value) {
        this.convictionConvictingCountryReference = value;
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
     * Gets the value of the convictionDecisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvictionDecisionDate() {
        return convictionDecisionDate;
    }

    /**
     * Sets the value of the convictionDecisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvictionDecisionDate(XMLGregorianCalendar value) {
        this.convictionDecisionDate = value;
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

    /**
     * Gets the value of the convictionDecidingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link DecidingAuthorityType }
     *     
     */
    public DecidingAuthorityType getConvictionDecidingAuthority() {
        return convictionDecidingAuthority;
    }

    /**
     * Sets the value of the convictionDecidingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecidingAuthorityType }
     *     
     */
    public void setConvictionDecidingAuthority(DecidingAuthorityType value) {
        this.convictionDecidingAuthority = value;
    }

    /**
     * Gets the value of the convictionNonCriminalRuling property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public YesNoUnknownStringEnumerationType getConvictionNonCriminalRuling() {
        return convictionNonCriminalRuling;
    }

    /**
     * Sets the value of the convictionNonCriminalRuling property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public void setConvictionNonCriminalRuling(YesNoUnknownStringEnumerationType value) {
        this.convictionNonCriminalRuling = value;
    }

    /**
     * Gets the value of the convictionRetentionPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvictionRetentionPeriodEndDate() {
        return convictionRetentionPeriodEndDate;
    }

    /**
     * Sets the value of the convictionRetentionPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvictionRetentionPeriodEndDate(XMLGregorianCalendar value) {
        this.convictionRetentionPeriodEndDate = value;
    }

    /**
     * Gets the value of the convictionIsTransmittable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public YesNoUnknownStringEnumerationType getConvictionIsTransmittable() {
        return convictionIsTransmittable;
    }

    /**
     * Sets the value of the convictionIsTransmittable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public void setConvictionIsTransmittable(YesNoUnknownStringEnumerationType value) {
        this.convictionIsTransmittable = value;
    }

    /**
     * Gets the value of the convictionRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public UncollapsedMultilingualTextType getConvictionRemarks() {
        return convictionRemarks;
    }

    /**
     * Sets the value of the convictionRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public void setConvictionRemarks(UncollapsedMultilingualTextType value) {
        this.convictionRemarks = value;
    }

    /**
     * Gets the value of the convictionDecision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convictionDecision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvictionDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionType }
     * 
     * 
     */
    public List<DecisionType> getConvictionDecision() {
        if (convictionDecision == null) {
            convictionDecision = new ArrayList<DecisionType>();
        }
        return this.convictionDecision;
    }

    /**
     * Gets the value of the convictionOffence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convictionOffence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvictionOffence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffenceType }
     * 
     * 
     */
    public List<OffenceType> getConvictionOffence() {
        if (convictionOffence == null) {
            convictionOffence = new ArrayList<OffenceType>();
        }
        return this.convictionOffence;
    }

    /**
     * Gets the value of the convictionSanction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convictionSanction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvictionSanction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanctionType }
     * 
     * 
     */
    public List<SanctionType> getConvictionSanction() {
        if (convictionSanction == null) {
            convictionSanction = new ArrayList<SanctionType>();
        }
        return this.convictionSanction;
    }

    /**
     * Gets the value of the convictionRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convictionRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvictionRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractRelationshipType }
     * 
     * 
     */
    public List<AbstractRelationshipType> getConvictionRelationship() {
        if (convictionRelationship == null) {
            convictionRelationship = new ArrayList<AbstractRelationshipType>();
        }
        return this.convictionRelationship;
    }

}
