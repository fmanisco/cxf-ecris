
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The abstract base definition for periods of time.
 * 
 * <p>Java class for AbstractPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeriodStartDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType" minOccurs="0"/>
 *         &lt;element name="PeriodDuration" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DurationType" minOccurs="0"/>
 *         &lt;element name="PeriodEndDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPeriodType", propOrder = {
    "periodStartDate",
    "periodDuration",
    "periodEndDate"
})
@XmlSeeAlso({
    SanctionPeriodType.class,
    SanctionSuspensionType.class,
    SanctionInterruptionType.class,
    SanctionSentencedPeriodType.class
})
public abstract class AbstractPeriodType {

    @XmlElement(name = "PeriodStartDate")
    protected XMLGregorianCalendar periodStartDate;
    @XmlElement(name = "PeriodDuration")
    protected Duration periodDuration;
    @XmlElement(name = "PeriodEndDate")
    protected XMLGregorianCalendar periodEndDate;

    /**
     * Gets the value of the periodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodStartDate() {
        return periodStartDate;
    }

    /**
     * Sets the value of the periodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodStartDate(XMLGregorianCalendar value) {
        this.periodStartDate = value;
    }

    /**
     * Gets the value of the periodDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPeriodDuration() {
        return periodDuration;
    }

    /**
     * Sets the value of the periodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPeriodDuration(Duration value) {
        this.periodDuration = value;
    }

    /**
     * Gets the value of the periodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEndDate() {
        return periodEndDate;
    }

    /**
     * Sets the value of the periodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEndDate(XMLGregorianCalendar value) {
        this.periodEndDate = value;
    }

}
