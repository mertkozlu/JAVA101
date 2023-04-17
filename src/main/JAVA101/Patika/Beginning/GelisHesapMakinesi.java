package Patika.Beginning;

import java.util.Scanner;

public class GelisHesapMakinesi {

    static int sum(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("Toplam : " + result);
        return result;
    }
    static int ext(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("Çıkarma : " + result);
        return result;
    }
    static int imp(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("Çarpma : " + result);
        return result;
    }
    static int div(int n1, int n2) {
        int result = n1 / n2;
        if (n2 != 0) {
            System.out.println("Bölme : " + result);
        } else {
            System.out.println("Bir sayı sıfıra bölünemez !");
        }
        return result;
    }
    static int pow(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        System.out.println("Üs Alma : " + result);
        return result;

    }
    static int mod(int n1, int n2) {
        int result = n1 % n2;
        System.out.println("Mod Alma: " + result);
        return result;
    }

    static void calc(int n1, int n2) {
        System.out.println("Çevresi : " + (2 * (n1 + n2)));
        System.out.println("Alanı : " + (n1 * n2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Alma\n"
                + "6- Mod Alma\n"
                + "7- Dikdörgen Alanı ve Çevresi\n"
                + "0- Çıkış Yap";

        System.out.println(menu);
        while (true) {

            System.out.print("Bir işlem seçiniz : ");
            select = input.nextInt();
            if (select == 0) {
                break;

            }
            System.out.print("İlk sayıyı giriniz : ");
            int n1 = input.nextInt();
            System.out.print("ikinci sayıyı giriniz : ");
            int n2 = input.nextInt();

            switch (select){
                case 1:
                    sum(n1,n2);
                    break;
                case 2:
                    ext(n1,n2);
                    break;
                case 3:
                    imp(n1,n2);
                    break;
                case 4:
                    div(n1,n2);
                    break;
                case 5:
                    pow(n1,n2);
                    break;
                case 6:
                    mod(n1,n2);
                    break;
                case 7:
                    calc(n1,n2);
                    break;
                case 0:
                default:
                    System.out.println("Hatalı giriş yaptınız !");
            }

        }
            System.out.println("Çıkış Yapıldı..");

    }
}
