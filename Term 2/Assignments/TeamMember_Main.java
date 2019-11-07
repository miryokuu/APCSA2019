import java.util.ArrayList;
import java.util.Scanner;

/**
 *	APCSA Term 2 Assignment 6 TeamMember Main
 *	@author miryokuu
 */

/**
 * 
 */
public class TeamMember_Main {

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<TeamMember> list = new ArrayList<TeamMember>();
        System.out.println("Enter the next name:");
        String in = input.nextLine();
        
        while(!in.toUpperCase().equals("STOP")) 
        {
            System.out.println("Enter the next ID:");
            TeamMember addi = new TeamMember(in, input.nextLine());
            
            int index = 0;
            
            for(int i = 0; i < list.size(); ++i) 
            {
                if (list.get(i).compareTo(addi) <= 0) 
                    index = i + 1;
            }
            
            list.add(index, addi);
            
            System.out.println("Enter the next name:");
            in = input.nextLine();
        }
        
        
        System.out.println(list.toString());
        input.close();
        
    }

}
