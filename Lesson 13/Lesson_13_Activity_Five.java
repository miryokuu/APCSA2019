/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */


import java.util.Scanner;

class Lesson_13_Activity_Five {
    public static int numgen() { return (int)(Math.random() * 12) + 1; }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer firstNum = numgen(), SecondNum = numgen();
        
        System.out.println(input.nextInt() == (firstNum * SecondNum) ? "Correct!" : "Wrong");
        input.close();
    }
}