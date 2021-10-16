
package eu.europa.ec.ecris.commons_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A proxy for day and month information; the month is mandatory and the day optional
 * 
 * <p>Java class for MonthDayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonthDayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateMonth" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MonthType"/>
 *         &lt;element name="DateDay" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthDayType", propOrder = {
    "dateMonth",
    "dateDay"
})
public class MonthDayType {

    @XmlElement(name = "DateMonth", required = true)
    protected XMLGregorianCalendar dateMonth;
    @XmlElement(name = "DateDay")
    protected XMLGregorianCalendar dateDay;

    /**
     * Gets the value of the dateMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateMonth() {
        return dateMonth;
    }

    /**
     * Sets the value of the dateMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateMonth(XMLGregorianCalendar value) {
        this.dateMonth = value;
    }

    /**
     * Gets the value of the dateDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDay() {
        return dateDay;
    }

    /**
     * Sets the value of the dateDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDay(XMLGregorianCalendar value) {
        this.dateDay = value;
    }

}
