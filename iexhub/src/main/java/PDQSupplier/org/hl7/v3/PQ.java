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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *             A dimensioned quantity expressing the result of a
 *             measurement act.
 *         
 * 
 * <p>Java class for PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QTY">
 *       &lt;sequence>
 *         &lt;element name="translation" type="{urn:hl7-org:v3}PQR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" type="{urn:hl7-org:v3}real" />
 *       &lt;attribute name="unit" type="{urn:hl7-org:v3}cs" default="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PQ", propOrder = {
    "translation"
})
@XmlSeeAlso({
    SXCMPQ.class,
    IVXBPQ.class,
    PPDPQ.class,
    HXITPQ.class
})
public class PQ
    extends QTY
{

    protected List<PQR> translation;
    @XmlAttribute
    protected String value;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unit;

    /**
     * Gets the value of the translation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PQR }
     * 
     * 
     */
    public List<PQR> getTranslation() {
        if (translation == null) {
            translation = new ArrayList<PQR>();
        }
        return this.translation;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        if (unit == null) {
            return "1";
        } else {
            return unit;
        }
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
