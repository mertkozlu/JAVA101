public class Metot {

    static void helloWorl() {
        System.out.println("Hello World !");
    }
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
        System.out.println(power(4,2));
        helloWorl();

        /*
        int n1 = 2 , n2 = 3;
        int case1 = power(n1,n2);
        System.out.println(case1);
         */

    }
}
