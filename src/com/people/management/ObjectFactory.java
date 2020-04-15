
package com.people.management;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.people.management package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.people.management
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetName }
     * 
     */
    public SetName createSetName() {
        return new SetName();
    }

    /**
     * Create an instance of {@link SetNameResponse }
     * 
     */
    public SetNameResponse createSetNameResponse() {
        return new SetNameResponse();
    }

    /**
     * Create an instance of {@link GetAge }
     * 
     */
    public GetAge createGetAge() {
        return new GetAge();
    }

    /**
     * Create an instance of {@link GetAgeResponse }
     * 
     */
    public GetAgeResponse createGetAgeResponse() {
        return new GetAgeResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

}
