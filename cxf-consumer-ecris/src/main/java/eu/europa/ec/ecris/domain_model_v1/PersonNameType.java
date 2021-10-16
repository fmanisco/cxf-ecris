
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents the structure containing the particulars for a person's name.
 * 
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/domain-model-v1.0}AbstractNameType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ec.europa.eu/ECRIS/domain-model-v1.0}Forename"/>
 *         &lt;element ref="{http://ec.europa.eu/ECRIS/domain-model-v1.0}Surname"/>
 *         &lt;element ref="{http://ec.europa.eu/ECRIS/domain-model-v1.0}SecondSurname" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://ec.europa.eu/ECRIS/commons-v1.0}FullNameTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType")
public class PersonNameType
    extends AbstractNameType
{


}
