
import java.util.Scanner; // Import kelas Scanner untuk input dari pengguna

public class Tugas14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek input untuk membaca input dari pengguna

        // Array untuk menyimpan nama mata uang
        String[] nameUang = {
            "USD (Dolar Amerika Serikat)",
            "EUR (Euro)",
            "JPY (Yen Jepang)",
            "GBP (Pound Inggris)"
        };

        // Menampilkan judul program
        System.out.println("======================================================================");
        System.out.println("===================== Zild Jian X TO / 1402024054 ====================");
        System.out.println("========================= Konversi Mata Uang =========================");
        System.out.println("======================================================================");

        // Perulangan tak terbatas menggunakan for
        for (;;) {
            // Meminta pengguna untuk memasukkan jumlah uang dalam Rupiah
            System.out.print("Masukan jumlah uang dalam Rupiah: ");
            int simpanUang = input.nextInt(); // Membaca inputan uang dalam bentuk integer

            input.nextLine(); // Membaca newline character yang tertinggal setelah nextInt()

            // Menampilkan pilihan mata uang tujuan
            System.out.println("Pilih mata uang tujuan:");
            System.out.println("1. " + nameUang[0] + "\n"
                    + "2. " + nameUang[1] + "\n"
                    + "3. " + nameUang[2] + "\n"
                    + "4. " + nameUang[3] + "\n");
            System.out.print("Masukan pilihan Anda: ");
            int pilihanMataUang = input.nextInt(); // Membaca input pilihan mata uang

            input.nextLine(); // Membaca newline character yang tertinggal setelah nextInt()

            // Variabel untuk menyimpan nilai tukar mata uang
            double kursUSD, kursEUR, kursJPY, kursGBP;

            // Memilih nilai tukar berdasarkan jumlah uang
            if (simpanUang > 1000000) { // Jika jumlah uang lebih dari 1 juta
                kursUSD = 14750; // Nilai tukar USD
                kursEUR = 15750; // Nilai tukar EUR
                kursJPY = 118;   // Nilai tukar JPY
                kursGBP = 17750; // Nilai tukar GBP
            } else { // Jika jumlah uang kurang dari atau sama dengan 1 juta
                kursUSD = 15000; // Nilai tukar USD
                kursEUR = 16000; // Nilai tukar EUR
                kursJPY = 120;   // Nilai tukar JPY
                kursGBP = 18000; // Nilai tukar GBP
            }

            // Melakukan konversi sesuai dengan pilihan mata uang
            switch (pilihanMataUang) {
                case 1: // Jika memilih USD
                    double hasilKonversiUSD = simpanUang / kursUSD; // Menghitung hasil konversi
                    float hasilSeluruhUSD = ((int) (hasilKonversiUSD * 100) / 100.0f); // Membatasi 2 desimal
                    System.out.println("Hasil konversi " + hasilSeluruhUSD + " USD");
                    break;
                case 2: // Jika memilih EUR
                    double hasilKonversiEUR = simpanUang / kursEUR; // Menghitung hasil konversi
                    float hasilSeluruhEUR = ((int) (hasilKonversiEUR * 100) / 100.0f); // Membatasi 2 desimal
                    System.out.println("Hasil konversi " + hasilSeluruhEUR + " EUR");
                    break;
                case 3: // Jika memilih JPY
                    double hasilKonversiJPY = simpanUang / kursJPY; // Menghitung hasil konversi
                    float hasilSeluruhJPY = ((int) (hasilKonversiJPY * 100) / 100.0f); // Membatasi 2 desimal
                    System.out.println("Hasil konversi " + hasilSeluruhJPY + " JPY");
                    break;
                case 4: // Jika memilih GBP
                    double hasilKonversiGBP = simpanUang / kursGBP; // Menghitung hasil konversi
                    float hasilSeluruhGBP = ((int) (hasilKonversiGBP * 100) / 100.0f); // Membatasi 2 desimal
                    System.out.println("Hasil konversi " + hasilSeluruhGBP + " GBP");
                    break;
                default: // Jika pilihan tidak valid
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }

            // Menanyakan apakah pengguna ingin mengulang proses konversi
            System.out.print("Apakah Anda ingin mengulang proses? (Y/T): ");
            String repeatChoice = input.nextLine(); // Membaca input pilihan 'Y' atau 'T'

            // Jika pengguna memilih 'Y', maka proses akan diulang
            if (repeatChoice.equalsIgnoreCase("Y")) {
                continue; // Kembali ke awal perulangan for
            } else if (repeatChoice.equalsIgnoreCase("T")) { // Jika memilih 'T', program selesai
                System.out.println("Terima kasih telah menggunakan program konversi mata uang.");
                break; // Keluar dari perulangan for dan menghentikan program
            } else { // Jika input selain 'Y' atau 'T', program akan keluar
                System.out.println("Pilihan tidak valid. Program akan keluar.");
                break; // Keluar dari perulangan for dan menghentikan program
            }
        }
    }
}
