public class MetotReturn {
    static int sum(int a,int b) {
        return a + b;
    }
    public static void main(String [] args) {
        int result = sum(5,2);
        System.out.println(result);

        // or
        System.out.println(sum(5,2));

        /* or
        int result = sum(5,2) + sum(3,1);
        System.out.println(result);
        çıktısı : 11

         */

    }
}
