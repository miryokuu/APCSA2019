/*
 * Lesson 14 Coding Activity 2
 * Write a program to input two integers and print 
 * "Both are positive or zero." to the screen, if both are positive or zero.
 * Print "One or both are negative." otherwise.
 */


import java.util.Scanner;

class Lesson_14_Activity_Two {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);       
        System.out.println((input.nextInt() > -1) && (input.nextInt() > -1) ? "Both are positive or zero." : "One or both are negative.");
        input.close();
    }
}