package Pewarisan;

public class Omnivor extends Animal{
    public Omnivor(String nama) {
        super(nama, "'semua'", "tajam dan tumpul");
    }
    public void identify_myself(){
        System.out.println("Hi I'm Omnivor, my name is " +nama+", My food is " + jenisMakanan+ ", I have " + gigi + " teeth ");
    }
}
