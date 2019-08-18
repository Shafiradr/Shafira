public class coba {
    /*//luas segitiga, persegi, persegi panjang, lingkaran
    public void LuasPersegiPanjang(int panjang, int lebar) {
        int luas = panjang * lebar;
        System.out.println("Luas MenghitungLuasdanKeliling.Persegi Panjang : " + luas);
    }

        public void LuasPersegi(int sisi) {
            int luas = sisi * sisi;
            System.out.println("Luas MenghitungLuasdanKeliling.Persegi : " + luas);

        }

        public void LuasSegitiga (int alas, int tinggi) {
        double luas = 0.5 * alas * tinggi ;
        System.out.println("Luas MenghitungLuasdanKeliling.Segitiga : " + luas);


        }
        public void LuasLingkaran (int r){
        double luas = 3.14 * r * r;
        System.out.println ("Luas Lingkaran : " + luas);

        }
        public static void main(String[] args) {
            coba hasil = new coba();
            hasil.LuasPersegiPanjang(7, 8);
            hasil.LuasPersegi(4);
            hasil.LuasSegitiga( 4, 8);
            hasil.LuasLingkaran (14);

        }*/
// OOP
    public static void main(String[] args) {
   /* motor objMotor = new motor();
    objMotor.jumlahRoda(2);
    objMotor.jenis("yamaha");
    objMotor.Warnamotor("Merah");


motorMatic rodaMatic = new motorMatic();
rodaMatic.getRodaMatic();
}*/
        motor motor = new motor();
        motor.kecepatan(125);

        motorMatic motorMatic = new motorMatic();
        motorMatic.kecepatan(110);

        motorSport motorSport = new motorSport();
        motorSport.kecepatan(350);
    }
}
