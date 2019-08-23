/*
 * Lesson 12 Coding Activity 2 
 * Input two decimal numbers and print the largest.
 * If the numbers are equal, print one of them.
 *     
 *     Sample Run 1
 *        Please enter two numbers:
 *        45.7
 *        45.1
 *
 *        Largest is: 45.7 
 *         
 *      Sample Run 2
 *        Please enter two numbers:
 *        14
 *        14
 * 
 *        Largest is: 14.0          
 * 
 */


import java.util.Scanner;

class Lesson_12_Activity_Two {
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	float firstInput, secondInput;
    	
    	firstInput = input.nextFloat();
    	secondInput = input.nextFloat();
    	
    	//	System.out.println(String.format("Largest is: %.1f", (firstInput > secondInput) ? firstInput : secondInput));
    	//	Broken REEEE
    	
    	System.out.println("Largest is: " + ((firstInput > secondInput) ? firstInput : secondInput));
    	input.close();
    }
}