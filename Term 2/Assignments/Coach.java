/**
 * APCSA Term 2 Assignment 3 Coach Class
 * 
 * @author miryokuu
 */
public class Coach extends Person {
    /**
     * Role of coach on the team. This is a flexible description; there are no
     * required values for this variable. For example, “Head Coach” or “Assistant
     * Coach”.
     */
    private String role;

    /**
     * The first and last names should be set by calling the constructor of the
     * parent class.
     */
    Coach(String firstName, String lastName, String role)
    {
        super(firstName, lastName);
        this.role = role;
    }

    /**
     * Returns a two-line String with Coach info formatted as follows:
     * 
     * Wagner, Rebecca Role: Head Coach
     * 
     * @return String
     */
    @Override
    public String toString()
    {
        return String.format("%s\n   Role: %s", super.toString(), this.role);
    }

}
