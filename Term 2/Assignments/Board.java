/**
 *  APCSA Term 2 Assignment 7 Battleship Board
 */
public class Board {
    
    private char[][] squares;

    Board()
    {
        
    }
    
    /**
     *  Returns a multi-line representation of the board by printing each character in squares with spaces 
     *  after each character and a new line for each row.
     * 
     */
    @Override
    public String toString()
    {
        String returnstr = "";
        for (char[] row : squares ) 
        {
            for (char ch : row) 
            {
                returnstr += String.valueOf(ch) + " ";
            }
            returnstr += "\n";
        }
        return returnstr;
    }
    
    public boolean addShip(int row, int col, int len, boolean horizontal)
    {
        /*
         * checks
         */
        try {
            squares[row + (horizontal ? len : 0)][col + (horizontal ? 0 : len)] = 'x';
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e) 
        {
            return false;
        }
        
        for(int i = 0; i <= len; ++i) 
        {
            squares[row + (horizontal ? i : 0)][col + (horizontal ? 0 : i)] = 'x';
        }
        return true;
    }

    public int shoot(int row, int col)
    {
        // TODO Auto-generated method stub
        return 0;
    }    

    public boolean gameOver()
    {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean foundShip(int len) 
    {
        return false;
    }



}
