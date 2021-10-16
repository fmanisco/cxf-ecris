
package eu.europa.ec.ecris.commons_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A proxy type for defining dates that allow empty day or month information for dates that are only partly defined.
 * 
 * <p>Java class for DateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateYear" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YearType"/>
 *         &lt;element name="DateMonthDay" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MonthDayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
    "dateYear",
    "dateMonthDay"
})
public class DateType {

    @XmlElement(name = "DateYear", required = true, defaultValue = "1800")
    protected XMLGregorianCalendar dateYear;
    @XmlElement(name = "DateMonthDay")
    protected MonthDayType dateMonthDay;

    /**
     * Gets the value of the dateYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateYear() {
        return dateYear;
    }

    /**
     * Sets the value of the dateYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateYear(XMLGregorianCalendar value) {
        this.dateYear = value;
    }

    /**
     * Gets the value of the dateMonthDay property.
     * 
     * @return
     *     possible object is
     *     {@link MonthDayType }
     *     
     */
    public MonthDayType getDateMonthDay() {
        return dateMonthDay;
    }

    /**
     * Sets the value of the dateMonthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthDayType }
     *     
     */
    public void setDateMonthDay(MonthDayType value) {
        this.dateMonthDay = value;
    }

}
