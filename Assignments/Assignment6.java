import java.util.Arrays;
import java.util.Scanner;

/*
 * Rename this class to Main!
 */
public class Assignment6 {
    public static int numgen(int max, int offset)
    {
        return (int) (Math.random() * max) + offset;
    }

    public static Integer[] generateArray(int length) 
    {
        Integer[] array = new Integer[length];
        
        for (int i = 0; i < length; i++) 
        {
            array[i] = numgen(100,1);
        }
        
        return array;
    }

    public static void main(String[] args)
    {
        int arrayLength = 0;
        Integer[] firstArray, secondArray, thirdArray;
        boolean mode = true;   //  true = first,  false = second
        int index = 0;
        
        while(arrayLength < 10) 
        {
            System.out.println("Enter an array length (must be 10 or greater):");
            arrayLength = new Scanner(System.in).nextInt();
        }
        
        firstArray = generateArray(arrayLength);
        secondArray = generateArray(arrayLength);
        thirdArray = new Integer[arrayLength*2];
        
        for (int i = 0; i < thirdArray.length; i++) 
        {
            thirdArray[i] = mode ? firstArray[index] : secondArray[index];
            
            if(!mode) 
                index++;
            mode = !mode;
        }
        
        System.out.println(String.format("First Array:%s", Arrays.toString(firstArray).replaceAll("(\\[|\\]|,)", " ").replaceAll("  ", " ")));
        System.out.println(String.format("Second Array:%s", Arrays.toString(secondArray).replaceAll("(\\[|\\]|,)", " ").replaceAll("  ", " ")));
        System.out.println(String.format("Merged Array:%s", Arrays.toString(thirdArray).replaceAll("(\\[|\\]|,)", " ").replaceAll("  ", " ")));
    }
    

}
