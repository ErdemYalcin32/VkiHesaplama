import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int kg;
        double vki,boy;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu(metre cinsinde) giriniz : ");
        boy = girdi.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kg = girdi.nextInt();

        vki = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}