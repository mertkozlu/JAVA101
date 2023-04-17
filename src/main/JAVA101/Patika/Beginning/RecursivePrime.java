package Patika.Beginning;

import java.util.Scanner;
public class RecursivePrime {
    static boolean isPrime(int n, int i) {
        if (i == 1) {
            return true;
        }else {
            if(n % i == 0) {
                return false;
            }else {
                return isPrime(n,i - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();

        if(isPrime(n,n / 2)) {
            System.out.println(n +"\tasal bir sayıdır.");
        }else {
            System.out.println(n +"\tasal bir sayı değildir.");
        }


    }
}
