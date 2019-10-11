
/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */

import java.util.Scanner;

class Lesson_13_Activity_Five {
    public static int numgen(int max)
    {
        return (int) (Math.random() * max);
    }

    public static int numgen(int max, int offset)
    {
        return (int) (Math.random() * max) + offset;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer firstNum = numgen(12, 1), SecondNum = numgen(12, 1);

        System.out.println(input.nextInt() == (firstNum * SecondNum) ? "Correct!" : "Wrong");
        input.close();
    }
}