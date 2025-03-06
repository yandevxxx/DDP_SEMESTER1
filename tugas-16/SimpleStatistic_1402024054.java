
import java.util.Scanner;

public class SimpleStatistic_1402024054 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner inputPengguna = new Scanner(System.in);

        // Menampilkan judul program
        System.out.println("============================================");
        System.out.println("--------------Simple Statistic--------------");
        System.out.println("---------Zild Jian XTO / 1402024054---------");
        System.out.println("============================================");

        // Variabel untuk kontrol pengulangan program
        int pengulanganSystem = 1;

        // Loop utama program yang akan terus berjalan selama pengulanganSystem bernilai 1
        do {
            // Meminta input jumlah bilangan yang ingin dihitung
            System.out.print("Masukkan jumlah bilangan: ");

            // Validasi input agar hanya angka yang diterima
            while (!inputPengguna.hasNextInt()) {
                System.out.println("Tolong masukan input angka.");
                System.out.print("Masukkan jumlah bilangan: ");
                inputPengguna.next(); // Membersihkan input yang salah
            }

            // Menyimpan jumlah bilangan yang dimasukkan
            int simpanBilangan = inputPengguna.nextInt();

            // Memastikan jumlah bilangan yang dimasukkan adalah angka positif
            while (simpanBilangan <= 0) {
                System.out.println("Tolong masukan angka positif.");
                System.out.print("Masukkan jumlah bilangan: ");
                while (!inputPengguna.hasNextInt()) {
                    System.out.println("Tolong masukan input angka.");
                    System.out.print("Masukkan jumlah bilangan: ");
                    inputPengguna.next(); // Membersihkan input yang salah
                }
                simpanBilangan = inputPengguna.nextInt();
            }

            // Mendeklarasikan array untuk menyimpan bilangan yang dimasukkan pengguna
            int[] bilanganArray = new int[simpanBilangan];
            // Variabel untuk menghitung jumlah bilangan genap, ganjil, dan total
            int totalBilanganGenap = 0;
            int totalBilanganGanjil = 0;
            int total = 0;
            int max = 0;
            int min = 0;

            // Memasukkan bilangan pertama
            System.out.print("Masukkan bilangan ke-1 : ");
            while (!inputPengguna.hasNextInt()) {
                System.out.println("Tolong masukan input angka.");
                System.out.print("Masukkan bilangan ke-1 : ");
                inputPengguna.next(); // Membersihkan input yang salah
            }
            bilanganArray[0] = inputPengguna.nextInt(); // Menyimpan bilangan pertama
            max = bilanganArray[0]; // Menetapkan nilai bilangan pertama sebagai nilai maksimum
            min = bilanganArray[0]; // Menetapkan nilai bilangan pertama sebagai nilai minimum
            total += bilanganArray[0]; // Menambahkan bilangan pertama ke total

            // Mengecek apakah bilangan pertama genap atau ganjil
            if (bilanganArray[0] % 2 == 0) {
                totalBilanganGenap++;
            } else {
                totalBilanganGanjil++;
            }

            // Loop untuk memasukkan bilangan selanjutnya
            for (int i = 1; i < simpanBilangan; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + " : ");
                while (!inputPengguna.hasNextInt()) {
                    System.out.println("Tolong masukan input angka.");
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + " : ");
                    inputPengguna.next(); // Membersihkan input yang salah
                }
                bilanganArray[i] = inputPengguna.nextInt(); // Menyimpan bilangan
                total += bilanganArray[i]; // Menambahkan bilangan ke total

                // Mengecek apakah bilangan tersebut genap atau ganjil
                if (bilanganArray[i] % 2 == 0) {
                    totalBilanganGenap++;
                } else {
                    totalBilanganGanjil++;
                }

                // Mengecek dan memperbarui nilai maksimum dan minimum
                if (bilanganArray[i] > max) {
                    max = bilanganArray[i];
                }
                if (bilanganArray[i] < min) {
                    min = bilanganArray[i];
                }
            }

            // Menghitung rata-rata
            double rataRata = (double) total / simpanBilangan;
            System.out.println("============================================");

            // Menampilkan hasil statistik
            System.out.println("\nHasil Statistik:");
            System.out.println("- Nilai maksimum : " + max);
            System.out.println("- Nilai minimum : " + min);
            System.out.println("- Rata-rata : " + rataRata);
            System.out.println("- Total bilangan genap : " + totalBilanganGenap);
            System.out.println("- Total bilangan ganjil : " + totalBilanganGanjil);
            System.out.println("============================================\n");

            inputPengguna.nextLine(); // Membersihkan buffer input

            // Variabel untuk menampung pilihan pengulangan program
            String simpanInputPengulangan = "";
            boolean inputValid = false;

            // Loop untuk meminta input apakah pengguna ingin mengulang atau tidak
            while (!inputValid) {
                System.out.print("Apakah ingin mengulang program? (ya/tidak) : ");
                simpanInputPengulangan = inputPengguna.nextLine();

                // Menangani jika input adalah "ya" atau "tidak"
                if (simpanInputPengulangan.equalsIgnoreCase("ya")) {
                    pengulanganSystem = 0; // Program akan mengulang jika "ya"
                    inputValid = true;
                } else if (simpanInputPengulangan.equalsIgnoreCase("tidak")) {
                    pengulanganSystem = 1; // Program berhenti jika "tidak"
                    System.out.println("Program selesai. Terima kasih!");
                    inputValid = true;
                } else {
                    System.out.println("Pilihan yang tersedia hanya ya/tidak.");
                }
            }

        } while (pengulanganSystem != 1); // Program akan mengulang jika pengulanganSystem bernilai 0

        inputPengguna.close(); // Menutup Scanner setelah program selesai
    }
}
