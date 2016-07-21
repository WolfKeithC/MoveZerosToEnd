
import XYTECH.org.datacontract.schemas._2004._07.xytech_xe;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingOperators.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingOperators">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANDOR"/>
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingOperators", namespace = "http://schemas.datacontract.org/2004/07/Xytech.XE.API")
@XmlEnum
public enum PricingOperators {

    ANDOR,
    AND,
    OR;

    public String value() {
        return name();
    }

    public static PricingOperators fromValue(String v) {
        return valueOf(v);
    }

}
