public class Opemantik {
    public static void main (String[] args){
        int a = 10, b = 20, c = 5;

        boolean kosul1 = (a < b);
        boolean kosul2 = (a > c);
        boolean sonuc = kosul1 || kosul2;
        System.out.println(sonuc);

        int x = 1, y = 2, z = 1;

        boolean kosula = (z == y);
        boolean kosulb = (x == z);
        boolean son = (kosula && kosulb);
        System.out.println(son);
        System.out.println(!son);

        int k = 10, l = 10, m, n;
        m = (k == l) ? 1 : 0 ;
        n = (k > l) ? 1 : 0 ;
        System.out.println(m);
        System.out.println(n);





    }
}
