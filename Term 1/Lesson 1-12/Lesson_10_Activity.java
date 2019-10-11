
/*
 * Lesson 10 Coding Activity Question 1
 * 
 * The following calculation will give roundoff error:
 *      double x = 1.473;
 *      System.out.println(2 - x);
 * 
 * Write the code to correct it. You can assume no more than 3 decimal places will be used.
 * 
 * Sample run:
 * 
 *      Please enter two decimal values:
 *      2
 *      1.473
 *     
 *      The difference is: 0.527
 * 
 * Use this starter file as your template.
 * 
*/

import java.util.Scanner;

class Lesson_10_Activity {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Double[] data = new Double[2];

        data[0] = input.nextDouble();
        data[1] = input.nextDouble();

        System.out.println((double) ((int) (data[0] * 100000) - (int) (data[1] * 100000)) / 100000);
        input.close();
    }
}