package Baslangic;

import java.util.Scanner;
public class
Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nFac = 1, rFac = 1, subFac = 1, fac;

        System.out.print("Kümenin eleman sayısını giriniz : ");
        int n = input.nextInt();
        System.out.print("Kombinasyon oluşturacak sayıyı giriniz : ");
        int r = input.nextInt();

        int sub = n - r;
        for (int i = 1; i <= n; i++) {
            nFac = nFac * i;
        }
        for (int i = 1; i <= r; i++) {
            rFac = rFac * i;
        }
        for (int i = 1; i <= sub; i++) {
            subFac = subFac * i;
        }
        fac = nFac / (rFac * subFac) ;
        System.out.println("Kombinasyon : " + fac);



    }

}
