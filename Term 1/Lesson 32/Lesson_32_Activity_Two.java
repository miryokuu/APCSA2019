
/*
* Lesson 32 Coding Activity 2
* 
* For the Lesson 32 activities, you will be asked to write one or more methods.
* Use the template to write a main method that tests each of your methods, 
* then paste everything into the code runner box. Your submission should 
* begin with the first import statement and end with the final }.
* 
* Write a method that takes a parameter for the number of a month 
* and prints the number of days in the month. Assume that February 
* will always have 28 days for this activity. 
* 
* This method must be called monthDays()and it must take a integer parameter. 
* 
* Calling monthDays(2) would print 28 and monthDays(9) would print 30.
* 
*/

import java.util.Arrays;

class Lesson_32_Activity_Two {
    public static void monthDays(int nMonth)
    {
        if (nMonth == 2)
        {
            System.out.println(28);
            return;
        } else if (Arrays.binarySearch(new int[] { 1, 3, 5, 7, 8, 10, 12 }, nMonth) >= 0)
        {
            System.out.println(31);
            return;
        } else
        {
            System.out.println(30);
            return;
        }
    }

    public static void main(String[] args)
    {
        monthDays(1);
        monthDays(2);
        monthDays(4);
    }
}
