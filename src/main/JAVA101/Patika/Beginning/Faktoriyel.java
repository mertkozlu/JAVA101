package Patika.Beginning;

import java.util.Scanner;
public class Faktoriyel {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n = input.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        System.out.println("Faktöriyel: " + total);
        /*
        Scanner input = new Scanner(System.in);

        int i = 1, n;
        int total = 1;


        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();
        while (i <= n) {
            total = total * i;
            i++;
        }
        System.out.println("Faktöriyel : " + total);

        */
    }

}
