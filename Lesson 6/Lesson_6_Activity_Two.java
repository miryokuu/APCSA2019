/*
 * Lesson 6 Coding Activity Question 2
 *
 * Input a double value and print only the integer part.
 *
 * Sample run:
 
Please input a decimal number:
57.8934
Answer: 57

*/

import java.util.Scanner;

class Lesson_6_Activity_Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double in = 0;
        
        in += input.nextDouble();
        
        System.out.println(String.format("Answer %d", (int)in));
        input.close();
    }
}