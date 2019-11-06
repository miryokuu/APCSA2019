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
        String in = input.nextLine();
        
        while(!in.equals("STOP")) 
        {
            list.add(new TeamMember(in, input.nextLine()));
            in = input.nextLine();
        }
        
        
    }

}
