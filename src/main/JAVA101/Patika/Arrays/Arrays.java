package Patika.Arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (i * 10) + 10;
            System.out.println(list[i]);
            System.out.println(list[0]);
        }

        int[] listOne = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(listOne[8]);



    }
}
