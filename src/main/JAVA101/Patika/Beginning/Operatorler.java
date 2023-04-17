package Patika.Beginning;

public class Operatorler {
    public static void main(String[] args) {

        /*ARİTMETİK OPERATÖRELER;
        matematiksel işlemleri programlama dilinde uygulamamızı sağlarlar.
        +, -, *, /, % ...

         */
        System.out.println("aritmetik;");
        int a = 5, b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);

        /*ATAMA OPERATÖRLERİ;
        =
        d = d + c ; d += c
        d = d - c ; d -= c
        d = d * c ; d *= c
        d = d / c ; d /= c
        d = d % c ; d %= c
    */
        System.out.println("Atama;");
        int c = 4, d = 3;
        System.out.println(c -= d);
        System.out.println(c /= d);

        /*KARŞILAŞTIRMA OPERATÖRLERİ;
        bollean veri tipinde tanımlanmış.
        iki nesnenin birbirleriyle olan durumlarını belirler;
        f==e, f!=e, f<e, f>e, f<=e, f>=e
         */
        System.out.println("karşılaştırma;");
        int f = 5, e = 2;
        boolean sonuc = f == e;
        System.out.println(sonuc);
        boolean sonuc2 = f != e ;
        System.out.println(sonuc2);

        /* MANTIKSAL OPERATÖRLER;
        boolean veri tipi
        nesnelerin veya ifadelerin mantıksal değerlerini yansıtır.
        Ve: g && h, Veya: g || h, Değil: !(g&&h)
        */
        System.out.println("mantıksal;");
        int g = 3, h = 1, j= 3;
        boolean kosul = g > h;
        boolean kosul2 = g == j;
        boolean kosul3 = h > g;
        boolean son = kosul && kosul2;
        boolean son2 = kosul2 && kosul3;
        boolean son3 = kosul || kosul3;
        boolean son4 = !(son);
        boolean son5 = !(son3);
        System.out.println(son);
        System.out.println(son2);
        System.out.println(son3);
        System.out.println(son4);
        System.out.println(son5);

        /*KOSUL OPERATÖRLERİ;
        ifadelerin sonucunda oluşacak olayları belirler.
        String str = sonuc ? "Doğru" : "Değil" ;
         */
        System.out.println("KOSUL;");
        int k = 7, l=8, m=7;
        boolean kos = k == m;
        boolean kos1 = k < l;
        boolean kos2 = k > l;
        boolean sonuc4 = kos && kos2;
        boolean sonuc5 = kos && kos1;
        String str = sonuc4 ? "Dogru" : "Değil";
        String str2 =  sonuc5 ? "Dogru" : "Değil";
        System.out.println(str);
        System.out.println(str2);
    }
}
