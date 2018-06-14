
package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumUpdatability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumUpdatability"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="readonly"/&gt;
 *     &lt;enumeration value="readwrite"/&gt;
 *     &lt;enumeration value="whencheckedout"/&gt;
 *     &lt;enumeration value="oncreate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumUpdatability")
@XmlEnum
public enum EnumUpdatability {

    @XmlEnumValue("readonly")
    READONLY("readonly"),
    @XmlEnumValue("readwrite")
    READWRITE("readwrite"),
    @XmlEnumValue("whencheckedout")
    WHENCHECKEDOUT("whencheckedout"),
    @XmlEnumValue("oncreate")
    ONCREATE("oncreate");
    private final String value;

    EnumUpdatability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumUpdatability fromValue(String v) {
        for (EnumUpdatability c: EnumUpdatability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
