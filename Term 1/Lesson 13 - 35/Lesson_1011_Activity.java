
/*
 * Lesson 30 1/2 Coding Activity 
 * 
 * For this program you will input an int to represent the octal number 
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */

import java.util.Scanner;

@SuppressWarnings("resource")
class Lesson_1011_Activity {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String octalString = input.nextLine();
        try
        {
            if (octalString.length() > 8)
            {
                throw new NumberFormatException();
            }
            System.out.println(Integer.parseInt(octalString, 8));
        } catch (NumberFormatException error)
        {
            System.out.println("ERROR: Incorrect Octal Format");
        }
        input.close();
    }
}