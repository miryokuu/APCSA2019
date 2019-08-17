/*
 * Lesson 3 Coding Activity Question 1
 * 
 * Write the code to ask the user to enter their name and print the following message:

Hi ______, nice to see you.
	
 * Remember, you'll need to use the method println and Scanner class method nextLine.
*/

import java.util.Scanner;

class Lesson_3_Activity_One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        System.out.println(String.format("Hi %s, nice to see you.", name));
        input.close();
    }
}