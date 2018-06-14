
package org.oasis_open.docs.ns.cmis.core._200908;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumCapabilityQuery.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumCapabilityQuery"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="metadataonly"/&gt;
 *     &lt;enumeration value="fulltextonly"/&gt;
 *     &lt;enumeration value="bothseparate"/&gt;
 *     &lt;enumeration value="bothcombined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumCapabilityQuery")
@XmlEnum
public enum EnumCapabilityQuery {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("metadataonly")
    METADATAONLY("metadataonly"),
    @XmlEnumValue("fulltextonly")
    FULLTEXTONLY("fulltextonly"),
    @XmlEnumValue("bothseparate")
    BOTHSEPARATE("bothseparate"),
    @XmlEnumValue("bothcombined")
    BOTHCOMBINED("bothcombined");
    private final String value;

    EnumCapabilityQuery(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCapabilityQuery fromValue(String v) {
        for (EnumCapabilityQuery c: EnumCapabilityQuery.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
