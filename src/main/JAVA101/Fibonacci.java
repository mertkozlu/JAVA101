import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz (fibonacci sayısı): ");
        int n = input.nextInt();

        System.out.println("Fibonacci Serisi : ");
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; i++ ) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

        }
    }
}
