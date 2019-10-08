
/*
 * Lesson 6 Coding Activity Question 3
 *
 * Input a double and print the first two digits after the decimal point.
 *
 * Sample run:
 
Please input a decimal number:
57.8934
Answer: 89

 * Hint - you will need to do a numeric cast and some division and/or subtraction.
 *
*/

import java.util.Scanner;

class Lesson_6_Activity_Three {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double in = 0;

        in = input.nextDouble();

        System.out.println(String.format("Answer %d", (int) ((in - (int) in) * 100)));
        input.close();
    }
}