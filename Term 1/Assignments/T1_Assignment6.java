import java.util.Arrays;
import java.util.Scanner;

/*
 * Rename this class to Main!
 */
public class T1_Assignment6 {
    public static int numgen(int max, int offset)
    {
        return (int) (Math.random() * max) + offset;
    }

    public static Integer[] generateArray(int length)
    {
        Integer[] array = new Integer[length];

        for (int i = 0; i < length; i++)
        {
            array[i] = numgen(100, 1);
        }

        return array;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer[] firstArray, secondArray, thirdArray;
        boolean mode = true; // true = first, false = second
        int index = 0, arrayLength = 0;

        while (arrayLength < 10)
        {
            System.out.println("Enter an array length (must be 10 or greater):");
            arrayLength = input.nextInt();
            // arrayLength = new Scanner(System.in).nextInt();
            // this breaks the test data validation. i have no clue why.
        }

        input.close();

        firstArray = generateArray(arrayLength);
        secondArray = generateArray(arrayLength);
        thirdArray = new Integer[arrayLength * 2];

        /*
         * this is disgusting
         */
        for (int i = 0; i < thirdArray.length && index < arrayLength; i++)
        {
            boolean duplicate = false;
            int numPending = mode ? firstArray[index] : secondArray[index];
            for (int in = 0; in < thirdArray.length; in++)
            {
                if (thirdArray[in] != null && thirdArray[in] == numPending)
                {
                    duplicate = true;
                }
            }

            if (!duplicate)
            {
                thirdArray[i] = numPending;
            } else
            {
                i--;
            }

            if (!mode)
                index++;
            mode = !mode;
        }

        String finalString = Arrays.toString(thirdArray).replaceAll("(\\[|\\]|,)", " ").replaceAll("  ", " ");

        System.out.println(
                String.format("First Array:%s", Arrays.toString(firstArray).replaceAll("(\\[|\\]|,)", " ").replaceAll("  ", " "))
        );
        System.out.println(
                String.format("Second Array:%s", Arrays.toString(secondArray).replaceAll("(\\[|\\]|,)", " ").replaceAll("  ", " "))
        );
        System.out.println(String.format("Merged Array:%s", finalString.substring(0, finalString.indexOf("n"))));
    }

}
