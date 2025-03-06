// Nama Zild Jian X TO
// NPM 1402024054

import java.util.Arrays;  // Mengimpor library untuk menggunakan fungsi array 
import java.util.Scanner; // Mengimpor library Scanner untuk membaca input dari pengguna

public class OpenTrip_1402024054 { //Nama class utama, penamaan sesuai dengan nama file java 

    public static void main(String[] args) { // Metode utama untuk menjalankan program
        Scanner input = new Scanner(System.in); // Scanner digunakan untuk menerima input dari pengguna

        // Array ongkosSewa menyimpan biaya sewa porter
        int[] ongkosSewa = {
            500000,
            300000,
            150000
        };

        System.out.println("-------------------------------------------------------------");
        System.out.println("-----------------Selamat Datang Di Program-------------------");
        System.out.println("-----------------Open Trip Summit Indonesia -----------------");
        System.out.println("-----------------Zild Jian X TO / 1402024054-----------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Selamat datang diprogram Open Trip Summit Seluruh Indonesia!");
        System.out.println("Tertarik Ikut Pendakian? Silahkan daftarkan diri anda sekarang!");

        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukan Nama : ");
        String namaPengguna = input.nextLine(); // String digunakan untuk menyimpan nama di variable nama pengguna

        // Meminta pengguna untuk memasukkan umur
        System.out.print("Masukan Umur : ");
        int umurPengguna = input.nextInt();  // Umur disimpan sebagai tipe data integer

        // Validasi umur untuk memastikan pengguna berusia 18 tahun atau lebih
        if (umurPengguna >= 18) {

            // Array untuk jenis pendakian yang tersedia
            String[] typePendakian = {
                "Tektok", // Pendakian jenis Tektok 
                "Camping" // Pendakian jenis Camping
            };

            System.out.println("Pilih Jenis Pendakian: ");
            System.out.println("1. " + typePendakian[0]);
            System.out.println("2. " + typePendakian[1]);

            // Meminta pengguna untuk memilih jenis pendakian
            System.out.print("~Pilih : ");
            int pendakianPilihan = input.nextInt();  // Pilihan pendakian disimpan sebagai integer
            input.nextLine();  // Membersihkan newline

            // Validasi pilihan jenis pendakian yang valid (1 atau 2)
            if (pendakianPilihan == 1 || pendakianPilihan == 2) {

                // Array yang menyimpan pilihan gunung berdasarkan jenis pendakian
                String[][] typeGunung = {
                    {"Kawah Ratu", "Pulosari", "Prau", "Andong"}, // Gunung untuk jenis pendakian Tektok
                    {"Semeru", "Rinjani", "Kerinci", "Latimojong"} // Gunung untuk jenis pendakian Camping
                };

                System.out.println("Pilihan Gunung:");
                System.out.println("1. Gunung " + typeGunung[pendakianPilihan - 1][0]);
                System.out.println("2. Gunung " + typeGunung[pendakianPilihan - 1][1]);
                System.out.println("3. Gunung " + typeGunung[pendakianPilihan - 1][2]);
                System.out.println("4. Gunung " + typeGunung[pendakianPilihan - 1][3]);

                // Meminta pengguna untuk memilih gunung
                System.out.print("~Pilih : ");
                int gunungPilihan = input.nextInt();  // Pilihan gunung disimpan sebagai integer
                input.nextLine();  // Membersihkan newline

                // Menangani jenis pendakian Tektok
                if (pendakianPilihan == 1) {

                    // Validasi apakah pilihan gunung valid (1-4)
                    if (gunungPilihan == 1 || gunungPilihan == 2 || gunungPilihan == 3 || gunungPilihan == 4) {

                        System.out.print("Apakah anda membutuhkan porter: Ya atau Tidak? ");

                        String pilihanBenarTidak = input.nextLine();  // Input string untuk jawaban Ya/Tidak

                        // Jika pengguna membutuhkan porter
                        if (pilihanBenarTidak.equalsIgnoreCase("ya")) {

                            System.out.print("Masukan beban tas yang dibawa: ");

                            String bebanTas = input.nextLine(); // Input string untuk ukuran tas

                            // Variabel untuk menyimpan ID berdasarkan ukuran tas
                            int simpanIdBebanTas = -1;

                            // Menentukan ID berdasarkan ukuran tas dan menyimpanya di simpanidbebantas
                            if (bebanTas.equalsIgnoreCase("60L")) {

                                simpanIdBebanTas = 0;

                            } else if (bebanTas.equalsIgnoreCase("30L")) {

                                simpanIdBebanTas = 1;

                            } else if (bebanTas.equalsIgnoreCase("15L")) {

                                simpanIdBebanTas = 2;

                            }

                            // Array ukuran tas yang valid
                            String[] typeBebanTas = {
                                "60L",
                                "30L",
                                "15L"
                            };

                            // Validasi ukuran tas yang dimasukkan oleh pengguna
                            if (bebanTas.equalsIgnoreCase(typeBebanTas[0]) || bebanTas.equalsIgnoreCase(typeBebanTas[1]) || bebanTas.equalsIgnoreCase(typeBebanTas[2])) {

                                // Biaya pendakian untuk jenis pendakian Tektok
                                int[] ongkosPendakian = {
                                    300000, // Ongkos pendakian untuk Tektok
                                    700000 // Ongkos pendakian untuk Camping
                                };

                                // Menghitung total ongkos dengan biaya sewa porter
                                int ongkosTotal = ongkosPendakian[pendakianPilihan - 1] + ongkosSewa[simpanIdBebanTas];

                                System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + ongkosSewa[simpanIdBebanTas]);
                                System.out.println("------------------------------------------------");

                                // Membuat kode pendaftaran berdasarkan informasi pengguna
                                String namaDepaBaru = namaPengguna.toUpperCase();  // Menjadikan nama pengguna huruf kapital
                                char abjadDepanNama = namaDepaBaru.charAt(0);  // Mengambil huruf pertama nama
                                String baru = namaPengguna.toUpperCase();
                                char abjadBelakangNama = baru.charAt(baru.length() - 1);  // Mengambil huruf terakhir nama

                                // Membuat kode pendaftaran
                                String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                        + abjadDepanNama + abjadBelakangNama
                                        + String.valueOf(umurPengguna);

                                System.out.println("Kode Daftar anda: " + kodeDaftar);

                                // Menampilkan informasi pendakian pengguna
                                String[] informasiPendakian = {
                                    namaPengguna,
                                    String.valueOf(umurPengguna),
                                    typePendakian[pendakianPilihan - 1],
                                    kodeDaftar
                                };

                                // Menampilkan biaya pendakian dan total biaya
                                System.out.println("Informasi tentang anda: " + Arrays.toString(informasiPendakian));

                                System.out.println("Biaya pendakian: Rp." + ongkosPendakian[pendakianPilihan - 1]);
                                System.out.println("Total Biaya: Rp." + ongkosTotal);
                                System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                            } else {

                                // Jika ukuran tas yang dimasukkan tidak valid
                                System.out.print("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi pendaftaran dari awal!");

                            }

                            // Validasi ukuran tas yang dimasukkan oleh pengguna yang bagian tidak
                        } else if (pilihanBenarTidak.equalsIgnoreCase("tidak")) {

                            // Biaya pendakian untuk jenis Camping atau Tektok tanpa porter
                            int[] ongkosPendakian = {
                                300000, // Ongkos pendakian untuk Tektok
                                700000 // Ongkos pendakian untuk Camping
                            };

                            // Menampilkan kode pendaftaran tanpa porter
                            System.out.println("------------------------------------------------");

                            // Membuat kode pendaftaran berdasarkan informasi pengguna
                            String namaDepaBaru = namaPengguna.toUpperCase();  // Menjadikan nama pengguna huruf kapital
                            char abjadDepanNama = namaDepaBaru.charAt(0);  // Mengambil huruf pertama nama
                            String baru = namaPengguna.toUpperCase();
                            char abjadBelakangNama = baru.charAt(baru.length() - 1);  // Mengambil huruf terakhir nama

                            // Membuat kode pendaftaran
                            String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                    + abjadDepanNama + abjadBelakangNama
                                    + String.valueOf(umurPengguna);

                            System.out.println("Kode Daftar anda: " + kodeDaftar);

                            // Menampilkan informasi pendakian
                            String[] informasiPendakian = {
                                namaPengguna,
                                String.valueOf(umurPengguna),
                                typePendakian[pendakianPilihan - 1],
                                kodeDaftar
                            };
                            System.out.println("Informasi tentang anda: " + Arrays.toString(informasiPendakian));

                            System.out.println("Informasi tentang anda: " + Arrays.toString(informasiPendakian));

                            System.out.println("Biaya pendakian: Rp." + ongkosPendakian[pendakianPilihan - 1]);
                            System.out.println("Total Biaya: Rp." + ongkosPendakian[pendakianPilihan - 1]);
                            System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                        } else {

                            // Jika pilihan gunung tidak valid
                            System.out.print("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi pendaftaran dari awal!");

                        }

                    } else {

                        // Jika pilihan jenis pendakian tidak valid
                        System.out.println("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi\n pendaftaran dari awal!");

                    }

                    // Menangani jenis pendakian Camping
                } else if (pendakianPilihan == 2) {

                    // Validasi apakah pilihan gunung valid (1-4)
                    if (gunungPilihan == 1 || gunungPilihan == 2 || gunungPilihan == 3 || gunungPilihan == 4) {

                        // menyimpan estimasi waktu di array string kenapa pakai string karena kita menyimpanya memakai huruf
                        String[] estimasiWaktu = {
                            "2 hari 1 malam",
                            "3 hari 2 malam",
                            "4 hari 3 malam"
                        };

                        System.out.println("Pilih Estimasi Waktu Pendakian : ");
                        System.out.println("1. " + estimasiWaktu[0]);
                        System.out.println("2. " + estimasiWaktu[1]);
                        System.out.println("3. " + estimasiWaktu[2]);

                        // meminta pengguna memilih 
                        System.out.print("~Pilih : ");
                        int pilihanEstimasi = input.nextInt(); // menyimpan inputan pengguna dalam int karna pengguna memasukan

                        // Membersihkan newline
                        input.nextLine();

                        // Validasi apakah pilihan estimasi waktu d3 dan gunung yang di pilih adalah 1 maka akan keluar print di bawah
                        if (gunungPilihan == 1 && pilihanEstimasi == 3) {

                            System.out.print("Maaf Pilihan Estimasi Pendakian di Gunung Semeru melebihi Batas\nWaktu Maksimal yang diizinkan. Silahkan ulangi pendaftaran dari awal!");

                            // jika tidak maka ini yang keluar
                        } else {
                            // Jika estimasi pendakian valid (1 sampai 3)
                            if (pilihanEstimasi >= 1 && pilihanEstimasi <= 3) {

                                // Menanyakan apakah pengguna membutuhkan porter
                                System.out.print("Apakah anda membutuhkan porter: Ya atau Tidak? ");
                                String simpanIdBebanTasPilihanYN = input.nextLine(); // Mengambil input dari pengguna

                                // Jika pengguna memilih membutuhkan porter
                                if (simpanIdBebanTasPilihanYN.equalsIgnoreCase("ya")) {

                                    // Meminta informasi tentang beban tas yang akan dibawa
                                    System.out.print("Masukan beban tas yang dibawa: ");
                                    String bebanTas = input.nextLine(); // Mengambil input beban tas

                                    // Inisialisasi variabel untuk menyimpan ID beban tas yang dipilih
                                    int simpanIdBebanTas = -1;

                                    // Menentukan ID beban tas berdasarkan pilihan
                                    if (bebanTas.equalsIgnoreCase("60L")) {

                                        simpanIdBebanTas = 0; // 60L tas

                                    } else if (bebanTas.equalsIgnoreCase("30L")) {

                                        simpanIdBebanTas = 1; // 30L tas

                                    } else if (bebanTas.equalsIgnoreCase("15L")) {

                                        simpanIdBebanTas = 2; // 15L tas

                                    }

                                    // Array untuk menyimpan batasan ukuran beban tas
                                    String[] batasBebanTas = {
                                        "60L", // 60L
                                        "30L", // 30L
                                        "15L" // 15L
                                    };

                                    // Jika pilihan beban tas valid (terdaftar dalam batasBebanTas)
                                    if (bebanTas.equals(batasBebanTas[0]) || bebanTas.equals(batasBebanTas[1]) || bebanTas.equals(batasBebanTas[2])) {

                                        // Array untuk menyimpan biaya pendakian berdasarkan pilihan pendakian
                                        int[] ongkosPendakian = {
                                            300000, // Biaya pendakian untuk pilihan 1
                                            700000 // Biaya pendakian untuk pilihan 2
                                        };

                                        System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + ongkosSewa[simpanIdBebanTas]);
                                        System.out.println("------------------------------------------------");

                                        // Membuat kode pendaftaran berdasarkan data pengguna
                                        String namaDepaBaru = namaPengguna.toUpperCase(); // Mengubah nama menjadi kapital
                                        char abjadDepanNama = namaDepaBaru.charAt(0); // Mengambil huruf pertama nama
                                        String baru = namaPengguna.toUpperCase(); // Mengubah nama menjadi kapital
                                        char abjadBelakangNama = baru.charAt(baru.length() - 1); // Mengambil huruf terakhir nama

                                        // Membuat kode pendaftaran berdasarkan berbagai data pengguna
                                        String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan) + String.valueOf(pilihanEstimasi)
                                                + abjadDepanNama + abjadBelakangNama
                                                + String.valueOf(umurPengguna);

                                        // Menampilkan kode pendaftaran
                                        System.out.println("Kode Daftar anda: " + kodeDaftar);

                                        // Menyusun array informasi pendakian yang mencakup nama, umur, dan jenis pendakian
                                        String[] informasiPendakian = {
                                            namaPengguna,
                                            String.valueOf(umurPengguna),
                                            typePendakian[pendakianPilihan - 1],
                                            kodeDaftar
                                        };

                                        // Menampilkan informasi tentang pengguna
                                        System.out.println("Informasi tentang anda: " + Arrays.toString(informasiPendakian));

                                        // Menampilkan biaya pendakian yang sesuai dengan pilihan
                                        System.out.println("Biaya pendakian: Rp." + ongkosPendakian[pendakianPilihan - 1]);

                                        // Menghitung total biaya pendakian
                                        int totalPembayaran = ongkosPendakian[pendakianPilihan - 1] + ongkosSewa[simpanIdBebanTas];
                                        System.out.println("Total Biaya: Rp." + totalPembayaran);

                                        // Menampilkan ucapan terima kasih
                                        System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                                    } else {

                                        // Jika beban tas yang dipilih tidak valid
                                        System.out.print("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi pendaftaran dari awal!");

                                    }

                                    // Jika pengguna memilih tidak membutuhkan porter (tidak)
                                } else if (simpanIdBebanTasPilihanYN.equalsIgnoreCase("tidak")) {

                                    // Jika pengguna tidak memilih porter, biaya hanya berdasarkan biaya pendakian
                                    int[] ongkosPendakian = {
                                        300000, // Biaya pendakian untuk pilihan 1
                                        700000 // Biaya pendakian untuk pilihan 2
                                    };

                                    System.out.println("------------------------------------------------");

                                    // Membuat kode pendaftaran berdasarkan data pengguna
                                    String namaDepaBaru = namaPengguna.toUpperCase(); // Mengubah nama menjadi kapital
                                    char abjadDepanNama = namaDepaBaru.charAt(0); // Mengambil huruf pertama nama
                                    String baru = namaPengguna.toUpperCase();// Mengubah nama menjadi kapital
                                    char abjadBelakangNama = baru.charAt(baru.length() - 1); // Mengambil huruf terakhir nama

                                    // Membuat kode pendaftaran berdasarkan berbagai data pengguna
                                    String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan) + String.valueOf(pilihanEstimasi)
                                            + abjadDepanNama + abjadBelakangNama
                                            + String.valueOf(umurPengguna);

                                    System.out.println("Kode Daftar anda: " + kodeDaftar);

                                    // Menyusun array informasi pendakian yang mencakup nama, umur, dan jenis pendakian
                                    String[] informasiPendakian = {
                                        namaPengguna,
                                        String.valueOf(umurPengguna),
                                        typePendakian[pendakianPilihan - 1],
                                        kodeDaftar
                                    };

                                    // Menampilkan informasi tentang pengguna
                                    System.out.println("Informasi tentang anda: " + Arrays.toString(informasiPendakian));

                                    // Menampilkan biaya pendakian yang sesuai dengan pilihan
                                    System.out.println("Biaya pendakian: Rp." + ongkosPendakian[pendakianPilihan - 1]);

                                    // Menampilkan total biaya pendakian (biaya pendakian saja, tanpa sewa porter)
                                    System.out.println("Total Biaya: Rp." + ongkosPendakian[pendakianPilihan - 1]);
                                    System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                                    // Jika pilihan jawaban tidak valid (selain 'ya' atau 'tidak')
                                } else {

                                    System.out.print("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi pendaftaran dari awal!");

                                }

                                // Jika pilihan pilihan tidak valid maka keluar ini
                            } else {

                                System.out.print("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi pendaftaran dari awal!");

                            }

                        }

                        // Jika pilihan pilihan tidak valid maka keluar ini
                    } else {

                        System.out.print("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi pendaftaran dari awal!");

                    }

                }

                // Jika pilihan pilihan tidak valid maka keluar ini
            } else {

                System.out.print("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi\n pendaftaran dari awal!");

            }

            // Jika pilihan pilihan tidak valid maka keluar ini
        } else {

            System.out.println("Mohon Maaf Umur anda masih kurang untuk mendaftarkan diri,\nSilahkan keluar dari Program!");

        }

    }

}
