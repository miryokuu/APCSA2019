/*
 * Lesson 11 Coding Activity 3
 * Get two integers from the keyboard and test if they are equal.
 * If they are, print "YES" (without the quotes).
*/

import java.util.Scanner;

class Lesson_11_Activity_Three {   
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        if (input.nextInt() == input.nextInt())
        {
            System.out.println("YES");
        }
        input.close();
    }
}