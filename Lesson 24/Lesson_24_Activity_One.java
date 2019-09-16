/*
 * Lesson 24 Coding Activity 1
 * Use a for loop to print all of the numbers from 23 to 89, with 10 numbers on each line. 
 * Print one space between each number.
 */

class Lesson_24_Activity_One {
    public static void main(String[] args)
    {
        String payload = "";

        for (int num = 23; num < 90; num++)
        {
            if (payload.split(" ").length >= 10)
            {
                System.out.println(payload);
                payload = "";
            }
            payload = payload + num + " ";
        }
        System.out.println(payload);
    }
}