
package eu.europa.ec.ecris.domain_model_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.DateType;
import eu.europa.ec.ecris.commons_v1.NameTextType;
import eu.europa.ec.ecris.commons_v1.UncollapsedMultilingualTextType;


/**
 * This type represents an abstract definition for all person types.
 * 
 * <p>Java class for AbstractPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PersonNameType" minOccurs="0"/>
 *         &lt;element name="PersonSex" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SexType" minOccurs="0"/>
 *         &lt;element name="PersonBirthDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DateType" minOccurs="0"/>
 *         &lt;element name="PersonBirthPlace" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PlaceType" minOccurs="0"/>
 *         &lt;element name="PersonNationalityReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryExternalReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonFormerForename" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonFormerSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonFormerSecondSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonFatherForename" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonFatherSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonFatherSecondSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonMotherForename" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonMotherSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonMotherSecondSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonIdentityNumber" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars" minOccurs="0"/>
 *         &lt;element name="PersonIdentificationDocument" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}IdentificationDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonAddress" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PersonAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonAlias" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PersonAliasType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPersonType", propOrder = {
    "personName",
    "personSex",
    "personBirthDate",
    "personBirthPlace",
    "personNationalityReference",
    "personFormerForename",
    "personFormerSurname",
    "personFormerSecondSurname",
    "personFatherForename",
    "personFatherSurname",
    "personFatherSecondSurname",
    "personMotherForename",
    "personMotherSurname",
    "personMotherSecondSurname",
    "personIdentityNumber",
    "personIdentificationDocument",
    "personAddress",
    "personAlias",
    "personRemarks"
})
@XmlSeeAlso({
    PersonType.class,
    PersonAliasType.class
})
public abstract class AbstractPersonType {

    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "PersonSex")
    protected Integer personSex;
    @XmlElement(name = "PersonBirthDate")
    protected DateType personBirthDate;
    @XmlElement(name = "PersonBirthPlace")
    protected PlaceType personBirthPlace;
    @XmlElement(name = "PersonNationalityReference")
    protected List<String> personNationalityReference;
    @XmlElement(name = "PersonFormerForename")
    protected List<NameTextType> personFormerForename;
    @XmlElement(name = "PersonFormerSurname")
    protected List<NameTextType> personFormerSurname;
    @XmlElement(name = "PersonFormerSecondSurname")
    protected List<NameTextType> personFormerSecondSurname;
    @XmlElement(name = "PersonFatherForename")
    protected List<NameTextType> personFatherForename;
    @XmlElement(name = "PersonFatherSurname")
    protected List<NameTextType> personFatherSurname;
    @XmlElement(name = "PersonFatherSecondSurname")
    protected List<NameTextType> personFatherSecondSurname;
    @XmlElement(name = "PersonMotherForename")
    protected List<NameTextType> personMotherForename;
    @XmlElement(name = "PersonMotherSurname")
    protected List<NameTextType> personMotherSurname;
    @XmlElement(name = "PersonMotherSecondSurname")
    protected List<NameTextType> personMotherSecondSurname;
    @XmlElement(name = "PersonIdentityNumber")
    protected String personIdentityNumber;
    @XmlElement(name = "PersonIdentificationDocument")
    protected List<IdentificationDocumentType> personIdentificationDocument;
    @XmlElement(name = "PersonAddress")
    protected List<PersonAddressType> personAddress;
    @XmlElement(name = "PersonAlias")
    protected List<PersonAliasType> personAlias;
    @XmlElement(name = "PersonRemarks")
    protected UncollapsedMultilingualTextType personRemarks;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the personSex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonSex() {
        return personSex;
    }

    /**
     * Sets the value of the personSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonSex(Integer value) {
        this.personSex = value;
    }

    /**
     * Gets the value of the personBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getPersonBirthDate() {
        return personBirthDate;
    }

    /**
     * Sets the value of the personBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setPersonBirthDate(DateType value) {
        this.personBirthDate = value;
    }

    /**
     * Gets the value of the personBirthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceType }
     *     
     */
    public PlaceType getPersonBirthPlace() {
        return personBirthPlace;
    }

    /**
     * Sets the value of the personBirthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceType }
     *     
     */
    public void setPersonBirthPlace(PlaceType value) {
        this.personBirthPlace = value;
    }

    /**
     * Gets the value of the personNationalityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personNationalityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonNationalityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPersonNationalityReference() {
        if (personNationalityReference == null) {
            personNationalityReference = new ArrayList<String>();
        }
        return this.personNationalityReference;
    }

    /**
     * Gets the value of the personFormerForename property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personFormerForename property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonFormerForename().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getPersonFormerForename() {
        if (personFormerForename == null) {
            personFormerForename = new ArrayList<NameTextType>();
        }
        return this.personFormerForename;
    }

    /**
     * Gets the value of the personFormerSurname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personFormerSurname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonFormerSurname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getPersonFormerSurname() {
        if (personFormerSurname == null) {
            personFormerSurname = new ArrayList<NameTextType>();
        }
        return this.personFormerSurname;
    }

    /**
     * Gets the value of the personFormerSecondSurname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personFormerSecondSurname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonFormerSecondSurname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getPersonFormerSecondSurname() {
        if (personFormerSecondSurname == null) {
            personFormerSecondSurname = new ArrayList<NameTextType>();
        }
        return this.personFormerSecondSurname;
    }

    /**
     * Gets the value of the personFatherForename property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personFatherForename property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonFatherForename().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getPersonFatherForename() {
        if (personFatherForename == null) {
            personFatherForename = new ArrayList<NameTextType>();
        }
        return this.personFatherForename;
    }

    /**
     * Gets the value of the personFatherSurname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personFatherSurname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonFatherSurname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getPersonFatherSurname() {
        if (personFatherSurname == null) {
            personFatherSurname = new ArrayList<NameTextType>();
        }
        return this.personFatherSurname;
    }

    /**
     * Gets the value of the personFatherSecondSurname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personFatherSecondSurname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonFatherSecondSurname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getPersonFatherSecondSurname() {
        if (personFatherSecondSurname == null) {
            personFatherSecondSurname = new ArrayList<NameTextType>();
        }
        return this.personFatherSecondSurname;
    }

    /**
     * Gets the value of the personMotherForename property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personMotherForename property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonMotherForename().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getPersonMotherForename() {
        if (personMotherForename == null) {
            personMotherForename = new ArrayList<NameTextType>();
        }
        return this.personMotherForename;
    }

    /**
     * Gets the value of the personMotherSurname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personMotherSurname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonMotherSurname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getPersonMotherSurname() {
        if (personMotherSurname == null) {
            personMotherSurname = new ArrayList<NameTextType>();
        }
        return this.personMotherSurname;
    }

    /**
     * Gets the value of the personMotherSecondSurname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personMotherSecondSurname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonMotherSecondSurname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getPersonMotherSecondSurname() {
        if (personMotherSecondSurname == null) {
            personMotherSecondSurname = new ArrayList<NameTextType>();
        }
        return this.personMotherSecondSurname;
    }

    /**
     * Gets the value of the personIdentityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonIdentityNumber() {
        return personIdentityNumber;
    }

    /**
     * Sets the value of the personIdentityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonIdentityNumber(String value) {
        this.personIdentityNumber = value;
    }

    /**
     * Gets the value of the personIdentificationDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personIdentificationDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonIdentificationDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationDocumentType }
     * 
     * 
     */
    public List<IdentificationDocumentType> getPersonIdentificationDocument() {
        if (personIdentificationDocument == null) {
            personIdentificationDocument = new ArrayList<IdentificationDocumentType>();
        }
        return this.personIdentificationDocument;
    }

    /**
     * Gets the value of the personAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonAddressType }
     * 
     * 
     */
    public List<PersonAddressType> getPersonAddress() {
        if (personAddress == null) {
            personAddress = new ArrayList<PersonAddressType>();
        }
        return this.personAddress;
    }

    /**
     * Gets the value of the personAlias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personAlias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonAliasType }
     * 
     * 
     */
    public List<PersonAliasType> getPersonAlias() {
        if (personAlias == null) {
            personAlias = new ArrayList<PersonAliasType>();
        }
        return this.personAlias;
    }

    /**
     * Gets the value of the personRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public UncollapsedMultilingualTextType getPersonRemarks() {
        return personRemarks;
    }

    /**
     * Sets the value of the personRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public void setPersonRemarks(UncollapsedMultilingualTextType value) {
        this.personRemarks = value;
    }

}
