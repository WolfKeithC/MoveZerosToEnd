
package XYTECH.com.xytechsystems.xytechapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="GenerateNextIDResult" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}APIResult" minOccurs="0"/>
 *         &lt;element name="firstNewKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "generateNextIDResult",
    "firstNewKey"
})
@XmlRootElement(name = "GenerateNextIDResponse")
public class GenerateNextIDResponse {

    @XmlElementRef(name = "GenerateNextIDResult", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<APIResult> generateNextIDResult;
    protected Integer firstNewKey;

    /**
     * Gets the value of the generateNextIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APIResult }{@code >}
     *     
     */
    public JAXBElement<APIResult> getGenerateNextIDResult() {
        return generateNextIDResult;
    }

    /**
     * Sets the value of the generateNextIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APIResult }{@code >}
     *     
     */
    public void setGenerateNextIDResult(JAXBElement<APIResult> value) {
        this.generateNextIDResult = value;
    }

    /**
     * Gets the value of the firstNewKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstNewKey() {
        return firstNewKey;
    }

    /**
     * Sets the value of the firstNewKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstNewKey(Integer value) {
        this.firstNewKey = value;
    }

}
