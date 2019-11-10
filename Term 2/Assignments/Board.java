/**
 *  APCSA Term 2 Assignment 7 Battleship Board
 */
public class Board {
    
    private char[][] squares;

    /**
     * This constructor initializes the squares array with every value set to ‘-’, 
     * which is the character used to represent a blank square.
     */
    Board()
    {
        squares = new char[10][10];
        
        for(int r = 0; r < squares.length; ++r) 
        {
            for(int i = 0; i < squares[r].length; ++i) 
            {
                squares[r][i] = '-';
            }
        }
    }
    
    /**
     *  Returns a multi-line representation of the board by printing each character in squares with spaces 
     *  after each character and a new line for each row.
     */
    @Override
    public String toString()
    {
        String returnstr = "";
        for (char[] row : squares) 
        {
            for (char ch : row) 
            {
                returnstr += String.valueOf(ch) + " ";
            }
            // new row
            returnstr += "\n";
        }
        return returnstr;
    }
    
    /**
     * Attempts to add a ship of length len to the grid, starting at the row and column specified and proceeding either rightwards 
     * (if horizontal is true), or downwards (if vertical is true). 
     * If the ship can be placed in the place specified, each square making up the ship should be set to ‘b’, 
     * and the method should return true. A ship may not be placed if it would go off the grid, 
     * or would intersect another ship on the grid. If the ship cannot be placed, 
     * no values in squares should be changed and the method should return false.
     * 
     * @param row
     * @param col
     * @param len
     * @param horizontal
     * @return bool
     */
    public boolean addShip(int row, int col, int len, boolean horizontal)
    {
        /*
         * checks
         */
        try {
            /*
             * find intersecting and try out-of-bounds 
             */
            for(int i = 0; i < len; ++i) 
            {
                if (squares[row + (horizontal ? 0 : i)][col + (horizontal ? i : 0)] == 'b')
                {
                    // throw exception to return false
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                }
            }
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e) 
        {
            return false;
        }
        
        /*
         * add the ship
         */
        for(int i = 0; i < len; ++i) 
        {
            squares[row + (horizontal ? 0 : i)][col + (horizontal ? i : 0)] = 'b';
        }
        return true;
    }

    /**
     * If row and col specify a square which is out of bounds, the method should return -1. 
     * If the square at the specified row and column contains ‘-’ (i.e. is blank), 
     * the square should be changed to ‘m’ to signify a miss, and the method should return 0. 
     * If the square contains ‘b’ (i.e. a battleship which hasn’t been hit yet) 
     * this square should be changed to an ‘x’ to signify a hit, and the method should return 1. 
     * If the square contains either ‘x’ or ‘m’ the method should return 2 (these are squares which have already been “shot”).
     * 
     * @param row
     * @param col
     * @return -1 | 0 | 1 | 2
     */
    public int shoot(int row, int col)
    {
        try {
            if(squares[row][col] == '-') 
            {
                //  empty
                squares[row][col] = 'm';
                return 0;
            }
            else if(squares[row][col] == 'b') 
            {
                // ship exists
                squares[row][col] = 'x';
                return 1;
            }
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e) 
        {
            //  out of grid
            return -1;
        }
        
        //  no conditions match means we already shot
        return 2;
    }    

    /**
     *  If the character ‘b’ does not appear at any location in squares, 
     *  then there are no unsunk ships remaining on the board, 
     *  so return true to indicate that the game is over. 
     *  Otherwise return false.
     * 
     * @return bool
     */
    public boolean gameOver()
    {
        for (char[] row : squares) 
        {
            for (char c : row) 
            {
                if(c == 'b')
                    return false;
            }
        }
        return true;
    }

    /**
     * Search the board for any possible ships of length len. If there are exactly len consecutive squares (either horizontal or vertical) 
     * containing a ‘b’ character somewhere in the grid, then return true, otherwise, return false.
     * 
     * @param len
     * @return
     */
    public boolean foundShip(int len) 
    {
        /*
         * find horizontal 
         */
        for (char[] row : squares) 
        {
            int iShipLen = 0;
            
            for(int i = 0; i < row.length; ++i) 
            {
                if (row[i] == 'b')
                    ++iShipLen;
                else if (iShipLen > 0 && row[i] != 'b')
                    iShipLen = 0;
                if(iShipLen == len && i + 1 < row.length && row[i + 1] != 'b') 
                    return true;
            }
        }
        
        /*
         * find vertical 
         */
        for(int iHorizontalRow = 0; iHorizontalRow < squares[0].length; ++iHorizontalRow) 
        {
            int iShipLen = 0;
            for(int iVerticalRow = 0; iVerticalRow < squares.length; ++iVerticalRow) 
            {
                if(squares[iVerticalRow][iHorizontalRow] == 'b') 
                    ++iShipLen;
                else if (iShipLen > 0 && squares[iVerticalRow][iHorizontalRow] != 'b') 
                    iShipLen = 0;
                if(iShipLen == len && iVerticalRow + 1 < squares.length && squares[iVerticalRow + 1][iHorizontalRow] != 'b')
                    return true;
            }
        }
        return false;
    }
}
