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
        int biggestNum = Integer.MIN_VALUE, smallestNum = Integer.MAX_VALUE, totalNum = 0, arrLen = input.nextInt();
        Integer[] dataArray = new Integer[arrLen];
        boolean diffMode = true, pDiffMode, diffmodeConst = true;

        for (int i = 0; i < arrLen; i++)
        {
            dataArray[i] = input.nextInt();
            totalNum += dataArray[i];
            biggestNum = biggestNum < dataArray[i] ? dataArray[i] : biggestNum;
            smallestNum = smallestNum > dataArray[i] ? dataArray[i] : smallestNum;
            
            if(i > 0)
            {    
                diffMode = 0 < (dataArray[i] - dataArray[i-1]); 
                pDiffMode = diffMode == pDiffMode;
            }
            
        }

        System.out.println(
                String.format(
                        "Your array is %s\r\nThe average is %f\r\nThe range is %f\r\nThe array is %s",
                        dataArray.toString().replace("[", "{").replace("]", "}"), totalNum / arrLen,
                        biggestNum - smallestNum, diffmodeConst ? diffMode ? "increasing" : "decreasing" : "unsorted"

                )

        );

        input.close();
    }
}
