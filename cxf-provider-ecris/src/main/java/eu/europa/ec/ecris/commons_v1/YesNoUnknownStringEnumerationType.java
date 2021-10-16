
package eu.europa.ec.ecris.commons_v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesNoUnknownStringEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YesNoUnknownStringEnumerationType">
 *   &lt;restriction base="{http://ec.europa.eu/ECRIS/commons-v1.0}StringType">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YesNoUnknownStringEnumerationType")
@XmlEnum
public enum YesNoUnknownStringEnumerationType {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    UNKNOWN("UNKNOWN");
    private final String value;

    YesNoUnknownStringEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YesNoUnknownStringEnumerationType fromValue(String v) {
        for (YesNoUnknownStringEnumerationType c: YesNoUnknownStringEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
