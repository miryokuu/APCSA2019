/*
 * Lesson 33 Coding Activity 3
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 *  
 * Write a method that takes an array of ints and prints the array on a 
 * single line. Print one space between each number.
 * 
 * This method must be called printit() and it must take an int[] parameter.
 */

class Lesson_33_Activity_Three {

    public static void printit(int[] inInt)
    {
        for (int num : inInt)
        {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args)
    {
        // no
    }
}