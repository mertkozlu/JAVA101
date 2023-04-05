import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();


        double ort = (mat + fizik + turkce + kimya + muzik) / 5;

        if(ort  <= 100 && ort >= 0 ) {
            if (ort >= 55 ){
                System.out.println("Ortalamanız: " + ort + "\nGeçtiniz.");
            }else {
                System.out.println("Ortalamanız: " + ort + "\nKaldınız.");
            }
        }else {
            System.out.println("Ortalamanız Hesaplanamadı.");
        }









    }

}
