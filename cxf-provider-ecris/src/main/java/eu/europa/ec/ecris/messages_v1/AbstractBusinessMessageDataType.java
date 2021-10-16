
package eu.europa.ec.ecris.messages_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.europa.ec.ecris.commons_v1.MultilingualTextType400Chars;
import eu.europa.ec.ecris.commons_v1.UncollapsedMultilingualTextType;
import eu.europa.ec.ecris.commons_v1.YesNoUnknownStringEnumerationType;
import eu.europa.ec.ecris.domain_model_v1.ConvictionType;
import eu.europa.ec.ecris.domain_model_v1.PersonType;


/**
 * The abstract base definition of the message data contained in all messages
 *                 participating in the ECRIS business processes. All message data types are derived from this one by
 *                 restriction.
 * 
 * <p>Java class for AbstractBusinessMessageDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractBusinessMessageDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageDataContactPerson" type="{http://ec.europa.eu/ECRIS/messages-v1.0}ContactPersonType" minOccurs="0"/>
 *         &lt;element name="MessageDataPerson" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}PersonType" minOccurs="0"/>
 *         &lt;element name="MessageDataRemarks" type="{http://ec.europa.eu/ECRIS/commons-v1.0}UncollapsedMultilingualTextType" minOccurs="0"/>
 *         &lt;element name="MessageDataRequestPurposeCategoryReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestPurposeExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="MessageDataRequestPurpose" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars" minOccurs="0"/>
 *         &lt;element name="MessageDataAccusationOffenceCategoryReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}OffenceExternalReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageDataAccusation" type="{http://ec.europa.eu/ECRIS/commons-v1.0}MultilingualTextType400Chars" minOccurs="0"/>
 *         &lt;element name="MessageDataRequestingAuthority" type="{http://ec.europa.eu/ECRIS/messages-v1.0}RequestingAuthorityType" minOccurs="0"/>
 *         &lt;element name="MessageDataCaseReferenceNumber" type="{http://ec.europa.eu/ECRIS/commons-v1.0}RestrictedStringType50Chars" minOccurs="0"/>
 *         &lt;element name="MessageDataConcernedPersonConsent" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType" minOccurs="0"/>
 *         &lt;element name="MessageDataUrgency" type="{http://ec.europa.eu/ECRIS/commons-v1.0}YesNoUnknownStringEnumerationType" minOccurs="0"/>
 *         &lt;element name="MessageDataConviction" type="{http://ec.europa.eu/ECRIS/domain-model-v1.0}ConvictionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageDataUpdatedConvictionReference" type="{http://ec.europa.eu/ECRIS/messages-v1.0}StructuredStrictConvictionReferenceType" minOccurs="0"/>
 *         &lt;element name="MessageDataOtherAffectedConviction" type="{http://ec.europa.eu/ECRIS/messages-v1.0}ConvictionToConvictionsRelationshipType" minOccurs="0"/>
 *         &lt;element name="MessageDataOtherMemberState" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}MemberStateCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageDataRequestResponseTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestResponseTypeExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="MessageDataNotificationResponseTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}NotificationResponseTypeExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="MessageDataRequestAdditionalInfoResponseTypeReference" type="{http://ec.europa.eu/ECRIS/common-reference-tables-v1.0}RequestAdditionalInfoTypeExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="MessageDataFingerprints" type="{http://ec.europa.eu/ECRIS/messages-v1.0}BinaryAttachmentType" minOccurs="0"/>
 *         &lt;element name="MessageDataFingerprintsPush" type="{http://ec.europa.eu/ECRIS/messages-v1.0}BinaryAttachmentPushType" minOccurs="0"/>
 *         &lt;element name="MessageDataDeadline" type="{http://ec.europa.eu/ECRIS/commons-v1.0}StrictDateType" minOccurs="0"/>
 *         &lt;element name="MessageDataAdditionalInformationRequested" type="{http://ec.europa.eu/ECRIS/messages-v1.0}AdditionalInformationRequestedEnumeration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageDataBinaryIDRequested" type="{http://ec.europa.eu/ECRIS/messages-v1.0}BinaryAttachmentIDType" minOccurs="0"/>
 *         &lt;element name="MessageDataFunctionalError" type="{http://ec.europa.eu/ECRIS/messages-v1.0}FunctionalErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractBusinessMessageDataType", propOrder = {
    "messageDataContactPerson",
    "messageDataPerson",
    "messageDataRemarks",
    "messageDataRequestPurposeCategoryReference",
    "messageDataRequestPurpose",
    "messageDataAccusationOffenceCategoryReference",
    "messageDataAccusation",
    "messageDataRequestingAuthority",
    "messageDataCaseReferenceNumber",
    "messageDataConcernedPersonConsent",
    "messageDataUrgency",
    "messageDataConviction",
    "messageDataUpdatedConvictionReference",
    "messageDataOtherAffectedConviction",
    "messageDataOtherMemberState",
    "messageDataRequestResponseTypeReference",
    "messageDataNotificationResponseTypeReference",
    "messageDataRequestAdditionalInfoResponseTypeReference",
    "messageDataFingerprints",
    "messageDataFingerprintsPush",
    "messageDataDeadline",
    "messageDataAdditionalInformationRequested",
    "messageDataBinaryIDRequested",
    "messageDataFunctionalError"
})
@XmlSeeAlso({
    RequestResponseMessageDataType.class,
    RequestResponseMessageDataPushType.class,
    RequestMessageDataPushType.class,
    RequestDeadlineMessageDataType.class,
    NotificationMessageDataPushType.class,
    RequestAdditionalInfoResponseMessageDataPushType.class,
    RequestAdditionalInfoResponseMessageDataType.class,
    NotificationResponseMessageDataPushType.class,
    NotificationMessageDataType.class,
    FunctionalErrorDataType.class,
    NotificationResponseMessageDataType.class,
    RequestMessageDataType.class,
    CancellationMessageDataType.class,
    RequestAdditionalInfoMessageDataType.class
})
public abstract class AbstractBusinessMessageDataType {

    @XmlElement(name = "MessageDataContactPerson")
    protected ContactPersonType messageDataContactPerson;
    @XmlElement(name = "MessageDataPerson")
    protected PersonType messageDataPerson;
    @XmlElement(name = "MessageDataRemarks")
    protected UncollapsedMultilingualTextType messageDataRemarks;
    @XmlElement(name = "MessageDataRequestPurposeCategoryReference")
    protected String messageDataRequestPurposeCategoryReference;
    @XmlElement(name = "MessageDataRequestPurpose")
    protected MultilingualTextType400Chars messageDataRequestPurpose;
    @XmlElement(name = "MessageDataAccusationOffenceCategoryReference")
    protected List<String> messageDataAccusationOffenceCategoryReference;
    @XmlElement(name = "MessageDataAccusation")
    protected MultilingualTextType400Chars messageDataAccusation;
    @XmlElement(name = "MessageDataRequestingAuthority")
    protected RequestingAuthorityType messageDataRequestingAuthority;
    @XmlElement(name = "MessageDataCaseReferenceNumber")
    protected String messageDataCaseReferenceNumber;
    @XmlElement(name = "MessageDataConcernedPersonConsent")
    protected YesNoUnknownStringEnumerationType messageDataConcernedPersonConsent;
    @XmlElement(name = "MessageDataUrgency")
    protected YesNoUnknownStringEnumerationType messageDataUrgency;
    @XmlElement(name = "MessageDataConviction")
    protected List<ConvictionType> messageDataConviction;
    @XmlElement(name = "MessageDataUpdatedConvictionReference")
    protected StructuredStrictConvictionReferenceType messageDataUpdatedConvictionReference;
    @XmlElement(name = "MessageDataOtherAffectedConviction")
    protected ConvictionToConvictionsRelationshipType messageDataOtherAffectedConviction;
    @XmlElement(name = "MessageDataOtherMemberState")
    protected List<String> messageDataOtherMemberState;
    @XmlElement(name = "MessageDataRequestResponseTypeReference")
    protected String messageDataRequestResponseTypeReference;
    @XmlElement(name = "MessageDataNotificationResponseTypeReference")
    protected String messageDataNotificationResponseTypeReference;
    @XmlElement(name = "MessageDataRequestAdditionalInfoResponseTypeReference")
    protected String messageDataRequestAdditionalInfoResponseTypeReference;
    @XmlElement(name = "MessageDataFingerprints")
    protected BinaryAttachmentType messageDataFingerprints;
    @XmlElement(name = "MessageDataFingerprintsPush")
    protected BinaryAttachmentPushType messageDataFingerprintsPush;
    @XmlElement(name = "MessageDataDeadline")
    protected XMLGregorianCalendar messageDataDeadline;
    @XmlElement(name = "MessageDataAdditionalInformationRequested")
    protected List<AdditionalInformationRequestedEnumeration> messageDataAdditionalInformationRequested;
    @XmlElement(name = "MessageDataBinaryIDRequested")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String messageDataBinaryIDRequested;
    @XmlElement(name = "MessageDataFunctionalError")
    protected List<FunctionalErrorType> messageDataFunctionalError;

    /**
     * Gets the value of the messageDataContactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getMessageDataContactPerson() {
        return messageDataContactPerson;
    }

    /**
     * Sets the value of the messageDataContactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setMessageDataContactPerson(ContactPersonType value) {
        this.messageDataContactPerson = value;
    }

    /**
     * Gets the value of the messageDataPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getMessageDataPerson() {
        return messageDataPerson;
    }

    /**
     * Sets the value of the messageDataPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setMessageDataPerson(PersonType value) {
        this.messageDataPerson = value;
    }

    /**
     * Gets the value of the messageDataRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public UncollapsedMultilingualTextType getMessageDataRemarks() {
        return messageDataRemarks;
    }

    /**
     * Sets the value of the messageDataRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncollapsedMultilingualTextType }
     *     
     */
    public void setMessageDataRemarks(UncollapsedMultilingualTextType value) {
        this.messageDataRemarks = value;
    }

    /**
     * Gets the value of the messageDataRequestPurposeCategoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDataRequestPurposeCategoryReference() {
        return messageDataRequestPurposeCategoryReference;
    }

    /**
     * Sets the value of the messageDataRequestPurposeCategoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDataRequestPurposeCategoryReference(String value) {
        this.messageDataRequestPurposeCategoryReference = value;
    }

    /**
     * Gets the value of the messageDataRequestPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public MultilingualTextType400Chars getMessageDataRequestPurpose() {
        return messageDataRequestPurpose;
    }

    /**
     * Sets the value of the messageDataRequestPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public void setMessageDataRequestPurpose(MultilingualTextType400Chars value) {
        this.messageDataRequestPurpose = value;
    }

    /**
     * Gets the value of the messageDataAccusationOffenceCategoryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDataAccusationOffenceCategoryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDataAccusationOffenceCategoryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageDataAccusationOffenceCategoryReference() {
        if (messageDataAccusationOffenceCategoryReference == null) {
            messageDataAccusationOffenceCategoryReference = new ArrayList<String>();
        }
        return this.messageDataAccusationOffenceCategoryReference;
    }

    /**
     * Gets the value of the messageDataAccusation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public MultilingualTextType400Chars getMessageDataAccusation() {
        return messageDataAccusation;
    }

    /**
     * Sets the value of the messageDataAccusation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualTextType400Chars }
     *     
     */
    public void setMessageDataAccusation(MultilingualTextType400Chars value) {
        this.messageDataAccusation = value;
    }

    /**
     * Gets the value of the messageDataRequestingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link RequestingAuthorityType }
     *     
     */
    public RequestingAuthorityType getMessageDataRequestingAuthority() {
        return messageDataRequestingAuthority;
    }

    /**
     * Sets the value of the messageDataRequestingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestingAuthorityType }
     *     
     */
    public void setMessageDataRequestingAuthority(RequestingAuthorityType value) {
        this.messageDataRequestingAuthority = value;
    }

    /**
     * Gets the value of the messageDataCaseReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDataCaseReferenceNumber() {
        return messageDataCaseReferenceNumber;
    }

    /**
     * Sets the value of the messageDataCaseReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDataCaseReferenceNumber(String value) {
        this.messageDataCaseReferenceNumber = value;
    }

    /**
     * Gets the value of the messageDataConcernedPersonConsent property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public YesNoUnknownStringEnumerationType getMessageDataConcernedPersonConsent() {
        return messageDataConcernedPersonConsent;
    }

    /**
     * Sets the value of the messageDataConcernedPersonConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public void setMessageDataConcernedPersonConsent(YesNoUnknownStringEnumerationType value) {
        this.messageDataConcernedPersonConsent = value;
    }

    /**
     * Gets the value of the messageDataUrgency property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public YesNoUnknownStringEnumerationType getMessageDataUrgency() {
        return messageDataUrgency;
    }

    /**
     * Sets the value of the messageDataUrgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoUnknownStringEnumerationType }
     *     
     */
    public void setMessageDataUrgency(YesNoUnknownStringEnumerationType value) {
        this.messageDataUrgency = value;
    }

    /**
     * Gets the value of the messageDataConviction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDataConviction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDataConviction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConvictionType }
     * 
     * 
     */
    public List<ConvictionType> getMessageDataConviction() {
        if (messageDataConviction == null) {
            messageDataConviction = new ArrayList<ConvictionType>();
        }
        return this.messageDataConviction;
    }

    /**
     * Gets the value of the messageDataUpdatedConvictionReference property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredStrictConvictionReferenceType }
     *     
     */
    public StructuredStrictConvictionReferenceType getMessageDataUpdatedConvictionReference() {
        return messageDataUpdatedConvictionReference;
    }

    /**
     * Sets the value of the messageDataUpdatedConvictionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredStrictConvictionReferenceType }
     *     
     */
    public void setMessageDataUpdatedConvictionReference(StructuredStrictConvictionReferenceType value) {
        this.messageDataUpdatedConvictionReference = value;
    }

    /**
     * Gets the value of the messageDataOtherAffectedConviction property.
     * 
     * @return
     *     possible object is
     *     {@link ConvictionToConvictionsRelationshipType }
     *     
     */
    public ConvictionToConvictionsRelationshipType getMessageDataOtherAffectedConviction() {
        return messageDataOtherAffectedConviction;
    }

    /**
     * Sets the value of the messageDataOtherAffectedConviction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvictionToConvictionsRelationshipType }
     *     
     */
    public void setMessageDataOtherAffectedConviction(ConvictionToConvictionsRelationshipType value) {
        this.messageDataOtherAffectedConviction = value;
    }

    /**
     * Gets the value of the messageDataOtherMemberState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDataOtherMemberState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDataOtherMemberState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageDataOtherMemberState() {
        if (messageDataOtherMemberState == null) {
            messageDataOtherMemberState = new ArrayList<String>();
        }
        return this.messageDataOtherMemberState;
    }

    /**
     * Gets the value of the messageDataRequestResponseTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDataRequestResponseTypeReference() {
        return messageDataRequestResponseTypeReference;
    }

    /**
     * Sets the value of the messageDataRequestResponseTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDataRequestResponseTypeReference(String value) {
        this.messageDataRequestResponseTypeReference = value;
    }

    /**
     * Gets the value of the messageDataNotificationResponseTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDataNotificationResponseTypeReference() {
        return messageDataNotificationResponseTypeReference;
    }

    /**
     * Sets the value of the messageDataNotificationResponseTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDataNotificationResponseTypeReference(String value) {
        this.messageDataNotificationResponseTypeReference = value;
    }

    /**
     * Gets the value of the messageDataRequestAdditionalInfoResponseTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDataRequestAdditionalInfoResponseTypeReference() {
        return messageDataRequestAdditionalInfoResponseTypeReference;
    }

    /**
     * Sets the value of the messageDataRequestAdditionalInfoResponseTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDataRequestAdditionalInfoResponseTypeReference(String value) {
        this.messageDataRequestAdditionalInfoResponseTypeReference = value;
    }

    /**
     * Gets the value of the messageDataFingerprints property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryAttachmentType }
     *     
     */
    public BinaryAttachmentType getMessageDataFingerprints() {
        return messageDataFingerprints;
    }

    /**
     * Sets the value of the messageDataFingerprints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryAttachmentType }
     *     
     */
    public void setMessageDataFingerprints(BinaryAttachmentType value) {
        this.messageDataFingerprints = value;
    }

    /**
     * Gets the value of the messageDataFingerprintsPush property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryAttachmentPushType }
     *     
     */
    public BinaryAttachmentPushType getMessageDataFingerprintsPush() {
        return messageDataFingerprintsPush;
    }

    /**
     * Sets the value of the messageDataFingerprintsPush property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryAttachmentPushType }
     *     
     */
    public void setMessageDataFingerprintsPush(BinaryAttachmentPushType value) {
        this.messageDataFingerprintsPush = value;
    }

    /**
     * Gets the value of the messageDataDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageDataDeadline() {
        return messageDataDeadline;
    }

    /**
     * Sets the value of the messageDataDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageDataDeadline(XMLGregorianCalendar value) {
        this.messageDataDeadline = value;
    }

    /**
     * Gets the value of the messageDataAdditionalInformationRequested property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDataAdditionalInformationRequested property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDataAdditionalInformationRequested().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformationRequestedEnumeration }
     * 
     * 
     */
    public List<AdditionalInformationRequestedEnumeration> getMessageDataAdditionalInformationRequested() {
        if (messageDataAdditionalInformationRequested == null) {
            messageDataAdditionalInformationRequested = new ArrayList<AdditionalInformationRequestedEnumeration>();
        }
        return this.messageDataAdditionalInformationRequested;
    }

    /**
     * Gets the value of the messageDataBinaryIDRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDataBinaryIDRequested() {
        return messageDataBinaryIDRequested;
    }

    /**
     * Sets the value of the messageDataBinaryIDRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDataBinaryIDRequested(String value) {
        this.messageDataBinaryIDRequested = value;
    }

    /**
     * Gets the value of the messageDataFunctionalError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDataFunctionalError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDataFunctionalError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionalErrorType }
     * 
     * 
     */
    public List<FunctionalErrorType> getMessageDataFunctionalError() {
        if (messageDataFunctionalError == null) {
            messageDataFunctionalError = new ArrayList<FunctionalErrorType>();
        }
        return this.messageDataFunctionalError;
    }

}
