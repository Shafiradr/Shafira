import java.util.Scanner;

public class nomor3 {
    public static void main(String[]args){
        char x = 'x';
        char o = 'o';
        int jumlahX = 0;
        int jumlahO= 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan xo (huruf kecil) :");
        String xo = scanner.nextLine();

for (int i = 0; i < xo.length(); i++){
            if (xo.charAt(i) == x){
        jumlahX++;
    } else if(xo.charAt(i) == o) {
            jumlahO++;
        }

    }
if (jumlahX == jumlahO){
        System.out.println(true);
    }else{
        System.out.println(false);
    }

}
}
