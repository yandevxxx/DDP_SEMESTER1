
import java.util.Scanner;

public class TUGAS15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan header program
        System.out.println("====================================================");
        System.out.println("---------------- Program MGR Battle ----------------");
        System.out.println("------------ Zild Jian Xto / 1402024054 ------------");
        System.out.println("====================================================");

        // Array untuk menyimpan nama-nama kelas karakter yang tersedia
        String[] nameClass = {
            "Cyborg Ninja", // Kelas 1
            "Samurai Swordsman", // Kelas 2
            "Tech Specialist", // Kelas 3
            "Stealth Operative" // Kelas 4
        };

        // Array untuk menyimpan nama-nama musuh yang tersedia
        String[] nameEnemy = {
            "Jetstream Sam", // Musuh 1
            "Sundowner", // Musuh 2
            "Senator Armstrong" // Musuh 3
        };

        // Menyambut pemain dan meminta input untuk nama panggilan karakter
        System.out.println("Welcome Operative!");
        System.out.print("Enter Codename: ");
        String nameCode = input.nextLine();

        // Memilih kelas karakter dari daftar yang tersedia
        int option = -1;
        while (option < 0 || option >= nameClass.length) {
            System.out.println("\nChoose your class");
            int indexNameClas = 1;
            // Menampilkan pilihan kelas
            for (String className : nameClass) {
                System.out.println(indexNameClas + ". " + className);
                indexNameClas++;  // Menambahkan nomor pilihan kelas
            }
            System.out.print("Option: ");
            option = input.nextInt() - 1;  // Memasukkan pilihan kelas (dikurangi 1 untuk indexing array)

            // Validasi input kelas
            if (option < 0 || option >= nameClass.length) {
                System.out.println("There is no class in the system \nPlease try again!");
            }
        }

        // Setup karakter berdasarkan kelas yang dipilih
        System.out.println("\nSetup your character stats");
        int healthAwal = 0;
        // Memasukkan nilai HP untuk karakter dan validasi
        while (true) {
            System.out.print(nameCode + " the " + nameClass[option] + " HP = ");
            healthAwal = input.nextInt();
            if (healthAwal <= 500) {
                break; // Keluar dari loop jika HP valid
            } else {
                System.out.println("HP can't be greater than 500, Please try again!.");
            }
        }

        int attackAwal = 0;
        // Memasukkan nilai serangan untuk karakter dan validasi
        while (true) {
            System.out.print(nameCode + " the " + nameClass[option] + " Attack = ");
            attackAwal = input.nextInt();
            if (attackAwal <= 100) {
                break; // Keluar dari loop jika serangan valid
            } else {
                System.out.println("Attack can't be greater than 100, Please try again!");
            }
        }

        System.out.println("-------------------------------------");

        // Menampilkan informasi musuh yang akan dihadapi
        System.out.println("Enemy info");
        int opponentEnemy = -1;
        // Memilih musuh yang akan dihadapi
        while (opponentEnemy < 0 || opponentEnemy >= nameEnemy.length) {
            int indexNameEnemy = 1;
            // Menampilkan pilihan musuh
            for (String className : nameEnemy) {
                System.out.println(indexNameEnemy + ". " + className);
                indexNameEnemy++;  // Menambahkan nomor pilihan musuh
            }
            System.out.print("Choose your opponent: ");
            opponentEnemy = input.nextInt() - 1;  // Memasukkan pilihan musuh (dikurangi 1 untuk indexing array)

            // Validasi input musuh
            if (opponentEnemy < 0 || opponentEnemy >= nameEnemy.length) {
                System.out.println("There is no opponent in the system \nPlease try again!");
            }
        }

        // Menyesuaikan status karakter berdasarkan kelas yang dipilih
        switch (option) {
            case 0:  // Cyborg Ninja
                attackAwal *= 2;  // Menambahkan kekuatan serangan
                break;
            case 1:  // Samurai Swordsman
                healthAwal *= 2;  // Menambahkan HP
                break;
            case 2:  // Tech Specialist
                healthAwal *= 2;  // Menambahkan HP
                attackAwal *= 2;  // Menambahkan serangan
                break;
            case 3:  // Stealth Operative
                healthAwal /= 4;  // Mengurangi HP
                attackAwal *= 4;  // Menambahkan serangan
                break;
        }

        // Menentukan status musuh berdasarkan pilihan
        int attackEnemy = 0, healthEnemy = 0;
        switch (opponentEnemy) {
            case 0:  // Jetstream Sam
                healthEnemy = 1200;  // HP Musuh
                attackEnemy = 80;   // Serangan Musuh
                break;
            case 1:  // Sundowner
                healthEnemy = 700;   // HP Musuh
                attackEnemy = 60;    // Serangan Musuh
                break;
            case 2:  // Senator Armstrong
                healthEnemy = 800;   // HP Musuh
                attackEnemy = 110;   // Serangan Musuh
                break;
        }

        // Menampilkan statistik awal pertarungan
        System.out.println("\n" + nameCode + " the " + nameClass[option] + " vs " + nameEnemy[opponentEnemy]);
        System.out.println("-------------------------------------");
        System.out.println("Battle statistics");

        // Menampilkan status karakter
        System.out.println(nameClass[option] + " HP " + healthAwal);
        System.out.println(nameClass[option] + " Attack " + attackAwal);

        // Menampilkan status musuh
        System.out.println("\n" + nameEnemy[opponentEnemy] + " HP " + healthEnemy);
        System.out.println(nameEnemy[opponentEnemy] + " Attack " + attackEnemy);
        System.out.println("-------------------------------------");

        // Menghitung berapa banyak pukulan yang dibutuhkan karakter untuk mengalahkan musuh
        // Jika pembagian HP musuh dengan serangan tidak bulat, tambahkan 1 untuk sisa pembagian
        int hitsToDefeatEnemy = healthEnemy / attackAwal;
        if (healthEnemy % attackAwal != 0) {
            hitsToDefeatEnemy++;  // Tambahkan 1 pukulan jika ada sisa
        }

        // Menghitung berapa banyak pukulan yang dibutuhkan musuh untuk mengalahkan karakter
        // Jika pembagian HP karakter dengan serangan musuh tidak bulat, tambahkan 1 untuk sisa pembagian
        int hitsToDefeatOperative = healthAwal / attackEnemy;
        if (healthAwal % attackEnemy != 0) {
            hitsToDefeatOperative++;  // Tambahkan 1 pukulan jika ada sisa
        }

        // Menampilkan hasil perhitungan jumlah pukulan yang dibutuhkan
        System.out.println(nameCode + " the " + nameClass[option] + " needs " + hitsToDefeatEnemy + " hits to defeat " + nameEnemy[opponentEnemy]);
        System.out.println(nameEnemy[opponentEnemy] + " needs " + hitsToDefeatOperative + " hits to defeat " + nameCode + " the " + nameClass[option]);

    }
}
