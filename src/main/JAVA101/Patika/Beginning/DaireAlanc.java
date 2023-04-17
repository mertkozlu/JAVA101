package Patika.Beginning;

import java.util.Scanner;
public class DaireAlanc {
    public static void main(String[] args){
        int r;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı:");
        r = input.nextInt();
        double alan = (pi * r * r), cevre = (2 * pi * r);
        System.out.println("Dairenin Alanı:"+alan);
        System.out.println("Dairenin Çevresi:"+cevre);

    }

}
