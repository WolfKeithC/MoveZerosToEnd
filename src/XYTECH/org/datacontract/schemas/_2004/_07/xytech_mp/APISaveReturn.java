
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
 * <p>Java class for APISaveReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APISaveReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewDocDataContainer" minOccurs="0">
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
 *         &lt;element name="NewKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APISaveReturn", propOrder = {
    "docChanged",
    "newDocDataContainer",
    "newKey",
    "recordID"
})
public class APISaveReturn {

    @XmlElement(name = "DocChanged")
    protected Boolean docChanged;
    @XmlElementRef(name = "NewDocDataContainer", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<APISaveReturn.NewDocDataContainer> newDocDataContainer;
    @XmlElementRef(name = "NewKey", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newKey;
    @XmlElementRef(name = "RecordID", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordID;

    /**
     * Gets the value of the docChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocChanged() {
        return docChanged;
    }

    /**
     * Sets the value of the docChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocChanged(Boolean value) {
        this.docChanged = value;
    }

    /**
     * Gets the value of the newDocDataContainer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APISaveReturn.NewDocDataContainer }{@code >}
     *     
     */
    public JAXBElement<APISaveReturn.NewDocDataContainer> getNewDocDataContainer() {
        return newDocDataContainer;
    }

    /**
     * Sets the value of the newDocDataContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APISaveReturn.NewDocDataContainer }{@code >}
     *     
     */
    public void setNewDocDataContainer(JAXBElement<APISaveReturn.NewDocDataContainer> value) {
        this.newDocDataContainer = value;
    }

    /**
     * Gets the value of the newKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewKey() {
        return newKey;
    }

    /**
     * Sets the value of the newKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewKey(JAXBElement<String> value) {
        this.newKey = value;
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
    public static class NewDocDataContainer {

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
