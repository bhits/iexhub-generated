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
 * <p>Java class for ClassificationQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationSchemeQuery" minOccurs="0"/>
 *         &lt;element name="ClassifiedObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationQueryType", propOrder = {
    "classificationSchemeQuery",
    "classifiedObjectQuery",
    "classificationNodeQuery"
})
public class ClassificationQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ClassificationSchemeQuery")
    protected ClassificationSchemeQueryType classificationSchemeQuery;
    @XmlElement(name = "ClassifiedObjectQuery")
    protected RegistryObjectQueryType classifiedObjectQuery;
    @XmlElement(name = "ClassificationNodeQuery")
    protected ClassificationNodeQueryType classificationNodeQuery;

    /**
     * Gets the value of the classificationSchemeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSchemeQueryType }
     *     
     */
    public ClassificationSchemeQueryType getClassificationSchemeQuery() {
        return classificationSchemeQuery;
    }

    /**
     * Sets the value of the classificationSchemeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSchemeQueryType }
     *     
     */
    public void setClassificationSchemeQuery(ClassificationSchemeQueryType value) {
        this.classificationSchemeQuery = value;
    }

    /**
     * Gets the value of the classifiedObjectQuery property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getClassifiedObjectQuery() {
        return classifiedObjectQuery;
    }

    /**
     * Sets the value of the classifiedObjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setClassifiedObjectQuery(RegistryObjectQueryType value) {
        this.classifiedObjectQuery = value;
    }

    /**
     * Gets the value of the classificationNodeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getClassificationNodeQuery() {
        return classificationNodeQuery;
    }

    /**
     * Sets the value of the classificationNodeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setClassificationNodeQuery(ClassificationNodeQueryType value) {
        this.classificationNodeQuery = value;
    }

}
