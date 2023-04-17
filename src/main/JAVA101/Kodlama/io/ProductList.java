package Kodlama.io;

import java.util.Scanner;
public class ProductList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] product = {"1-Pantolon", "2-Tshirt"};
        String[] brand = {"1-Mavi", "2-Loft"};

        for (int i = 0; i < product.length; i++){
           System.out.println(product[i]);
        }
        System.out.print("Ürün Seçin : ");
        int n = input.nextInt();

        if (n == 1) {
            for(int j = 0; j < brand.length; j++) {
                System.out.println(brand[j]);
            }
            System.out.print("Pantolon Markası Seçin :");
            int m = input.nextInt();

            if (m == 1) {
                System.out.println("Mavi Marka Pantolonlar Listelendi.");
            } else if (m == 2) {
                System.out.println("Loft Marka Pantolonlar Listelendi.");
            }else {
                System.out.println("Hatalı seçim !");
            }
        }else if (n == 2) {
            for (int k = 0; k < brand.length; k++ ){
                System.out.println(brand[k]);
            }
            System.out.print("T-shirt Markası Seçin : ");
            int l = input.nextInt();
            if (l == 1){
                System.out.println("Mavi Marka Tshirtler Listelendi.");
            } else if (l == 2) {
                System.out.println("Loft Marka Tshirtler Listelendi.");
            }else {
                System.out.println("Hatalı seçim !");
            }
        }else {
            System.out.println("Hatalı seçim !");
        }


    }
}
