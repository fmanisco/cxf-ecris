
package eu.europa.ec.ecris.domain_model_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.AbstractRelationshipType;


/**
 * This types defines one-to-many relationships between one "sanction" and one or more "saction" entities.
 * 
 * <p>Java class for SanctionToSanctionsRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionToSanctionsRelationshipType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/commons-v1.0}AbstractRelationshipType">
 *       &lt;sequence>
 *         &lt;element name="SourceSanction" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SanctionReferenceType"/>
 *         &lt;element name="DestinationSanction" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SanctionReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="relationshipTypeReference" use="required" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionToSanctionsRelationTypeExternalReferenceType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionToSanctionsRelationshipType", propOrder = {
    "sourceSanction",
    "destinationSanction"
})
public class SanctionToSanctionsRelationshipType
    extends AbstractRelationshipType
{

    @XmlElement(name = "SourceSanction", required = true)
    @XmlIDREF
    protected Object sourceSanction;
    @XmlElementRef(name = "DestinationSanction", namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0", type = JAXBElement.class)
    protected List<JAXBElement<Object>> destinationSanction;
    @XmlAttribute(name = "relationshipTypeReference", required = true)
    protected String relationshipTypeReference;

    /**
     * Gets the value of the sourceSanction property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSourceSanction() {
        return sourceSanction;
    }

    /**
     * Sets the value of the sourceSanction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSourceSanction(Object value) {
        this.sourceSanction = value;
    }

    /**
     * Gets the value of the destinationSanction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationSanction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationSanction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getDestinationSanction() {
        if (destinationSanction == null) {
            destinationSanction = new ArrayList<JAXBElement<Object>>();
        }
        return this.destinationSanction;
    }

    /**
     * Gets the value of the relationshipTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipTypeReference() {
        return relationshipTypeReference;
    }

    /**
     * Sets the value of the relationshipTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipTypeReference(String value) {
        this.relationshipTypeReference = value;
    }

}
