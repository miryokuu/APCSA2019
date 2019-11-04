/**
 *	APCSA Term 2 Lesson 17
 *	@author miryokuu
 */

/**
 * 
 */
public class Lesson_15_Activity {
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
        sortAndPrint(list);
    }
    
    public static void sortAndPrint(String [] list) 
    {
        String lowestStr = "";
        int lowestIndex = 0;

        for (int i = 0; i < list.length; i++) {
            lowestStr = list[i];
            lowestIndex = i;
            for (int j = i; j < list.length; j++) {
                if (list[j].compareTo(lowestStr) < 0) {
                    lowestIndex = j;
                    lowestStr = list[j];
                }
            }
            list[lowestIndex] = list[i];
            list[i] = lowestStr;
        }
        
        for(String str : list) {System.out.print(str+" ");}
        
    }

}
