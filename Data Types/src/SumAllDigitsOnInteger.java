import java.util.Scanner;

//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

public class SumAllDigitsOnInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input an integer between 0 and 1000: ");
		int num = sc.nextInt();
		int firstInteger = num%10;
		int remainsInteger = num/10;
		int secondInteger = remainsInteger% 10;
		remainsInteger = remainsInteger/10;
		int thirdInteger = remainsInteger%10;
		remainsInteger =  remainsInteger/10;
		int fourthInteger = remainsInteger%10;
		
		int sum = firstInteger+secondInteger+thirdInteger+fourthInteger;
		System.out.println("The sum of all digits - "+sum);

		
		sc.close();
	}

}
