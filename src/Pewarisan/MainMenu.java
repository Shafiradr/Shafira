package Pewarisan;

public class MainMenu {
    public static void main (String[] args){
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
    }
}
