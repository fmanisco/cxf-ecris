
package eu.europa.ec.ecris.common_reference_tables_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CentralAuthorities">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="CentralAuthority" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CentralAuthorityType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Languages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Language" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}LanguageType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Countries">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Country" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Currencies">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Currency" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CurrencyType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CountrySubdivisions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="CountrySubdivision" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountrySubdivisionType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cities">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="City" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CityType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OffenceCategories">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="OffenceCategory" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceCategoryType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OffenceLevelsOfParticipation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="OffenceLevelOfParticipation" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceLevelOfParticipationType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OffenceLevelsOfCompletion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="OffenceLevelOfCompletion" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceLevelOfCompletionType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SanctionCategories">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="SanctionCategory" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionCategoryType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SanctionTypesOfSuspension">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="SanctionTypeOfSuspension" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionTypeOfSuspensionType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SanctionNatures">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="SanctionNature" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionNatureType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPurposeCategories">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="RequestPurposeCategory" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestPurposeCategoryType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IdentificationDocumentCategories">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="IdentificationDocumentCategory" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}IdentificationDocumentCategoryType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DecisionChangeTypes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="DecisionChangeType" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}DecisionChangeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestResponses">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="RequestResponse" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestResponseType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NotificationResponses">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="NotificationResponse" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}NotificationResponseType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestAdditionalInfoResponses">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="RequestAdditionalInfoResponse" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestAdditionalInfoResponseType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FunctionalErrors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="FunctionalError" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}FunctionalErrorType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Faults">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="Fault" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}FaultType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SanctionToSanctionsRelationshipTypes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="SanctionToSanctionsRelationshipType" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionToSanctionsRelationshipType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestingAuthorityTypes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="RequestingAuthorityType" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestingAuthorityType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SanctionAlternativeTypes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="SanctionAlternativeType" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionAlternativeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "centralAuthorities",
    "languages",
    "countries",
    "currencies",
    "countrySubdivisions",
    "cities",
    "offenceCategories",
    "offenceLevelsOfParticipation",
    "offenceLevelsOfCompletion",
    "sanctionCategories",
    "sanctionTypesOfSuspension",
    "sanctionNatures",
    "requestPurposeCategories",
    "identificationDocumentCategories",
    "decisionChangeTypes",
    "requestResponses",
    "notificationResponses",
    "requestAdditionalInfoResponses",
    "functionalErrors",
    "faults",
    "sanctionToSanctionsRelationshipTypes",
    "requestingAuthorityTypes",
    "sanctionAlternativeTypes"
})
@XmlRootElement(name = "CommonReferenceTable")
public class CommonReferenceTable {

    @XmlElement(name = "CentralAuthorities", required = true)
    protected CommonReferenceTable.CentralAuthorities centralAuthorities;
    @XmlElement(name = "Languages", required = true)
    protected CommonReferenceTable.Languages languages;
    @XmlElement(name = "Countries", required = true)
    protected CommonReferenceTable.Countries countries;
    @XmlElement(name = "Currencies", required = true)
    protected CommonReferenceTable.Currencies currencies;
    @XmlElement(name = "CountrySubdivisions", required = true)
    protected CommonReferenceTable.CountrySubdivisions countrySubdivisions;
    @XmlElement(name = "Cities", required = true)
    protected CommonReferenceTable.Cities cities;
    @XmlElement(name = "OffenceCategories", required = true)
    protected CommonReferenceTable.OffenceCategories offenceCategories;
    @XmlElement(name = "OffenceLevelsOfParticipation", required = true)
    protected CommonReferenceTable.OffenceLevelsOfParticipation offenceLevelsOfParticipation;
    @XmlElement(name = "OffenceLevelsOfCompletion", required = true)
    protected CommonReferenceTable.OffenceLevelsOfCompletion offenceLevelsOfCompletion;
    @XmlElement(name = "SanctionCategories", required = true)
    protected CommonReferenceTable.SanctionCategories sanctionCategories;
    @XmlElement(name = "SanctionTypesOfSuspension", required = true)
    protected CommonReferenceTable.SanctionTypesOfSuspension sanctionTypesOfSuspension;
    @XmlElement(name = "SanctionNatures", required = true)
    protected CommonReferenceTable.SanctionNatures sanctionNatures;
    @XmlElement(name = "RequestPurposeCategories", required = true)
    protected CommonReferenceTable.RequestPurposeCategories requestPurposeCategories;
    @XmlElement(name = "IdentificationDocumentCategories", required = true)
    protected CommonReferenceTable.IdentificationDocumentCategories identificationDocumentCategories;
    @XmlElement(name = "DecisionChangeTypes", required = true)
    protected CommonReferenceTable.DecisionChangeTypes decisionChangeTypes;
    @XmlElement(name = "RequestResponses", required = true)
    protected CommonReferenceTable.RequestResponses requestResponses;
    @XmlElement(name = "NotificationResponses", required = true)
    protected CommonReferenceTable.NotificationResponses notificationResponses;
    @XmlElement(name = "RequestAdditionalInfoResponses", required = true)
    protected CommonReferenceTable.RequestAdditionalInfoResponses requestAdditionalInfoResponses;
    @XmlElement(name = "FunctionalErrors", required = true)
    protected CommonReferenceTable.FunctionalErrors functionalErrors;
    @XmlElement(name = "Faults", required = true)
    protected CommonReferenceTable.Faults faults;
    @XmlElement(name = "SanctionToSanctionsRelationshipTypes", required = true)
    protected CommonReferenceTable.SanctionToSanctionsRelationshipTypes sanctionToSanctionsRelationshipTypes;
    @XmlElement(name = "RequestingAuthorityTypes", required = true)
    protected CommonReferenceTable.RequestingAuthorityTypes requestingAuthorityTypes;
    @XmlElement(name = "SanctionAlternativeTypes", required = true)
    protected CommonReferenceTable.SanctionAlternativeTypes sanctionAlternativeTypes;

