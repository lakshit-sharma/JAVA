import java.util.Scanner;

public class sumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number - ");
        int num1 = sc.nextInt();
        System.out.printf("Enter 2nd Number - ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum of two number   - "+ sum);

        sc.close();
    }
}
