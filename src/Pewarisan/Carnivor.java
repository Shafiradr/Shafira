package Pewarisan;

public class Carnivor extends Animal {
    public Carnivor(String nama) {
        super(nama, "'daging'", "tajam");
    }
    public void identify_myself(){
        System.out.println("Hi I'm Carnivor, my name is " +nama+", My food is " + jenisMakanan+ ", I have " + gigi + " teeth ");
    }
}
