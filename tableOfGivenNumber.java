import java.util.Scanner;

public class tableOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print Table of - ");
        int num = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(num+" x "+i+" = " + num*i);
        }
        sc.close();
    }
}
