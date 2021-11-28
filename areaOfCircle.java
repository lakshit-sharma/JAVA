// Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter Radius - ");
        float radius = sc.nextFloat();
        double perimeter =  2 * pi * radius;
        double areaOfCircle = pi * radius * radius;
        System.out.println("Perimeter of Circle - " + perimeter);
        System.out.println("Area of Circle - " + areaOfCircle);

        sc.close();
    }
}
