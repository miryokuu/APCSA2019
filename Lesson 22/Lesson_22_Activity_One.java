/*
 * Lesson 22 Coding Activity 1
 * Write the code to take a String and print it with one letter per line.

  Sample run:

  Enter a string:
  bought
  b
  o
  u
  g
  h
  t
  
*/ 

import java.util.Scanner;

class Lesson_22_Activity_One {
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	String str = input.nextLine();
    	for (int i=0; i < str.length(); i++)
    	{
    		System.out.println(str.charAt(i));
    	}
    	input.close();
    }
}