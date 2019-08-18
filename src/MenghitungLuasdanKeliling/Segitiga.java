package MenghitungLuasdanKeliling;

import java.util.Scanner;

public class Segitiga {

        public void segiTiga(double a, double t) {
            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Alas : ");
            double a = scanner.nextDouble();
            System.out.print("tinggi : ");
            double t = scanner.nextDouble();*/

            double c = Math.sqrt (a*a + t*t);
            System.out.println("sisi miring  : " + c);
            double keliling = a + t + c ;
            System.out.println("Keliling Segitiga :" + keliling);
            double luas = a * t / 2;
            System.out.println("Luas Segitiga : " + luas);
        }

    }

