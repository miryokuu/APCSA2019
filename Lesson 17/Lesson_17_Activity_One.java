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

import java.util.ArrayList;
import java.util.Scanner;

class Lesson_17_Activity_One {
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	ArrayList<Integer> num = new ArrayList<Integer>();
    	Integer avg = 0;
    	boolean loop = true;
    	
    	while (loop) 
    	{
    		num.add(input.nextInt());
    		loop = num.get(num.size() - 1) != -1;
    	}
    	
    	num.remove(num.size() - 1);
    	
    	for(int i = 0; i < num.size(); i++) 
    	{
    		avg += num.get(i);
    	}
    	
    	System.out.println("The average is: " + (avg.doubleValue() / num.size()));
    	input.close();
    }
}