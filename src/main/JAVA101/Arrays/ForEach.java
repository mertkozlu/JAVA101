package Arrays;

public class ForEach {
    public static void main(String[] args) {

        // e.g 1:
        int[] list = {1, 2, 3, 4};
        for (int i = 0; i < list.length; i++) {
           // System.out.println(list[i]);
        }

        int sum = 0;
        for (int i : list) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);


        // e.g 2 :
        String[] cars = {"BMW", "Audi", "Mercedes"};
        for (String str : cars) {
            System.out.println(str);
        }

        //e.g 3:
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
        };
        for(int j = 0; j < matris.length; j++) {
            for (int k = 0; k < matris[j].length; k++) {
                //System.out.print(matris[j][k] + " ");
            }
            //System.out.println();
        }

        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}
