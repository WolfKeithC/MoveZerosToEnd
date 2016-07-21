
package XYTECH.org.datacontract.schemas._2004._07.xytech_mp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPriceAttributeSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPriceAttributeSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceAttributeSet" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}PriceAttributeSet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPriceAttributeSet", propOrder = {
    "priceAttributeSet"
})
public class ArrayOfPriceAttributeSet {

    @XmlElement(name = "PriceAttributeSet", nillable = true)
    protected List<PriceAttributeSet> priceAttributeSet;

    /**
     * Gets the value of the priceAttributeSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceAttributeSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceAttributeSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceAttributeSet }
     * 
     * 
     */
    public List<PriceAttributeSet> getPriceAttributeSet() {
        if (priceAttributeSet == null) {
            priceAttributeSet = new ArrayList<PriceAttributeSet>();
        }
        return this.priceAttributeSet;
    }

}
