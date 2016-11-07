/*******************************************************************************
 * Copyright (c) 2015, 2016 Substance Abuse and Mental Health Services Administration (SAMHSA)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Eversolve, LLC - initial IExHub implementation for Health Information Exchange (HIE) integration
 *     Anthony Sute, Ioana Singureanu
 *******************************************************************************/

package PDQSupplier.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderedListStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderedListStyle">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="Arabic"/>
 *     &lt;enumeration value="BigAlpha"/>
 *     &lt;enumeration value="BigRoman"/>
 *     &lt;enumeration value="LittleAlpha"/>
 *     &lt;enumeration value="LittleRoman"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderedListStyle")
@XmlEnum
public enum OrderedListStyle {

    @XmlEnumValue("Arabic")
    ARABIC("Arabic"),
    @XmlEnumValue("BigAlpha")
    BIG_ALPHA("BigAlpha"),
    @XmlEnumValue("BigRoman")
    BIG_ROMAN("BigRoman"),
    @XmlEnumValue("LittleAlpha")
    LITTLE_ALPHA("LittleAlpha"),
    @XmlEnumValue("LittleRoman")
    LITTLE_ROMAN("LittleRoman");
    private final String value;

    OrderedListStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderedListStyle fromValue(String v) {
        for (OrderedListStyle c: OrderedListStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
