/*
 * Lesson 13 Coding Activity 1 
 * Take input of an integer number from the keyboard 
 * and print "Positive" if it's positive or zero, and print "Negative" otherwise.
 */


import java.util.Scanner;

class Lesson_13_Activity_One {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer num;
        
        num = input.nextInt();
        
        System.out.println(num >= 0 ? "Positive" : "Negative");
        input.close();
    }
}