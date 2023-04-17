package Patika.Beginning;

import java.util.Scanner;
public class CiftDordunKat {
    public static void main(String[] args) {
        int  k;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            k = input.nextInt();
                if ( k % 2 == 0 || k % 4 == 0) {
                    total +=k;
                }
        }while (k > 0);
            System.out.println("Toplam : " + total);

    }
}
