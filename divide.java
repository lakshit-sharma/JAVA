import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number - ");
        int num = sc.nextInt();
        System.out.print("Enter a divider - ");
        int div = sc.nextInt();
        int q = num/div;
        System.out.print("So, The answer is - "+q);

        sc.close();

    }
}
