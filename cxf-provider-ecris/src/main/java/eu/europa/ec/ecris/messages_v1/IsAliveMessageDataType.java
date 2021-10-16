
package eu.europa.ec.ecris.messages_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents the data content of the "IsAlive" message.
 * 
 * <p>Java class for IsAliveMessageDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsAliveMessageDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsAlive" type="{http://ec.europa.eu/ECRIS/commons-v1.0}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsAliveMessageDataType", propOrder = {
    "isAlive"
})
public class IsAliveMessageDataType {

    @XmlElement(name = "IsAlive")
    protected boolean isAlive;

    /**
     * Gets the value of the isAlive property.
     * 
     */
    public boolean isIsAlive() {
        return isAlive;
    }

    /**
     * Sets the value of the isAlive property.
     * 
     */
    public void setIsAlive(boolean value) {
        this.isAlive = value;
    }

}
