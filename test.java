//Zild Jian X TO 
//1402024054

import java.util.Scanner;

public class test {

    static Scanner input = new Scanner(System.in);
    static String[] listAkun = new String[5];
    static String[] listFilm = new String[100];
    static int[] kursiTersedia = new int[100];
    static boolean[] penambahanFilm = new boolean[100];
    static boolean adminLogin = false;
    static int jumlahAkunPengguna = 0;
    static int jumlahFilm = 4;
    static boolean[][] kursiBookingan = new boolean[100][50];

    public static void main(String[] Jiann) {
        System.out.println("==============================================================================");
        System.out.println("                     Program Absolute Cinema");
        System.out.println("                     Dibuat Oleh : Zild Jian Xto / 1402024054");
        System.out.println("==============================================================================");

        listFilm[0] = "5 cm";
        listFilm[1] = "Your Name";
        listFilm[2] = "Twenty Five Twenty One";
        listFilm[3] = "La La Land";

        for (int i = 0; i < jumlahFilm; i++) {
            kursiTersedia[i] = 50;
            penambahanFilm[i] = true;
        }

        while (true) {
            System.out.println("\n=== Login ===");
            System.out.print("Masukkan username: ");
            String username = input.nextLine();

            if (username.equals("admin")) {
                System.out.print("Masukkan password: ");
                String password = input.nextLine();
                if (password.equals("admin")) {
                    adminLogin = true;
                    System.out.println("Selamat datang kembali, " + username + "!");
                    adminMenu();
                } else {
                    System.out.println("Password salah!");
                }
            } else {
                guestLogin(username);
            }
        }
    }

    public static void guestLogin(String username) {

        boolean statusAkun = false;

        for (int i = 0; i < jumlahAkunPengguna; i++) {
            if (listAkun[i].equals(username)) {
                statusAkun = true;
            }
        }

        if (statusAkun) {
            System.out.println("Selamat datang kembali, " + username + "!");
            guestMenu();
        } else {
            if (jumlahAkunPengguna <= 4) {
                listAkun[jumlahAkunPengguna] = username;
                jumlahAkunPengguna++;
                System.out.println(username + " berhasil didaftarkan.");
                System.out.println("Selamat datang, " + username + "!");
                guestMenu();
            } else {
                System.out.println("Maksimal pengguna yang dapat terdaftar adalah 5.");
            }
        }
    }

    public static void guestMenu() {
        while (true) {
            System.out.println("\n=== Menu Guest ===");
            System.out.println("1. Lihat Daftar Film");
            System.out.println("2. Pesan Kursi");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    viewFilms();
                    break;
                case 2:
                    bookSeat();
                    break;
                case 0:
                    System.out.println("Anda telah logout.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void viewFilms() {
        System.out.println("\n=== Daftar Film ===");
        for (int i = 0; i < jumlahFilm; i++) {
            if (penambahanFilm[i]) {
                System.out.println((i + 1) + ". " + listFilm[i] + " (Kursi tersedia: " + kursiTersedia[i] + ")");
            }
        }
    }

    public static void bookSeat() {
        viewFilms();
        System.out.print("Pilih nomor film: ");
        int filmChoice = input.nextInt() - 1;
        if (filmChoice < 0 || filmChoice >= jumlahFilm || !penambahanFilm[filmChoice]) {
            System.out.println("Film tidak valid.");
            return;
        }

        System.out.println("Kursi tersedia:");
        for (int i = 1; i <= 50; i++) {
            if (!kursiBookingan[filmChoice][i - 1]) {
                System.out.print(i < 10 ? "0" + i + " " : i + " ");
            } else {
                System.out.print("XX ");
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        int seatChoice;
        boolean validSeat = false;

        while (!validSeat) {
            System.out.print("Pilih nomor kursi: ");
            seatChoice = input.nextInt();

            if (seatChoice < 1 || seatChoice > 50) {
                System.out.println("Nomor kursi tidak valid. Silakan pilih kursi antara 1 dan 50.");
            } else if (kursiBookingan[filmChoice][seatChoice - 1]) {
                System.out.println("Kursi sudah dipesan, silakan pilih kursi lain.");
            } else {
                kursiBookingan[filmChoice][seatChoice - 1] = true;
                kursiTersedia[filmChoice]--;
                System.out.println("Kursi nomor " + seatChoice + " berhasil dipesan.");
                validSeat = true;
            }
        }
    }

    public static void adminMenu() {
        while (true) {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Lihat Daftar Film");
            System.out.println("2. Tambah Film");
            System.out.println("3. Edit Film");
            System.out.println("4. Hapus Film");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    viewFilms();
                    break;
                case 2:
                    addFilm();
                    break;
                case 3:
                    editFilm();
                    break;
                case 4:
                    deleteFilm();
                    break;
                case 0:
                    System.out.println("Anda telah logout.");
                    adminLogin = false;
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void addFilm() {
        if (jumlahFilm >= 5) {
            System.out.println("Maksimal film telah tercapai. Tidak bisa menambahkan film baru.");
            return;
        }

        System.out.print("Masukkan nama film baru: ");
        String newFilm = input.nextLine();

        listFilm[jumlahFilm] = newFilm;
        kursiTersedia[jumlahFilm] = 50;
        penambahanFilm[jumlahFilm] = true;
        jumlahFilm++;

        System.out.println("Film " + newFilm + " berhasil ditambahkan.");
    }

    public static void editFilm() {
        System.out.println("\n=== Daftar Film ===");
        for (int i = 0; i < jumlahFilm; i++) {
            if (penambahanFilm[i]) {
                System.out.println((i + 1) + ". " + listFilm[i] + " (Kursi tersedia: " + kursiTersedia[i] + ")");
            }
        }

        System.out.print("Pilih nomor film yang ingin diedit: ");
        int filmChoice = input.nextInt() - 1;
        input.nextLine();

        if (filmChoice < 0 || filmChoice >= jumlahFilm || !penambahanFilm[filmChoice]) {
            System.out.println("Film tidak valid.");
            return;
        }

        System.out.print("Masukkan nama baru untuk film: ");
        String newName = input.nextLine();
        listFilm[filmChoice] = newName;
        System.out.println("Film berhasil diperbarui.");
    }

    public static void deleteFilm() {
        System.out.println("\n=== Daftar Film ===");
        for (int i = 0; i < jumlahFilm; i++) {
            if (penambahanFilm[i]) {
                System.out.println((i + 1) + ". " + listFilm[i] + " (Kursi tersedia: " + kursiTersedia[i] + ")");
            }
        }

        System.out.print("Pilih nomor film yang ingin dihapus: ");
        int filmChoice = input.nextInt() - 1;
        input.nextLine();

        if (filmChoice < 0 || filmChoice >= jumlahFilm || !penambahanFilm[filmChoice]) {
            System.out.println("Film tidak valid.");
            return;
        }

        for (int i = filmChoice; i < jumlahFilm - 1; i++) {
            listFilm[i] = listFilm[i + 1];
            kursiTersedia[i] = kursiTersedia[i + 1];
            penambahanFilm[i] = penambahanFilm[i + 1];
        }

        listFilm[jumlahFilm - 1] = null;
        kursiTersedia[jumlahFilm - 1] = 0;
        penambahanFilm[jumlahFilm - 1] = false;

        jumlahFilm--;

        System.out.println("Film berhasil dihapus.");
    }

}
