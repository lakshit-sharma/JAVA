/* Write a JAVA program to detect whether a number entered by the user is integer or not.*/

import java.util.Scanner;

public class CheckInteger {

	public static void main(String[] args) {
		Scanner dc = new Scanner(System.in);
		System.out.println("Enter the number");
		System.out.println(dc.hasNextInt());
		dc.close();
	}
}
