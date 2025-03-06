
import java.util.Arrays;
import java.util.Scanner;

public class OpenTrip_1402024054 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------");
        System.out.println("-----------------Selamat Datang Di Program-------------------");
        System.out.println("-----------------Open Trip Summit Indonesia -----------------");
        System.out.println("-----------------Zild Jian X TO / 1402024054-----------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Selamat datang diprogram Open Trip Summit Seluruh Indonesia!");
        System.out.println("Tertarik Ikut Pendakian? Silahkan daftarkan diri anda sekarang!");

        System.out.print("Masukan Nama : ");
        String namaPengguna = input.nextLine();

        System.out.print("Masukan Umur : ");
        int umurPengguna = input.nextInt();

        String[] jenisPendakian = {"Tektok", "Camping"};

        String[][] listGunung = {
            {"Gunung Kawah Ratu", "Gunung Pulosari", "Gunung Prau", "Gunung Andong"},
            {"Gunung Semeru", "Gunung Rinjani", "Gunung Kerinci", "Gunung Latimojong"}
        };

        String estimasiWaktu[] = {"2 hari 1 malam ", "3 hari 2 malam", "4 hari 3 malam"};

        String biayaSewaPorter[] = {"150000", "300000", "500000"};
        int biayaPendakian[] = {300000, 700000};

        if (umurPengguna >= 18) {

            System.out.println("Pilih Jenis Pendakian: ");
            System.out.println("1." + jenisPendakian[0]);
            System.out.println("2." + jenisPendakian[1]);
            System.out.print("~Pilih : ");
            int pendakianPilihan = input.nextInt();
            input.nextLine();

            if (pendakianPilihan == 1) {

                System.out.println("Pilihan Gunung:");
                System.out.println("1." + listGunung[pendakianPilihan - 1][0]);
                System.out.println("2." + listGunung[pendakianPilihan - 1][1]);
                System.out.println("3." + listGunung[pendakianPilihan - 1][2]);
                System.out.println("4." + listGunung[pendakianPilihan - 1][3]);

                System.out.print("~Pilih : ");
                int gunungPilihan = input.nextInt();
                input.nextLine();

                if (gunungPilihan == 1 || gunungPilihan == 2 || gunungPilihan == 3 || gunungPilihan == 4) {
                    System.out.print("Apakah anda membutuhkan Porter: Ya atau Tidak? ");
                    String pilihanKorter = input.nextLine();

                    if (pilihanKorter.equalsIgnoreCase("Ya")) {

                        System.out.print("Masukkan beban tas yang dibawa: ");

                        String bebanTas = input.nextLine();

                        if (bebanTas.equalsIgnoreCase("15L")) {
                            String namaDepaBaru = namaPengguna.toUpperCase();
                            char abjadDepanNama = namaDepaBaru.charAt(0);
                            String baru = namaPengguna.toUpperCase();
                            char abjadBelakangNama = baru.charAt(baru.length() - 1);

                            System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + biayaSewaPorter[0]);

                            System.out.println("-------------------------------------------");

                            System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + abjadDepanNama + abjadBelakangNama + umurPengguna);

                            String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                    + abjadDepanNama + abjadBelakangNama
                                    + String.valueOf(umurPengguna);

                            String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                            System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                            System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                            System.out.println("Total Biaya: Rp." + (biayaPendakian[pendakianPilihan - 1] + Integer.parseInt(biayaSewaPorter[0])));

                            System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                        } else if (bebanTas.equalsIgnoreCase("30L")) {

                            String namaDepaBaru = namaPengguna.toUpperCase();
                            char abjadDepanNama = namaDepaBaru.charAt(0);
                            String baru = namaPengguna.toUpperCase();
                            char abjadBelakangNama = baru.charAt(baru.length() - 1);

                            System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + biayaSewaPorter[1]);

                            System.out.println("-------------------------------------------");

                            System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + abjadDepanNama + abjadBelakangNama + umurPengguna);

                            String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                    + abjadDepanNama + abjadBelakangNama
                                    + String.valueOf(umurPengguna);

                            String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                            System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                            System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                            System.out.println("Total Biaya: Rp." + (biayaPendakian[pendakianPilihan - 1] + Integer.parseInt(biayaSewaPorter[1])));

                            System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                        } else if (bebanTas.equalsIgnoreCase("60L")) {

                            String namaDepaBaru = namaPengguna.toUpperCase();
                            char abjadDepanNama = namaDepaBaru.charAt(0);
                            String baru = namaPengguna.toUpperCase();
                            char abjadBelakangNama = baru.charAt(baru.length() - 1);

                            System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + biayaSewaPorter[2]);

                            System.out.println("-------------------------------------------");

                            System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + abjadDepanNama + abjadBelakangNama + umurPengguna);

                            String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                    + abjadDepanNama + abjadBelakangNama
                                    + String.valueOf(umurPengguna);

                            String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                            System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                            System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                            System.out.println("Total Biaya: Rp." + (biayaPendakian[pendakianPilihan - 1] + Integer.parseInt(biayaSewaPorter[2])));

                            System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                        } else {

                            System.out.println("Maaf Pilihan beban tas yang anda masukkan tidak tersedia.");

                        }

                    } else if (pilihanKorter.equalsIgnoreCase("Tidak")) {

                        String namaDepaBaru = namaPengguna.toUpperCase();
                        char abjadDepanNama = namaDepaBaru.charAt(0);
                        String baru = namaPengguna.toUpperCase();
                        char abjadBelakangNama = baru.charAt(baru.length() - 1);

                        System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + abjadDepanNama + abjadBelakangNama + umurPengguna);

                        String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                + abjadDepanNama + abjadBelakangNama
                                + String.valueOf(umurPengguna);

                        String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                            jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                        System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                        System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                        System.out.println("Total Biaya: Rp." + biayaPendakian[pendakianPilihan - 1]);

                        System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                    } else {
                        System.out.println("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi");
                        System.out.println("pendaftaran dari awal!");
                    }

                } else {

                    System.out.println("Mohon Pilihan Gunung Yang Anda Masukan Tidak Tersedia");
                    System.out.println("Silahkan keluar dari Program!");
                }
            } else if (pendakianPilihan == 2) {

                System.out.println("Pilihan Gunung:");
                System.out.println("1." + listGunung[pendakianPilihan - 1][0]);
                System.out.println("2." + listGunung[pendakianPilihan - 1][1]);
                System.out.println("3." + listGunung[pendakianPilihan - 1][2]);
                System.out.println("4." + listGunung[pendakianPilihan - 1][3]);

                System.out.print("~Pilih : ");
                int gunungPilihan = input.nextInt();

                if (gunungPilihan == 1) {

                    System.out.println("Pilih Estimasi Waktu Pendakian : ");
                    System.out.println("1. " + estimasiWaktu[0]);
                    System.out.println("2. " + estimasiWaktu[1]);
                    System.out.println("3. " + estimasiWaktu[2]);
                    System.out.print("~Pilih : ");
                    int pilihanEstimasi = input.nextInt();
                    input.nextLine();

                    if (pilihanEstimasi == 1 || pilihanEstimasi == 2) {
                        System.out.print("Apakah anda membutuhkan Porter: Ya atau Tidak? ");
                        String pilihanKorter = input.nextLine();

                        if (pilihanKorter.equalsIgnoreCase("Ya")) {

                            System.out.print("Masukkan beban tas yang dibawa: ");

                            String bebanTas = input.nextLine();

                            if (bebanTas.equalsIgnoreCase("15L")) {
                                String namaDepaBaru = namaPengguna.toUpperCase();
                                char abjadDepanNama = namaDepaBaru.charAt(0);
                                String baru = namaPengguna.toUpperCase();
                                char abjadBelakangNama = baru.charAt(baru.length() - 1);

                                System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + biayaSewaPorter[0]);

                                System.out.println("-------------------------------------------");

                                System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + pilihanEstimasi + abjadDepanNama + abjadBelakangNama + umurPengguna);

                                String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                        + String.valueOf(pilihanEstimasi) + abjadDepanNama + abjadBelakangNama
                                        + String.valueOf(umurPengguna);

                                String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                    jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                                System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                                System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                                System.out.println("Total Biaya: Rp." + (biayaPendakian[pendakianPilihan - 1] + Integer.parseInt(biayaSewaPorter[0])));

                                System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                            } else if (bebanTas.equalsIgnoreCase("30L")) {

                                String namaDepaBaru = namaPengguna.toUpperCase();
                                char abjadDepanNama = namaDepaBaru.charAt(0);
                                String baru = namaPengguna.toUpperCase();
                                char abjadBelakangNama = baru.charAt(baru.length() - 1);

                                System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + biayaSewaPorter[1]);

                                System.out.println("-------------------------------------------");

                                System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + pilihanEstimasi + abjadDepanNama + abjadBelakangNama + umurPengguna);

                                String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                        + String.valueOf(pilihanEstimasi) + abjadDepanNama + abjadBelakangNama
                                        + String.valueOf(umurPengguna);

                                String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                    jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                                System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                                System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                                System.out.println("Total Biaya: Rp." + (biayaPendakian[pendakianPilihan - 1] + Integer.parseInt(biayaSewaPorter[1])));

                                System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                            } else if (bebanTas.equalsIgnoreCase("60L")) {

                                String namaDepaBaru = namaPengguna.toUpperCase();
                                char abjadDepanNama = namaDepaBaru.charAt(0);
                                String baru = namaPengguna.toUpperCase();
                                char abjadBelakangNama = baru.charAt(baru.length() - 1);

                                System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + biayaSewaPorter[2]);

                                System.out.println("-------------------------------------------");

                                System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + pilihanEstimasi + abjadDepanNama + abjadBelakangNama + umurPengguna);

                                String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                        + String.valueOf(pilihanEstimasi) + abjadDepanNama + abjadBelakangNama
                                        + String.valueOf(umurPengguna);

                                String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                    jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                                System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                                System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                                System.out.println("Total Biaya: Rp." + (biayaPendakian[pendakianPilihan - 1] + Integer.parseInt(biayaSewaPorter[2])));

                                System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                            } else {

                                System.out.println("Maaf Pilihan beban tas yang anda masukkan tidak tersedia.");

                            }

                        } else if (pilihanKorter.equalsIgnoreCase("Tidak")) {

                            String namaDepaBaru = namaPengguna.toUpperCase();
                            char abjadDepanNama = namaDepaBaru.charAt(0);
                            String baru = namaPengguna.toUpperCase();
                            char abjadBelakangNama = baru.charAt(baru.length() - 1);

                            System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + pilihanEstimasi + abjadDepanNama + abjadBelakangNama + umurPengguna);

                            String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                    + String.valueOf(pilihanEstimasi) + abjadDepanNama + abjadBelakangNama
                                    + String.valueOf(umurPengguna);

                            String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                            System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                            System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                            System.out.println("Total Biaya: Rp." + biayaPendakian[pendakianPilihan - 1]);

                            System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                        } else {
                            System.out.println("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi");
                            System.out.println("pendaftaran dari awal!");
                        }

                    } else if (pilihanEstimasi == 3) {

                        System.out.println("Maaf Pilihan Estimasi Pendakian di Gunung Semeru melebihi Batas");
                        System.out.println("Waktu Maksimal yang diizinkan. Silahkan ulangi pendaftaran dari awal!");

                    } else {

                        System.out.println("Mohon Pilihan Estimasi Yang Anda Masukan Tidak Tersedia");
                        System.out.println("Silahkan keluar dari Program!");

                    }

                } else if (gunungPilihan == 2 || gunungPilihan == 3 || gunungPilihan == 4) {

                    System.out.println("Pilih Estimasi Waktu Pendakian : ");
                    System.out.println("1. " + estimasiWaktu[0]);
                    System.out.println("2. " + estimasiWaktu[1]);
                    System.out.println("3. " + estimasiWaktu[2]);
                    System.out.print("~Pilih : ");
                    int pilihanEstimasi = input.nextInt();
                    input.nextLine();

                    if (pilihanEstimasi == 1 || pilihanEstimasi == 2 || pilihanEstimasi == 3) {
                        System.out.print("Apakah anda membutuhkan Porter: Ya atau Tidak? ");
                        String pilihanKorter = input.nextLine();

                        if (pilihanKorter.equalsIgnoreCase("Ya")) {

                            System.out.print("Masukkan beban tas yang dibawa: ");

                            String bebanTas = input.nextLine();

                            if (bebanTas.equalsIgnoreCase("15L")) {
                                String namaDepaBaru = namaPengguna.toUpperCase();
                                char abjadDepanNama = namaDepaBaru.charAt(0);
                                String baru = namaPengguna.toUpperCase();
                                char abjadBelakangNama = baru.charAt(baru.length() - 1);

                                System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + biayaSewaPorter[0]);

                                System.out.println("-------------------------------------------");

                                System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + pilihanEstimasi + abjadDepanNama + abjadBelakangNama + umurPengguna);

                                String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                        + String.valueOf(pilihanEstimasi) + abjadDepanNama + abjadBelakangNama
                                        + String.valueOf(umurPengguna);

                                String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                    jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                                System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                                System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                                System.out.println("Total Biaya: Rp." + (biayaPendakian[pendakianPilihan - 1] + Integer.parseInt(biayaSewaPorter[0])));

                                System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                            } else if (bebanTas.equalsIgnoreCase("30L")) {

                                String namaDepaBaru = namaPengguna.toUpperCase();
                                char abjadDepanNama = namaDepaBaru.charAt(0);
                                String baru = namaPengguna.toUpperCase();
                                char abjadBelakangNama = baru.charAt(baru.length() - 1);

                                System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + biayaSewaPorter[1]);

                                System.out.println("-------------------------------------------");

                                System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + pilihanEstimasi + abjadDepanNama + abjadBelakangNama + umurPengguna);

                                String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                        + String.valueOf(pilihanEstimasi) + abjadDepanNama + abjadBelakangNama
                                        + String.valueOf(umurPengguna);

                                String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                    jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                                System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                                System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                                System.out.println("Total Biaya: Rp." + (biayaPendakian[pendakianPilihan - 1] + Integer.parseInt(biayaSewaPorter[1])));

                                System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                            } else if (bebanTas.equalsIgnoreCase("60L")) {

                                String namaDepaBaru = namaPengguna.toUpperCase();
                                char abjadDepanNama = namaDepaBaru.charAt(0);
                                String baru = namaPengguna.toUpperCase();
                                char abjadBelakangNama = baru.charAt(baru.length() - 1);

                                System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp." + biayaSewaPorter[2]);

                                System.out.println("-------------------------------------------");

                                System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + pilihanEstimasi + abjadDepanNama + abjadBelakangNama + umurPengguna);

                                String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                        + String.valueOf(pilihanEstimasi) + abjadDepanNama + abjadBelakangNama
                                        + String.valueOf(umurPengguna);

                                String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                    jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                                System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                                System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                                System.out.println("Total Biaya: Rp." + (biayaPendakian[pendakianPilihan - 1] + Integer.parseInt(biayaSewaPorter[2])));

                                System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                            } else {

                                System.out.println("Maaf Pilihan beban tas yang anda masukkan tidak tersedia.");

                            }

                        } else if (pilihanKorter.equalsIgnoreCase("Tidak")) {

                            String namaDepaBaru = namaPengguna.toUpperCase();
                            char abjadDepanNama = namaDepaBaru.charAt(0);
                            String baru = namaPengguna.toUpperCase();
                            char abjadBelakangNama = baru.charAt(baru.length() - 1);

                            System.out.println("Kode Daftar anda " + pendakianPilihan + gunungPilihan + pilihanEstimasi + abjadDepanNama + abjadBelakangNama + umurPengguna);

                            String kodeDaftar = String.valueOf(pendakianPilihan) + String.valueOf(gunungPilihan)
                                    + String.valueOf(pilihanEstimasi) + abjadDepanNama + abjadBelakangNama
                                    + String.valueOf(umurPengguna);

                            String[] informasiAnda = {namaPengguna, String.valueOf(umurPengguna),
                                jenisPendakian[pendakianPilihan - 1], kodeDaftar};

                            System.out.println("Informasi tentang anda " + Arrays.toString(informasiAnda));

                            System.out.println("Biaya pendakian: Rp." + biayaPendakian[pendakianPilihan - 1]);

                            System.out.println("Total Biaya: Rp." + biayaPendakian[pendakianPilihan - 1]);

                            System.out.println("Terimakasih telah mendaftarkan diri di Open Trip Summit!");

                        } else {
                            System.out.println("Maaf Pilihan yang anda masukkan tidak tersedia. Silahkan ulangi");
                            System.out.println("pendaftaran dari awal!");
                        }
                    } else {

                        System.out.println("Mohon Pilihan Estimasi Yang Anda Masukan Tidak Tersedia");
                        System.out.println("Silahkan keluar dari Program!");

                    }

                } else {

                    System.out.println("Mohon Pilihan Gunung Yang Anda Masukan Tidak Tersedia");
                    System.out.println("Silahkan keluar dari Program!");

                }

            } else {
                System.out.println("Mohon Pilihan Pendakian Yang Anda Masukan Tidak Tersedia");
                System.out.println("Silahkan keluar dari Program!");
            }

        } else {

            System.out.println("Mohon Maaf Umur anda masih kurang untuk mendaftarkan diri,");
            System.out.println("Silahkan keluar dari Program!");

        }
    }
}
