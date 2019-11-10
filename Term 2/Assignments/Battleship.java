/* Term 2 Assignment 7 - Battleship */

/* Main Battleship class -
 * requires Board class to be written 
 */
import java.util.Scanner;

public class Battleship {
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        // Set up board and print welcome
        Board b = new Board();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Battleship!\n");
        System.out.println(b + "\n");
        boolean addNew = true;

        while (addNew)
        {
            // Ask for new ship
            System.out.println("Add a new ship? (y/n)");
            String ans = scan.nextLine();
            if (ans.toLowerCase().equals("y"))
            {
                // Get parameters for new ship
                System.out.println("Starting in which row?");
                int r = scan.nextInt();
                System.out.println("Starting in which column?");
                int c = scan.nextInt();
                System.out.println("How long?");
                int l = scan.nextInt();
                scan.nextLine();
                System.out.println("Horizontal (h) or vertical (v)?");
                String d = scan.nextLine();
                boolean h = (d.toLowerCase().equals("h"));

                // Call addShip method and return message based on true/false value
                if (b.addShip(r, c, l, h))
                {
                    System.out.println("\nNew ship added!\n\n" + b + "\n");
                } else
                    System.out.println("\nCan't put a ship there!\n");
            } else
            {
                addNew = false;
                System.out.println("\nOk, let's play!\n");
            }
        }

        // As long as ships remain, play game
        while (!b.gameOver())
        {   
            // Get row and column to shoot
            System.out.println("Input row");
            int r = scan.nextInt();
            System.out.println("Input column");
            int c = scan.nextInt();

            // Perform shot and store result
            int result = b.shoot(r, c);

            // Choose message based on result
            if (result == 1)
                System.out.println("\nHit!\n\n" + b + "\n");
            else if (result == 0)
                System.out.println("\nMiss!\n\n" + b + "\n");
            else if (result == 2)
                System.out.println("\nYou already tried that\n");
            else
                System.out.println("\nInvalid coordinates\n");
        }
        System.out.println("Game over!");
    }
}