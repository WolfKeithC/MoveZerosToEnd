
package XYTECH.org.datacontract.schemas._2004._07.xytech_mp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import XYTECH.org.datacontract.schemas._2004._07.xytech_xe.PricingOperators;


/**
 * <p>Java class for PriceEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSets" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}ArrayOfPriceAttributeSet" minOccurs="0"/>
 *         &lt;element name="EntityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://schemas.datacontract.org/2004/07/Xytech.XE.API}PricingOperators" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceEntity", propOrder = {
    "attributeSets",
    "entityID",
    "entityTag",
    "operator"
})
public class PriceEntity {

    @XmlElementRef(name = "AttributeSets", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPriceAttributeSet> attributeSets;
    @XmlElementRef(name = "EntityID", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityID;
    @XmlElementRef(name = "EntityTag", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityTag;
    @XmlElement(name = "Operator")
    @XmlSchemaType(name = "string")
    protected PricingOperators operator;

    /**
     * Gets the value of the attributeSets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceAttributeSet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPriceAttributeSet> getAttributeSets() {
        return attributeSets;
    }

    /**
     * Sets the value of the attributeSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceAttributeSet }{@code >}
     *     
     */
    public void setAttributeSets(JAXBElement<ArrayOfPriceAttributeSet> value) {
        this.attributeSets = value;
    }

    /**
     * Gets the value of the entityID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityID() {
        return entityID;
    }

    /**
     * Sets the value of the entityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityID(JAXBElement<String> value) {
        this.entityID = value;
    }

    /**
     * Gets the value of the entityTag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityTag() {
        return entityTag;
    }

    /**
     * Sets the value of the entityTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityTag(JAXBElement<String> value) {
        this.entityTag = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link PricingOperators }
     *     
     */
    public PricingOperators getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingOperators }
     *     
     */
    public void setOperator(PricingOperators value) {
        this.operator = value;
    }

}
