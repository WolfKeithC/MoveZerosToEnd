
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
 * <p>Java class for PriceAttributeSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceAttributeSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSetID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}ArrayOfPriceAttribute" minOccurs="0"/>
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
@XmlType(name = "PriceAttributeSet", propOrder = {
    "attributeSetID",
    "attributes",
    "operator"
})
public class PriceAttributeSet {

    @XmlElement(name = "AttributeSetID")
    protected Integer attributeSetID;
    @XmlElementRef(name = "Attributes", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPriceAttribute> attributes;
    @XmlElement(name = "Operator")
    @XmlSchemaType(name = "string")
    protected PricingOperators operator;

    /**
     * Gets the value of the attributeSetID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributeSetID() {
        return attributeSetID;
    }

    /**
     * Sets the value of the attributeSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributeSetID(Integer value) {
        this.attributeSetID = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPriceAttribute> getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceAttribute }{@code >}
     *     
     */
    public void setAttributes(JAXBElement<ArrayOfPriceAttribute> value) {
        this.attributes = value;
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
