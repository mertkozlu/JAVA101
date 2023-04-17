package Kodlama.io;

public class FindNumber {
    public static void main(String[] args) {
        search();
    }
    public static void search () {
        int[] numbers = new int[] {1,3,5,7,9};
        int find = 6;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == find) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            System.out.println("Sayı mevcuttur.");
        }else {
            System.out.println("Sayı Mevcut değildir.");
        }
    }

}
