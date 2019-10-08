/*
 * Lesson 24 Coding Activity 2
 * Use a for loop to print the even numbers between 1 and 50. 
 * Print each number on a new line.
 */

class Lesson_24_Activity_Two {
    public static void main(String[] args)
    {
        for (int num = 1; num <= 50; num++)
        {
            if (num % 2 == 0)
                System.out.println(num + "\n");
        }
    }
}