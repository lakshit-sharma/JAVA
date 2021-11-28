import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*char c1= 65;
        char c2=66;

        System.out.println(c1);
        System.out.println(c2);*/
System.out.println("Enter numbers");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();

        char n1 = (char)c1;
        char n2 = (char)c2;
        char n3 = (char)c3;
        char n4 = (char)c4;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        sc.close();

    }
}
