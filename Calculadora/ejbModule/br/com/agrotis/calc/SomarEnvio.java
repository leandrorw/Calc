//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.11 at 02:57:01 PM BRT 
//


package br.com.agrotis.calc;

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
 *         &lt;element name="valor1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valor2" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "valor1",
    "valor2"
})
@XmlRootElement(name = "somarEnvio")
public class SomarEnvio {

    protected int valor1;
    protected int valor2;

    /**
     * Gets the value of the valor1 property.
     * 
     */
    public int getValor1() {
        return valor1;
    }

    /**
     * Sets the value of the valor1 property.
     * 
     */
    public void setValor1(int value) {
        this.valor1 = value;
    }

    /**
     * Gets the value of the valor2 property.
     * 
     */
    public int getValor2() {
        return valor2;
    }

    /**
     * Sets the value of the valor2 property.
     * 
     */
    public void setValor2(int value) {
        this.valor2 = value;
    }

}
