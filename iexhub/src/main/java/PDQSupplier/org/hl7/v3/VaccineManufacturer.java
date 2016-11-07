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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VaccineManufacturer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VaccineManufacturer">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="ALP"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="PMC"/>
 *     &lt;enumeration value="AVI"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="BAY"/>
 *     &lt;enumeration value="BPC"/>
 *     &lt;enumeration value="BP"/>
 *     &lt;enumeration value="MIP"/>
 *     &lt;enumeration value="CEN"/>
 *     &lt;enumeration value="CHI"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="EVN"/>
 *     &lt;enumeration value="GRE"/>
 *     &lt;enumeration value="IAG"/>
 *     &lt;enumeration value="IUS"/>
 *     &lt;enumeration value="KGC"/>
 *     &lt;enumeration value="LED"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MED"/>
 *     &lt;enumeration value="MSD"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="MIL"/>
 *     &lt;enumeration value="NAB"/>
 *     &lt;enumeration value="NYB"/>
 *     &lt;enumeration value="NAV"/>
 *     &lt;enumeration value="NOV"/>
 *     &lt;enumeration value="OTC"/>
 *     &lt;enumeration value="ORT"/>
 *     &lt;enumeration value="PD"/>
 *     &lt;enumeration value="PRX"/>
 *     &lt;enumeration value="SCL"/>
 *     &lt;enumeration value="SKB"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="JPN"/>
 *     &lt;enumeration value="USA"/>
 *     &lt;enumeration value="WAL"/>
 *     &lt;enumeration value="WA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VaccineManufacturer")
@XmlEnum
public enum VaccineManufacturer {

    AB,
    AD,
    ALP,
    AR,
    PMC,
    AVI,
    BA,
    BAY,
    BPC,
    BP,
    MIP,
    CEN,
    CHI,
    CON,
    EVN,
    GRE,
    IAG,
    IUS,
    KGC,
    LED,
    MA,
    MED,
    MSD,
    IM,
    MIL,
    NAB,
    NYB,
    NAV,
    NOV,
    OTC,
    ORT,
    PD,
    PRX,
    SCL,
    SKB,
    SI,
    JPN,
    USA,
    WAL,
    WA;

    public String value() {
        return name();
    }

    public static VaccineManufacturer fromValue(String v) {
        return valueOf(v);
    }

}
