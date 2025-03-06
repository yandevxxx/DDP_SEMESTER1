//zild jian xto 
//1402024054

import java.util.Scanner; // Mengimpor class Scanner untuk membaca input dari pengguna.

public class Easy_Cashier { // Mendefinisikan kelas utama program.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna.

        // Daftar menu makanan yang tersedia.
        String[] menuMakanan = {
            "Nasi Putih",
            "Sate Padang",
            "Ayam Bakar Rendang",
            "Soto Padang",
            "Nasi Kapau",
            "Dendeng Balado"
        };

        // Harga masing-masing menu makanan.
        int[] hargaMakanan = {
            12000,
            44000,
            31000,
            27000,
            45000,
            31000
        };

        // Array untuk menyimpan informasi keranjang belanjaan.
        String[] keranjang = new String[100]; // Menyimpan Keranjang masing-masing pesanan.
        int[] jumlahPesanan = new int[100]; // Menyimpan jumlah masing-masing pesanan.
        int[] hargaPesanan = new int[100]; // Menyimpan Harga masing-masing pesanan.
        int pesananCount = 0; // Counter untuk jumlah pesanan

        System.out.println("========================================");
        System.out.println("----------Program Easy Cashier----------");
        System.out.println("-------Zild Jian X TO / 1402024054------");
        System.out.println("========================================");

