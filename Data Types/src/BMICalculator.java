//Write a Java program to compute body mass index (BMI).

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in pounds- ");
		double weight = sc.nextDouble();
		System.out.println("Enter height in inch");
		double height = sc.nextDouble();
		
		double bmi = weight *0.45359237/(height*0.0254*0.0254*height);
		System.out.println("BMI Index - "+bmi);
		
		sc.close();
	}

}
