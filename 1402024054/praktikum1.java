
import java.util.Scanner;

public class praktikum1 {

    public static void main(String[] jian) {
        Scanner scanner = new Scanner(System.in);

        int batasAngka = 5;
        int[] angkaJumlah = new int[batasAngka];

        int i = 0;
        while (i < batasAngka) {
            System.out.print("Masukan Angka ke-" + (i + 1) + ": ");
            angkaJumlah[i] = scanner.nextInt();
            i++;
        }

        int simpanPengecekan = checking(angkaJumlah);
        System.out.println("Angka yang tertinggi: " + simpanPengecekan);
    }

    public static int checking(int[] angkaCheck) {
        int isiKeluaran = angkaCheck[0];
        int i = 1;
        while (i < angkaCheck.length) {
            if (angkaCheck[i] > isiKeluaran) {
                isiKeluaran = angkaCheck[i];
            }
            i++;
        }
        return isiKeluaran;
    }
}
