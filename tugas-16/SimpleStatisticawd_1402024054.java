import java.util.Scanner;

public class SimpleStatistic_1402024054 {

    public static void main(String[] args) {
        Scanner inputPengguna = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("--------------Simple Statistic--------------");
        System.out.println("---------Zild Jian XTO / 1402024054---------");
        System.out.println("============================================");

        int pengulanganSystem = -1;

        do {
            System.out.print("Masukkan jumlah bilangan: ");

            while (!inputPengguna.hasNextInt()) {
                System.out.println("Tolong masukan input angka.");
                System.out.print("Masukkan jumlah bilangan: ");
                inputPengguna.next();
            }

            int simpanBilangan = inputPengguna.nextInt();

            while (simpanBilangan <= 0) {
                System.out.println("Tolong masukan angka positif.");
                System.out.print("Masukkan jumlah bilangan: ");
                while (!inputPengguna.hasNextInt()) {
                    System.out.println("Tolong masukan input angka.");
                    System.out.print("Masukkan jumlah bilangan: ");
                    inputPengguna.next();
                }
                simpanBilangan = inputPengguna.nextInt();
            }

            int[] bilanganArray = new int[simpanBilangan];
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
                inputPengguna.next();
            }
            bilanganArray[0] = inputPengguna.nextInt();
            max = bilanganArray[0];
            min = bilanganArray[0];
            total += bilanganArray[0];

            if (bilanganArray[0] % 2 == 0) {
                totalBilanganGenap++;
            } else {
                totalBilanganGanjil++;
            }

            for (int i = 1; i < simpanBilangan; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + " : ");
                while (!inputPengguna.hasNextInt()) {
                    System.out.println("Tolong masukan input angka.");
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + " : ");
                    inputPengguna.next();
                }
                bilanganArray[i] = inputPengguna.nextInt();
                total += bilanganArray[i];

                if (bilanganArray[i] % 2 == 0) {
                    totalBilanganGenap++;
                } else {
                    totalBilanganGanjil++;
                }

                if (bilanganArray[i] > max) {
                    max = bilanganArray[i];
                }
                if (bilanganArray[i] < min) {
                    min = bilanganArray[i];
                }
            }

            double rataRata = (double) total / simpanBilangan;
            System.out.println("============================================");

            // Menampilkan hasil
            System.out.println("\nHasil Statistik:");
            System.out.println("- Nilai maksimum : " + max);
            System.out.println("- Nilai minimum : " + min);
            System.out.println("- Rata-rata : " + rataRata);
            System.out.println("- Total bilangan genap : " + totalBilanganGenap);
            System.out.println("- Total bilangan ganjil : " + totalBilanganGanjil);
            System.out.println("============================================\n");

            inputPengguna.nextLine(); // Membersihkan buffer

            String simpanInputPengulangan = "";
            boolean inputValid = false;

            while (!inputValid) {
                System.out.print("Apakah ingin mengulang program? (ya/tidak) : ");
                simpanInputPengulangan = inputPengguna.nextLine();

                if (simpanInputPengulangan.equals("ya")) {
                    pengulanganSystem = 0;
                    inputValid = true;
                } else if (simpanInputPengulangan.equals("tidak")) {
                    pengulanganSystem = 1;
                    System.out.println("Program selesai. Terima kasih!");
                    inputValid = true;
                } else {
                    System.out.println("Pilihan yang tersedia hanya ya/tidak.");
                }
            }

        } while (pengulanganSystem != 1);

        inputPengguna.close();
    }
}
