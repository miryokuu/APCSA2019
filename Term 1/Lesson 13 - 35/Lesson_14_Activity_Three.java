
/*
 * Lesson 14 Coding Activity 3
 * The Internet runs on web addresses.The addresses we type represent the IP address 
 * for each site and how the computer finds an individual web page.
 *
 * IP addresses are made up of four numbers, each between 0 and 255 separated by a period. 
 * For example, 128.253.21.58 is an IP address.
 * 
 * Write a program to enter four numbers and test if they make up a valid IP address.
 * In other words, test to see if the numbers entered are between 0 and 255 inclusive.
 * 
 *     Sample Run 1
 *         Please enter the first octet:
 *         898
 *         Please enter the second octet:
 *         34
 *         Please enter the third octet:
 *         712
 *         Please enter the fourth octet:
 *         45
 *         Octet 1 is incorrect
 *         Octet 3 is incorrect
 * 
 *         
 *      Sample Run 2
 *         Please enter the first octet:
 *         112
 *         Please enter the second octet:
 *         200
 *         Please enter the third octet:
 *         0
 *         Please enter the fourth octet:
 *         254
 *         IP Address: 112.200.0.254
 * 
 */

import java.util.Scanner;

class Lesson_14_Activity_Three {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer[] ip = new Integer[4];
        String ipString = "IP Address: ";
        boolean invalid = false;

        ip[0] = input.nextInt();
        ip[1] = input.nextInt();
        ip[2] = input.nextInt();
        ip[3] = input.nextInt();

        for (int loop = 0; loop < ip.length; loop++)
        {
            ipString += loop == 3 ? ip[loop].toString() : ip[loop].toString() + ".";
            if (ip[loop] > 255 || ip[loop] < 0)
            {
                invalid = true;
                System.out.println(String.format("Octet %d is incorrect", loop + 1));
            }
        }

        System.out.println(invalid ? null : ipString);
        input.close();
    }
}