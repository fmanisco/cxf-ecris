
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
 * This types defines one-to-many relationships between one "decision" and one or more "sanction" entities.
 * 
 * <p>Java class for DecisionToSanctionsRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionToSanctionsRelationshipType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/commons-v1.0}AbstractRelationshipType">
 *       &lt;sequence>
 *         &lt;element name="Decision" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}DecisionReferenceType"/>
 *         &lt;element name="Sanction" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SanctionReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionToSanctionsRelationshipType", propOrder = {
    "decision",
    "sanction"
})
public class DecisionToSanctionsRelationshipType
    extends AbstractRelationshipType
{

    @XmlElement(name = "Decision", required = true)
    @XmlIDREF
    protected Object decision;
    @XmlElementRef(name = "Sanction", namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0", type = JAXBElement.class)
    protected List<JAXBElement<Object>> sanction;

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDecision(Object value) {
        this.decision = value;
    }

    /**
     * Gets the value of the sanction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getSanction() {
        if (sanction == null) {
            sanction = new ArrayList<JAXBElement<Object>>();
        }
        return this.sanction;
    }

}
