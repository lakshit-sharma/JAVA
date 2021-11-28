import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.print("Enter Name - ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello\n" +name);

        sc.close();
    }
}
