
import java.util.*;

public class KonversiMataUang_1402024006 {

    public static void main(String[] args) {
        int pilihan = 0, jumlah = 0;
        float rupiah = 0, usd = 0, eur = 0, gbp = 0, jpy = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("\n============================================"
                + "\n=======Aidan Pitra Habibie/1402024006======="
                + "\n=============Konversi Mata Uang============="
                + "\n============================================"
                + "\nMasukan jumlah uang dalam Rupiah: ");
        rupiah = scan.nextInt();
        System.out.print("Pilih mata uang tujuan:\n1. USD (Dolar Amerika Serikat)\n2. EUR (Euro)\n3. JPY (Yen Jepang)\n4. GBP (Pound Inggris)\nMasukan pilihan Anda: ");
        pilihan = scan.nextInt();
        jumlah = (int) (rupiah / 1000001);
        switch (pilihan) {
            case 1:
                switch (jumlah) {
                    case 0:
                        usd = rupiah / 15000;
                        System.out.print("============================================\nHasil konversi: " + ((int) (usd * 100) / 100.0f) + " USD");
                        break;
                    default:
                        usd = rupiah / 14750;
                        System.out.print("============================================\nHasil konversi: " + ((int) (usd * 100) / 100.0f) + " USD");
                        break;
                }
                break;

            case 2:
                switch (jumlah) {
                    case 0:
                        eur = rupiah / 16000;
                        System.out.print("============================================\nHasil konversi: " + ((int) (eur * 100) / 100.0f) + " EUR");
                        break;
                    default:
                        eur = rupiah / 15750;
                        System.out.print("============================================\nHasil konversi: " + ((int) (eur * 100) / 100.0f) + " EUR");
                        break;
                }
                break;

            case 3:
                switch (jumlah) {
                    case 0:
                        jpy = rupiah / 120;
                        System.out.print("============================================\nHasil konversi: " + ((int) (jpy * 100) / 100.0f) + " JPY");
                        break;
                    default:
                        jpy = rupiah / 118;
                        System.out.print("============================================\nHasil konversi: " + ((int) (jpy * 100) / 100.0f) + " JPY");
                        break;
                }
                break;

            case 4:
                switch (jumlah) {
                    case 0:
                        gbp = rupiah / 18000;
                        System.out.print("============================================\nHasil konversi: " + ((int) (gbp * 100) / 100.0f) + " GBP");
                        break;
                    default:
                        gbp = rupiah / 17750;
                        System.out.print("============================================\nHasil konversi: " + ((int) (gbp * 100) / 100.0f) + " GBP");
                        break;
                }
                break;
            default:
                System.out.print("============================================\nPilihan Tidak Valid!");
        }
    }
}
