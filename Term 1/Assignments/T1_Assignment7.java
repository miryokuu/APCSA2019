import java.util.Scanner;
import java.lang.Math;

public class T1_Assignment7 {

    public static String duplicate(String str)
    {
        String[] strArray = str.split("");
        String finalString = "";

        for (String st : strArray)
        {
            for (int i = 0; i < (strArray.length % 2 == 0 ? strArray.length * 2 : strArray.length); i++)
            {
                finalString += st;
            }
        }

        return finalString;
    }

    public static boolean isEdhesivePalindrome(String str)
    {
        if (str.length() < 3 || str.length() > 15)
            return false;

        // String reversing- see Lesson 29 Activity Two on how this really wants us to
        // solve it.
        return str
                .equals(new StringBuilder(str.toLowerCase().replace("a", "4").replace("e", "3").replace("o", "0")).reverse().toString());
    }

    public static double numberScramble(double num)
    {
        if (num < 0)
            return 0.d;

        return Math.sqrt((num + 5.d) / 2.d);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
        System.out.println(String.format("The duplicated String is: %s", duplicate(input.nextLine())));

        System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
        System.out.println(
                isEdhesivePalindrome(input.nextLine()) ? "Nice, you found an Edhesive Palindrome!" : "Too bad, that isn't an Edhesive Palindrome."
        );

        System.out.println("Almost done! Please enter a number to scramble.");
        System.out.println(String.format("The scrambled number is: %.1f", numberScramble(input.nextDouble())));

        input.close();
    }

}
