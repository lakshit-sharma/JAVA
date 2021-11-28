import java.util.Scanner;

/*Write a java program to find the range of the entered value.

a)If the entered value is greater than 0 and less than or equal to 100 then display "Range of the number <number> is 0 to 100"

b)If the entered value is greater than 100 and less than or equal to 200 then display "Range of the number <number> is 100 to 200"

c)If the entered value is greater than 200 and less than or equal to 500 then display "Range of the number <number> is 200 to 500"

If the given number is not in the above list then display "Entered number <number> is not in the expected range".*/

public class findRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		if (number < 0 ) {
			System.out.println("Range of the number "+number+" is not in expected range");
		}
		else if (number <= 100){
			System.out.println("Range of the number "+ number+ " is 0 to 100");
		}
		else if (number <= 200){
			System.out.println("Range of the number "+ number+" is 100 to 200");
		}
		else if (number <= 500){
			System.out.println("Range if the number "+number+ " is 200 to 500");
		}
		else
			System.out.println("Entered number "+number+" is not in the expected range");

		sc.close();
	}

}
