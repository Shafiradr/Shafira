import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class tugas {
        public static void main(String args[]) {

            String inputPalindrom;
            Scanner in = new Scanner((System.in));

            System.out.println("Input Palindrome");
            inputPalindrom = in.nextLine();

            int length = inputPalindrom.length();
            int i, mulai, selesai, hampir;

            mulai = 0;
            selesai = length - 1;
            hampir = (mulai + selesai) / 2;

            for (i = mulai; i <= hampir; i++) {
                if (inputPalindrom.charAt(mulai) == inputPalindrom.charAt(selesai)) {
                    mulai++;
                    selesai-- ;
                } else {
                    break;
                }

            }
            if (i == hampir + 1) {
                System.out.println("Benar");
            } else {
                System.out.println("Salah");
            }
        }
    }

