/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard. 
 * When the user enters -1, print the average.
 * 
 * What do you need to be careful about when using -1 to stop a loop?
 * 
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 * 
 * 
 */

import java.util.Scanner;

class Lesson_17_Activity_One {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int iterations = 0;
        int temp = input.nextInt();
        
        while(temp!=-1){
          total += temp;
          temp = input.nextInt();
          iterations++;
        }
        
        System.out.println((double)total/iterations);
        input.close();
        
    }
}
