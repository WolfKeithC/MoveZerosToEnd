
package XYTECH.com.xytechsystems.xytechapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.Credentials;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.PriceCriteria;

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
 *         &lt;element name="credentials" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}Credentials" minOccurs="0"/>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricingData" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}PriceCriteria" minOccurs="0"/>
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
    "credentials",
    "className",
    "pricingData"
})
@XmlRootElement(name = "Price")
public class Price {

    @XmlElementRef(name = "credentials", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Credentials> credentials;
    @XmlElementRef(name = "className", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> className;
    @XmlElementRef(name = "pricingData", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<PriceCriteria> pricingData;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Credentials }{@code >}
     *     
     */
    public JAXBElement<Credentials> getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Credentials }{@code >}
     *     
     */
    public void setCredentials(JAXBElement<Credentials> value) {
        this.credentials = value;
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
     * Gets the value of the pricingData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriceCriteria }{@code >}
     *     
     */
    public JAXBElement<PriceCriteria> getPricingData() {
        return pricingData;
    }

    /**
     * Sets the value of the pricingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriceCriteria }{@code >}
     *     
     */
    public void setPricingData(JAXBElement<PriceCriteria> value) {
        this.pricingData = value;
    }

}
