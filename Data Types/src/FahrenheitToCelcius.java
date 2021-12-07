import java.util.Scanner;

//Write a Java program to create a new String object with the contents of a character array.


public class FahrenheitToCelcius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a degree in Fahrenheit: ");
		float temperature = sc.nextFloat();
		double celsius = (temperature-32)*5/9;
		
		System.out.println(temperature+" degree Fahrenheit is equal to "+celsius+" in Celsius");
		
		sc.close();

	}

}
