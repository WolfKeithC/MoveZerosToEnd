
package XYTECH.com.xytechsystems.xytechapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import XYTECH.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.APIResult;


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
 *         &lt;element name="AllDatabaseNamesResult" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}APIResult" minOccurs="0"/>
 *         &lt;element name="names" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "allDatabaseNamesResult",
    "names"
})
@XmlRootElement(name = "AllDatabaseNamesResponse")
public class AllDatabaseNamesResponse {

    @XmlElementRef(name = "AllDatabaseNamesResult", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<APIResult> allDatabaseNamesResult;
    @XmlElementRef(name = "names", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> names;

    /**
     * Gets the value of the allDatabaseNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APIResult }{@code >}
     *     
     */
    public JAXBElement<APIResult> getAllDatabaseNamesResult() {
        return allDatabaseNamesResult;
    }

    /**
     * Sets the value of the allDatabaseNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APIResult }{@code >}
     *     
     */
    public void setAllDatabaseNamesResult(JAXBElement<APIResult> value) {
        this.allDatabaseNamesResult = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setNames(JAXBElement<ArrayOfstring> value) {
        this.names = value;
    }

}
