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
 * <p>Java class for ValueSetPropertyId.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueSetPropertyId">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="appliesTo"/>
 *     &lt;enumeration value="howApplies"/>
 *     &lt;enumeration value="openIssue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueSetPropertyId")
@XmlEnum
public enum ValueSetPropertyId {

    @XmlEnumValue("appliesTo")
    APPLIES_TO("appliesTo"),
    @XmlEnumValue("howApplies")
    HOW_APPLIES("howApplies"),
    @XmlEnumValue("openIssue")
    OPEN_ISSUE("openIssue");
    private final String value;

    ValueSetPropertyId(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueSetPropertyId fromValue(String v) {
        for (ValueSetPropertyId c: ValueSetPropertyId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
