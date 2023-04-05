import java.util.Scanner;
public class For2 {
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
        */


    }
}
