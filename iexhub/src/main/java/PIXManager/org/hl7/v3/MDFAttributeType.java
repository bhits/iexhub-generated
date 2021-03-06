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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MDFAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MDFAttributeType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ADDR"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="COM"/>
 *     &lt;enumeration value="DTTM"/>
 *     &lt;enumeration value="DESC"/>
 *     &lt;enumeration value="EXPR"/>
 *     &lt;enumeration value="FRC"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="NM"/>
 *     &lt;enumeration value="NBR"/>
 *     &lt;enumeration value="PHON"/>
 *     &lt;enumeration value="QTY"/>
 *     &lt;enumeration value="TXT"/>
 *     &lt;enumeration value="TMR"/>
 *     &lt;enumeration value="VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MDFAttributeType")
@XmlEnum
public enum MDFAttributeType {

    ADDR,
    CD,
    COM,
    DTTM,
    DESC,
    EXPR,
    FRC,
    TIME,
    ID,
    IND,
    NM,
    NBR,
    PHON,
    QTY,
    TXT,
    TMR,
    VALUE;

    public String value() {
        return name();
    }

    public static MDFAttributeType fromValue(String v) {
        return valueOf(v);
    }

}
