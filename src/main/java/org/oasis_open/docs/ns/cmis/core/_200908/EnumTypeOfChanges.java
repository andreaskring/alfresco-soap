
package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumTypeOfChanges.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumTypeOfChanges"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="created"/&gt;
 *     &lt;enumeration value="updated"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="security"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumTypeOfChanges")
@XmlEnum
public enum EnumTypeOfChanges {

    @XmlEnumValue("created")
    CREATED("created"),
    @XmlEnumValue("updated")
    UPDATED("updated"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("security")
    SECURITY("security");
    private final String value;

    EnumTypeOfChanges(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumTypeOfChanges fromValue(String v) {
        for (EnumTypeOfChanges c: EnumTypeOfChanges.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
