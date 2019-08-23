import java.util.Scanner;

/*
 * Rename this class to Main!
 */
public class Assignment2 {
	public static final int YEAR_LEN = 31104000;
	public static final int MONTH_LEN = 2592000;
	public static final int DAY_LEN = 86400;
	public static final int HOUR_LEN = 3600;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long epochtime, year;		// if this is an integer this will break in 19 years.
		// https://en.wikipedia.org/wiki/Year_2038_problem
		int month, day, hour, min, seconds;

		System.out.println("Seconds Since Unix Epoch:");
		epochtime = input.nextLong();
		
		year = epochtime / YEAR_LEN;
		month = (int)(epochtime % YEAR_LEN) / MONTH_LEN;
		day = (int)(epochtime % MONTH_LEN) / DAY_LEN;
		hour = (int)(epochtime % DAY_LEN) / HOUR_LEN;
		min = (int)(epochtime % HOUR_LEN) / 60;
		seconds = (int)(epochtime % 60);
		
		System.out.println(String.format("Year: %d\nMonth: %d\nDay: %d\nHour: %d\nMin: %d\nSec: %d", 1970 + year, month, day, hour, min, seconds));
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