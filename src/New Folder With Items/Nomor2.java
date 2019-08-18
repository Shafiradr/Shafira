import java.util.Scanner;

public class Nomor2 {
    public static void main(String args[]) {
        String vokalKecil = "aiueo";
        String konsonanKecil = "bcdfghjklmnpqrstvwxyz";
        String vokalBesar = "AIUEO";
        String konsonanBesar= "BCDFGHJKLMNPQRSTVWXYZ";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String input = scanner.nextLine();

        int jumlahVokal = 0;
        int jumlahKonsonan = 0;
        int totalKarakter = input.length();

        for (int i = 0; i < totalKarakter; i++) {
            for (int j = 0;  j < vokalKecil.length(); j++) {
                if (input.charAt(i) == vokalKecil.charAt(j)|| input.charAt(i) == vokalBesar.charAt(j)) {
                    jumlahVokal++;
                }
            }
            for (int j = 0; j < konsonanKecil.length(); j++) {
                if (input.charAt(i) == konsonanKecil.charAt(j) || input.charAt(i) == konsonanBesar.charAt(j)) {
                    jumlahKonsonan++;
                }
            }
        }
        System.out.println("Jumlah Vokal : " + jumlahVokal);
        System.out.println("Jumlah Konsonan :" + jumlahKonsonan);
        System.out.println("Total Karakter" + totalKarakter);
    }
}
