/**
 * APCSA Term 2 Assignment 3 UltimatePlayer Class
 * 
 * @author miryokuu
 */

public class UltimatePlayer extends Person {

    /**
     * Using a static variable to keep track of ultimate player jersey numbers,
     * every player should be assigned a unique value for their own jersey number.
     */
    public int jerseyNumber;
    public static int jerseyNumberTrack = 0;

    /**
     * Represents a player’s position. Possible values are “handler” and “cutter”.
     */
    private String position;

    /**
     * Constructor that accepts the first name, last name and the position of a
     * player. The first and last names should be set by calling the constructor of
     * the parent class. Position should be set to “handler” if the input string is
     * not “handler” or “cutter”. The UltimatePlayer constructor also sets the
     * jersey number to the next available positive integer. The first
     * UltimatePlayer created should have a jersey number of 1, the second will have
     * a jersey number of 2, third of 3, etc.
     */
    UltimatePlayer(String firstName, String lastName, String position)
    {
        super(firstName, lastName);
        this.position = position == "cutter" ? position : "handler";
        UltimatePlayer.jerseyNumberTrack++;
        this.jerseyNumber = UltimatePlayer.jerseyNumberTrack;
    }

    /**
     * Returns the UltimatePlayer's position.
     * 
     * @return position
     */
    protected String getPosition()
    {
        return this.position;
    }

    /**
     * Returns a three-line String with UltimatePlayer information formatted as
     * follows:
     * 
     * Smith, Mary Jersey #: 1 Position: cutter
     * 
     * @return String
     */
    @Override
    public String toString()
    {
        return String.format(
                "%s\n   Jersey #: %d\n   Position: %s", super.toString(), this.jerseyNumber, this.getPosition()
        );
    }

}
