
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalInformationRequestedEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalInformationRequestedEnumeration">
 *   &lt;restriction base="{http://ec.europa.eu/ECRIS/commons-v1.0}StringType">
 *     &lt;enumeration value="Forename"/>
 *     &lt;enumeration value="Surname"/>
 *     &lt;enumeration value="SecondSurname"/>
 *     &lt;enumeration value="Sex"/>
 *     &lt;enumeration value="BirthDate"/>
 *     &lt;enumeration value="BirthPlace"/>
 *     &lt;enumeration value="Nationality"/>
 *     &lt;enumeration value="FormerName"/>
 *     &lt;enumeration value="MotherName"/>
 *     &lt;enumeration value="FatherName"/>
 *     &lt;enumeration value="IdentityNumber"/>
 *     &lt;enumeration value="IdentificationDocument"/>
 *     &lt;enumeration value="Address"/>
 *     &lt;enumeration value="Alias"/>
 *     &lt;enumeration value="Fingerprints"/>
 *     &lt;enumeration value="MoreInformationOnRequestPurpose"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalInformationRequestedEnumeration")
@XmlEnum
public enum AdditionalInformationRequestedEnumeration {

    @XmlEnumValue("Forename")
    FORENAME("Forename"),
    @XmlEnumValue("Surname")
    SURNAME("Surname"),
    @XmlEnumValue("SecondSurname")
    SECOND_SURNAME("SecondSurname"),
    @XmlEnumValue("Sex")
    SEX("Sex"),
    @XmlEnumValue("BirthDate")
    BIRTH_DATE("BirthDate"),
    @XmlEnumValue("BirthPlace")
    BIRTH_PLACE("BirthPlace"),
    @XmlEnumValue("Nationality")
    NATIONALITY("Nationality"),
    @XmlEnumValue("FormerName")
    FORMER_NAME("FormerName"),
    @XmlEnumValue("MotherName")
    MOTHER_NAME("MotherName"),
    @XmlEnumValue("FatherName")
    FATHER_NAME("FatherName"),
    @XmlEnumValue("IdentityNumber")
    IDENTITY_NUMBER("IdentityNumber"),
    @XmlEnumValue("IdentificationDocument")
    IDENTIFICATION_DOCUMENT("IdentificationDocument"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("Alias")
    ALIAS("Alias"),
    @XmlEnumValue("Fingerprints")
    FINGERPRINTS("Fingerprints"),
    @XmlEnumValue("MoreInformationOnRequestPurpose")
    MORE_INFORMATION_ON_REQUEST_PURPOSE("MoreInformationOnRequestPurpose");
    private final String value;

    AdditionalInformationRequestedEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdditionalInformationRequestedEnumeration fromValue(String v) {
        for (AdditionalInformationRequestedEnumeration c: AdditionalInformationRequestedEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
