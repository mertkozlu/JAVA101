package Beginning;

import java.util.Scanner;
public class IkininKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i < n; i *=2 ){
            System.out.println(i);


        }

    }
}
