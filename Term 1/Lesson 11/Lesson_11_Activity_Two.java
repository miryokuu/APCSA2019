
/*
 * Lesson 11 Coding Activity 2
 * Test if a decimal value input from the keyboard is equal to 48.729.
 * If it is, print "YES" (without the quotes).
*/

import java.util.Scanner;

class Lesson_11_Activity_Two {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        if (input.nextDouble() == 48.729)
        {
            System.out.println("YES");
        }
        input.close();
    }
}