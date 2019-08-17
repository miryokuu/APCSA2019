/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/

import java.util.Scanner;

class Lesson_3_Activity_Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = new String[3];
        
        System.out.println("Please enter three names:");
        name[0] = input.nextLine();
        name[1] = input.nextLine();
        name[2] = input.nextLine();

        System.out.println(String.format("%s %s %s", name[2], name[1], name[0]));
        input.close();
    }
}