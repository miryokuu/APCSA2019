
/*
 * Lesson 29 Coding Activity 2
 * Write a loop that processes an array of strings. 
 * Each String should be printed backwards on its own line.
 * 
 * For example, if the list contains:
 *     
 *     {"every", "nearing", "checking", "food", "stand", "value"}
 * 
 * It should output:
 *     yreve
 *     gniraen
 *     gnikcehc
 *     doof
 *     dnats
 *     eulav
 */

class Lesson_29_Activity_Two {

    /*
     * Fill this list with values that will be useful for you to test. A good idea
     * may be to copy/paste the list in the example above. Do not make any changes
     * to this list in your main method. You can print values from list, but do not
     * add or remove values to this variable.
     */
    public static String[] list = {"every", "nearing", "checking", "food", "stand", "value"};

    public static void main(String[] args)
    {
        for (String listWord : list)
        {
            System.out.println(new StringBuilder(listWord).reverse().toString());
        }
    }
    
    /*
     * the way it's supposed to be done - for extra.
     * 
     * they didn't remove StringBuilder megaPog
     */
    public static void alternate_main(String[] args)
    {
        for (String listWord : list)
        {
            String reversed = "";
            for (int i = listWord.length() - 1; i > 0; i--) 
            {
                reversed += listWord.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}