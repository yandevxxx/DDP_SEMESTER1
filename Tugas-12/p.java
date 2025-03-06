
import java.util.Scanner;

public class p {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------");
        System.out.println("---------------Selamat dateng diprogram----------------------");
        System.out.println("--------------Open Trip Summit Indonesia---------------------");
        System.out.println("---------Askhabul Nur Ardhiansyakh / 1402024012--------------");
        System.out.println("-------------------------------------------------------------");

        System.out.println("Selamat datang diprogram Open Trip Summit Seluruh Indonesia!");
        System.out.println("Tertarik Ikut Pendakian? Silahkan daftarkan diri anda sekarang!");

        String[] pjPendakian = new String[2];
        pjPendakian[0] = "Tektok";
        pjPendakian[1] = "Camping";

        String[] pGunung = new String[4];
        pGunung[0] = "Gunung Semeru";
        pGunung[1] = "Gunung Rinjani";
        pGunung[2] = "Gunung Kerinci";
        pGunung[3] = "Gunung Latimojong";

        String[] tktkGuntung = new String[4];
        tktkGuntung[0] = "Gunung Kawah Ratu";
        tktkGuntung[1] = "Gunung Pulosari";
        tktkGuntung[2] = "Gunung Prau";
        tktkGuntung[3] = "Gunung Andong";

        String[] pEstimasi = new String[3];
        pEstimasi[0] = "2 hari 1 malam";
        pEstimasi[1] = "3 hari 2 malam";
        pEstimasi[2] = "4 hari 3 malam";

        int bpPendakian[] = new int[2];
        bpPendakian[0] = 300000;
        bpPendakian[1] = 700000;

        int bsPorter[] = new int[3];
        bsPorter[0] = 500000;
        bsPorter[1] = 300000;
        bsPorter[2] = 150000;

        Scanner scanDhi = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String mkNama = scanDhi.nextLine();

        System.out.print("Masukan Umur : ");
        int mkUmur = scanDhi.nextInt();

        String[] mkNamaa = new String[1];
        mkNamaa[0] = mkNama;
        int[] mkUmurr = new int[1];
        mkUmurr[0] = mkUmur;

        if (mkUmur >= 18) {

            System.out.println("Pilihan Jenis Pendakian : ");
            System.out.println("1. " + pjPendakian[0]);
            System.out.println("2. " + pjPendakian[1]);

            System.out.print("-Pilih: ");
            int ppjPendakian = scanDhi.nextInt();

            if (ppjPendakian == 2) {

                System.out.println("Pilihan Gunung: ");
                System.out.println("1. " + pGunung[0]);
                System.out.println("2. " + pGunung[1]);
                System.out.println("3. " + pGunung[2]);
                System.out.println("4. " + pGunung[3]);

                System.out.print("-Pilih: ");
                int ppGunung = scanDhi.nextInt();

                if (ppGunung == 1) {
                    System.out.println("Pilih Estimasi Waktu Pendakian:");
                    System.out.println("1. " + pEstimasi[0]);
                    System.out.println("2. " + pEstimasi[1]);
                    System.out.println("3. " + pEstimasi[2]);

                    System.out.print("-Pilih: ");
                    int ppEstimasi = scanDhi.nextInt();
                    scanDhi.nextLine();

                    if (ppEstimasi == 2) {
                        System.out.print("Apakah anda membutuhkan Porter: Ya atau Tidak? ");
                        String memPorter = scanDhi.nextLine();

                        if (memPorter.equalsIgnoreCase("ya")) {

                            System.out.print("Masukkan beban tas yang dibawa: ");
                            String mkBebanTas = scanDhi.nextLine();

                            System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp. " + bsPorter[2]);

                            char dpnNama = mkNama.charAt(0);
                            char akrNama = mkNama.charAt(mkNama.length() - 1);

                            String codeDaftar = String.valueOf(ppjPendakian) + ppGunung + ppEstimasi + dpnNama + akrNama + mkUmur;

                            System.out.println("Kode Daftar anda: " + codeDaftar);

                        }

                    }

                }

            } else if (ppjPendakian == 1) {
                System.out.println("Pilihan Gunung: ");
                System.out.println("1. " + tktkGuntung[0]);
                System.out.println("2. " + tktkGuntung[1]);
                System.out.println("3. " + tktkGuntung[2]);
                System.out.println("4. " + tktkGuntung[3]);

                System.out.print("-Pilih: ");
                int ppGunung = scanDhi.nextInt();

                if (ppGunung == 1) {

                    System.out.print("Apakah anda membutuhkan Porter: Ya atau Tidak? ");
                    String memPorter = scanDhi.nextLine();
                    scanDhi.next();

                    if (memPorter.equalsIgnoreCase("tidak")) {
                        System.out.print("Masukkan beban tas yang dibawa: ");
                        String mkBebanTas = scanDhi.nextLine();
                        System.out.println("Anda dikenakan biaya sewa Jasa Porter: Rp. " + bsPorter[1]);

                    }

                }
            } else {
                System.out.println("Pemilihan tidak valid");
            }

        } else {
            System.out.println("Umur Tidak Cukup");
        }
    }
}
