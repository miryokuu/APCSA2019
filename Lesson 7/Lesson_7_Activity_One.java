
/*
 * Lesson 7 Coding Activity Question 1
 *
 * Input a positive three digit integer. Print out the digits one per line.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

*/

import java.util.Scanner;

class Lesson_7_Activity_One {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;

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
         * You lied to me you said THREE DIGIT INTEGER
         */

        System.out.println((int) (num / 100) + "\n" + (int) ((num % 100) / 10) + "\n" + (num % 10));
        input.close();
    }
}