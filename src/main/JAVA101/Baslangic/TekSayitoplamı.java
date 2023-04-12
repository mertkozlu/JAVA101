package Baslangic;

import java.util.Scanner;
public class TekSayitoplamı {
    public static void main (String[] args) {
        int i;
        int total =0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            i = input.nextInt();
            if(i % 2 == 1 ) {
                total +=i;
            }
        }while (i > 0);
        System.out.println("Toplam : " + total);

    }
}
