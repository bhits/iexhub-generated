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

package XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element name="SelectorQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}AdhocQueryQueryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionQueryType", propOrder = {
    "selectorQuery"
})
public class SubscriptionQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "SelectorQuery")
    protected AdhocQueryQueryType selectorQuery;

    /**
     * Gets the value of the selectorQuery property.
     * 
     * @return
     *     possible object is
     *     {@link AdhocQueryQueryType }
     *     
     */
    public AdhocQueryQueryType getSelectorQuery() {
        return selectorQuery;
    }

    /**
     * Sets the value of the selectorQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdhocQueryQueryType }
     *     
     */
    public void setSelectorQuery(AdhocQueryQueryType value) {
        this.selectorQuery = value;
    }

}
