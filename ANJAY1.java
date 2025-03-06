
import java.util.Scanner;

public class ANJAY1 {

    public static void main(String[] jian) {
        Scanner scanner = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukan Angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }
        System.out.println("Angka yang tertinggi: " + checking(angka));
    }

    public static int checking(int[] checkAngka) {
        int keluaran = checkAngka[0];
        
        for (int angkaHitung : checkAngka) {
            if (angkaHitung > keluaran) {
                keluaran = angkaHitung;
            }
        }
        return keluaran;
    }
}
