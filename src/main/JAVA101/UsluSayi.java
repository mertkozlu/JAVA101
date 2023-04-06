import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k, total = 1;
        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Cevap : " + total);
        
        /*
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();
        int total = 1;

        //3^4 = a , 3 * 3 * 3 * 3 = a
        int i = 1;
        while (i <= k ) {
            total *= n;
            i++;
        }
        System.out.println("Cevap : " +total);

         */
    }

}
