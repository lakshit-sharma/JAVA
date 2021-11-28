import java.util.Scanner;

public class ComparisonaOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int givenInteger = 50;
		System.out.println("Enter the Number - ");
		int userInput = sc.nextInt();
		System.out.println("The given number is 50. Is the nuumber entered by user is greater?");
		System.out.println(userInput>givenInteger);
		
		sc.close();
	}

}
