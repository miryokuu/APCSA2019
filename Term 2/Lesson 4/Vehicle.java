/**
 * APCSA Term 2 Lesson 4 Vehicle.java
 * 
 * @author miryokuu
 */
public class Vehicle {
    /**
     * An integer that holds the current block location of the car on the road, with
     * possible values ranging from -20 to 20.
     */
    public int location;

    /**
     * Set location to 0.
     */
    Vehicle()
    {
        this.location = 0;
    }

    /**
     * If loc is between -20 and 20 inclusive, set location to loc. Otherwise, set
     * location to 0.
     * 
     * @param loc
     */
    Vehicle(int loc)
    {
        this.location = Math.abs(loc) <= 20 ? loc : 0;
    }

    /**
     * Increments the Vehicle forward one block. Do not let the user move past block
     * 20.
     * 
     * @return void
     */
    public void forward()
    {
        if (this.location >= 20)
            return;
        this.location++;
    }

    /**
     * Increments the vehicle backward one block. Do not let the user move past
     * block -20.
     * 
     * @return void
     */
    public void backward()
    {
        if (this.location <= -20)
            return;
        this.location--;
    }

    /**
     * Should return an integer representing the block location of the car.
     * 
     * @return
     */
    public int getLocation()
    {
        return this.location;
    }

    /**
     * Returns a String representation of the car's location. It should print out
     * spaces for all of the blocks from -20 to the car's current location, then
     * print the '@' character. For example if the car is at block -10, the method
     * will return the following String: " @" (10 spaces then the '@').
     */
    @Override
    public String toString()
    {
        String strLocation = new String("");
        for (int i = 0; i < 20 + this.location; i++)
        {
            strLocation += " ";
        }
        return strLocation + "@";
    }

}
