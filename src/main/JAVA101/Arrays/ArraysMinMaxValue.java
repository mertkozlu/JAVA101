package Arrays;

public class ArraysMinMaxValue {
    public static void main(String[] args) {
        int[] list = {4, 5, 10, 2, 34};
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Minimum Değer : " + min);
        System.out.println("Maximum Değer :" + max);




    }
}
