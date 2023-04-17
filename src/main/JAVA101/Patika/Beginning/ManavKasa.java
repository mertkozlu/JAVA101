package Patika.Beginning;

import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args){
        double armut,elma,domates,muz,patlican,toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo:");
        armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo:");
        elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo:");
        domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo:");
        muz = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo:");
        patlican = input.nextDouble();

        toplam = (2.14 * armut) + (3.67 * elma) + (1.11 * domates) + (0.95 * muz) + (5.00 * patlican);
        System.out.print("Toplam Tutar:" + toplam);


    }
}
