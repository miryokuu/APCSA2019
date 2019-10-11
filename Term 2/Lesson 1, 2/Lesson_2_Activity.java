import java.util.ArrayList;
import java.util.Scanner;

//  rename to Main!
class T2_Lesson_2_Activity {
    public static void main(String[] args)
    {
        System.out.println("Please enter words, enter STOP to stop the loop.");

        Scanner input = new Scanner(System.in);
        boolean bLoop = true;
        ArrayList<String> dataArray = new ArrayList<String>();

        while (bLoop)
        {
            String tempString = input.nextLine();

            if (tempString.equals("STOP"))
            {
                bLoop = false;
            } else
            {
                dataArray.add(tempString);
            }
        }

        for (String word : dataArray)
        {
            if (word.contains("a"))
            {
                System.out.println(word);
            }
        }

        input.close();
        return;
    }
}