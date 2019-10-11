/*
 * Lesson 33 Coding Activity 2
 * 
 * For the Lesson 33 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 *  
 * For questions 2-5, you may want to start with the printIt method 
 * and use it to test the other three.
 *  
 * Write a method that takes an array of ints and stores random numbers
 * between 10 and 99 in the array. Use Math.random() to generate
 * random numbers and convert them to integers between 10 and 99 inclusive.
 * 
 * This method must be called randomize() and it must take an int[] parameter. 
 * 
 */

class Lesson_33_Activity_Two {
    protected static int numgen(int max, int offset)
    {
        return (int) (Math.random() * max) + offset;
    }

    public static void randomize(int[] inInt)
    {
        for (int i = 0; i < inInt.length; i++)
        {
            inInt[i] = numgen(10, 100);
        }
    }

    public static void main(String[] args)
    {
        // i don't write tests
    }
}