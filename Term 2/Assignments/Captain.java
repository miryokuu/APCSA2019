/**
 *	APCSA Term 2 Assignment 3 Captain Class
 *	@author miryokuu
 */

public class Captain extends UltimatePlayer {

    /**
     * Captains on an Ultimate team are usually responsible for either offense or defense. 
     * This variable is a boolean representing the type of captain, true for offense, false for defense.
     */
    protected boolean type;
    
    /**
     * The first and last names and the position should be set by calling the constructor of the parent class.
     * 
     * @param firstName
     * @param lastName
     * @param position
     */
    Captain(String firstName, String lastName, String position, boolean type)
    {
        super(firstName, lastName, position);
        this.type = type;
    }

    /**
     * Returns a three-line String with UltimatePlayer information formatted as follows:
     * 
     * Smith, Mary
     *    Jersey #: 1
     *    Position: cutter
     *    Captain: offense
     * 
     * @return String
     */
    @Override
    public String toString() 
    {
        return String.format("%s\n   Captain: %s", super.toString(), type ? "offense" : "defense");
    }
}
