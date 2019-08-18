package Pewarisan;

public class Animal {
    String nama;
    String jenisMakanan;
    String gigi;

    public  Animal(String nama){
        this.nama = nama ;
    }
    public Animal(String nama, String jenisMakanan, String gigi){
        this.nama = nama ;
        this.jenisMakanan = jenisMakanan ;
        this.gigi = gigi;

    }
    public void identify_myself(){
        System.out.println("Hi I'm Parent at All Animal, My Name is " + nama);
    }
}
