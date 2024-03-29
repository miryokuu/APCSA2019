
/*
 * Lesson 12 Coding Activity 4 
 * You are running an experiment that involves hatching chicken eggs. 
 * Bird eggs are very sensitive to temperature and chickens� eggs will hatch 
 * between 99 and 102 degrees Fahrenheit.
 * 
 * Write the code for the sensor that will be tracking the temperature. 
 * If the temperature falls below 99 or above 102 your code should print �WARNING�.
 * The input should be in doubles.
 *     
 *     Sample Run 1
 *         What is the temperature?
 *         45.3
 *         WARNING
 *
 *         
 *      Sample Run 2
 *         What is the temperature?
 *         100        
 * 
 */

import java.util.Scanner;

class Lesson_12_Activity_Four {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float temp;

        temp = input.nextFloat();
        System.out.println(temp >= 99 && temp <= 102 ? null : "WARNING");
        input.close();
    }
}