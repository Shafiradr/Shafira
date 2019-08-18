package utama;

import Kalkulator.pembagian;
import Kalkulator.pengurangan;
import Kalkulator.penjumlahan;
import Kalkulator.perkalian;
import MenghitungLuasdanKeliling.Persegi;
import MenghitungLuasdanKeliling.PersegiPanjang;
import MenghitungLuasdanKeliling.Segitiga;
import MenghitungVolume.Tabung;
import MenghitungVolume.balok;
import MenghitungVolume.kubus;
import OngkosKirim.volum;
import Pewarisan.Animal;
import Pewarisan.Carnivor;
import Pewarisan.Herbivor;
import Pewarisan.Omnivor;

import java.util.Scanner;

public class menu {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int pilihan;
        do{
            System.out.println("Pilih Menu yang Diinginkan: ");
            pilihan = scan.nextInt();
            switch (pilihan){
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Masukan sisi : ");
                    Persegi persegi = new Persegi();
                    persegi.persegi((scanner.nextDouble()));

                    System.out.println("Masukan Panjang dan Lebar : ");
                    PersegiPanjang persegipan = new PersegiPanjang();
                    persegipan.persegiPanjang((scanner.nextDouble()),(scanner.nextDouble()));

                    System.out.println("Masukan Alas dan Tinggi : ");
                    Segitiga segitiga = new Segitiga();
                    segitiga.segiTiga((scanner.nextDouble()),(scanner.nextDouble()));
                    break;
                case 2:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Masukan panjang, lebar, dan tinggi : ");
                    balok balok = new balok();
                    balok.volBalok((scanner1.nextDouble()), (scanner1.nextDouble()), (scanner1.nextDouble()));

                    System.out.println("Masukan sisi : ");
                    kubus kubus = new kubus();
                    kubus.kubus1((scanner1.nextDouble()));

                    System.out.println("Masukan jari - jari dan tinggi : ");
                    Tabung volTabung = new Tabung();
                    volTabung.tabung1((scanner1.nextDouble()), (scanner1.nextDouble()));
                    break;
                case 3:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Masukan angka pertama dan kedua: ");
                    pengurangan kurang = new pengurangan();
                    kurang.kurang((scanner2.nextDouble()),(scanner2.nextDouble()));

                    System.out.println("Masukan angka pertama dan kedua: ");
                    penjumlahan jumlah = new penjumlahan();
                    jumlah.tambah((scanner2.nextDouble()),(scanner2.nextDouble()));

                    System.out.println("Masukan angka pertama dan kedua: ");
                    perkalian kali1 = new perkalian();
                    kali1.kali((scanner2.nextDouble()),(scanner2.nextDouble()));

                    System.out.println("Masukan angka pertama dan kedua: ");
                    pembagian bagi1 = new pembagian();
                    bagi1.bagi((scanner2.nextDouble()),(scanner2.nextDouble()));
                    break;
                case 4:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Masukan panjang, lebar, dan tinggi : ");
                    volum volum = new volum();
                    volum.hitungHarga((scanner3.nextInt()), (scanner3.nextInt()), (scanner3.nextInt()));
                    break;
                case 5:
                    Animal animal = new Animal("Binatang");
                    animal.identify_myself();

                    System.out.println("");
                    Herbivor herbivor = new Herbivor("Kambing");
                    herbivor.identify_myself();
                    Carnivor carnivor = new Carnivor("Harimau");
                    carnivor.identify_myself ();

                    System.out.println("");
                    Omnivor omnivor = new Omnivor("Ayam");
                    omnivor.identify_myself();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }
        } while (pilihan!=0);
    }
}
