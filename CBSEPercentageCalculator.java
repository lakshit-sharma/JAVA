import java.util.Scanner;

public class CBSEPercentageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("----- CBSE Board Calculator -----\n\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name - ");
		String name = sc.nextLine();
		System.out.print("Marks in English - ");
		int english = sc.nextInt();
		System.out.print("Marks in Hindi - ");
		int hindi = sc.nextInt();
		System.out.print("Marks in  Physics- ");
		int physics = sc.nextInt();
		System.out.print("Marks in Chemistry - " );
		int chemistry = sc.nextInt();
		System.out.print("Marks in Maths - ");		
		int maths = sc.nextInt();
		
		int sum = english + hindi + physics + chemistry + maths;
		int percentage = (sum*100/500);
		
		System.out.print("Student Name - \n" + name);
		System.out.print("Total percentage in 12th - " +percentage+"%");


		

	}

}
