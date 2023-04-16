package Beginning;

import java.util.Scanner;
public class AsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int m = 2; m < i; m++) {
                if (i % m == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i  + " Asal Sayıdır.");

        }


        }
    }
}

