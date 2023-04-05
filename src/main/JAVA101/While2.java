import java.util.Scanner;
public class While2 {
    public static void main(String[] args) {
       int password;
       boolean isPasswordSuccess = false;

       Scanner input = new Scanner(System.in);

       while (!isPasswordSuccess) {

           System.out.print("Şifre Giriniz : ");
           password = input.nextInt();

           if (password == 123){
               System.out.println("Giriş Yapıldı.");
               isPasswordSuccess = true;
           }else  {
               System.out.println("Giriş Yapılamadı. Tekrar Deneyin.");
           }

       }



    }
}
