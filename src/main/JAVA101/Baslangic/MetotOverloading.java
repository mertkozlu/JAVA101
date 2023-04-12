package Baslangic;

public class MetotOverloading {
    static void print() {
        System.out.println("Parametresiz metot");
    }
    static void print(int a) {
        System.out.println("Parametreler : " + a);

    }
    static void print(double a) {
        System.out.println(a);
    }
    static int print(int a,int b) {
        return a + b;
    }
    static int print(int a,int b,int c) {
        return  a + b +  c;
    }
    public static void main(String[] args) {
        print();
        print(10);
        print(1.0);
        System.out.println(print(1,2));
        System.out.println(print(1,2,3));

    }
}
