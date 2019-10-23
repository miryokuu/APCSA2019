/**
 *	APCSA Term 2 Assignment 3 Person Class
 *	@author miryokuu
 */

public class Person {
    /**
     * Holds the person's first name.
     */
    protected String firstName;
    
    /**
     * Holds the person's first name.
     */
    protected String lastName;
    
    /**
     * Constructor that takes in String parameters representing the first and last names.
     * 
     * @param firstName
     * @param lastName
     */
    Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    /**
     * Returns a String with the following format: lastName, firstName
     * 
     * @return String
     */
    @Override
    public String toString() 
    {
        return String.format("%s, %s", lastName, firstName);
    }

}
