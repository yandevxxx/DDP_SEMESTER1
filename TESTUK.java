
import java.util.Arrays;
import java.util.Scanner;

public class TESTUK {

    public static void main(String[] Output) {
        Scanner input = new Scanner(System.in);

        int[] simpanArray = new int[3];
        int[] inputPengguna = new int[3];

        String[] huruf = {
            "pertama", "kedua", "ketiga"
        };

        for (int i = 0; 0 < simpanArray.length; i++) {
            System.out.print("Simpan Angka Slot Array " + huruf[i] + ": ");
            inputPengguna[i] = input.nextInt();
            simpanArray[i] = inputPengguna[i];
            if (i > 1) {
                break;
            }
        }

        System.out.println("List Isi Array" + Arrays.toString(simpanArray));
        System.out.print("Pilih dua Slot array yang akan di kalikan : ");
        int pilih1 = input.nextInt() - 1;
        int pilih2 = input.nextInt() - 1;

        int hasil = simpanArray[pilih1] * simpanArray[pilih2];
        System.out.println(simpanArray[pilih1] + " dikalikan " + simpanArray[pilih2] + " hasilnya " + hasil);
        System.out.println("character yang di dapaat" + (char) hasil);

    }
}
