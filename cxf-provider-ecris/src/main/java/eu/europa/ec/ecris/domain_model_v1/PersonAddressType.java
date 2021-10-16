
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType400Chars;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType50Chars;
import eu.europa.ec.ecris.commons_v1.UncollapsedMultilingualTextType;


/**
 * This type represents an address of a person.
 * 
 * <p>Java class for PersonAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressPlace" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PlaceType"/>
 *         &lt;element name="AddressStreet" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars" minOccurs="0"/>
 *         &lt;element name="AddressHouseNumber" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType50Chars" minOccurs="0"/>
 *         &lt;element name="AddressPostCode" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType50Chars" minOccurs="0"/>
 *         &lt;element name="AddressFull" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonAddressType", propOrder = {
    "addressPlace",
    "addressStreet",
    "addressHouseNumber",
    "addressPostCode",
    "addressFull"
})
public class PersonAddressType {

    @XmlElement(name = "AddressPlace", required = true)
    protected PlaceType addressPlace;
    @XmlElement(name = "AddressStreet")
    protected MultilingualTextType400Chars addressStreet;
    @XmlElement(name = "AddressHouseNumber")
    protected MultilingualTextType50Chars addressHouseNumber;
    @XmlElement(name = "AddressPostCode")
    protected MultilingualTextType50Chars addressPostCode;
    @XmlElement(name = "AddressFull")
    protected UncollapsedMultilingualTextType addressFull;

    /**
     * Gets the value of the addressPlace property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceType }
     *     
     */
    public PlaceType getAddressPlace() {
        return addressPlace;
    }

    /**
     * Sets the value of the addressPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceType }
     *     
     */
    public void setAddressPlace(PlaceType value) {
        this.addressPlace = value;
    }

    /**
     * Gets the value of the addressStreet property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public MultilingualTextType400Chars getAddressStreet() {
        return addressStreet;
    }

    /**
     * Sets the value of the addressStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public void setAddressStreet(MultilingualTextType400Chars value) {
        this.addressStreet = value;
    }

    /**
     * Gets the value of the addressHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType50Chars }
     *     
     */
    public MultilingualTextType50Chars getAddressHouseNumber() {
        return addressHouseNumber;
    }

    /**
     * Sets the value of the addressHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType50Chars }
     *     
     */
    public void setAddressHouseNumber(MultilingualTextType50Chars value) {
        this.addressHouseNumber = value;
    }

    /**
     * Gets the value of the addressPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType50Chars }
     *     
     */
    public MultilingualTextType50Chars getAddressPostCode() {
        return addressPostCode;
    }

    /**
     * Sets the value of the addressPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType50Chars }
     *     
     */
    public void setAddressPostCode(MultilingualTextType50Chars value) {
        this.addressPostCode = value;
    }

    /**
     * Gets the value of the addressFull property.
     * 
     * @return
     *     possible object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public UncollapsedMultilingualTextType getAddressFull() {
        return addressFull;
    }

    /**
     * Sets the value of the addressFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public void setAddressFull(UncollapsedMultilingualTextType value) {
        this.addressFull = value;
    }

}
