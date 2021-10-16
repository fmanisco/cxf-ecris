
package eu.europa.ec.ecris.messages_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.commons_v1.AbstractRelationshipType;


/**
 * This types defines one-to-many relationships between one "conviction" and
 *                 one or more "conviction" entities. The source conviction must be contained in the same XML document but
 *                 the destinations refer to convictions that have been sent previously and that are outside of the XML
 *                 document itself.
 * 
 * <p>Java class for ConvictionToConvictionsRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvictionToConvictionsRelationshipType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/commons-v1.0}AbstractRelationshipType">
 *       &lt;sequence>
 *         &lt;element name="SourceConviction" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}ConvictionReferenceType"/>
 *         &lt;element name="DestinationConviction" type="{http://ec.europa.eu/ECRIS/messages-v1.0}StructuredLooseConvictionReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvictionToConvictionsRelationshipType", propOrder = {
    "sourceConviction",
    "destinationConviction"
})
public class ConvictionToConvictionsRelationshipType
    extends AbstractRelationshipType
{

    @XmlElement(name = "SourceConviction", required = true)
    @XmlIDREF
    protected Object sourceConviction;
    @XmlElement(name = "DestinationConviction", required = true)
    protected List<StructuredLooseConvictionReferenceType> destinationConviction;

    /**
     * Gets the value of the sourceConviction property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSourceConviction() {
        return sourceConviction;
    }

    /**
     * Sets the value of the sourceConviction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSourceConviction(Object value) {
        this.sourceConviction = value;
    }

    /**
     * Gets the value of the destinationConviction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationConviction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationConviction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredLooseConvictionReferenceType }
     * 
     * 
     */
    public List<StructuredLooseConvictionReferenceType> getDestinationConviction() {
        if (destinationConviction == null) {
            destinationConviction = new ArrayList<StructuredLooseConvictionReferenceType>();
        }
        return this.destinationConviction;
    }

}
