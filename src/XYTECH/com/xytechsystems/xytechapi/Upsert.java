
package XYTECH.com.xytechsystems.xytechapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.ArrayOfAPISaveArgument;
import XYTECH.org.datacontract.schemas._2004._07.xytech_mp.Credentials;


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
 *         &lt;element name="arguments" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}ArrayOfAPISaveArgument" minOccurs="0"/>
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
    "arguments"
})
@XmlRootElement(name = "Upsert")
public class Upsert {

    @XmlElementRef(name = "credentials", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Credentials> credentials;
    @XmlElementRef(name = "arguments", namespace = "urn:xytechsystems.com/XytechAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPISaveArgument> arguments;

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
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISaveArgument }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPISaveArgument> getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISaveArgument }{@code >}
     *     
     */
    public void setArguments(JAXBElement<ArrayOfAPISaveArgument> value) {
        this.arguments = value;
    }

}
