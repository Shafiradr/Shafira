import java.util.Scanner;

public class nomor1 {
    public static void main(String args[]) {
        String abjadKecil = "abcdefghijklmnopqrstuvwxyz";
        String abjadBesar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < abjadKecil.length(); j++) {
                if (input.charAt(i) == abjadKecil.charAt(j) || input.charAt(i) == abjadBesar.charAt(j)) {
                    int urutanAbjad = j + 1;
                    System.out.print(urutanAbjad);
                    if (i < input.length() - 1) {
                        System.out.print(" -");
                    }
                }
            }
        }
    }
}




