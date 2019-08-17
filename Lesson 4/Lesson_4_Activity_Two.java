/*
 * Lesson 4 Coding Activity Question 2
 * 
 * Ask the user their name and age and print out how many years until 
 * they are 100. Note that age should be an integer, not a double.
 *
 * Sample run:
 
Hi there. What is your name?
Pascal
Hi Pascal. How old are you?
16
Pascal, you will be 100 in 84 years.

*/

import java.util.Scanner;

class Lesson_4_Activity_Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        
        System.out.println("Hi there. What is your name?");
        name = input.nextLine();
        System.out.println(String.format("Hi %s. How old are you?", name));
        age = input.nextInt();
        
        if(age > 100 || age < 0) { input.close(); throw new RuntimeException("That's not how any of this works.");} 
        
        System.out.println(String.format("%s, you will be 100 in %d years.", name, 100 - age));
        input.close();

    }
}