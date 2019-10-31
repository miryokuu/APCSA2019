import java.util.ArrayList;

/**
 * APCSA Term 2 Assignment 3 UltimateTeam Class
 * 
 * @author miryokuu
 */
public class UltimateTeam {
    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    /**
     * A constructor that specifies the coaches and players of the team.
     * 
     * @param players
     * @param coaches
     */
    UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches)
    {
        this.players = players;
        this.coaches = coaches;
    }

    /**
     * Returns a String listing all the UltimateTeams's UltimatePlayers that have
     * the position of “cutter”. Returns an empty String if the UltimateTeam does
     * not have a player with the position of “cutter”. See the Sample Run below for
     * the format of the returned String.
     * 
     * @return String
     */
    public String getCutters()
    {
        String returnStr = "";
        for (UltimatePlayer p : players)
        {
            if (p.getPosition().equals("cutter"))
            {
                returnStr += p.toString() + "\n";
            }
        }
        return returnStr;
    }

    /**
     * Returns a String listing all the UltimateTeams's UltimatePlayers that have
     * the position of “handler”. Returns an empty String if the UltimateTeam does
     * not have a player with the position of “handler”. See the Sample Run below
     * for the format of the returned String.
     * 
     * @retun String
     */
    public String getHandlers()
    {
        String returnStr = "";
        for (UltimatePlayer p : players)
        {
            if (p.getPosition().equals("handler"))
            {
                returnStr += p.toString() + "\n";
            }
        }
        return returnStr;
    }

    /**
     * Returns a multiline String listing the Coaches and UltimatePlayers on the
     * UltimateTeam. The String is formatted as follows:
     * 
     * COACHES {listing of faculty}
     * 
     * PLAYERS {listing of UltimatePlayers}
     * 
     * @return String
     */
    @Override
    public String toString()
    {
        String playerStr = "", coachStr = "";
        for (UltimatePlayer p : players)
        {
            playerStr += p.toString() + "\n";
        }

        for (Coach c : coaches)
        {
            coachStr += c.toString() + "\n";
        }

        return String.format("COACHES\n%s\nPLAYERS\n%s", coachStr, playerStr);
    }

}
