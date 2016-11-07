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
 * <p>Java class for QueryStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryStatusCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="aborted"/>
 *     &lt;enumeration value="deliveredResponse"/>
 *     &lt;enumeration value="executing"/>
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="waitContinuedQueryResponse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryStatusCode")
@XmlEnum
public enum QueryStatusCode {

    @XmlEnumValue("aborted")
    ABORTED("aborted"),
    @XmlEnumValue("deliveredResponse")
    DELIVERED_RESPONSE("deliveredResponse"),
    @XmlEnumValue("executing")
    EXECUTING("executing"),
    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("waitContinuedQueryResponse")
    WAIT_CONTINUED_QUERY_RESPONSE("waitContinuedQueryResponse");
    private final String value;

    QueryStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryStatusCode fromValue(String v) {
        for (QueryStatusCode c: QueryStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
