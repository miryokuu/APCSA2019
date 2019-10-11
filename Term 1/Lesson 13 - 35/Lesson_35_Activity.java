
/*
 * Lesson 35 Coding Activity
 * 
 * Write four overloaded methods called randomize. Each method will
 * return a random number based on the parameters that it receives:
 * 
 * Write four overloaded methods called randomize. 
 * Each method will return a random number based on the parameters that it receives:
 * randomize() - Returns a random int between min and max inclusive. Must have two int parameters. 
 * randomize() - Returns a random int between 0 and max inclusive. Must have one int parameter. 
 * randomize() - Returns a random double between min and max inclusive. Must have two double parameters. 
 * randomize() - Returns a random double between 0 and max inclusive. Must have one double parameter. 
 * 
 * Because these methods are overloaded, they should be declared in the same class. 
 * To simulate this, copy all four methods into the single Code Runner box.
 */

import java.util.Scanner;

class Lesson_35_Activity {

    /**
     * Returns a random int between min and max inclusive. Must have two int
     * parameters.
     * 
     * personally, this does a terrible job of explaining what the parameter wants.
     *
     * @param max
     * @param min
     * @return int
     */
    public static int randomize(int fParam, int sParam)
    {
        boolean mode = fParam > sParam;
        int max = mode ? fParam : sParam;
        int min = mode ? sParam : fParam;

        return (int) (Math.random() * (max - min)) + min;
    }

    /**
     * Returns a random int between 0 and max inclusive. Must have one int
     * parameter.
     * 
     * @param max
     * @return int
     */
    public static int randomize(int max)
    {
        return (int) (Math.random() * max);
    }

    /**
     * Returns a random double between min and max. Must have two double parameters.
     * 
     * @param max
     * @param min
     * @return double
     */
    public static double randomize(double fParam, double sParam)
    {
        boolean mode = fParam > sParam;
        double max = mode ? fParam : sParam;
        double min = mode ? sParam : fParam;

        return (int) (Math.random() * (max - min)) + min;
    }

    /**
     * Returns a random double between 0 and max. Must have one double parameter.
     * 
     * @param max
     * @return double
     */
    public static double randomize(double max)
    {
        return Math.random() * max;
    }

    public static void main(String[] args)
    {
        // tests
    }
}