        // Program utama yang berjalan terus-menerus selama pengguna memilih untuk tidak keluar.
        while (true) {
            // Menampilkan menu utama yang tersedia.
            System.out.println("1. Lihat Daftar Menu");
            System.out.println("2. Tambah Menu");
            System.out.println("3. Tambah Pesanan");
            System.out.println("4. Lihat Keranjang");
            System.out.println("5. Bayar");
            System.out.println("6. Keluar");
            System.out.print("Pilih sistem menu: "); // Meminta pengguna untuk memilih menu.
            int pilihan = scanner.nextInt(); // Membaca pilihan menu dari pengguna.
            scanner.nextLine(); // membersih kan buffer input

            // Menangani pilihan menu 1 (Lihat Daftar Menu).
            if (pilihan == 1) {
                System.out.println("================================ Lihat Daftar Menu ================================");
                System.out.println("No.\tNama Makanan\t\tHarga");

                //menampilkan daftar menu makanan dan juga harga dari makanan
                for (int i = 0; i < menuMakanan.length; i++) {
                    System.out.println((i + 1) + ". \t" + menuMakanan[i] + "\t\t" + hargaMakanan[i]);
                }

                System.out.println("===================================================================================");
                // Menanyakan apakah pengguna ingin kembali ke menu awal.
                System.out.print("Ingin kembali ke menu awal (Y/T)? ");
                char kembali = scanner.nextLine().charAt(0); // membaca input dari pengguna
                System.out.println("===================================================================================");
                // Mengecek apakah pengguna ingin keluar atau kembali.
                if (kembali == 'T' || kembali == 't') {
                    System.out.println("Program berhenti! terimakasih telah menggunakan program ini");
                    break; // Keluar dari program.
                } else if (kembali == 'y' || kembali == 'Y') {
                    // Jika memilih kembali, program akan melanjutkan ke menu awal.
                } else {
                    // Menangani input yang tidak valid.
                    System.out.println("Maaf Input Yang Anda Masukan Salah");
                    System.out.println("===================================================================================");
                }

                // Menangani pilihan menu 2 (Tambah Menu).
            } else if (pilihan == 2) {

                // Membuat array baru untuk menampung menu yang sudah ditambahkan.
                String[] newMenuMakanan = new String[menuMakanan.length + 1];
                int[] newHargaMakanan = new int[hargaMakanan.length + 1];

                // Menyalin data menu dan harga yang lama ke dalam array baru.
                System.arraycopy(menuMakanan, 0, newMenuMakanan, 0, menuMakanan.length);
                System.arraycopy(hargaMakanan, 0, newHargaMakanan, 0, hargaMakanan.length);

                System.out.println("================================ Tambah Menu ================================");

                // Meminta input nama menu dan harga untuk menu baru.
                System.out.print("Masukkan nama menu: ");
                newMenuMakanan[menuMakanan.length] = scanner.nextLine(); // membaca inputan nama makanan dari pengguna 
                System.out.print("Masukkan harga: ");
                int harga = scanner.nextInt(); // membaca inputan harga makanan dari pengguna 

                // Mengecek apakah harga yang dimasukkan valid (lebih besar dari 0).
                if (harga < 1) {
                    System.out.println("\nMenu Gagal ditambahkan!");
                } else {
                    newHargaMakanan[hargaMakanan.length] = harga; // Menambahkan harga menu baru.
                    menuMakanan = newMenuMakanan; // menyimpan menu makanan baru 
                    hargaMakanan = newHargaMakanan; // menyimpan menu harga makanan baru 
                    System.out.println("\nMenu berhasil ditambahkan!");
                }

                scanner.nextLine(); // menghilangkan buffer 
                System.out.println("===================================================================================");

                // Menanyakan apakah pengguna ingin kembali ke menu awal.
                System.out.print("Ingin kembali ke menu awal (Y/T)? ");
                char kembali = scanner.nextLine().charAt(0); // membaca inputan kembali dari si penggunna 
                System.out.println("===================================================================================");

                if (kembali == 'T' || kembali == 't') {
                    System.out.println("Program berhenti! terimakasih telah menggunakan program ini");
                    break; // Keluar dari program.
                } else if (kembali == 'y' || kembali == 'Y') {
                    // Jika memilih kembali, program akan melanjutkan ke menu awal.
                } else {
                    // Menangani input yang tidak valid.
                    System.out.println("Maaf Input Yang Anda Masukan Salah");
                    System.out.println("===================================================================================");
                }

                // Menangani pilihan menu 3 (Tambah Pesanan).
            } else if (pilihan == 3) {
                // Mengecek apakah jumlah pesanan sudah mencapai batas maksimal.
                if (pesananCount < 100) {
                    System.out.println("================================ Tambah Pesanan ================================");

                    System.out.println("Daftar Menu:");
                    for (int i = 0; i < menuMakanan.length; i++) {
                        System.out.println((i + 1) + ". " + menuMakanan[i]); // Menampilkan daftar menu yang tersedia.
                    }

                    System.out.print("Pilih nomor menu: ");
                    int menuPilih = scanner.nextInt(); // Membaca pilihan menu dari pengguna.
                    scanner.nextLine(); // Membaca jumlah pesanan.

                    if (menuPilih >= 1 && menuPilih <= menuMakanan.length) {
                        System.out.print("Masukkan jumlah pesanan: ");
                        int jumlah = scanner.nextInt(); // Membaca jumlah pesanan.
                        scanner.nextLine(); // Membaca jumlah pesanan.

                        // Menambahkan pesanan ke dalam keranjang.
                        keranjang[pesananCount] = menuMakanan[menuPilih - 1];
                        jumlahPesanan[pesananCount] = jumlah;
                        hargaPesanan[pesananCount] = hargaMakanan[menuPilih - 1] * jumlah;
                        pesananCount++; // menambahkan jumlah pesanan

                        System.out.println("Pesanan berhasil ditambahkan!");
                    } else if (menuPilih <= 0) { // mengecek apakah menu pilihan 0 dan kurang dari nol
                        System.out.println("Jumlah Pesanan Harus Lebih Dari Nol");
                    } else {
                        System.out.println("Menu Pilihan Tidak Tersedia");
                    }
                } else {
                    System.out.println("Maaf, maksimal pesanan adalah 100!"); // Jika pesanan mencapai 100, tidak bisa menambah lagi.
                }

                System.out.println("===================================================================================");
                System.out.print("Ingin kembali ke menu awal (Y/T)? ");
                char kembali = scanner.nextLine().charAt(0); //membaca inputan kembali pengguna
                System.out.println("===================================================================================");

                if (kembali == 'T' || kembali == 't') {
                    System.out.println("Program berhenti! terimakasih telah menggunakan program ini");
                    break; // Keluar dari program.
                } else if (kembali == 'y' || kembali == 'Y') {
                    // Jika memilih kembali, program akan melanjutkan ke menu awal.
                } else {
                    // Menangani input yang tidak valid.
                    System.out.println("Maaf Input Yang Anda Masukan Salah");
                    System.out.println("===================================================================================");
                }

                // Menangani pilihan menu 4 (Lihat Keranjang).
            } else if (pilihan == 4) {
                System.out.println("================================ Lihat Keranjang ================================");

                // Mengecek apakah ada pesanan di keranjang.
                if (pesananCount == 0) {
                    System.out.println("Keranjang kosong!");
                } else {
                    int totalHarga = 0; // Variabel untuk menghitung total harga.
                    for (int i = 0; i < pesananCount; i++) {
                        // Menampilkan daftar pesanan di keranjang beserta jumlah dan harga.
                        System.out.println(keranjang[i] + "\t" + " x " + jumlahPesanan[i] + " = " + hargaPesanan[i]);
                        totalHarga += hargaPesanan[i]; // Menambahkan harga ke total.
                    }
                    System.out.println("Total Harga: " + totalHarga); // Menampilkan total harga.
                }

                System.out.println("===================================================================================");
                System.out.print("Ingin kembali ke menu awal (Y/T)? ");
                char kembali = scanner.nextLine().charAt(0);
                System.out.println("===================================================================================");

                if (kembali == 'T' || kembali == 't') {
                    System.out.println("Program berhenti! terimakasih telah menggunakan program ini");
                    break; // Keluar dari program.
                } else if (kembali == 'y' || kembali == 'Y') {
                    // Jika memilih kembali, program akan melanjutkan ke menu awal.
                } else {
                    // Menangani input yang tidak valid.
                    System.out.println("Maaf Input Yang Anda Masukan Salah");
                    System.out.println("===================================================================================");
                }

                // Menangani pilihan menu 5 (Bayar).
            } else if (pilihan == 5) {
                System.out.println("================================ Bayar ================================");

                // Mengecek apakah ada pesanan di keranjang.
                if (pesananCount == 0) {
                    System.out.println("Keranjang kosong! Tidak ada yang perlu dibayar.");
                } else {
                    int totalHarga = 0; // Variabel untuk menghitung total harga.
                    for (int i = 0; i < pesananCount; i++) {
                        totalHarga += hargaPesanan[i]; // Menambahkan harga pesanan ke total.
                    }

                    System.out.println("Total yang harus dibayar: " + totalHarga); // Menampilkan total yang harus dibayar.
                    System.out.print("Masukkan uang pembayaran: ");
                    int bayar = scanner.nextInt(); // Membaca jumlah uang yang dibayar oleh pengguna.
                    scanner.nextLine(); // Membersihkan buffer input.

                    // Mengecek apakah uang yang dibayar cukup.
                    if (bayar >= totalHarga) {
                        System.out.println("Pembayaran berhasil! Kembalian: " + (bayar - totalHarga)); // Menampilkan kembalian.
                        // Mengosongkan keranjang setelah pembayaran.
                        for (int i = 0; i < pesananCount; i++) {
                            keranjang[i] = null;
                            jumlahPesanan[i] = 0;
                            hargaPesanan[i] = 0;
                        }
                        pesananCount = 0; // Mengatur jumlah pesanan menjadi 0.
                        System.out.println("Kerenjang Telah Di Kosongkan.");
                    } else {
                        System.out.println("Uang tidak cukup!"); // Menangani kasus uang tidak cukup.
                    }
                }

                System.out.println("===================================================================================");

                // Menanyakan apakah pengguna ingin kembali ke menu awal.
                System.out.print("Ingin kembali ke menu awal (Y/T)? ");
                char kembali = scanner.nextLine().charAt(0);
                System.out.println("===================================================================================");

                if (kembali == 'T' || kembali == 't') {
                    System.out.println("Program berhenti! terimakasih telah menggunakan program ini");
                    break; // Keluar dari program.
                } else if (kembali == 'y' || kembali == 'Y') {
                    // Jika memilih kembali, program akan melanjutkan ke menu awal.
                } else {
                    // Menangani input yang tidak valid.
                    System.out.println("Maaf Input Yang Anda Masukan Salah");
                    System.out.println("===================================================================================");
                }

                // Menangani pilihan menu 6 (Keluar).
            } else if (pilihan == 6) {
                System.out.println("================================ Keluar ================================");
                System.out.println("Terima kasih telah menggunakan program ini!");
                break; // Keluar dari program.
            }

        }

        scanner.close(); // Menutup scanner setelah program selesai dijalankan.
    }
}
