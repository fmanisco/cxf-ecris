
package eu.europa.ec.ecris.domain_model_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents the time-related terms of the execution of a sanction.
 * 
 * <p>Java class for SanctionPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://ec.europa.eu/ECRIS/domain-model-v1.0}AbstractPeriodType">
 *       &lt;sequence>
 *         &lt;element name="PeriodStartDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType" minOccurs="0"/>
 *         &lt;element name="PeriodDuration" type="{http://ec.europa.eu/ECRIS/commons-v1.0}DurationType" minOccurs="0"/>
 *         &lt;element name="PeriodEndDate" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionPeriodType")
public class SanctionPeriodType
    extends AbstractPeriodType
{


}
