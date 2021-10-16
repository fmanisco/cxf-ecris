
package eu.europa.ec.ecris.commons_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.ecris.domain_model_v1.DecisionToOffencesRelationshipType;
import eu.europa.ec.ecris.domain_model_v1.DecisionToSanctionsRelationshipType;
import eu.europa.ec.ecris.domain_model_v1.SanctionToOffencesRelationshipType;
import eu.europa.ec.ecris.domain_model_v1.SanctionToSanctionsRelationshipType;
import eu.europa.ec.ecris.messages_v1.ConvictionToConvictionsRelationshipType;


/**
 * The abstract base definition for all relationship types between entities. Please note that this abstract type is only a marker type and does not contain any elements. The concrete relationship types must be defined in the appropriate package file, deriving from this abstract type by extension, and using the proper specific types for the source and destination elements.
 * 
 * <p>Java class for AbstractRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRelationshipType")
@XmlSeeAlso({
    ConvictionToConvictionsRelationshipType.class,
    DecisionToOffencesRelationshipType.class,
    DecisionToSanctionsRelationshipType.class,
    SanctionToSanctionsRelationshipType.class,
    SanctionToOffencesRelationshipType.class
})
public abstract class AbstractRelationshipType {


}
