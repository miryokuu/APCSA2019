import java.util.Scanner;

/*
 * Rename this class to Main!
 */
public class Assignment2 {
	public static final int YEAR_LENGTH = 31104000;
	public static final int MONTH_LEN = 2592000;
	public static final int DAY_LEN = 86400;
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long epochtime, year;		// if this is an int this will break in 19 years
		// https://en.wikipedia.org/wiki/Year_2038_problem
		int month, day, hour, min, seconds;

		epochtime = input.nextLong();
		
		year = epochtime / YEAR_LENGTH;
		month = (int)((epochtime - (year * YEAR_LENGTH)) / MONTH_LEN);
		seconds = (int)(epochtime % 60);
		
		System.out.println(String.format("%d %d %d", year, month, seconds));
	}
}


/*

Seconds Since Unix Epoch:
999999999

Year: 2002
Month: 1
Day: 24
Hour: 1
Min: 46
Sec: 39

*/