// ZILD JIAN XTO
// 1402024054

import java.util.Scanner;  // Mengimpor kelas Scanner untuk input dari pengguna

public class AbsoluteCinema_1402024054 {

    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner inputPengguna = new Scanner(System.in);  // Scanner untuk menerima input pengguna
        int menuPilihan = 0, penggunaTerdaftar = 0, semuaFilm = 0;
        boolean isAdminLogout = false, statusHapusFilm = true, isPenggunaExists = false, statusKursiBoking = false;

        String filmTambahan = "";  // Menyimpan nama film yang ditambahkan oleh admin

        // Array untuk menyimpan data pengguna, film, dan kursi
        String[] penyimpananNameQuest = new String[5];  // Menyimpan nama pengguna
        String[] penyimpananFilm = new String[5];  // Menyimpan daftar film
        String[] menuAdmin = new String[4];  // Menyimpan menu admin
        int[] kursiTersedia = new int[5];  // Menyimpan jumlah kursi yang tersedia untuk setiap film
        boolean[][] pilihNomorKursi = new boolean[100][50];  // Array 2 Dimensi untuk menentukan apakah kursi telah dipesan

        // Array Menyimpan Nama Dan Npm
        String[] dataDiri = {
            "Zild Jian Xto",
            "1402024054"
        };

        // Metode Void untuk print nama dan npm
        nameAndNpm(dataDiri[0], dataDiri[1]);

        // List menu yang tersedia untuk admin
        menuAdmin[0] = "Lihat Daftar Film";
        menuAdmin[1] = "Tambah Film";
        menuAdmin[2] = "Edit Film";
        menuAdmin[3] = "Hapus Film";

        // Daftar film yang tersedia pada awal program
        penyimpananFilm[0] = "5 cm";
        penyimpananFilm[1] = "Your Name";
        penyimpananFilm[2] = "Twenty Five Twenty One";
        penyimpananFilm[3] = "La La Land";

        // Menetapkan jumlah kursi yang tersedia untuk setiap film
        kursiTersedia[0] = 50;
        kursiTersedia[1] = 50;
        kursiTersedia[2] = 50;
        kursiTersedia[3] = 50;

