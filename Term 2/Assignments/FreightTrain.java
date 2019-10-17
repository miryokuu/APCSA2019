/**
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 2: FreightTrain
 * A class which represents a freight train with multiple boxcars.
 */

import java.util.ArrayList;

public class FreightTrain
{
    // An ArrayList that stores a train with multiple boxcars
    private ArrayList<Boxcar> train = new ArrayList<Boxcar>();
    
    // this should be in boxcar class. but code runner headass
    public static final String[] Boxcar_cargoType = { "gizmos", "gadgets", "widgets", "wadgets" };

    /**
     * Default constructor that sets train to an ArrayList holding one
     * boxcar containing 5 gizmos, that is not in repair.
     */
    public FreightTrain()
    {
        train.add(new Boxcar("gizmos", 5, false));
    }

    /**
     * A constructor that sets train to an ArrayList of size n, holding
     * n boxcars, that are all hold 5 gizmos and are not in repair. If n <= 0,
     * then the train should be set to size one, with a single boxcar containing
     * 5 gizmos and not in repair.
     * @param n
     */
    public FreightTrain(int n)
    {
        this();
        
        if(n > 1) 
        {
            for(int i = 1; i < n; i++) 
                train.add(new Boxcar("gizmos", 5, false));
        }
    }

    /**
     * This method returns a String representation of the
     * Boxcar objects in the ArrayList, one per line. For example,
     * here is the String returned when toString is called on a
     * FreightTrain with 5 boxcars:
     *
     * 3 gadgets    in service
     * 2 wadgets    in service
     * 0 gizmos    in repair
     * 7 gadgets    in service
     * 0 gadgets    in repair
     *
     * Note: there is one space between the number of units and
     * the cargo type, and a tab between the cargo type and
     * "in repair"/"in service".
     */ 
    public String toString()
    {
        String outString = "";
        for(Boxcar boxcar : train) 
            outString += boxcar.toString() + "\n";
        return outString;
    }

    // This method sets the cargo type of all the boxcars in the entire train.
    public void setCargo(String c)
    {
        for(Boxcar boxcar : train) 
            boxcar.setCargo(c);
    }

    /**
     * This method sets the boxcars to the pattern "gizmos", "gadgets", "widgets",
     * "wadgets", "gizmos", "gadgets", "widgets", "wadgets", ...
     * until the end of the train.
     */
    public void setMultiCargo()
    {
        for(int i = 0; i < train.size(); i++)
        {
            train.get(i).setCargo(Boxcar_cargoType[i%4]);
        }
    }

    /**
     * This method fills every boxcar in the train to max capacity of 10.
     * Each individual boxcar can only hold cargo if its
     * repair variable is false.
     */
    public void fillTrain()
    {        
        for(Boxcar boxcar : train) 
        {
            while(!boxcar.isFull())
                boxcar.loadCargo();            
        }
    }

    /**
     * This method sets the Boxcar at location i's repair variable to true.
     * @param i index
     */
    public void callForRepair(int i)
    {
        train.get(i).callForRepair();
    }
}
