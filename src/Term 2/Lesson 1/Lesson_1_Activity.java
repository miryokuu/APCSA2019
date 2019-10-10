import java.util.ArrayList;
import java.util.Scanner;

//  rename to Main!
class T2_Lesson_1_Activity {
    public static void main(String[] args)
    {
        System.out.println("Please enter words, enter STOP to stop the loop.");
        
        Scanner input = new Scanner(System.in);
        boolean bLoop = true;
        ArrayList<String> dataArray = new ArrayList<String>();
        
        while (bLoop) 
        {
            String tempString = input.nextLine();
            
            if(tempString.equals("STOP")) 
            {
                bLoop = false;
            }
            else 
            {
                dataArray.add(tempString);
            }
        }
        
        System.out.println(
                String.format("%d\n%s\n", 
                        dataArray.size(), 
                        dataArray.toString()
                        )
                );
        
        if (dataArray.size() > 2)
        {
            dataArray.remove(dataArray.size() - 1);
            dataArray.remove(0);    
        }
        
        System.out.println(dataArray.toString());
        input.close();
        return;
    }
}