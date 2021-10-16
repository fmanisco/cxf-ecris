
package eu.europa.ec.ecris.common_reference_tables_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the national currencies based on ISO-4217 standard of the Member States.
 * 
 * <p>Java class for CurrencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CurrencyTechnicalIdentifierType"/>
 *         &lt;element name="CurrencyISO4217Code" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CurrencyISO4217CodeType"/>
 *         &lt;element name="CurrencyISO4217Number" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CurrencyISO4217NumberType"/>
 *         &lt;element name="CurrencyUsedInCountry" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryReferenceType" maxOccurs="unbounded"/>
 *         &lt;element name="CurrencyReplacedBy" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CurrencyReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyType", propOrder = {
    "currencyTechnicalIdentifier",
    "currencyISO4217Code",
    "currencyISO4217Number",
    "currencyUsedInCountry",
    "currencyReplacedBy"
})
public class CurrencyType
    extends EntityType
{

    @XmlElement(name = "CurrencyTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String currencyTechnicalIdentifier;
    @XmlElement(name = "CurrencyISO4217Code", required = true)
    protected String currencyISO4217Code;
    @XmlElement(name = "CurrencyISO4217Number", required = true)
    protected String currencyISO4217Number;
    @XmlElementRef(name = "CurrencyUsedInCountry", namespace = "http://ec.europa.eu/ECRIS/common-reference-tables-v1.0", type = JAXBElement.class)
    protected List<JAXBElement<Object>> currencyUsedInCountry;
    @XmlElementRef(name = "CurrencyReplacedBy", namespace = "http://ec.europa.eu/ECRIS/common-reference-tables-v1.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> currencyReplacedBy;

    /**
     * Gets the value of the currencyTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyTechnicalIdentifier() {
        return currencyTechnicalIdentifier;
    }

    /**
     * Sets the value of the currencyTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyTechnicalIdentifier(String value) {
        this.currencyTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the currencyISO4217Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyISO4217Code() {
        return currencyISO4217Code;
    }

    /**
     * Sets the value of the currencyISO4217Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyISO4217Code(String value) {
        this.currencyISO4217Code = value;
    }

    /**
     * Gets the value of the currencyISO4217Number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyISO4217Number() {
        return currencyISO4217Number;
    }

    /**
     * Sets the value of the currencyISO4217Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyISO4217Number(String value) {
        this.currencyISO4217Number = value;
    }

    /**
     * Gets the value of the currencyUsedInCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyUsedInCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyUsedInCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getCurrencyUsedInCountry() {
        if (currencyUsedInCountry == null) {
            currencyUsedInCountry = new ArrayList<JAXBElement<Object>>();
        }
        return this.currencyUsedInCountry;
    }

    /**
     * Gets the value of the currencyReplacedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyReplacedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyReplacedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getCurrencyReplacedBy() {
        if (currencyReplacedBy == null) {
            currencyReplacedBy = new ArrayList<JAXBElement<Object>>();
        }
        return this.currencyReplacedBy;
    }

}
