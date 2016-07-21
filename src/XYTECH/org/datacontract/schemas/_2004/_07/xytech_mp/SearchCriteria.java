
package XYTECH.org.datacontract.schemas._2004._07.xytech_mp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import XYTECH.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for SearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Criteria" type="{http://schemas.datacontract.org/2004/07/Xytech.MP.API}ArrayOfCriteriaNode" minOccurs="0"/>
 *         &lt;element name="IncludeBlobData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxRows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RenderReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReportLayoutNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResultColumns" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria", propOrder = {
    "criteria",
    "includeBlobData",
    "maxRows",
    "renderReport",
    "reportLayoutNumber",
    "resultColumns"
})
public class SearchCriteria {

    @XmlElementRef(name = "Criteria", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCriteriaNode> criteria;
    @XmlElement(name = "IncludeBlobData")
    protected Boolean includeBlobData;
    @XmlElement(name = "MaxRows")
    protected Integer maxRows;
    @XmlElement(name = "RenderReport")
    protected Boolean renderReport;
    @XmlElement(name = "ReportLayoutNumber")
    protected Integer reportLayoutNumber;
    @XmlElementRef(name = "ResultColumns", namespace = "http://schemas.datacontract.org/2004/07/Xytech.MP.API", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> resultColumns;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCriteriaNode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCriteriaNode> getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCriteriaNode }{@code >}
     *     
     */
    public void setCriteria(JAXBElement<ArrayOfCriteriaNode> value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the includeBlobData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeBlobData() {
        return includeBlobData;
    }

    /**
     * Sets the value of the includeBlobData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeBlobData(Boolean value) {
        this.includeBlobData = value;
    }

    /**
     * Gets the value of the maxRows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRows() {
        return maxRows;
    }

    /**
     * Sets the value of the maxRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRows(Integer value) {
        this.maxRows = value;
    }

    /**
     * Gets the value of the renderReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRenderReport() {
        return renderReport;
    }

    /**
     * Sets the value of the renderReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenderReport(Boolean value) {
        this.renderReport = value;
    }

    /**
     * Gets the value of the reportLayoutNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportLayoutNumber() {
        return reportLayoutNumber;
    }

    /**
     * Sets the value of the reportLayoutNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportLayoutNumber(Integer value) {
        this.reportLayoutNumber = value;
    }

    /**
     * Gets the value of the resultColumns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getResultColumns() {
        return resultColumns;
    }

    /**
     * Sets the value of the resultColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setResultColumns(JAXBElement<ArrayOfstring> value) {
        this.resultColumns = value;
    }

}
