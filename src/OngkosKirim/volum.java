package OngkosKirim;

import java.util.Scanner;

public class volum {
    public void hitungHarga (int panjang, int lebar, int tinggi){
        int volume = panjang * lebar * tinggi;
        int dimensi = 50;
        int hargaPer50Volume = 5000;
        int hargaDimensi = 0;
        while (true){
            hargaDimensi += hargaPer50Volume;
            if (volume < dimensi){
                break;
            }
            volume = volume - dimensi;
        }
        int totalHarga = hargaDimensi;
        System.out.println("");
        System.out.println("Harga per 50 cm3 / Kg :" + hargaPer50Volume);
        System.out.println("Total Harga : Rp " + totalHarga);
    }
}
