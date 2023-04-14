package Arrays;

import java.util.Arrays;
public class _ArraysToString {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        double[] list2 = {5, 6, 7, 8};

        _ArraysClass.print(list);
        //

        System.out.println(Arrays.toString(list2));
        //

        Arrays.fill(list,10);
        System.out.println(Arrays.toString(list));
        //

        int[] list3 = {-10, 59, 10, -5, 0, -64};
        Arrays.sort(list3);
        System.out.println(Arrays.toString(list3));
        //

        int [] list4 = { -50, 4, 6, 14, -10, 65,70};
        Arrays.sort(list4);
        System.out.println(Arrays.toString(list4));
        System.out.println(Arrays.binarySearch(list4, 6));
        //

        int[] copyList = Arrays.copyOf(list4, 4);
        System.out.println(Arrays.toString(copyList));

        int[] copyList1 = Arrays.copyOfRange(list4,2,5);
        System.out.println(Arrays.toString(copyList1));
        //

        int[] listA = {1,2,3};
        int[] listB = {1,2,3};
        int[] listC = {1,2,4};
        System.out.println(Arrays.equals(listA,listB));
        System.out.println(Arrays.equals(listB,listC));















    }

}
