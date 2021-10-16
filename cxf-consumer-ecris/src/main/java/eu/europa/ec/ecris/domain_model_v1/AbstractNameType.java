
package eu.europa.ec.ecris.domain_model_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.FullNameTextType;
import eu.europa.ec.ecris.commons_v1.NameTextType;


/**
 * The abstract base definition of person name structures.
 * 
 * <p>Java class for AbstractNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ec.europa.eu/ECRIS/domain-model-v1.0}Forename" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ec.europa.eu/ECRIS/domain-model-v1.0}Surname" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SecondSurname" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://ec.europa.eu/ECRIS/commons-v1.0}FullNameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractNameType", propOrder = {
    "forename",
    "surname",
    "secondSurname",
    "fullName"
})
@XmlSeeAlso({
    PersonNameType.class
})
public abstract class AbstractNameType {

    @XmlElement(name = "Forename")
    protected List<NameTextType> forename;
    @XmlElement(name = "Surname")
    protected List<NameTextType> surname;
    @XmlElement(name = "SecondSurname")
    protected List<NameTextType> secondSurname;
    @XmlElement(name = "FullName")
    protected List<FullNameTextType> fullName;

    /**
     * Gets the value of the forename property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forename property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForename().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getForename() {
        if (forename == null) {
            forename = new ArrayList<NameTextType>();
        }
        return this.forename;
    }

    /**
     * Gets the value of the surname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getSurname() {
        if (surname == null) {
            surname = new ArrayList<NameTextType>();
        }
        return this.surname;
    }

    /**
     * Gets the value of the secondSurname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondSurname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondSurname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameTextType }
     * 
     * 
     */
    public List<NameTextType> getSecondSurname() {
        if (secondSurname == null) {
            secondSurname = new ArrayList<NameTextType>();
        }
        return this.secondSurname;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullNameTextType }
     * 
     * 
     */
    public List<FullNameTextType> getFullName() {
        if (fullName == null) {
            fullName = new ArrayList<FullNameTextType>();
        }
        return this.fullName;
    }

}
