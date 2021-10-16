
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents the identity information of a person being the subject of the various ECRIS messages.
 * 
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/domain-model-v1.0}AbstractPersonType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PersonNameType"/>
 *         &lt;element name="PersonSex" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SexType"/>
 *         &lt;element name="PersonBirthDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DateType"/>
 *         &lt;element name="PersonBirthPlace" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PlaceType"/>
 *         &lt;element name="PersonNationalityReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}CountryExternalReferenceType" maxOccurs="unbounded"/>
 *         &lt;element name="PersonFormerForename" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonFormerSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonFormerSecondSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonFatherForename" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" minOccurs="0"/>
 *         &lt;element name="PersonFatherSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" minOccurs="0"/>
 *         &lt;element name="PersonFatherSecondSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" minOccurs="0"/>
 *         &lt;element name="PersonMotherForename" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" minOccurs="0"/>
 *         &lt;element name="PersonMotherSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" minOccurs="0"/>
 *         &lt;element name="PersonMotherSecondSurname" type="{http://ec.europa.eu/ECRIS/commons-v1.0}NameTextType" minOccurs="0"/>
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
@XmlType(name = "PersonType")
public class PersonType
    extends AbstractPersonType
{


}
