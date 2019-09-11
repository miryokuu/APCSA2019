/*
 * Lesson 22 Coding Activity 2
 * Write the code to take a String and print it diagonally.

  Sample run:

  Enter a string:
  bought
  b
      o
          u
              g
                  h
                      t
  Use a tab character for every four spaces in the sample.

  Hint: You may need more than one loop.
  
*/ 

import java.util.Scanner; 

class Lesson_22_Activity_Two {
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	String str = input.nextLine(), tabs = "";
    	
    	// "Hint: You may need more than one loop." NO YOU DONT GOTTEM BOIS
    	for (int i=0; i < str.length(); i++)
    	{
    		System.out.println(tabs + str.charAt(i));
    		tabs += "\t";
    	}
    	input.close();
    }
}