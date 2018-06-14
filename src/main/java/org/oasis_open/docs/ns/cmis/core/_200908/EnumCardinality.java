
package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumCardinality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumCardinality"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="single"/&gt;
 *     &lt;enumeration value="multi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumCardinality")
@XmlEnum
public enum EnumCardinality {

    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("multi")
    MULTI("multi");
    private final String value;

    EnumCardinality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCardinality fromValue(String v) {
        for (EnumCardinality c: EnumCardinality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
