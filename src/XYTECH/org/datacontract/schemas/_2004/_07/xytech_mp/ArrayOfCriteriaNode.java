
package XYTECH.org.datacontract.schemas._2004._07.xytech_mp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCriteriaNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCriteriaNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CriteriaNode" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}CriteriaNode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCriteriaNode", propOrder = {
    "criteriaNode"
})
public class ArrayOfCriteriaNode {

    @XmlElement(name = "CriteriaNode", nillable = true)
    protected List<CriteriaNode> criteriaNode;

    /**
     * Gets the value of the criteriaNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriteriaNode }
     * 
     * 
     */
    public List<CriteriaNode> getCriteriaNode() {
        if (criteriaNode == null) {
            criteriaNode = new ArrayList<CriteriaNode>();
        }
        return this.criteriaNode;
    }

}
