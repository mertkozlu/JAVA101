package Beginning;

public class Alancevre {
    public static void main(String[] args) {
        int kisaKenar = 10, uzunKenar = 20;
        int cevre = 2 * (kisaKenar + uzunKenar);
        int alan = kisaKenar * uzunKenar;
        System.out.println("Kısa\tkenarı\t10,\tuzun\tkenarı\t20\tolan\tbir\tüçgenin;");
        System.out.println("Cevresi\tkactır?");
        System.out.print("Cevap=");
        System.out.println(cevre);
        System.out.println("Alanı\tkactır?");
        System.out.print("Cevap=");
        System.out.println(alan);
    }
}
