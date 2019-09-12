import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	String inputString = input.nextLine(), replacedString = "";
    	int repeatedCount = 0, vowelCount = 0;
    	
    	if (inputString.length() < 10) 
    	{
    		System.out.println("This doesn’t need shortening!");
    		input.close();
    		return;
    	}
    	
    	System.out.println(String.format("%s\nRepeated letters removed: %d\nVowels removed: %d\nTotal characters saved: %d", 
    			replacedString, repeatedCount, vowelCount, repeatedCount+vowelCount));
    	
    	input.close();
    }
}
