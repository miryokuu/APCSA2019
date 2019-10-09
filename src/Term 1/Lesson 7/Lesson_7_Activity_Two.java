
/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;

class Lesson_7_Activity_Two {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num, result1, result2, result3;

        num = input.nextInt();

        // if(num > 999 || num < 100) { input.close(); throw new RuntimeException("I
        // said three positive integer.");}
        /*
         * Runtime Error
         * 
         * Exception in thread "main" java.lang.RuntimeException: I said three positive
         * digits. at Lesson_7_Activity_One.main(Main.java:262) at
         * Ideone.assertRegex(Main.java:88) at Ideone.test(Main.java:40) at
         * Ideone.main(Main.java:29)
         * 
         * You lied to me AGAIN you said THREE DIGIT INTEGER
         */
        result1 = (int) (num / 100);
        result2 = (int) ((num % 100) / 10);
        result3 = (num % 10);

        System.out.println(result1 + "\n" + result2 + "\n" + result3);
        System.out.println(result1 + " + " + result2 + " + " + result3 + " = " + (result1 + result2 + result3));
        input.close();
    }
}
