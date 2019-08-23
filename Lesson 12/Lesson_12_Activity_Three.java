/*
 * Lesson 12 Coding Activity 3 
 * Test if a number input from the keyboard is a valid
 * test score (between 0 and 100 inclusive).
 *     
 *     Sample Run 1
 *         Enter a test score:
 *         78.5
 *         Valid
 *
 *         
 *      Sample Run 2
 *         Enter a test score:
 *         179
 *         Not Valid         
 * 
 */


import java.util.Scanner;

class Lesson_12_Activity_Three {
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	double score = input.nextDouble();
    	System.out.println((score > 100.0d) || (score < 0.0d) ? "Not Valid" : "Valid");
    }
}