
package XYTECH.org.datacontract.schemas._2004._07.xytech_mp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAPISaveArgument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAPISaveArgument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APISaveArgument" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}APISaveArgument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAPISaveArgument", propOrder = {
    "apiSaveArgument"
})
public class ArrayOfAPISaveArgument {

    @XmlElement(name = "APISaveArgument", nillable = true)
    protected List<APISaveArgument> apiSaveArgument;

    /**
     * Gets the value of the apiSaveArgument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apiSaveArgument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPISaveArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISaveArgument }
     * 
     * 
     */
    public List<APISaveArgument> getAPISaveArgument() {
        if (apiSaveArgument == null) {
            apiSaveArgument = new ArrayList<APISaveArgument>();
        }
        return this.apiSaveArgument;
    }

}
