
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.NameTextType;


/**
 * Information of the person within the central authority of the Member State
 *                 that can be further contacted in case of questions or problems relating to a specific ECRIS message.
 * 
 * <p>Java class for ContactPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactPersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ec.europa.eu/ECRIS/domain-model-v1.0}Forename" minOccurs="0"/>
 *         &lt;element ref="{http://ec.europa.eu/ECRIS/domain-model-v1.0}Surname" minOccurs="0"/>
 *         &lt;element ref="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SecondSurname" minOccurs="0"/>
 *         &lt;element name="ContactPersonPhoneNumber" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType8to30Chars" minOccurs="0"/>
 *         &lt;element name="ContactPersonFaxNumber" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType8to30Chars" minOccurs="0"/>
 *         &lt;element name="ContactPersonEmail" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType320Chars"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactPersonType", propOrder = {
    "forename",
    "surname",
    "secondSurname",
    "contactPersonPhoneNumber",
    "contactPersonFaxNumber",
    "contactPersonEmail"
})
public class ContactPersonType {

    @XmlElement(name = "Forename", namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0")
    protected NameTextType forename;
    @XmlElement(name = "Surname", namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0")
    protected NameTextType surname;
    @XmlElement(name = "SecondSurname", namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0")
    protected NameTextType secondSurname;
    @XmlElement(name = "ContactPersonPhoneNumber")
    protected String contactPersonPhoneNumber;
    @XmlElement(name = "ContactPersonFaxNumber")
    protected String contactPersonFaxNumber;
    @XmlElement(name = "ContactPersonEmail", required = true)
    protected String contactPersonEmail;

    /**
     * The first name of the contact person.
     * 
     * @return
     *     possible object is
     *     {@link NameTextType }
     *     
     */
    public NameTextType getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTextType }
     *     
     */
    public void setForename(NameTextType value) {
        this.forename = value;
    }

    /**
     * The last name of the contact person.
     * 
     * @return
     *     possible object is
     *     {@link NameTextType }
     *     
     */
    public NameTextType getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTextType }
     *     
     */
    public void setSurname(NameTextType value) {
        this.surname = value;
    }

    /**
     * The second last name of the contact person
     * 
     * @return
     *     possible object is
     *     {@link NameTextType }
     *     
     */
    public NameTextType getSecondSurname() {
        return secondSurname;
    }

    /**
     * Sets the value of the secondSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTextType }
     *     
     */
    public void setSecondSurname(NameTextType value) {
        this.secondSurname = value;
    }

    /**
     * Gets the value of the contactPersonPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonPhoneNumber() {
        return contactPersonPhoneNumber;
    }

    /**
     * Sets the value of the contactPersonPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonPhoneNumber(String value) {
        this.contactPersonPhoneNumber = value;
    }

    /**
     * Gets the value of the contactPersonFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonFaxNumber() {
        return contactPersonFaxNumber;
    }

    /**
     * Sets the value of the contactPersonFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonFaxNumber(String value) {
        this.contactPersonFaxNumber = value;
    }

    /**
     * Gets the value of the contactPersonEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonEmail() {
        return contactPersonEmail;
    }

    /**
     * Sets the value of the contactPersonEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonEmail(String value) {
        this.contactPersonEmail = value;
    }

}
