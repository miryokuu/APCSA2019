import java.util.Arrays;
import java.util.Scanner;

/*
 * Milestone 1: Set up program which asks user for array length (integer value), outputs 
 * correct message if this is non-positive, and creates an array of that length if it is positive.
 * 
 * Milestone 2: Write code to ask user to enter a new number for each element of the array and 
 * enters these values into the array.
 * 
 * Milestone 3: Write code to sum the values of the array and calculate maximum and minimum values of array.
 * 
 * Milestone 4: Write code to determine if the array is sorted in increasing/decreasing order and display message if true.
 */

final class Assignment5 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Double biggestNum = -Double.MAX_VALUE, smallestNum = Double.MAX_VALUE, totalNum = 0.0d, diff;
        //  today I've learned that MIN_VALUE is not double's minimum value it's the smallest nonzero value (magnitude)
        //  why
        int arrLen = input.nextInt();

        if (arrLen < 1)
        {
            System.out.print("Not a valid length!");
            input.close();
            return;
        }

        Double[] dataArray = new Double[arrLen];
        boolean diffMode = true, diffmodeConst = true;

        for (int i = 0; i < arrLen; i++)
        {
            dataArray[i] = input.nextDouble();
            totalNum += dataArray[i];
            biggestNum = biggestNum < dataArray[i] ? dataArray[i] : biggestNum;
            smallestNum = smallestNum > dataArray[i] ? dataArray[i] : smallestNum;

            if (i > 1)
            {
                diff = dataArray[i] - dataArray[i - 1];
                diffmodeConst = diffmodeConst ? (0 <= diff) == diffMode : false;
            } else if (i == 1)
                diffMode = 0 <= (dataArray[i] - dataArray[i - 1]);

        }

        

        System.out.println(
                String.format(
                        "Your array is %s\r\nThe average is %s\r\nThe range is %s\r\nThe array is %s", Arrays.toString(
                                dataArray
                        ).replace("[", "{").replace("]", "}"), Double.toString(totalNum / arrLen), Double.toString(
                                biggestNum - smallestNum
                        ),
                        diffmodeConst ? diffMode ? "sorted in increasing order" : "sorted in decreasing order"
                                : "unsorted"
                )
        );

        input.close();
    }
}
