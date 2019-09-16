/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */

import java.util.Scanner;

class Lesson_12_Activity_One {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = 0;

        num += input.nextInt();
        num += input.nextInt();
        num += input.nextInt();

        if (((float) num / 3.0f) >= 89.5f)
            System.out.println("ABOVE AVERAGE");

        input.close();
    }
}