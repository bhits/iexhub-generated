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

package PIXManager.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedReleaseSuspension.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendedReleaseSuspension">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ERSUSP"/>
 *     &lt;enumeration value="ERSUSP12"/>
 *     &lt;enumeration value="ERSUSP24"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtendedReleaseSuspension")
@XmlEnum
public enum ExtendedReleaseSuspension {

    ERSUSP("ERSUSP"),
    @XmlEnumValue("ERSUSP12")
    ERSUSP_12("ERSUSP12"),
    @XmlEnumValue("ERSUSP24")
    ERSUSP_24("ERSUSP24");
    private final String value;

    ExtendedReleaseSuspension(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtendedReleaseSuspension fromValue(String v) {
        for (ExtendedReleaseSuspension c: ExtendedReleaseSuspension.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
