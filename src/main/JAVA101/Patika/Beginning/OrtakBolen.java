package Patika.Beginning;

import java.util.Scanner;
public class OrtakBolen {
    public static void main(String[] args) {
        int k, total = 0, numbers = 0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                total += i;
                numbers++;

            }
        }average = (double) total / numbers;
        System.out.println("Ortalama : " + average);
    }
}
