package Baslangic;

import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, phone;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı:");
        userName = input.nextLine();

        System.out.print("Şifre:");
        password = input.nextLine();

        if (userName.equals("mertkozlu") && (password.equals("mert123"))) {
            System.out.println("Giriş Yapıldı!");
            return;
        } else if (!userName.equals("mertkozlu")) {
            System.out.println("Kullanıcı adını hatalı girdiniz!");
            System.out.println("Kullanıcı adınızı hatırlamıyorsanız, Telefon numaranız ile giriş yapınız!");
            System.out.print("Telefon Numarası:");
            phone = input.nextLine();
            System.out.print("Şifre:");
            password = input.nextLine();

            if (password.equals("mert123") && (phone.equals("05555555555"))) {
                System.out.println("Giriş Yapıldı!");

            }else {
                System.out.println("Hesabınız Bloke Edildi.");

            }


        } else if (!password.equals("mert123")) {
            System.out.println("Şifrenizi Hatalı Girdiniz!\nŞifrenizi Sıfırlamak İster misiniz?:");
            String choose = input.nextLine();;

            if (choose.equals("login")) {
                System.out.print("Lütfen Yeni şifrenizi Girin:");
                String newPass = input.nextLine();


                if (newPass.equals("mert123")) {
                    System.out.println("Şifreniz Oluşturulamadı!\nŞifreniz bir önceki şifreniz ile aynı olmamalıdır.");

                }else  {
                    System.out.println("Şifreniz Başarılı Bir Şekilde Oluşturuldu.");

                }



            }




        }




    }

}
