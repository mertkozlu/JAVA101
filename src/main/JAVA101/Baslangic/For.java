package Baslangic;

import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;

        for (boolean run = true; run;){
            System.out.println("Sayı Giriniz:");
            numb = input.nextInt();
            if (numb < 0){
                run = false;
            }
        }

        /*
        do {
            System.out.println("Sayı Gİriniz : ");
            numb = input.nextInt();
        }while (numb > 0);
      ..................................................
        for (int i  = 0; i <= 10; i++) {
            System.out.println(i);
               birinci durum; sayaç görevi görecek
               ikinci durum ; dögünün çalışması için gerekli koşul, boolean ifade
               üçüncü durum; bir arttırıp veya bir azaltacak.

       .................................................

            int i = 1;
            while (, <= 10){
                System.out.println(k);
                k++;

            }

            */

    }
}
