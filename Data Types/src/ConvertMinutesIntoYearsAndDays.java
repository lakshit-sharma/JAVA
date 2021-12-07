//Write a Java program to convert minutes into a number of years and days

import java.util.Scanner;

public class ConvertMinutesIntoYearsAndDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double minuteInYear = 60 * 24 *365;
		System.out.println("Enter minutes - ");
		double min = sc.nextDouble();
		long year = (long)(min/minuteInYear);
		int days = (int)(min /60/24) % 365;
		
        System.out.println((int) min + " minutes is approximately " + year + " years and " + days + " days");
		
        
        sc.close();
	}

}
