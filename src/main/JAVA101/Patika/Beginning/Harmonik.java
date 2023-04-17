package Patika.Beginning;

import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();
        double result = 0.0;
        for (double i = 1; i <= n; i++ ) {
            result += (1/i);
        }
        System.out.println(result);
        // 1. Döngü, i = 1; result = 0 + (1/1) = 1;
        // 2. Döngü, i = 2; result = 1 + (1/2) = 1.5;
    }
}
