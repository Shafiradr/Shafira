package MenghitungLuasdanKeliling;

import java.util.Scanner;

    public class PersegiPanjang {

        public void persegiPanjang (double p, double l) {
            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Panjang : ");
            double p = scanner.nextDouble();
            System.out.print("Lebar : ");
            double l = scanner.nextDouble();*/

            double luas = p * l;
            System.out.println("Luas MenghitungLuasdanKeliling.Persegi Panjang : " + luas);
            double keliling = 2*(p+l);
            System.out.println("Keliling MenghitungLuasdanKeliling.Persegi Panjang :" + keliling);
        }

    }
