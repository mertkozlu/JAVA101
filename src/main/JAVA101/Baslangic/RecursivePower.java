package Baslangic;

import java.util.Scanner;

public class RecursivePower {
    static int power(int n, int m) {
        if (m == 0) {
            return 1;
        }else {
            return n * power(n,m - 1 );
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz :  ");
        int n = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int m = input.nextInt();

        System.out.println("Sonuç : " + power(n,m));

    }
}
