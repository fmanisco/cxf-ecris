
package eu.europa.ec.ecris.commons_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for strictly positive decimal values with fraction supporting 2 positions
 * 
 * <p>Java class for PositiveDecimalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositiveDecimalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PositiveDecimalUnit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://ec.europa.eu/ECRIS/commons-v1.0}NonNegativeIntegerType">
 *               &lt;maxInclusive value="999999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PositiveDecimalFraction" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://ec.europa.eu/ECRIS/commons-v1.0}PositiveIntegerType">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositiveDecimalType", propOrder = {
    "positiveDecimalUnit",
    "positiveDecimalFraction"
})
public class PositiveDecimalType {

    @XmlElement(name = "PositiveDecimalUnit")
    protected long positiveDecimalUnit;
    @XmlElement(name = "PositiveDecimalFraction")
    protected Integer positiveDecimalFraction;

    /**
     * Gets the value of the positiveDecimalUnit property.
     * 
     */
    public long getPositiveDecimalUnit() {
        return positiveDecimalUnit;
    }

    /**
     * Sets the value of the positiveDecimalUnit property.
     * 
     */
    public void setPositiveDecimalUnit(long value) {
        this.positiveDecimalUnit = value;
    }

    /**
     * Gets the value of the positiveDecimalFraction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositiveDecimalFraction() {
        return positiveDecimalFraction;
    }

    /**
     * Sets the value of the positiveDecimalFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositiveDecimalFraction(Integer value) {
        this.positiveDecimalFraction = value;
    }

}
