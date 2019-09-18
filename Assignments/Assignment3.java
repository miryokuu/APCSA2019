import java.util.Scanner;

class WrongAnswer extends java.lang.Exception {
    /**
     * random generated
     */
    private static final long serialVersionUID = 9042451774593630116L;

    WrongAnswer(String message)
    {
        super(message);
    }
}

/*
 * Rename this class to Main!
 */
public final class Assignment3 {
    /**
     * god i'm lazy
     * 
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int buffer;

        System.out.println("Welcome. What is your name?");
        System.out.println("Hello " + input.nextLine() + ". Try your best to crack the code!");

        try
        {
            System.out.println("PHASE 1\nEnter a number:");
            if (input.nextInt() != 3)
            {
                throw new WrongAnswer("phase 1 wrong");
            }

            System.out.println("Correct!\n\nPHASE 2\r\nEnter a number:");
            buffer = input.nextInt();
            if (!(buffer == 1 || (buffer >= 33 && buffer <= 100)))
            {
                throw new WrongAnswer("phase 2 wrong");
            }

            System.out.println("Correct!\n\nPHASE 3\r\nEnter a number:");
            buffer = input.nextInt();
            if (!(buffer > 0 && (buffer % 3 == 0 || buffer % 7 == 0)))
            {
                throw new WrongAnswer("phase 3 wrong");
            }
            System.out.println("Correct!\nYou have cracked the code!");

        } catch (WrongAnswer error)
        {
            System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
        }

        input.close();
    }
}
