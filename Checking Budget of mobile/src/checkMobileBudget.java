import java.util.Scanner;

/*Write a java program to find the mobile chosen is within the budget or not. To find the budget mobiles is based on the below-mentioned criteria, 

 a)If the cost of the mobile chosen is less than or equal to 13000 then display it as "Mobile chosen is within the budget"

 b)If the cost of the mobile chosen is greater than 13000 then display it as "Mobile chosen is beyond the budget"*/


public class checkMobileBudget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of the mobile");
		int price = sc.nextInt();
		if (price < 0){
			System.out.println("invalid price for mobile");
		}
		else if (price <=13000) {
			System.out.println("Mobile chosen is within the budget");
		}
		else 
			System.out.println("Mobile chosen is beyond the budget");
		
		sc.close();

	}

}
