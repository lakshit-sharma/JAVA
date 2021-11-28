import java.util.Scanner;

public class calculateExamPercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("----- CBSE EXAM PEERCENTAGE CALCULATOR -----");
		
		System.out.println("Enter marks of English -  ");
		int english = sc.nextInt();

		System.out.println("Enter marks of Hindi -  ");
		int hindi = sc.nextInt();

		System.out.println("Enter marks of Maths -  ");
		int maths = sc.nextInt();

		System.out.println("Enter marks of Science -  ");
		int science = sc.nextInt();

		System.out.println("Enter marks of History -  ");
		int history = sc.nextInt();
		
		int total = english + hindi + maths + history + science;
		if (english > 100 || hindi  > 100 || maths > 100 || history > 100 || science > 100) {
			System.out.println("Invalid Entry of Marks TRY AGAIN!!!!!");
		}
		else {
			
			double percent = (total*100)/500;
			System.out.println("Total Marks - "+total + "\nPercentage - "+percent);			
		}
		sc.close();
	}

}
