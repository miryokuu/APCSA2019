/**
 *	APCSA Term 2 Lesson 17
 *	@author miryokuu
 */

/**
 * 
 */
public class Lesson_17_Activity {

    /**
     * returns true if the array a is in ascending order and false otherwise.
     * 
     * @param a
     * @return
     */
    public static boolean isSorted(int [] a)
    {
        int tmp = a[0];
        for (int num : a) 
        {
            if(tmp > num)
                return false;
            tmp = num;
        }
        return true;
    }
    
    /**
     * performs a binary search to determine if the value b is stored in a. 
     * If b is found, return the index of b. Otherwise, return -1.
     * 
     * @param a
     * @param b
     * @return index of b
     */
    public static int binarySearch(int [] a, int b) 
    {
        int low = 0, high = a.length - 1;
        if (low <= high) 
        {
            int mid = (low + high) / 2;
            if (a[mid] > b) 
                high = mid-1;
            else if (a[mid] < b)
                low = mid + 1;
            else 
                return mid;
        }
        
        return -1;
    }
    
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // who writes tests amirite?
    }

}
