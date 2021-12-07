import java.util.Scanner;

//Write a Java program that reads a number in inches, converts it to meters.

public class InchToMeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a value for Inch:");
		float inch =sc.nextFloat();
		double meter = (inch*0.0254);
		
		System.out.print(inch +" inch is "+meter+" meters");
		
		sc.close();

	}

}
