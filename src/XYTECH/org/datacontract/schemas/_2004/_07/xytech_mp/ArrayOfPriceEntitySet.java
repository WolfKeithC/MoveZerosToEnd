
package XYTECH.org.datacontract.schemas._2004._07.xytech_mp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPriceEntitySet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPriceEntitySet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceEntitySet" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}PriceEntitySet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPriceEntitySet", propOrder = {
    "priceEntitySet"
})
public class ArrayOfPriceEntitySet {

    @XmlElement(name = "PriceEntitySet", nillable = true)
    protected List<PriceEntitySet> priceEntitySet;

    /**
     * Gets the value of the priceEntitySet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceEntitySet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceEntitySet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceEntitySet }
     * 
     * 
     */
    public List<PriceEntitySet> getPriceEntitySet() {
        if (priceEntitySet == null) {
            priceEntitySet = new ArrayList<PriceEntitySet>();
        }
        return this.priceEntitySet;
    }

}
