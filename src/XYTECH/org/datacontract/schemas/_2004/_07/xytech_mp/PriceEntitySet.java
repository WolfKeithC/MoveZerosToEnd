
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
 * <p>Java class for PriceEntitySet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceEntitySet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Entities" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}ArrayOfPriceEntity" minOccurs="0"/>
 *         &lt;element name="EntitySetID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "PriceEntitySet", propOrder = {
    "entities",
    "entitySetID",
    "operator"
})
public class PriceEntitySet {

    @XmlElementRef(name = "Entities", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPriceEntity> entities;
    @XmlElement(name = "EntitySetID")
    protected Integer entitySetID;
    @XmlElement(name = "Operator")
    @XmlSchemaType(name = "string")
    protected PricingOperators operator;

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPriceEntity> getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceEntity }{@code >}
     *     
     */
    public void setEntities(JAXBElement<ArrayOfPriceEntity> value) {
        this.entities = value;
    }

    /**
     * Gets the value of the entitySetID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntitySetID() {
        return entitySetID;
    }

    /**
     * Sets the value of the entitySetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntitySetID(Integer value) {
        this.entitySetID = value;
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
