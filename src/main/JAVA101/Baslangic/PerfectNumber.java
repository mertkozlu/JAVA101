package Baslangic;

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();
        int sum = 0;

        for(int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum += i;
            }

        }
        if (sum == n) {
            System.out.println(n +  " mükemmel sayıdır");
        }else {
            System.out.println(n+ " mükemmel sayı değildir.");
        }
    }
}
