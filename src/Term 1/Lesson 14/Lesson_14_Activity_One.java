/*
 * Lesson 14 Coding Activity 1
 * Test if an integer is not between 5 and 76 inclusive.
 *
 *     Sample Run 1
 *         Enter a number:
 *         7
 *         False
 *
 *         
 *      Sample Run 2
 *         Enter a number:
 *         1   
 *         True
 * 
 */

import java.util.Scanner;

class Lesson_14_Activity_One {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer num = input.nextInt();

        System.out.println(num >= 5 && num <= 76 ? "False" : "True");
        input.close();
    }
}