
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
 *         &lt;element name="SendAlertResult" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}APIResult" minOccurs="0"/>
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
    "sendAlertResult"
})
@XmlRootElement(name = "SendAlertResponse")
public class SendAlertResponse {

    @XmlElementRef(name = "SendAlertResult", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<APIResult> sendAlertResult;

    /**
     * Gets the value of the sendAlertResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APIResult }{@code >}
     *     
     */
    public JAXBElement<APIResult> getSendAlertResult() {
        return sendAlertResult;
    }

    /**
     * Sets the value of the sendAlertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APIResult }{@code >}
     *     
     */
    public void setSendAlertResult(JAXBElement<APIResult> value) {
        this.sendAlertResult = value;
    }

}
