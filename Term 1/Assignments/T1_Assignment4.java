import java.util.Scanner;

final class T1_Assignment4 {
    public static void main(String[] args)
    {
        System.out.println("Type the message to be shortened");

        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine(), replacedString = "";
        int repeatedCount = 0, vowelCount = 0;

        if (inputString.length() < 10)
        {
            System.out.println("This doesn\'t need shortening!");
            input.close();
            return;
        }

        for (String indexString : inputString.toLowerCase().split(" "))
        {
            String tempString = indexString;
            boolean loop = true;
            int index = 0;

            while (tempString.substring(1).indexOf("a") != -1 || tempString.substring(1)
                    .indexOf("e") != -1 || tempString.substring(1).indexOf("i") != -1
                    || tempString.substring(1).indexOf("o") != -1 || tempString.substring(1).indexOf("u") != -1)
            {
                tempString = tempString.charAt(0) + tempString.substring(1).replaceFirst("([aeiou])", "");
                vowelCount++;
            }

            while (loop && tempString.length() > 1)
            {
                if (tempString.charAt(index) == tempString.charAt(index + 1))
                {
                    tempString = tempString.substring(0, index) + tempString.substring(index + 1);
                    repeatedCount++;
                    index = 0;
                }
                index++;
                loop = index < tempString.length() - 1;
            }

            replacedString += tempString + " ";
        }

        System.out.println(
                String.format(
                        "Shortened message: %s\nRepeated letters removed: %d\nVowels removed: %d\nTotal characters saved: %d",
                        replacedString, repeatedCount, vowelCount, repeatedCount + vowelCount
                )
        );

        input.close();
    }
}
