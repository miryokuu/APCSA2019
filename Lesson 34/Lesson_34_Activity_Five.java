/*
 * Lesson 34 Coding Activity 5
 * 
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 *  
 * Write a method that takes an array of ints
 * and returns a sum of only the even values.
 * 
 *     public static int sumEven(int [] a)
 * 
 * For example, sumEven(a) would return 6 if a = {1, 2, 3, 4, 5}.
 */

class Lesson_34_Activity_Five {

    public static int sumEven(int[] a)
    {
        int out = 0;
        for(int num : a)
        {
            out += num % 2 == 0 ? num : 0;
        }
        return out;
    }

    public static void main(String[] args)
    {
        /*
         * Test your method here
         */
    }
}