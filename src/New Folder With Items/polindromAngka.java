import java.util.Scanner;

public class polindromAngka {
    public static void main(String[] args) {

        int angkaAwal = 10;
        int plusGanjil = 11;
        int plusGenap = 1;

        boolean isPlusGenap = true;
        boolean isRange = true;

        System.out.println("Masukkan Angka: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int angkaa = angkaAwal;
        int angkaTetap = angkaa;
        int plusAwal = 1;
        input++;
        cari_palindrome:

        while (true) {
            int i = input;
            if (i < angkaAwal) {
                if (isRange) {
                    angkaa = angkaAwal / 10;
                    angkaTetap = angkaa;
                    isRange = !isRange;

                }
                if (i < angkaa + angkaTetap) {
                    for (int j = input; j < angkaAwal; j++) {
                        int palindrome = angkaa + plusAwal;

                        while (palindrome < angkaAwal) {
                            if (j == palindrome) {
                                System.out.println("Angka " + j + "adalah palindrome selanjutnya");
                                break cari_palindrome;
                            }
                            if (isPlusGenap) {
                                palindrome = palindrome + plusGenap;
                            } else {
                                palindrome = palindrome + plusGanjil;
                            }
                        }
                    }
                    break;
                } else {
                    angkaa += angkaTetap;
                    plusAwal++;
                }
            } else {
                angkaAwal = angkaAwal * 10;
                if (isPlusGenap) {
                    plusGenap *= 10;
                } else {
                    plusGanjil *= 10;
                }
                isPlusGenap = !isPlusGenap;
            }
        }
    }
}
