public class motor implements Warna {

    public static int roda = 10;
    public static String kapasitasMesin = "250cc";

    int rodaA;
    int ccMesin;
    String merk;

    void jumlahRoda(int rodaAa) {
        if (rodaAa < 2) {
            System.out.println("Bukan Motor");

        } else if (rodaAa >= 2) {
            System.out.println("Motor");
        } else {
            System.out.println("Kendaraan Roda 3 Ke atas");
        }
    }

    public void jenis(String merk) {
        this.merk = merk;
    }

    protected void kecepatan(int ccMesin) {
        System.out.println("Kecepatan motor umum "+ccMesin+" CC");

    }

    public motor() {
        System.out.println("Ini parent motor");
    }

    public void Warnamotor (String warna) {
        if (warna.equals("Merah")) {
            System.out.println(Warna.Merah);
        } else if (warna.equals("Biru")) {
            System.out.println(Warna.Biru);
        }else {
            System.out.println("Warna Default");
        }
  }
}
