
package eu.europa.ec.ecris.commons_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A complex type representing a string value limited to 200 characters in one or more specific languages, allowing to indicate for each linguistic representation whether the text provided is the result of transliteration and/or translation.
 * 
 * <p>Java class for MultilingualTextType200Chars complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultilingualTextType200Chars">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultilingualTextLinguisticRepresentation" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://ec.europa.eu/ECRIS/commons-v1.0>RestrictedStringType200Chars">
 *                 &lt;attribute name="languageCode" type="{http://ec.europa.eu/ECRIS/commons-v1.0}LanguageISO639-1CodeType" />
 *                 &lt;attribute name="translated" type="{http://ec.europa.eu/ECRIS/commons-v1.0}BooleanType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
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
@XmlType(name = "MultilingualTextType200Chars", propOrder = {
    "multilingualTextLinguisticRepresentation"
})
public class MultilingualTextType200Chars {

    @XmlElement(name = "MultilingualTextLinguisticRepresentation", required = true)
    protected List<MultilingualTextType200Chars.MultilingualTextLinguisticRepresentation> multilingualTextLinguisticRepresentation;

    /**
     * Gets the value of the multilingualTextLinguisticRepresentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multilingualTextLinguisticRepresentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultilingualTextLinguisticRepresentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualTextType200Chars.MultilingualTextLinguisticRepresentation }
     * 
     * 
     */
    public List<MultilingualTextType200Chars.MultilingualTextLinguisticRepresentation> getMultilingualTextLinguisticRepresentation() {
        if (multilingualTextLinguisticRepresentation == null) {
            multilingualTextLinguisticRepresentation = new ArrayList<MultilingualTextType200Chars.MultilingualTextLinguisticRepresentation>();
        }
        return this.multilingualTextLinguisticRepresentation;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://ec.europa.eu/ECRIS/commons-v1.0>RestrictedStringType200Chars">
     *       &lt;attribute name="languageCode" type="{http://ec.europa.eu/ECRIS/commons-v1.0}LanguageISO639-1CodeType" />
     *       &lt;attribute name="translated" type="{http://ec.europa.eu/ECRIS/commons-v1.0}BooleanType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MultilingualTextLinguisticRepresentation {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "languageCode")
        protected String languageCode;
        @XmlAttribute(name = "translated")
        protected Boolean translated;

        /**
         * A restriction for the basic StringType used to enforce the limit of 200 maximum characters
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the languageCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguageCode() {
            return languageCode;
        }

        /**
         * Sets the value of the languageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguageCode(String value) {
            this.languageCode = value;
        }

        /**
         * Gets the value of the translated property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTranslated() {
            return translated;
        }

        /**
         * Sets the value of the translated property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTranslated(Boolean value) {
            this.translated = value;
        }

    }

}
