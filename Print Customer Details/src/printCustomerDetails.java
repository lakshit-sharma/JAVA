/*Help Mr.Ben who is a programmer, in developing a registration form on console. Customers will not just input data, 
but also view the details once he/she finishes the registration. */

import java.util.Scanner;

public class printCustomerDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = sc.nextLine();
		
		System.out.print("\nEnter age:");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.println("\nEnter gender");
		String gender = sc.nextLine();
		
		System.out.println("\nHailing from:");
		String place = sc.nextLine();
		
		System.out.println("Welcome,"+ name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("City:"+place);

		sc.close();
	}

}
