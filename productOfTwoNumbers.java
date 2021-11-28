import java.util.Scanner;

public class productOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Multiplication Program\n");
        System.out.print("Enter number 1 - ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 - ");
        int num2 = sc.nextInt();
        int product = num1*num2;
        System.out.print("Output - "+product);
        sc.close();
    }
}
