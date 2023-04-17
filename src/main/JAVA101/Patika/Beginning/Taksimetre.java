package Patika.Beginning;

import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        int au = 10;
        double kbu = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe Giriniz (Km);");
        km = input.nextInt();
        double tutar =  (km  * kbu) + au;
        System.out.println("Açılış Ücreti;" +au);
        System.out.println("Km Başına Ücret;" +kbu);
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.print("Toplam Tutar; " +tutar);


    }
}
