
/*
 * Lesson 5 Coding Activity Question 2
 * 
 * Input four integer values and print the sum of all four values.
 *
*/

import java.util.Scanner;

class Lesson_5_Activity_Two {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = 0;

        num += input.nextInt();
        num += input.nextInt();
        num += input.nextInt();

        System.out.println(num);
        input.close();
    }
}