    /**
     * Gets the value of the centralAuthorities property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.CentralAuthorities }
     *     
     */
    public CommonReferenceTable.CentralAuthorities getCentralAuthorities() {
        return centralAuthorities;
    }

    /**
     * Sets the value of the centralAuthorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.CentralAuthorities }
     *     
     */
    public void setCentralAuthorities(CommonReferenceTable.CentralAuthorities value) {
        this.centralAuthorities = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.Languages }
     *     
     */
    public CommonReferenceTable.Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.Languages }
     *     
     */
    public void setLanguages(CommonReferenceTable.Languages value) {
        this.languages = value;
    }

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.Countries }
     *     
     */
    public CommonReferenceTable.Countries getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.Countries }
     *     
     */
    public void setCountries(CommonReferenceTable.Countries value) {
        this.countries = value;
    }

    /**
     * Gets the value of the currencies property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.Currencies }
     *     
     */
    public CommonReferenceTable.Currencies getCurrencies() {
        return currencies;
    }

    /**
     * Sets the value of the currencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.Currencies }
     *     
     */
    public void setCurrencies(CommonReferenceTable.Currencies value) {
        this.currencies = value;
    }

    /**
     * Gets the value of the countrySubdivisions property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.CountrySubdivisions }
     *     
     */
    public CommonReferenceTable.CountrySubdivisions getCountrySubdivisions() {
        return countrySubdivisions;
    }

    /**
     * Sets the value of the countrySubdivisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.CountrySubdivisions }
     *     
     */
    public void setCountrySubdivisions(CommonReferenceTable.CountrySubdivisions value) {
        this.countrySubdivisions = value;
    }

    /**
     * Gets the value of the cities property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.Cities }
     *     
     */
    public CommonReferenceTable.Cities getCities() {
        return cities;
    }

    /**
     * Sets the value of the cities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.Cities }
     *     
     */
    public void setCities(CommonReferenceTable.Cities value) {
        this.cities = value;
    }

    /**
     * Gets the value of the offenceCategories property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.OffenceCategories }
     *     
     */
    public CommonReferenceTable.OffenceCategories getOffenceCategories() {
        return offenceCategories;
    }

    /**
     * Sets the value of the offenceCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.OffenceCategories }
     *     
     */
    public void setOffenceCategories(CommonReferenceTable.OffenceCategories value) {
        this.offenceCategories = value;
    }

    /**
     * Gets the value of the offenceLevelsOfParticipation property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.OffenceLevelsOfParticipation }
     *     
     */
    public CommonReferenceTable.OffenceLevelsOfParticipation getOffenceLevelsOfParticipation() {
        return offenceLevelsOfParticipation;
    }

    /**
     * Sets the value of the offenceLevelsOfParticipation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.OffenceLevelsOfParticipation }
     *     
     */
    public void setOffenceLevelsOfParticipation(CommonReferenceTable.OffenceLevelsOfParticipation value) {
        this.offenceLevelsOfParticipation = value;
    }

    /**
     * Gets the value of the offenceLevelsOfCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.OffenceLevelsOfCompletion }
     *     
     */
    public CommonReferenceTable.OffenceLevelsOfCompletion getOffenceLevelsOfCompletion() {
        return offenceLevelsOfCompletion;
    }

    /**
     * Sets the value of the offenceLevelsOfCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.OffenceLevelsOfCompletion }
     *     
     */
    public void setOffenceLevelsOfCompletion(CommonReferenceTable.OffenceLevelsOfCompletion value) {
        this.offenceLevelsOfCompletion = value;
    }

    /**
     * Gets the value of the sanctionCategories property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.SanctionCategories }
     *     
     */
    public CommonReferenceTable.SanctionCategories getSanctionCategories() {
        return sanctionCategories;
    }

    /**
     * Sets the value of the sanctionCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.SanctionCategories }
     *     
     */
    public void setSanctionCategories(CommonReferenceTable.SanctionCategories value) {
        this.sanctionCategories = value;
    }

    /**
     * Gets the value of the sanctionTypesOfSuspension property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.SanctionTypesOfSuspension }
     *     
     */
    public CommonReferenceTable.SanctionTypesOfSuspension getSanctionTypesOfSuspension() {
        return sanctionTypesOfSuspension;
    }

    /**
     * Sets the value of the sanctionTypesOfSuspension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.SanctionTypesOfSuspension }
     *     
     */
    public void setSanctionTypesOfSuspension(CommonReferenceTable.SanctionTypesOfSuspension value) {
        this.sanctionTypesOfSuspension = value;
    }

    /**
     * Gets the value of the sanctionNatures property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.SanctionNatures }
     *     
     */
    public CommonReferenceTable.SanctionNatures getSanctionNatures() {
        return sanctionNatures;
    }

    /**
     * Sets the value of the sanctionNatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.SanctionNatures }
     *     
     */
    public void setSanctionNatures(CommonReferenceTable.SanctionNatures value) {
        this.sanctionNatures = value;
    }

    /**
     * Gets the value of the requestPurposeCategories property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.RequestPurposeCategories }
     *     
     */
    public CommonReferenceTable.RequestPurposeCategories getRequestPurposeCategories() {
        return requestPurposeCategories;
    }

    /**
     * Sets the value of the requestPurposeCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.RequestPurposeCategories }
     *     
     */
    public void setRequestPurposeCategories(CommonReferenceTable.RequestPurposeCategories value) {
        this.requestPurposeCategories = value;
    }

    /**
     * Gets the value of the identificationDocumentCategories property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.IdentificationDocumentCategories }
     *     
     */
    public CommonReferenceTable.IdentificationDocumentCategories getIdentificationDocumentCategories() {
        return identificationDocumentCategories;
    }

    /**
     * Sets the value of the identificationDocumentCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.IdentificationDocumentCategories }
     *     
     */
    public void setIdentificationDocumentCategories(CommonReferenceTable.IdentificationDocumentCategories value) {
        this.identificationDocumentCategories = value;
    }

    /**
     * Gets the value of the decisionChangeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.DecisionChangeTypes }
     *     
     */
    public CommonReferenceTable.DecisionChangeTypes getDecisionChangeTypes() {
        return decisionChangeTypes;
    }

    /**
     * Sets the value of the decisionChangeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.DecisionChangeTypes }
     *     
     */
    public void setDecisionChangeTypes(CommonReferenceTable.DecisionChangeTypes value) {
        this.decisionChangeTypes = value;
    }

    /**
     * Gets the value of the requestResponses property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.RequestResponses }
     *     
     */
    public CommonReferenceTable.RequestResponses getRequestResponses() {
        return requestResponses;
    }

    /**
     * Sets the value of the requestResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.RequestResponses }
     *     
     */
    public void setRequestResponses(CommonReferenceTable.RequestResponses value) {
        this.requestResponses = value;
    }

    /**
     * Gets the value of the notificationResponses property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.NotificationResponses }
     *     
     */
    public CommonReferenceTable.NotificationResponses getNotificationResponses() {
        return notificationResponses;
    }

    /**
     * Sets the value of the notificationResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.NotificationResponses }
     *     
     */
    public void setNotificationResponses(CommonReferenceTable.NotificationResponses value) {
        this.notificationResponses = value;
    }

    /**
     * Gets the value of the requestAdditionalInfoResponses property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.RequestAdditionalInfoResponses }
     *     
     */
    public CommonReferenceTable.RequestAdditionalInfoResponses getRequestAdditionalInfoResponses() {
        return requestAdditionalInfoResponses;
    }

    /**
     * Sets the value of the requestAdditionalInfoResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.RequestAdditionalInfoResponses }
     *     
     */
    public void setRequestAdditionalInfoResponses(CommonReferenceTable.RequestAdditionalInfoResponses value) {
        this.requestAdditionalInfoResponses = value;
    }

    /**
     * Gets the value of the functionalErrors property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.FunctionalErrors }
     *     
     */
    public CommonReferenceTable.FunctionalErrors getFunctionalErrors() {
        return functionalErrors;
    }

    /**
     * Sets the value of the functionalErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.FunctionalErrors }
     *     
     */
    public void setFunctionalErrors(CommonReferenceTable.FunctionalErrors value) {
        this.functionalErrors = value;
    }

    /**
     * Gets the value of the faults property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.Faults }
     *     
     */
    public CommonReferenceTable.Faults getFaults() {
        return faults;
    }

    /**
     * Sets the value of the faults property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.Faults }
     *     
     */
    public void setFaults(CommonReferenceTable.Faults value) {
        this.faults = value;
    }

    /**
     * Gets the value of the sanctionToSanctionsRelationshipTypes property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.SanctionToSanctionsRelationshipTypes }
     *     
     */
    public CommonReferenceTable.SanctionToSanctionsRelationshipTypes getSanctionToSanctionsRelationshipTypes() {
        return sanctionToSanctionsRelationshipTypes;
    }

    /**
     * Sets the value of the sanctionToSanctionsRelationshipTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.SanctionToSanctionsRelationshipTypes }
     *     
     */
    public void setSanctionToSanctionsRelationshipTypes(CommonReferenceTable.SanctionToSanctionsRelationshipTypes value) {
        this.sanctionToSanctionsRelationshipTypes = value;
    }

    /**
     * Gets the value of the requestingAuthorityTypes property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.RequestingAuthorityTypes }
     *     
     */
    public CommonReferenceTable.RequestingAuthorityTypes getRequestingAuthorityTypes() {
        return requestingAuthorityTypes;
    }

    /**
     * Sets the value of the requestingAuthorityTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.RequestingAuthorityTypes }
     *     
     */
    public void setRequestingAuthorityTypes(CommonReferenceTable.RequestingAuthorityTypes value) {
        this.requestingAuthorityTypes = value;
    }

    /**
     * Gets the value of the sanctionAlternativeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link CommonReferenceTable.SanctionAlternativeTypes }
     *     
     */
    public CommonReferenceTable.SanctionAlternativeTypes getSanctionAlternativeTypes() {
        return sanctionAlternativeTypes;
    }

    /**
     * Sets the value of the sanctionAlternativeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonReferenceTable.SanctionAlternativeTypes }
     *     
     */
    public void setSanctionAlternativeTypes(CommonReferenceTable.SanctionAlternativeTypes value) {
        this.sanctionAlternativeTypes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="CentralAuthority" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CentralAuthorityType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "centralAuthority"
    })
    public static class CentralAuthorities {

        @XmlElement(name = "CentralAuthority")
        protected List<CentralAuthorityType> centralAuthority;

        /**
         * Gets the value of the centralAuthority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the centralAuthority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCentralAuthority().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CentralAuthorityType }
         * 
         * 
         */
        public List<CentralAuthorityType> getCentralAuthority() {
            if (centralAuthority == null) {
                centralAuthority = new ArrayList<CentralAuthorityType>();
            }
            return this.centralAuthority;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="City" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CityType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "city"
    })
    public static class Cities {

        @XmlElement(name = "City")
        protected List<CityType> city;

        /**
         * Gets the value of the city property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the city property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CityType }
         * 
         * 
         */
        public List<CityType> getCity() {
            if (city == null) {
                city = new ArrayList<CityType>();
            }
            return this.city;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Country" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "country"
    })
    public static class Countries {

        @XmlElement(name = "Country")
        protected List<CountryType> country;

        /**
         * Gets the value of the country property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the country property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryType }
         * 
         * 
         */
        public List<CountryType> getCountry() {
            if (country == null) {
                country = new ArrayList<CountryType>();
            }
            return this.country;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="CountrySubdivision" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountrySubdivisionType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "countrySubdivision"
    })
    public static class CountrySubdivisions {

        @XmlElement(name = "CountrySubdivision")
        protected List<CountrySubdivisionType> countrySubdivision;

        /**
         * Gets the value of the countrySubdivision property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countrySubdivision property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountrySubdivision().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountrySubdivisionType }
         * 
         * 
         */
        public List<CountrySubdivisionType> getCountrySubdivision() {
            if (countrySubdivision == null) {
                countrySubdivision = new ArrayList<CountrySubdivisionType>();
            }
            return this.countrySubdivision;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Currency" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CurrencyType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currency"
    })
    public static class Currencies {

        @XmlElement(name = "Currency")
        protected List<CurrencyType> currency;

        /**
         * Gets the value of the currency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the currency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCurrency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CurrencyType }
         * 
         * 
         */
        public List<CurrencyType> getCurrency() {
            if (currency == null) {
                currency = new ArrayList<CurrencyType>();
            }
            return this.currency;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="DecisionChangeType" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}DecisionChangeType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "decisionChangeType"
    })
    public static class DecisionChangeTypes {

        @XmlElement(name = "DecisionChangeType")
        protected List<DecisionChangeType> decisionChangeType;

        /**
         * Gets the value of the decisionChangeType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the decisionChangeType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDecisionChangeType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DecisionChangeType }
         * 
         * 
         */
        public List<DecisionChangeType> getDecisionChangeType() {
            if (decisionChangeType == null) {
                decisionChangeType = new ArrayList<DecisionChangeType>();
            }
            return this.decisionChangeType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Fault" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}FaultType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fault"
    })
    public static class Faults {

        @XmlElement(name = "Fault")
        protected List<FaultType> fault;

        /**
         * Gets the value of the fault property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fault property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFault().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FaultType }
         * 
         * 
         */
        public List<FaultType> getFault() {
            if (fault == null) {
                fault = new ArrayList<FaultType>();
            }
            return this.fault;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="FunctionalError" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}FunctionalErrorType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "functionalError"
    })
    public static class FunctionalErrors {

        @XmlElement(name = "FunctionalError")
        protected List<FunctionalErrorType> functionalError;

        /**
         * Gets the value of the functionalError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the functionalError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFunctionalError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FunctionalErrorType }
         * 
         * 
         */
        public List<FunctionalErrorType> getFunctionalError() {
            if (functionalError == null) {
                functionalError = new ArrayList<FunctionalErrorType>();
            }
            return this.functionalError;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="IdentificationDocumentCategory" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}IdentificationDocumentCategoryType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "identificationDocumentCategory"
    })
    public static class IdentificationDocumentCategories {

        @XmlElement(name = "IdentificationDocumentCategory")
        protected List<IdentificationDocumentCategoryType> identificationDocumentCategory;

        /**
         * Gets the value of the identificationDocumentCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identificationDocumentCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentificationDocumentCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IdentificationDocumentCategoryType }
         * 
         * 
         */
        public List<IdentificationDocumentCategoryType> getIdentificationDocumentCategory() {
            if (identificationDocumentCategory == null) {
                identificationDocumentCategory = new ArrayList<IdentificationDocumentCategoryType>();
            }
            return this.identificationDocumentCategory;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="Language" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}LanguageType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "language"
    })
    public static class Languages {

        @XmlElement(name = "Language")
        protected List<LanguageType> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LanguageType }
         * 
         * 
         */
        public List<LanguageType> getLanguage() {
            if (language == null) {
                language = new ArrayList<LanguageType>();
            }
            return this.language;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="NotificationResponse" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}NotificationResponseType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "notificationResponse"
    })
    public static class NotificationResponses {

        @XmlElement(name = "NotificationResponse")
        protected List<NotificationResponseType> notificationResponse;

        /**
         * Gets the value of the notificationResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notificationResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotificationResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotificationResponseType }
         * 
         * 
         */
        public List<NotificationResponseType> getNotificationResponse() {
            if (notificationResponse == null) {
                notificationResponse = new ArrayList<NotificationResponseType>();
            }
            return this.notificationResponse;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="OffenceCategory" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceCategoryType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offenceCategory"
    })
    public static class OffenceCategories {

        @XmlElement(name = "OffenceCategory")
        protected List<OffenceCategoryType> offenceCategory;

        /**
         * Gets the value of the offenceCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offenceCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOffenceCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OffenceCategoryType }
         * 
         * 
         */
        public List<OffenceCategoryType> getOffenceCategory() {
            if (offenceCategory == null) {
                offenceCategory = new ArrayList<OffenceCategoryType>();
            }
            return this.offenceCategory;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="OffenceLevelOfCompletion" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceLevelOfCompletionType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offenceLevelOfCompletion"
    })
    public static class OffenceLevelsOfCompletion {

        @XmlElement(name = "OffenceLevelOfCompletion")
        protected List<OffenceLevelOfCompletionType> offenceLevelOfCompletion;

        /**
         * Gets the value of the offenceLevelOfCompletion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offenceLevelOfCompletion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOffenceLevelOfCompletion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OffenceLevelOfCompletionType }
         * 
         * 
         */
        public List<OffenceLevelOfCompletionType> getOffenceLevelOfCompletion() {
            if (offenceLevelOfCompletion == null) {
                offenceLevelOfCompletion = new ArrayList<OffenceLevelOfCompletionType>();
            }
            return this.offenceLevelOfCompletion;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="OffenceLevelOfParticipation" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceLevelOfParticipationType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offenceLevelOfParticipation"
    })
    public static class OffenceLevelsOfParticipation {

        @XmlElement(name = "OffenceLevelOfParticipation")
        protected List<OffenceLevelOfParticipationType> offenceLevelOfParticipation;

        /**
         * Gets the value of the offenceLevelOfParticipation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offenceLevelOfParticipation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOffenceLevelOfParticipation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OffenceLevelOfParticipationType }
         * 
         * 
         */
        public List<OffenceLevelOfParticipationType> getOffenceLevelOfParticipation() {
            if (offenceLevelOfParticipation == null) {
                offenceLevelOfParticipation = new ArrayList<OffenceLevelOfParticipationType>();
            }
            return this.offenceLevelOfParticipation;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="RequestAdditionalInfoResponse" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestAdditionalInfoResponseType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requestAdditionalInfoResponse"
    })
    public static class RequestAdditionalInfoResponses {

        @XmlElement(name = "RequestAdditionalInfoResponse")
        protected List<RequestAdditionalInfoResponseType> requestAdditionalInfoResponse;

        /**
         * Gets the value of the requestAdditionalInfoResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestAdditionalInfoResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequestAdditionalInfoResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestAdditionalInfoResponseType }
         * 
         * 
         */
        public List<RequestAdditionalInfoResponseType> getRequestAdditionalInfoResponse() {
            if (requestAdditionalInfoResponse == null) {
                requestAdditionalInfoResponse = new ArrayList<RequestAdditionalInfoResponseType>();
            }
            return this.requestAdditionalInfoResponse;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="RequestPurposeCategory" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestPurposeCategoryType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requestPurposeCategory"
    })
    public static class RequestPurposeCategories {

        @XmlElement(name = "RequestPurposeCategory")
        protected List<RequestPurposeCategoryType> requestPurposeCategory;

        /**
         * Gets the value of the requestPurposeCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestPurposeCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequestPurposeCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestPurposeCategoryType }
         * 
         * 
         */
        public List<RequestPurposeCategoryType> getRequestPurposeCategory() {
            if (requestPurposeCategory == null) {
                requestPurposeCategory = new ArrayList<RequestPurposeCategoryType>();
            }
            return this.requestPurposeCategory;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="RequestResponse" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestResponseType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requestResponse"
    })
    public static class RequestResponses {

        @XmlElement(name = "RequestResponse")
        protected List<RequestResponseType> requestResponse;

        /**
         * Gets the value of the requestResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequestResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestResponseType }
         * 
         * 
         */
        public List<RequestResponseType> getRequestResponse() {
            if (requestResponse == null) {
                requestResponse = new ArrayList<RequestResponseType>();
            }
            return this.requestResponse;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="RequestingAuthorityType" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestingAuthorityType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requestingAuthorityType"
    })
    public static class RequestingAuthorityTypes {

        @XmlElement(name = "RequestingAuthorityType")
        protected List<RequestingAuthorityType> requestingAuthorityType;

        /**
         * Gets the value of the requestingAuthorityType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestingAuthorityType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequestingAuthorityType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestingAuthorityType }
         * 
         * 
         */
        public List<RequestingAuthorityType> getRequestingAuthorityType() {
            if (requestingAuthorityType == null) {
                requestingAuthorityType = new ArrayList<RequestingAuthorityType>();
            }
            return this.requestingAuthorityType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SanctionAlternativeType" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionAlternativeType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sanctionAlternativeType"
    })
    public static class SanctionAlternativeTypes {

        @XmlElement(name = "SanctionAlternativeType")
        protected List<SanctionAlternativeType> sanctionAlternativeType;

        /**
         * Gets the value of the sanctionAlternativeType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sanctionAlternativeType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSanctionAlternativeType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SanctionAlternativeType }
         * 
         * 
         */
        public List<SanctionAlternativeType> getSanctionAlternativeType() {
            if (sanctionAlternativeType == null) {
                sanctionAlternativeType = new ArrayList<SanctionAlternativeType>();
            }
            return this.sanctionAlternativeType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SanctionCategory" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionCategoryType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sanctionCategory"
    })
    public static class SanctionCategories {

        @XmlElement(name = "SanctionCategory")
        protected List<SanctionCategoryType> sanctionCategory;

        /**
         * Gets the value of the sanctionCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sanctionCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSanctionCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SanctionCategoryType }
         * 
         * 
         */
        public List<SanctionCategoryType> getSanctionCategory() {
            if (sanctionCategory == null) {
                sanctionCategory = new ArrayList<SanctionCategoryType>();
            }
            return this.sanctionCategory;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SanctionNature" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionNatureType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sanctionNature"
    })
    public static class SanctionNatures {

        @XmlElement(name = "SanctionNature")
        protected List<SanctionNatureType> sanctionNature;

        /**
         * Gets the value of the sanctionNature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sanctionNature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSanctionNature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SanctionNatureType }
         * 
         * 
         */
        public List<SanctionNatureType> getSanctionNature() {
            if (sanctionNature == null) {
                sanctionNature = new ArrayList<SanctionNatureType>();
            }
            return this.sanctionNature;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SanctionToSanctionsRelationshipType" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionToSanctionsRelationshipType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sanctionToSanctionsRelationshipType"
    })
    public static class SanctionToSanctionsRelationshipTypes {

        @XmlElement(name = "SanctionToSanctionsRelationshipType")
        protected List<SanctionToSanctionsRelationshipType> sanctionToSanctionsRelationshipType;

        /**
         * Gets the value of the sanctionToSanctionsRelationshipType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sanctionToSanctionsRelationshipType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSanctionToSanctionsRelationshipType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SanctionToSanctionsRelationshipType }
         * 
         * 
         */
        public List<SanctionToSanctionsRelationshipType> getSanctionToSanctionsRelationshipType() {
            if (sanctionToSanctionsRelationshipType == null) {
                sanctionToSanctionsRelationshipType = new ArrayList<SanctionToSanctionsRelationshipType>();
            }
            return this.sanctionToSanctionsRelationshipType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="SanctionTypeOfSuspension" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}SanctionTypeOfSuspensionType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sanctionTypeOfSuspension"
    })
    public static class SanctionTypesOfSuspension {

        @XmlElement(name = "SanctionTypeOfSuspension")
        protected List<SanctionTypeOfSuspensionType> sanctionTypeOfSuspension;

        /**
         * Gets the value of the sanctionTypeOfSuspension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sanctionTypeOfSuspension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSanctionTypeOfSuspension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SanctionTypeOfSuspensionType }
         * 
         * 
         */
        public List<SanctionTypeOfSuspensionType> getSanctionTypeOfSuspension() {
            if (sanctionTypeOfSuspension == null) {
                sanctionTypeOfSuspension = new ArrayList<SanctionTypeOfSuspensionType>();
            }
            return this.sanctionTypeOfSuspension;
        }

    }

}
