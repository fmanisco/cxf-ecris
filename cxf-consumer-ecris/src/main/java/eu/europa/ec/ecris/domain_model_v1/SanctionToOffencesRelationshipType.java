
package eu.europa.ec.ecris.domain_model_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.AbstractRelationshipType;


/**
 * This types defines one-to-many relationships between one "sanction" and one or more "offence" entities.
 * 
 * <p>Java class for SanctionToOffencesRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionToOffencesRelationshipType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/commons-v1.0}AbstractRelationshipType">
 *       &lt;sequence>
 *         &lt;element name="Sanction" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SanctionReferenceType"/>
 *         &lt;element name="Offence" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}OffenceReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionToOffencesRelationshipType", propOrder = {
    "sanction",
    "offence"
})
public class SanctionToOffencesRelationshipType
    extends AbstractRelationshipType
{

    @XmlElement(name = "Sanction", required = true)
    @XmlIDREF
    protected Object sanction;
    @XmlElementRef(name = "Offence", namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0", type = JAXBElement.class)
    protected List<JAXBElement<Object>> offence;

    /**
     * Gets the value of the sanction property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSanction() {
        return sanction;
    }

    /**
     * Sets the value of the sanction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSanction(Object value) {
        this.sanction = value;
    }

    /**
     * Gets the value of the offence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getOffence() {
        if (offence == null) {
            offence = new ArrayList<JAXBElement<Object>>();
        }
        return this.offence;
    }

}
