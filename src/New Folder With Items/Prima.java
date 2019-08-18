import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("P : ");
        int p = scanner.nextInt();
        System.out.print("L : ");
        int l = scanner.nextInt();
        System.out.print("X : ");
        int x = scanner.nextInt();
        x++;

        int totPrima = 0;
        System.out.println("--------");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < p; j++) {
                while (true) {
                    boolean isPrima = true;
                    // Cek prima
                    for (int pembagi = 2; pembagi <= x / 2; pembagi++) {
                        if (x % pembagi == 0) {
                            isPrima = false;
                            break;
                        }
                    }
                    if (x > 1 && isPrima) {
                        System.out.print(x + " ");
                        totPrima += x;
                        x++;
                        break;
                    } else {
                    }
                    x++;
                }
            }
            System.out.println(""); //Enter

        }
        System.out.println("Total : " + totPrima);
    }
}