        // Loop utama untuk program
        do {

            // Menghitung jumlah film yang terdaftar
            for (int f = 0; f < penyimpananFilm.length; f++) {
                // Menambah jumlah film terdaftar jika film tidak null
                if (penyimpananFilm[f] != null) {
                    //menambahkan ke list film yang ada
                    semuaFilm += 1;
                }
            }

            System.out.println("\n=== Login ===");
            System.out.print("Masukan username: ");

            //Menyimpan Nama Yang di input oleh pengguna 
            String InputUsername = inputPengguna.next();

            // Jika username admin, maka lanjut ke login admin
            if (InputUsername.equals("admin")) {
                System.out.print("Masukan password: ");

                // menyimpan password yang di input oleh pengguna
                String inputPassword = inputPengguna.next();

                // Memeriksa apakah password yang dimasukkan benar Admin Atau Bukan
                if (inputPassword.equals("admin")) {
                    System.out.println("Selamat datang kembali, " + InputUsername + "!");

                    // Looping untuk Menu Admin 
                    do {

                        // Metode Void untuk mengeluarkan print menuadmin
                        adminMenu(menuAdmin);

                        //menyimpan inputan bertype data byte  untuk memilih menu
                        menuPilihan = inputPengguna.nextByte();

                        // Mengatur keluaran sesuai inputan yang di pilih pengguna
                        switch (menuPilihan) {
                            //jika menu pilihan pengguna di input angka 1
                            case 1:
                                // mengeluarkan print film dan kursi yang tersedia
                                filmAndSeatList(penyimpananFilm, kursiTersedia);
                                break;

                            //jika menu pilihan pengguna di input angka 2
                            case 2:
                                // Menentukan apakah sudah ada ruang kosong untuk menambahkan film baru
                                boolean isFull = true;  // Anggap array penyimpananFilm sudah penuh
                                // Loop untuk memeriksa setiap elemen dalam array penyimpananFilm
                                for (int i = 0; i < penyimpananFilm.length; i++) {
                                    // Jika ditemukan elemen yang null, berarti masih ada ruang kosong
                                    if (penyimpananFilm[i] == null) {
                                        isFull = false;  // Set isFull menjadi false karena ada ruang kosong
                                        break;  // Keluar dari loop karena sudah menemukan ruang kosong
                                    }
                                }

                                // Jika array penyimpananFilm penuh, beri tahu pengguna
                                if (isFull) {
                                    System.out.println("Maksimal film telah tercapai. Tidak bisa menambahkan film baru.");
                                } else {
                                    // Jika masih ada ruang kosong, minta pengguna untuk memasukkan nama film baru
                                    System.out.print("Masukan nama film baru: ");
                                    filmTambahan = new Scanner(System.in).nextLine();  // Membaca nama film baru dari input pengguna

                                    // Loop untuk mencari indeks kosong dan menambahkan film baru
                                    for (int i = 0; i < penyimpananFilm.length; i++) {
                                        if (penyimpananFilm[i] == null) {  // Menemukan ruang kosong
                                            penyimpananFilm[i] = filmTambahan;  // Menambahkan film baru ke array penyimpananFilm
                                            kursiTersedia[i] = 50;  // Menetapkan jumlah kursi yang tersedia (50 kursi)
                                            semuaFilm += 1;  // Menambah jumlah total film yang terdaftar
                                            break;  // Keluar dari loop setelah berhasil menambahkan film baru
                                        }
                                    }
                                    // Menampilkan pesan bahwa film berhasil ditambahkan
                                    System.out.println("Film " + filmTambahan + " berhasil ditambahkan.");
                                }

                                // Mengatur status logout admin ke false, menandakan admin masih aktif
                                isAdminLogout = false;
                                break;

                            //jika menu pilihan pengguna di input angka 3
                            case 3:
                                // mengeluarkan list film dan kursi yang tersedia 
                                filmAndSeatList(penyimpananFilm, kursiTersedia);
                                System.out.print("Pilih nomor yang ingin diedit: ");
                                // menyimpan inputan nomor yang di input oleh pengguna 
                                int number = inputPengguna.nextByte();

                                // Memeriksa apakah nomor film yang dipilih valid (antara 1 hingga jumlah film yang ada)
                                if (number >= 0 && number <= semuaFilm) {
                                    // Jika nomor film valid, meminta admin untuk memasukkan nama baru untuk film yang dipilih
                                    System.out.print("Masukan nama baru untuk film: ");
                                    filmTambahan = new Scanner(System.in).nextLine();  // Membaca nama film baru dari input pengguna

                                    // Menampilkan pesan bahwa film telah berhasil diperbarui
                                    System.out.println("Film berhasil diperbarui.");

                                    // Mengupdate nama film di array penyimpananFilm pada indeks yang sesuai (number - 1)
                                    penyimpananFilm[number - 1] = filmTambahan;  // Film yang terpilih pada indeks (number - 1) diganti dengan film baru

                                    // Mengatur status logout admin menjadi false karena admin tidak logout setelah edit film
                                    isAdminLogout = false;
                                } else {
                                    // Jika nomor film tidak valid (di luar range), beri tahu admin bahwa nomor film salah
                                    System.out.println("Nomor film tidak valid.");

                                    // Mengatur status logout admin menjadi true untuk keluar dari menu admin setelah kesalahan
                                    isAdminLogout = true;
                                }

                                break;

                            //jika menu pilihan pengguna di input angka 4
                            case 4:
                                //mengeluarkan list film dan kursi yang tersedia
                                filmAndSeatList(penyimpananFilm, kursiTersedia);
                                System.out.print("Pilih nomor film yang ingin dihapus: ");

                                // menyimpan inputan nomor yang di input pengguna
                                number = inputPengguna.nextByte();

                                // Memeriksa apakah nomor film yang dipilih valid (antara 1 hingga jumlah film yang ada)
                                if (number >= 0 && number <= semuaFilm) {

                                    // Memeriksa apakah nomor film lebih besar atau sama dengan panjang array penyimpananFilm
                                    if (number - 1 >= penyimpananFilm.length) {
                                        // Jika nomor film melebihi panjang array, set statusHapusFilm ke false (gagal hapus)
                                        statusHapusFilm = false;
                                    } // Memeriksa apakah film yang dipilih null (belum ada film pada posisi tersebut)
                                    else if (penyimpananFilm[number - 1] == null) {
                                        // Jika film yang dipilih adalah null, set statusHapusFilm ke false (gagal hapus)
                                        statusHapusFilm = false;
                                    } else {
                                        // Jika nomor film valid dan film ada, lakukan perulangan untuk menghapus film
                                        for (int i = (number - 1); i < penyimpananFilm.length; i++) {

                                            // Jika posisi indeks adalah posisi terakhir dalam array penyimpananFilm
                                            if (i == (penyimpananFilm.length - 1)) {
                                                // Menghapus film dan mengatur kursi tersedia menjadi 0 pada posisi terakhir
                                                penyimpananFilm[i] = null;
                                                kursiTersedia[i] = 0;
                                            } // Jika bukan posisi terakhir, geser semua elemen ke kiri
                                            else {
                                                penyimpananFilm[i] = penyimpananFilm[i + 1];
                                                kursiTersedia[i] = kursiTersedia[i + 1];
                                            }
                                        }
                                    }

                                    // Jika statusHapusFilm false, tampilkan pesan gagal hapus film
                                    if (!statusHapusFilm) {
                                        System.out.println("Film gagal dihapus.");
                                    } else {
                                        // Jika film berhasil dihapus, tampilkan pesan berhasil
                                        System.out.println("Film berhasil dihapus.");
                                    }

                                    // Menetapkan status logout admin menjadi false karena admin tidak logout setelah menghapus film
                                    isAdminLogout = false;
                                } else {
                                    // Jika nomor film tidak valid (di luar rentang), beri tahu admin bahwa nomor film salah
                                    System.out.println("Nomor film tidak valid.");
                                }

                                break;

                            //jika menu pilihan pengguna di input angka 0
                            case 0:
                                // menyimpan status admin login menjadi true (yang berarti tidak login )
                                isAdminLogout = true;
                                System.out.println("Anda telah logout.");
                                break;

                            // selain dari 0 1 2 3 4
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }

                    } while (menuPilihan == 1 || menuPilihan == 2 || menuPilihan == 3 || menuPilihan == 4);
                } else { // bagian jika password admin yang di masukan salah
                    System.out.println("Password salah.");
                    isAdminLogout = true;
                }
                // bagian pengguna memasukan nama dan password
            } else {
                // Melakukan perulangan untuk memeriksa setiap pengguna yang terdaftar
                for (int i = 0; i < penggunaTerdaftar; i++) {

                    // Memeriksa apakah nama pengguna yang dimasukkan (InputUsername) sudah ada dalam array penyimpananNameQuest
                    if (penyimpananNameQuest[i].equals(InputUsername)) {

                        // Jika nama pengguna ditemukan, set variabel isPenggunaExists menjadi true
                        // Menandakan bahwa pengguna dengan username yang dimasukkan sudah terdaftar
                        isPenggunaExists = true;
                    }
                }

                // ini untuk mengecek pengguna sudah terdaftar apa belum
                if (isPenggunaExists) {
                    System.out.println("Selamat datang kembali, " + InputUsername + "!");
                    // ini menyimpan pilihan pengguna 
                    String[] penggunaPilih = {"Lihat Daftar Film", "Pesan Kursi"};

                    do {

                        // ini untuk mengeluarkan printan 
                        penggunaMenuPilihan(penggunaPilih);
                        // menyimpan pilihan menu pilihan pengguna ke dalam variable 
                        menuPilihan = inputPengguna.nextByte();

                        // Memeriksa pilihan menu yang dipilih oleh pengguna
                        switch (menuPilihan) {

                            // Jika pilihan menu adalah 1 (Lihat Daftar Film)
                            case 1:
                                // Memanggil metode untuk menampilkan daftar film dan jumlah kursi yang tersedia
                                filmAndSeatList(penyimpananFilm, kursiTersedia);
                                break;

                            // Jika pilihan menu adalah 2 (Pesan Kursi)
                            case 2:
                                // Menampilkan daftar film dan jumlah kursi yang tersedia
                                filmAndSeatList(penyimpananFilm, kursiTersedia);

                                // Meminta pengguna memilih film yang ingin mereka pesan
                                System.out.print("Pilih nomor film: ");
                                int filmNumber = inputPengguna.nextInt();  // Menyimpan nomor film yang dipilih oleh pengguna

                                // Menampilkan status kursi yang tersedia untuk film yang dipilih
                                System.out.println("Kursi tersedia: ");
                                pengecekanKursiTersedia(pilihNomorKursi, filmNumber);  // Menampilkan kursi yang tersedia untuk film

                                // Melakukan loop untuk memesan kursi hingga pengguna berhasil memesan kursi
                                while (!statusKursiBoking) {
                                    // Meminta pengguna memilih nomor kursi
                                    System.out.print("Pilih nomor kursi: ");
                                    int seatNumberPengguna = inputPengguna.nextInt();  // Menyimpan nomor kursi yang dipilih oleh pengguna

                                    // Memeriksa apakah nomor kursi yang dipilih valid (antara 1 dan 50)
                                    if (seatNumberPengguna < 1 || seatNumberPengguna > 50) {
                                        // Jika nomor kursi tidak valid, tampilkan pesan kesalahan
                                        System.out.println("Nomor kursi tidak valid. Silakan pilih kursi antara 1 dan 50.");
                                    } // Memeriksa apakah kursi sudah dipesan sebelumnya
                                    else if (pilihNomorKursi[filmNumber][seatNumberPengguna - 1]) {
                                        // Jika kursi sudah dipesan, tampilkan pesan kesalahan
                                        System.out.println("Kursi sudah dipesan, silakan pilih kursi lain.");
                                    } // Jika kursi valid dan belum dipesan
                                    else {
                                        // Menampilkan pesan bahwa kursi berhasil dipesan
                                        System.out.println("Kursi nomor " + seatNumberPengguna + " berhasil dipesan.");
                                        statusKursiBoking = true;  // Mengatur status bahwa kursi telah berhasil dipesan
                                        pilihNomorKursi[filmNumber][seatNumberPengguna - 1] = true;  // Menandai kursi sebagai sudah dipesan
                                    }
                                }
                                break;

                            // Jika pilihan menu adalah 0 (Logout)
                            case 0:
                                // Menampilkan pesan bahwa pengguna telah logout
                                System.out.println("Anda telah logout.");
                                isAdminLogout = true;  // Mengatur status logout
                                break;

                            // Jika pilihan menu tidak valid
                            default:
                                // Menampilkan pesan kesalahan jika input menu tidak valid
                                System.out.println("Pilihan menu tidak valid.");
                                break;
                        }

                    } while (menuPilihan == 1 || menuPilihan == 2);

                    // Jika pengguna yang dimasukkan belum terdaftar sebelumnya
                } else {
                    // Memeriksa apakah jumlah pengguna yang terdaftar sudah mencapai batas maksimum (4 pengguna)
                    if (penggunaTerdaftar < 4) {
                        // Jika jumlah pengguna belum mencapai 4, maka pengguna baru berhasil didaftarkan
                        System.out.println(InputUsername + " berhasil didaftarkan.");
                        System.out.println("Selamat datang, " + InputUsername + "!");

                        // Menyiapkan pilihan menu untuk pengguna yang baru terdaftar
                        String[] penggunaPilih = {"Lihat Daftar Film", "Pesan Kursi"};

                        // Menyimpan nama pengguna ke dalam array penyimpananNameQuest
                        penyimpananNameQuest[penggunaTerdaftar] = InputUsername;

                        // Menambah jumlah pengguna terdaftar
                        penggunaTerdaftar += 1;

                        // Menampilkan menu pilihan untuk pengguna yang baru terdaftar
                        do {
                            // Menampilkan pilihan menu bagi pengguna
                            penggunaMenuPilihan(penggunaPilih);

                            // Menerima input pilihan menu
                            menuPilihan = inputPengguna.nextByte();

                            // Mengevaluasi pilihan menu yang dimasukkan oleh pengguna
                            switch (menuPilihan) {
                                // Jika pengguna memilih menu 1 (Lihat Daftar Film)
                                case 1:
                                    // Menampilkan daftar film dan kursi yang tersedia
                                    filmAndSeatList(penyimpananFilm, kursiTersedia);
                                    break;

                                // Jika pengguna memilih menu 2 (Pesan Kursi)
                                case 2:
                                    // Menampilkan daftar film dan kursi yang tersedia
                                    filmAndSeatList(penyimpananFilm, kursiTersedia);
                                    System.out.print("Pilih nomor film: ");

                                    // Menerima input nomor film yang ingin dipilih oleh pengguna
                                    byte filmNumber = inputPengguna.nextByte();
                                    System.out.println("Kursi tersedia: ");

                                    // Menampilkan status kursi yang tersedia untuk film yang dipilih
                                    pengecekanKursiTersedia(pilihNomorKursi, filmNumber);

                                    // Memulai proses pemesanan kursi
                                    while (!statusKursiBoking) {
                                        // Meminta pengguna memilih nomor kursi yang ingin dipesan
                                        System.out.print("Pilih nomor kursi: ");
                                        int seatNumberPengguna = inputPengguna.nextInt();

                                        // Memeriksa apakah nomor kursi yang dimasukkan valid (antara 1 dan 50)
                                        if (seatNumberPengguna < 1 || seatNumberPengguna > 50) {
                                            // Jika nomor kursi tidak valid, memberikan pesan kesalahan
                                            System.out.println("Nomor kursi tidak valid. Silakan pilih kursi antara 1 dan 50.");
                                        } // Memeriksa apakah kursi sudah dipesan
                                        else if (pilihNomorKursi[filmNumber][seatNumberPengguna - 1]) {
                                            // Jika kursi sudah dipesan, memberi tahu pengguna untuk memilih kursi lain
                                            System.out.println("Kursi sudah dipesan, silakan pilih kursi lain.");
                                        } // Jika kursi belum dipesan dan valid
                                        else {
                                            // Mengonfirmasi pemesanan kursi berhasil
                                            System.out.println("Kursi nomor " + seatNumberPengguna + " berhasil dipesan.");

                                            // Mengurangi jumlah kursi yang tersedia
                                            kursiTersedia[filmNumber - 1] -= 1;

                                            // Mengubah status kursi menjadi telah dipesan
                                            statusKursiBoking = true;

                                            // Menandai kursi yang telah dipesan
                                            pilihNomorKursi[filmNumber][seatNumberPengguna - 1] = true;
                                        }
                                    }
                                    break;

                                // Jika pengguna memilih menu 0 (Logout)
                                case 0:
                                    // Menampilkan pesan bahwa pengguna telah logout
                                    isAdminLogout = true;
                                    System.out.println("Anda telah logout.");
                                    break;

                                // Jika pilihan menu tidak valid
                                default:
                                    // Menampilkan pesan kesalahan jika input menu tidak valid
                                    System.out.println("Pilihan menu tidak valid.");
                                    break;
                            }
                        } while (menuPilihan == 1 || menuPilihan == 2); // Loop terus berjalan jika pilihan menu adalah 1 atau 2
                    } else {
                        // Jika jumlah pengguna sudah mencapai batas maksimum (4), menampilkan pesan bahwa tidak bisa menambahkan pengguna baru
                        System.out.println("Maksimal pengguna telah tercapai. Tidak bisa menambahkan pengguna baru.");
                    }
                }
            }
        } while (isAdminLogout);
    }

    // Metode ini menampilkan informasi nama dan NPM
    public static void nameAndNpm(String name, String npm) {
        // Menampilkan judul program dan nama pengguna
        System.out.print("=====================================================\n"
                + "---------------Program Absolute Cinema---------------\n"
                + "--------------" + name);  // Menampilkan nama pengguna yang diberikan
        npmShow(npm);  // Memanggil metode npmShow untuk menampilkan NPM
    }

    // Metode ini menampilkan NPM
    public static void npmShow(String npm) {
        // Menampilkan NPM pengguna
        System.out.print("/" + npm + "--------------\n"
                + "=====================================================");
    }

    // Metode ini menampilkan menu untuk admin berdasarkan array menuAdmin yang diberikan
    public static void adminMenu(String[] menuAdmin) {
        // Menampilkan judul menu admin
        System.out.println("\n=== Menu Admin ===");

        // Loop untuk menampilkan setiap pilihan menu yang ada di array menuAdmin
        for (int c = 0; c < menuAdmin.length; c++) {
            int nomor = c + 1;  // Nomor pilihan menu (dimulai dari 1)
            String adminMenu = menuAdmin[c];  // Mendapatkan nama menu dari array menuAdmin
            System.out.println(nomor + ". " + adminMenu);  // Menampilkan nomor dan nama menu
        }

        // Menampilkan pilihan logout dan meminta input pilihan menu dari admin
        System.out.print("0. Logout\nPilih menu: ");
    }

    // Metode ini menampilkan menu untuk pengguna (guest) berdasarkan array penggunaPilih yang diberikan
    public static void penggunaMenuPilihan(String[] penggunaPilih) {
        // Menampilkan judul menu pengguna
        System.out.println("\n=== Menu Guest ===");

        // Loop untuk menampilkan setiap pilihan menu yang ada di array penggunaPilih
        for (int a = 0; a < penggunaPilih.length; a++) {
            int nomor = a + 1;  // Nomor pilihan menu (dimulai dari 1)
            String Pengguna = penggunaPilih[a];  // Mendapatkan nama menu dari array penggunaPilih
            System.out.println(nomor + ". " + Pengguna);  // Menampilkan nomor dan nama menu
        }

        // Menampilkan pilihan logout dan meminta input pilihan menu dari pengguna
        System.out.print("0. Logout\nPilih menu: ");
    }

    // Metode ini menampilkan daftar film dan jumlah kursi yang tersedia
    public static void filmAndSeatList(String[] penyimpananFilm, int[] kursiTersedia) {
        // Menampilkan judul daftar film
        System.out.println("\n=== Daftar Film ===");

        // Loop untuk menampilkan setiap film beserta jumlah kursi yang tersedia
        for (int d = 0; d < penyimpananFilm.length; d++) {
            int availableSit = kursiTersedia[d];  // Menyimpan jumlah kursi yang tersedia untuk film tertentu
            int nomor = d + 1;  // Nomor film (dimulai dari 1)
            String filmName = penyimpananFilm[d];  // Nama film dari array penyimpananFilm

            // Memastikan bahwa film ada (tidak null) dan masih ada kursi yang tersedia
            if (penyimpananFilm[d] != null && availableSit != 0) {
                // Menampilkan nomor film, nama film, dan jumlah kursi yang tersedia
                System.out.println(nomor + ". " + filmName + " (Kursi tersedia: " + availableSit + ")");
            }
        }
    }

    // Metode ini menampilkan status ketersediaan kursi untuk film tertentu
    public static void pengecekanKursiTersedia(boolean[][] pilihNomorKursi, int filmNumber) {
        // Loop untuk mengecek dan menampilkan status setiap kursi untuk film yang dipilih
        for (int b = 1; b <= 50; b++) {
            // Jika kursi belum dipesan (false), tampilkan nomor kursi
            if (!pilihNomorKursi[filmNumber][b - 1]) {
                // Menampilkan nomor kursi dengan format dua digit (misal 01, 02, dst.)
                System.out.print(b < 10 ? "0" + b + " " : b + " ");
            } else {
                // Jika kursi sudah dipesan, tampilkan "XX" sebagai tanda kursi tidak tersedia
                System.out.print("XX ");
            }

            // Setiap 10 kursi, mulai baris baru untuk mempermudah pembacaan
            if (b % 10 == 0) {
                System.out.println();
            }
        }
    }
}
