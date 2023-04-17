package Patika.Beginning;

import java.util.Scanner;
public class MinmaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, min = 0, max = 0;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++ ) {
            System.out.print(i + " Sayıyı giriniz : ");
            number = input.nextInt();
            if (number > max) {
                max = number;

            }
            if (number < min || min == 0) {
                min = number;
            }
        }
        System.out.println("En küçük sayı : " + min);
        System.out.println("En büyük sayı : " +max);


    }
}
