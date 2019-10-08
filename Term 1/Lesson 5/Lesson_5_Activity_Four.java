
/*
 * Lesson 5 Coding Activity Question 4
 * 
 * Ask the user to enter the price of an item and tell them 
 * how much money they would get back from $20. It's okay to 
 * return a negative number. Also, Don't forget to include the dollar sign.
 *
 * Sample Run:

Enter a price:
3.50
Change from $20: $16.5

*/

import java.util.Scanner;

class Lesson_5_Activity_Four {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float money = input.nextFloat();

        System.out.println(String.format("Change from $20: $%.2f", 20 - money));
        input.close();

    }
}