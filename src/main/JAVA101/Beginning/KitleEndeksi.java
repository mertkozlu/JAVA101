package Beginning;

import java.util.Scanner;
public class KitleEndeksi {
    public static void main(String[] args){
        double kilo, boy;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz:");
        boy = input.nextDouble();

        System.out.print("Kilonuzu Giriniz:");
        kilo = input.nextDouble();

        double indeks = kilo / (boy * boy);
        System.out.println("Vüct Kitle İndeksiniz:"+ indeks);

        if (indeks < 18.5) {
            System.out.println("Zayıf");
        } else if (indeks >= 18.5 && indeks < 25) {
            System.out.println("Normal");
        } else if (indeks >= 25 && indeks< 30) {
            System.out.println("Fazla Kilolu");
        } else {
            System.out.println("Obez");
        }

    }
}
