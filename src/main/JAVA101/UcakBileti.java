import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int mil, age, direction;
        double normPrice, ageDiscount, priceDiscount,totalPrice, directionPrice;


        Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafe (km): ");
        mil = input.nextInt();

        System.out.print("Yaşınız: ");
        age = input.nextInt();

        System.out.print("1- Tek Yön\t2- Gidiş-Dönüş\nYolculuk tipi seçiniz: ");
        direction = input.nextInt();

        normPrice = mil * 0.10;

        if ((((99 > age)) && (age > 0)) && (mil > 0)) {
            System.out.println("İşleminiz devam ediyor...");
        } else {
            System.out.println("Hatalı giriş yaptınız !");
            return;
        }

        switch (direction) {
            case 1:
                if((12 <= age) && (age < 24)){
                    ageDiscount = normPrice * 0.10;
                    priceDiscount = normPrice - ageDiscount;
                    System.out.println("Normal Tutar: " + normPrice);
                    System.out.println("İndirim Oranı: %10");
                    System.out.println("Toplam Tutar: " + priceDiscount + "tl");
                } else if (age < 12) {
                    ageDiscount = normPrice * 0.50;
                    priceDiscount =normPrice - ageDiscount;
                    System.out.println("Normal Tutar: " + normPrice);
                    System.out.println("İndirim Oranı: %50");
                    System.out.println("Toplam Tutar: " + priceDiscount + "tl");

                }else if (age >= 65){
                    ageDiscount = normPrice * 0.30;
                    priceDiscount = normPrice - ageDiscount;
                    System.out.println("Normal Tutar: " + normPrice);
                    System.out.println("İndirim Oranı: %30");
                    System.out.println("Toplam Tutar: " +priceDiscount + "tl");

                }else {
                    System.out.println("Toplam Tutar: " + normPrice + "tl");
                }
                break;
            case 2:
                if((12 <= age) && (age < 24)){
                    ageDiscount = normPrice * 0.10;
                    priceDiscount = normPrice - ageDiscount;
                    directionPrice = priceDiscount * 0.20;
                    totalPrice = (priceDiscount - directionPrice) * 2;
                    System.out.println("Normal Tutar: " + normPrice * 2);
                    System.out.println("İndirim Oranı: %10 + %20");
                    System.out.println("Toplam Tutar: " + totalPrice + "tl");
                } else if (age < 12) {
                    ageDiscount = normPrice * 0.50;
                    priceDiscount = normPrice - ageDiscount;
                    directionPrice = priceDiscount * 0.20;
                    totalPrice = (priceDiscount - directionPrice) * 2;
                    System.out.println("Normal Tutar: " + normPrice * 2);
                    System.out.println("İndirim Oranı: %50 + %20");
                    System.out.println("Toplam Tutar: " + totalPrice + "tl");

                }else if (age >= 65){
                    ageDiscount = normPrice * 0.30;
                    priceDiscount = normPrice - ageDiscount;
                    directionPrice = priceDiscount * 0.20;
                    totalPrice = (priceDiscount - directionPrice) * 2;
                    System.out.println("Normal Tutar: " + normPrice * 2);
                    System.out.println("İndirim Oranı: %30 + %20");
                    System.out.println("Toplam Tutar: " +totalPrice + "tl");

                }else {
                    directionPrice = normPrice * 2;
                    totalPrice = directionPrice * 0.20;
                    System.out.println("Normal Tutar: " + normPrice * 2);
                    System.out.println("İndirim Oranı: %20");
                    System.out.println("Toplam Tutar: " + ((normPrice * 2) - totalPrice) + "tl");
                }
                break;

















        }















    }
}
