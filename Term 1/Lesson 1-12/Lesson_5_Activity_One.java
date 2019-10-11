
/*
 * Lesson 5 Coding Activity Question 1
 * 
 * Input two double values and print the difference between them. 
 * (The difference can be found by subtracting the second value from the first).
 *
*/

import java.util.Scanner;

class Lesson_5_Activity_One {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double first, second;

        first = input.nextDouble();
        second = input.nextDouble();

        System.out.println(second - first);
        input.close();
    }
}