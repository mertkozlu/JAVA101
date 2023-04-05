import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar,kdvOrani = 0.18;
        System.out.print("Tutar Giriniz:");
        tutar = input.nextDouble();
        System.out.println("KDV'siz Tutar:"+ tutar);
        System.out.println("KDV Oranı:"+ kdvOrani);
        double kdvTutari = tutar * kdvOrani;
        double kdvDahiltutar = kdvTutari + tutar;
        System.out.println("KDV Tutarı:"+kdvTutari);
        System.out.print("KDV Dahil Toplam Tutar:"+kdvDahiltutar);

    }
}
