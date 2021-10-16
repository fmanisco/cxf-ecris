
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import eu.europa.ec.ecris.commons_v1.NameTextType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.ec.ecris.domain_model_v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SecondSurname_QNAME = new QName("http://ec.europa.eu/ECRIS/domain-model-v1.0", "SecondSurname");
    private final static QName _Surname_QNAME = new QName("http://ec.europa.eu/ECRIS/domain-model-v1.0", "Surname");
    private final static QName _Forename_QNAME = new QName("http://ec.europa.eu/ECRIS/domain-model-v1.0", "Forename");
    private final static QName _DecisionToSanctionsRelationshipTypeSanction_QNAME = new QName("http://ec.europa.eu/ECRIS/domain-model-v1.0", "Sanction");
    private final static QName _SanctionToSanctionsRelationshipTypeDestinationSanction_QNAME = new QName("http://ec.europa.eu/ECRIS/domain-model-v1.0", "DestinationSanction");
    private final static QName _DecisionToOffencesRelationshipTypeOffence_QNAME = new QName("http://ec.europa.eu/ECRIS/domain-model-v1.0", "Offence");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.ec.ecris.domain_model_v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SanctionPeriodType }
     * 
     */
    public SanctionPeriodType createSanctionPeriodType() {
        return new SanctionPeriodType();
    }

    /**
     * Create an instance of {@link DecisionToOffencesRelationshipType }
     * 
     */
    public DecisionToOffencesRelationshipType createDecisionToOffencesRelationshipType() {
        return new DecisionToOffencesRelationshipType();
    }

    /**
     * Create an instance of {@link PlaceType }
     * 
     */
    public PlaceType createPlaceType() {
        return new PlaceType();
    }

    /**
     * Create an instance of {@link SanctionSuspensionType }
     * 
     */
    public SanctionSuspensionType createSanctionSuspensionType() {
        return new SanctionSuspensionType();
    }

    /**
     * Create an instance of {@link DecisionToSanctionsRelationshipType }
     * 
     */
    public DecisionToSanctionsRelationshipType createDecisionToSanctionsRelationshipType() {
        return new DecisionToSanctionsRelationshipType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link SanctionInterruptionType }
     * 
     */
    public SanctionInterruptionType createSanctionInterruptionType() {
        return new SanctionInterruptionType();
    }

    /**
     * Create an instance of {@link SanctionType }
     * 
     */
    public SanctionType createSanctionType() {
        return new SanctionType();
    }

    /**
     * Create an instance of {@link DecisionType }
     * 
     */
    public DecisionType createDecisionType() {
        return new DecisionType();
    }

    /**
     * Create an instance of {@link ConvictionType }
     * 
     */
    public ConvictionType createConvictionType() {
        return new ConvictionType();
    }

    /**
     * Create an instance of {@link SanctionSentencedPeriodType }
     * 
     */
    public SanctionSentencedPeriodType createSanctionSentencedPeriodType() {
        return new SanctionSentencedPeriodType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link IdentificationDocumentType }
     * 
     */
    public IdentificationDocumentType createIdentificationDocumentType() {
        return new IdentificationDocumentType();
    }

    /**
     * Create an instance of {@link SanctionToSanctionsRelationshipType }
     * 
     */
    public SanctionToSanctionsRelationshipType createSanctionToSanctionsRelationshipType() {
        return new SanctionToSanctionsRelationshipType();
    }

    /**
     * Create an instance of {@link DecidingAuthorityType }
     * 
     */
    public DecidingAuthorityType createDecidingAuthorityType() {
        return new DecidingAuthorityType();
    }

    /**
     * Create an instance of {@link OffenceType }
     * 
     */
    public OffenceType createOffenceType() {
        return new OffenceType();
    }

    /**
     * Create an instance of {@link PersonAliasType }
     * 
     */
    public PersonAliasType createPersonAliasType() {
        return new PersonAliasType();
    }

    /**
     * Create an instance of {@link PersonAddressType }
     * 
     */
    public PersonAddressType createPersonAddressType() {
        return new PersonAddressType();
    }

    /**
     * Create an instance of {@link SanctionToOffencesRelationshipType }
     * 
     */
    public SanctionToOffencesRelationshipType createSanctionToOffencesRelationshipType() {
        return new SanctionToOffencesRelationshipType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0", name = "SecondSurname")
    public JAXBElement<NameTextType> createSecondSurname(NameTextType value) {
        return new JAXBElement<NameTextType>(_SecondSurname_QNAME, NameTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0", name = "Surname")
    public JAXBElement<NameTextType> createSurname(NameTextType value) {
        return new JAXBElement<NameTextType>(_Surname_QNAME, NameTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0", name = "Forename")
    public JAXBElement<NameTextType> createForename(NameTextType value) {
        return new JAXBElement<NameTextType>(_Forename_QNAME, NameTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0", name = "Sanction", scope = DecisionToSanctionsRelationshipType.class)
    @XmlIDREF
    public JAXBElement<Object> createDecisionToSanctionsRelationshipTypeSanction(Object value) {
        return new JAXBElement<Object>(_DecisionToSanctionsRelationshipTypeSanction_QNAME, Object.class, DecisionToSanctionsRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0", name = "DestinationSanction", scope = SanctionToSanctionsRelationshipType.class)
    @XmlIDREF
    public JAXBElement<Object> createSanctionToSanctionsRelationshipTypeDestinationSanction(Object value) {
        return new JAXBElement<Object>(_SanctionToSanctionsRelationshipTypeDestinationSanction_QNAME, Object.class, SanctionToSanctionsRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0", name = "Offence", scope = DecisionToOffencesRelationshipType.class)
    @XmlIDREF
    public JAXBElement<Object> createDecisionToOffencesRelationshipTypeOffence(Object value) {
        return new JAXBElement<Object>(_DecisionToOffencesRelationshipTypeOffence_QNAME, Object.class, DecisionToOffencesRelationshipType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ec.europa.eu/ECRIS/domain-model-v1.0", name = "Offence", scope = SanctionToOffencesRelationshipType.class)
    @XmlIDREF
    public JAXBElement<Object> createSanctionToOffencesRelationshipTypeOffence(Object value) {
        return new JAXBElement<Object>(_DecisionToOffencesRelationshipTypeOffence_QNAME, Object.class, SanctionToOffencesRelationshipType.class, value);
    }

}
