
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType200Chars;


/**
 * This type represents a physical location and is used for transmitting information such as the birth place of a person or the place of an address.
 * 
 * <p>Java class for PlaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlaceCountryReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryExternalReferenceType"/>
 *         &lt;element name="PlaceCountrySubdivisionReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountrySubdivisionExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="PlaceTownReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CityExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="PlaceTownName" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType200Chars"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceType", propOrder = {
    "placeCountryReference",
    "placeCountrySubdivisionReference",
    "placeTownReference",
    "placeTownName"
})
public class PlaceType {

    @XmlElement(name = "PlaceCountryReference", required = true, defaultValue = "CO-00-999-XXX")
    protected String placeCountryReference;
    @XmlElement(name = "PlaceCountrySubdivisionReference")
    protected String placeCountrySubdivisionReference;
    @XmlElement(name = "PlaceTownReference")
    protected String placeTownReference;
    @XmlElement(name = "PlaceTownName", required = true)
    protected MultilingualTextType200Chars placeTownName;

    /**
     * Gets the value of the placeCountryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceCountryReference() {
        return placeCountryReference;
    }

    /**
     * Sets the value of the placeCountryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceCountryReference(String value) {
        this.placeCountryReference = value;
    }

    /**
     * Gets the value of the placeCountrySubdivisionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceCountrySubdivisionReference() {
        return placeCountrySubdivisionReference;
    }

    /**
     * Sets the value of the placeCountrySubdivisionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceCountrySubdivisionReference(String value) {
        this.placeCountrySubdivisionReference = value;
    }

    /**
     * Gets the value of the placeTownReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceTownReference() {
        return placeTownReference;
    }

    /**
     * Sets the value of the placeTownReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceTownReference(String value) {
        this.placeTownReference = value;
    }

    /**
     * Gets the value of the placeTownName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType200Chars }
     *     
     */
    public MultilingualTextType200Chars getPlaceTownName() {
        return placeTownName;
    }

    /**
     * Sets the value of the placeTownName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType200Chars }
     *     
     */
    public void setPlaceTownName(MultilingualTextType200Chars value) {
        this.placeTownName = value;
    }

}
