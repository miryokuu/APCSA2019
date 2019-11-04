/**
 *	APCSA Term 2 Assignment 5 Game Wheel Main class.
 *	@author miryokuu
 */

/**
 * this should be renamed to Main.
 */
public class GameWheel_Main {

    /**
     * When run, the main method in this class will simulate a game in which a game wheel is spun three times 
     * and the results are used to calculate a total prize. 
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        GameWheel g_Wheel = new GameWheel();
        Slice[] spins = {g_Wheel.spinWheel(), g_Wheel.spinWheel(), g_Wheel.spinWheel()};
        String spinStr = "";
        boolean duplicate = true;
        int total = 0;
        
        for(int i = 0; i < spins.length; i++) 
        {
            total += spins[i].getPrizeAmount();
            spinStr += String.format("Spin %d - %s\n", i + 1, spins[i].toString());
            if (i > 0)
                duplicate = duplicate && spins[i].getColor().equals(spins[i - 1].getColor());
        }

        System.out.println(
                String.format("Total prize money: $%s\n\n%s\n%s",
                        String.valueOf(total *= duplicate ? 2 : 1),
                        spinStr,
                        duplicate ? "Three "+ spins[0].getColor() + "s = double your money!" : ""
                        )
                );
    }

}
