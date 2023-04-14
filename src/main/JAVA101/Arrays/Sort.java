package Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.SortedSet;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Dizi boyutunu girin : ");
        int n = input.nextInt();

        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını girin : ");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " Eleman : ");
            list [i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + ",");
        }


    }
}
