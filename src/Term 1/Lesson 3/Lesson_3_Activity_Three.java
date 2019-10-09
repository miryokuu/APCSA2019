
/*
 * Lesson 3 Coding Activity Question 3
 * 
 * Write a program that will ask the user to enter an adjective and a name. 
 * Print the following sentence, replacing the ______ with the words they entered.
 * 
 * My name is _____. I am _____.
 *
 * Sample Run:

Hi there. What is your name?
Ada
What adjective describes you?
logical
My name is Ada. I am logical.

*/

import java.util.Scanner;

class Lesson_3_Activity_Three {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] name = new String[2];

        System.out.println("Hi there. What is your name?");
        name[0] = input.nextLine();

        System.out.println("What adjective describes you?");
        name[1] = input.nextLine();

        System.out.println(String.format("My name is %s. I am %s.", name[0], name[1]));
        input.close();
    }
}