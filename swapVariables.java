// Write a Java program to swap two variables.

import java.util.Scanner;



public class swapVariables {
    public static void main(String[] args) {
        int temp;
        System.out.println("----- Swapping two numbers -----");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter 1st number - ");
        int num1 = sc.nextInt();
        System.out.print("ENter 2nd Number - ");
        int num2 = sc.nextInt();
        System.out.print("Before Swapping number 1 - "+ num1+ " and number 2 - "+num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nAfter swapping number 1 - "+num1+ " and number 2 - "+num2);
        sc.close();
    }
}
