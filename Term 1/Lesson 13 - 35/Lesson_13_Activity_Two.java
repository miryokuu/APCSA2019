
/*
 * Lesson 13 Coding Activity 2 
 * Take input of an integer number from the keyboard and print "passing" 
 * if it's greater than or equal to 60, and print "failing" otherwise.
 */

import java.util.Scanner;

class Lesson_13_Activity_Two {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer num;

        num = input.nextInt();

        System.out.println(num >= 60 ? "passing" : "failing");
        input.close();
    }
}