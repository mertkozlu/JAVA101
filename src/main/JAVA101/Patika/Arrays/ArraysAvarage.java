package Patika.Arrays;

public class ArraysAvarage {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double sum =0.0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double avarage = sum / list.length;
        System.out.println(avarage);

    }
}
