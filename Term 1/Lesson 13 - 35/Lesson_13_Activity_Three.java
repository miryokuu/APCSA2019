
/*
 * Lesson 13 Coding Activity 3 
 * Input two integers and print the largest. If they are equal print "EQUAL". 
 * You should be able to do this with only one if statement but you may use multiple else statements.
 */

import java.util.Scanner;

class Lesson_13_Activity_Three {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer firstInput, secondInput;

        firstInput = input.nextInt();
        secondInput = input.nextInt();

        System.out.println(firstInput == secondInput ? "EQUAL" : firstInput > secondInput ? firstInput : secondInput);
        input.close();
    }
}