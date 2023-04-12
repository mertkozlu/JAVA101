package Baslangic;

public class Charboolean {
    public static void main(String[] args) {
        /*char karakter saklamak için kullanılan veri tipi.
        Charda metin, sözcük yazamıyoruz. harf yazdığımız da ise
        karakter olduğunu belirtmek için tırnak içine alıyoruz.
         */
        char vChar = 'b';
        char vChar2 = 98;
        char vChar3 = 240;
        System.out.println(vChar);
        System.out.println(vChar2);
        System.out.println(vChar3);
        //charların birleşimiyle String oluşur ve "" + şeklinde de yazılır.
        System.out.println("" + vChar + vChar2 + vChar3);
        //boolean ise mantıksal değerleri saklamak için kullanılan veri tipi.
        boolean dogru = true;
        boolean yanlis = false;
        System.out.println(dogru);
        System.out.println(yanlis);
    }
}
