// Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of Rectangle");
        System.out.print("Enter Length - ");
        float length = sc.nextFloat();
        System.out.print("Enter Breadth - ");
        float breadth = sc.nextFloat();
        float perimeter = 2*length*breadth;
        float area = length*breadth;
        System.out.println("So the are of rectangle - "+area+ " and the perimeter of rectangle - "+perimeter);
        
        
        sc.close();
    }
}
