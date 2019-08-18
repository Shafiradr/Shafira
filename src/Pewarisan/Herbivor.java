package Pewarisan;

public class Herbivor extends Animal{
    public Herbivor(String nama) {
        super(nama, "'tumbuhan'", "tumpul");
    }
    public void identify_myself(){
        System.out.println("Hi I'm Herbivor, my name is " +nama+ ", My food is " + jenisMakanan+ ", I have " + gigi + " teeth ");
    }
}
