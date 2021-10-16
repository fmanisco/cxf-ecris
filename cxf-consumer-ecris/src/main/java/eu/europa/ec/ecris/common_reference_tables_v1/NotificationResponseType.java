
package eu.europa.ec.ecris.common_reference_tables_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A representation of the possible types of responses to transmitted notifications
 * 
 * <p>Java class for NotificationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}EntityType">
 *       &lt;sequence>
 *         &lt;element name="NotificationResponseTypeTechnicalIdentifier" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}NotificationResponseTypeTechnicalIdentifierType"/>
 *         &lt;element name="NotificationResponseTypeCode" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}NotificationResponseTypeCodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationResponseType", propOrder = {
    "notificationResponseTypeTechnicalIdentifier",
    "notificationResponseTypeCode"
})
public class NotificationResponseType
    extends EntityType
{

    @XmlElement(name = "NotificationResponseTypeTechnicalIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String notificationResponseTypeTechnicalIdentifier;
    @XmlElement(name = "NotificationResponseTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String notificationResponseTypeCode;

    /**
     * Gets the value of the notificationResponseTypeTechnicalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationResponseTypeTechnicalIdentifier() {
        return notificationResponseTypeTechnicalIdentifier;
    }

    /**
     * Sets the value of the notificationResponseTypeTechnicalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationResponseTypeTechnicalIdentifier(String value) {
        this.notificationResponseTypeTechnicalIdentifier = value;
    }

    /**
     * Gets the value of the notificationResponseTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationResponseTypeCode() {
        return notificationResponseTypeCode;
    }

    /**
     * Sets the value of the notificationResponseTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationResponseTypeCode(String value) {
        this.notificationResponseTypeCode = value;
    }

}
