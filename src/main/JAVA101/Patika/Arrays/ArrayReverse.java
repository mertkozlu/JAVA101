package Patika.Arrays;

public class ArrayReverse {
    static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];
        for (int i = 0, l = list.length - 1; i < list.length; i++, l--) {
            reverse[i] = list[l];
        }
        return reverse;
    }

    static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] newListe = reverse(list);
        printArray(newListe);
    }
}
