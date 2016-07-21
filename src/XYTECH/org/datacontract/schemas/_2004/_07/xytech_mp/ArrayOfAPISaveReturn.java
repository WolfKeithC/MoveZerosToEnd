
package XYTECH.org.datacontract.schemas._2004._07.xytech_mp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAPISaveReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAPISaveReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APISaveReturn" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}APISaveReturn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAPISaveReturn", propOrder = {
    "apiSaveReturn"
})
public class ArrayOfAPISaveReturn {

    @XmlElement(name = "APISaveReturn", nillable = true)
    protected List<APISaveReturn> apiSaveReturn;

    /**
     * Gets the value of the apiSaveReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apiSaveReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPISaveReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISaveReturn }
     * 
     * 
     */
    public List<APISaveReturn> getAPISaveReturn() {
        if (apiSaveReturn == null) {
            apiSaveReturn = new ArrayList<APISaveReturn>();
        }
        return this.apiSaveReturn;
    }

}
