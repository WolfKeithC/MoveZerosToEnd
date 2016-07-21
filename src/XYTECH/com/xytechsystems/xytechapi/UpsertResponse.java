
package XYTECH.com.xytechsystems.xytechapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.APIResult;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.ArrayOfAPISaveReturn;


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
 *         &lt;element name="UpsertResult" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}APIResult" minOccurs="0"/>
 *         &lt;element name="results" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}ArrayOfAPISaveReturn" minOccurs="0"/>
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
    "upsertResult",
    "results"
})
@XmlRootElement(name = "UpsertResponse")
public class UpsertResponse {

    @XmlElementRef(name = "UpsertResult", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<APIResult> upsertResult;
    @XmlElementRef(name = "results", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPISaveReturn> results;

    /**
     * Gets the value of the upsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APIResult }{@code >}
     *     
     */
    public JAXBElement<APIResult> getUpsertResult() {
        return upsertResult;
    }

    /**
     * Sets the value of the upsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APIResult }{@code >}
     *     
     */
    public void setUpsertResult(JAXBElement<APIResult> value) {
        this.upsertResult = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISaveReturn }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPISaveReturn> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISaveReturn }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfAPISaveReturn> value) {
        this.results = value;
    }

}
