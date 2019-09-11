import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	String inputString = input.nextLine(), replacedString = "";
    	String[] splitString = replacedString.split(" ");
    	int repeatedCount = 0, vowelCount = 0;
    	
    	if (replacedString.length() < 10) 
    	{
    		System.out.println("This doesn’t need shortening!");
    		input.close();
    		return;
    	}
    	
    	for(String indexString : splitString) {
    		// replace duplicates
    		for () 
    		{
    			// nested for loops are nightmare but i'm lazy to think of better way
    		}
    		replacedString += indexString;
    	}
    	
    	while (replacedString.toLowerCase().indexOf("a") != -1 || replacedString.toLowerCase().indexOf("e") != -1 ||
    			replacedString.toLowerCase().indexOf("i") != -1 || replacedString.toLowerCase().indexOf("o") != -1 ||
    			replacedString.toLowerCase().indexOf("u") != -1) 
    	{
    		replacedString = replacedString.replaceFirst("([a,e,i,o,u])", "");
    		vowelCount++;
    	}
    	
    	System.out.println(String.format("Repeated letters removed: %d\nVowels removed: %d\nTotal characters saved: %d", 
    			repeatedCount, vowelCount, repeatedCount+vowelCount));
    	
    	input.close();
    }
}
