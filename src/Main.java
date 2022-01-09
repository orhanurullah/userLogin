import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String userName = "orhanurullah";
        String password = "orhan1512@gmail.com/falanfilan";
        String inputUserName, inputPassword, newPassword;
        int secenek;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adınızı Girin: ");
        inputUserName = scanner.nextLine();
        System.out.print("Şifrenizi Girin : ");
        inputPassword = scanner.nextLine();
        if(inputUserName.equalsIgnoreCase(userName) && inputPassword.equalsIgnoreCase(password)){
            System.out.println("Sayın " + userName + " hoşgeldiniz.");
        }else{
            if(!inputUserName.equalsIgnoreCase(userName)){
                System.out.println("Username Bilgisi Hatalı! Lütfen Tekrar Deneyin.");
            }else{
                System.out.print("Şifre Bilgisi Hatalı!\nŞifrenizi değiştirmek için 1'e basın.\nDevam etmek için 0'a basın.");
                secenek = scanner.nextInt();
                if(secenek == 1){
                    System.out.print("Lütfen yeni şifrenizi girin:");
                    newPassword = scanner.next();
                    if(newPassword.equalsIgnoreCase(password)){
                        System.out.println("Şifre Oluşturulamadı. Lütfen başka şifre girin.");
                    }else{
                        System.out.println("Şifre Başarıyla Oluşturuldu.");
                    }
                }else{
                    System.out.println("İşlem Sonlandırıldı.");
                }
            }
        }
    }
}
