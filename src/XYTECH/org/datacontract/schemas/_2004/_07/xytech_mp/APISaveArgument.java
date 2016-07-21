
package XYTECH.org.datacontract.schemas._2004._07.xytech_mp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for APISaveArgument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APISaveArgument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeSetContainer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaveArgument" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WantNewDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APISaveArgument", propOrder = {
    "changeSetContainer",
    "className",
    "key",
    "keyName",
    "recordID",
    "saveArgument",
    "wantNewDoc"
})
public class APISaveArgument {

    @XmlElementRef(name = "ChangeSetContainer", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<APISaveArgument.ChangeSetContainer> changeSetContainer;
    @XmlElementRef(name = "ClassName", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<String> className;
    @XmlElementRef(name = "Key", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<String> key;
    @XmlElementRef(name = "KeyName", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyName;
    @XmlElementRef(name = "RecordID", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordID;
    @XmlElementRef(name = "SaveArgument", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<APISaveArgument.SaveArgument> saveArgument;
    @XmlElement(name = "WantNewDoc")
    protected Boolean wantNewDoc;

    /**
     * Gets the value of the changeSetContainer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APISaveArgument.ChangeSetContainer }{@code >}
     *     
     */
    public JAXBElement<APISaveArgument.ChangeSetContainer> getChangeSetContainer() {
        return changeSetContainer;
    }

    /**
     * Sets the value of the changeSetContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APISaveArgument.ChangeSetContainer }{@code >}
     *     
     */
    public void setChangeSetContainer(JAXBElement<APISaveArgument.ChangeSetContainer> value) {
        this.changeSetContainer = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassName(JAXBElement<String> value) {
        this.className = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKey(JAXBElement<String> value) {
        this.key = value;
    }

    /**
     * Gets the value of the keyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyName() {
        return keyName;
    }

    /**
     * Sets the value of the keyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyName(JAXBElement<String> value) {
        this.keyName = value;
    }

    /**
     * Gets the value of the recordID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordID() {
        return recordID;
    }

    /**
     * Sets the value of the recordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordID(JAXBElement<String> value) {
        this.recordID = value;
    }

    /**
     * Gets the value of the saveArgument property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APISaveArgument.SaveArgument }{@code >}
     *     
     */
    public JAXBElement<APISaveArgument.SaveArgument> getSaveArgument() {
        return saveArgument;
    }

    /**
     * Sets the value of the saveArgument property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APISaveArgument.SaveArgument }{@code >}
     *     
     */
    public void setSaveArgument(JAXBElement<APISaveArgument.SaveArgument> value) {
        this.saveArgument = value;
    }

    /**
     * Gets the value of the wantNewDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantNewDoc() {
        return wantNewDoc;
    }

    /**
     * Sets the value of the wantNewDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantNewDoc(Boolean value) {
        this.wantNewDoc = value;
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
     *       &lt;sequence>
     *         &lt;any processContents='lax' minOccurs="0"/>
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
        "any"
    })
    public static class ChangeSetContainer {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
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
     *       &lt;sequence>
     *         &lt;any processContents='lax' minOccurs="0"/>
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
        "any"
    })
    public static class SaveArgument {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
