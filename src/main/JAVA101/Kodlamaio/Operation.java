package Kodlamaio;

public class Operation {
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(total(2,1,8));
    }
    public static void add() {

    }
    public static void delete() {

    }
    public static void update() {

    }
    public static int sum(int n, int m) {
        return n + m;
    }
    public static int total(int... k) {
        int summ = 0;
        for (int numb : k) {
            summ += numb;
        }
        return summ;
    }
}
