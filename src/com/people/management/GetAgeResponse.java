
package com.people.management;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getAgeReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAgeReturn"
})
@XmlRootElement(name = "getAgeResponse")
public class GetAgeResponse {

    protected int getAgeReturn;

    /**
     * Gets the value of the getAgeReturn property.
     * 
     */
    public int getGetAgeReturn() {
        return getAgeReturn;
    }

    /**
     * Sets the value of the getAgeReturn property.
     * 
     */
    public void setGetAgeReturn(int value) {
        this.getAgeReturn = value;
    }

}
