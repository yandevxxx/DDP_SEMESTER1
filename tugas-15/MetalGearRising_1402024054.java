// Zild Jian Xto 
// 1402024054

import java.util.Scanner; // digunakan di Java untuk mengimpor kelas atau paket dari library

public class MetalGearRising_1402024054 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("---------------- Program MGR Battle ----------------");
        System.out.println("------------ Zild Jian Xto / 1402024054 ------------");
        System.out.println("====================================================");

        // Array untuk menyimpan nama-nama kelas karakter yang tersedia
        String[] nameClass = {
            "Cyborg Ninja",
            "Samurai Swordsman",
            "Tech Specialist",
            "Stealth Operative",
            "Dept Colector"
        };

        // Array untuk menyimpan nama-nama musuh yang tersedia
        String[] nameEnemy = {
            "Jetstream Sam",
            "Sundowner",
            "Senator Armstrong",
            "Hasan Biasa Aja"
        };

        System.out.println("Welcome Operative!");
        System.out.print("Enter Codename: ");
        // meminta pengguna untuk memasukan nama dari code yang ingin di pakai 
        String nameCode = input.nextLine();

        // Inisialisasi variabel option dengan nilai -1. Ini untuk memastikan while loop pertama kali dijalankan.
        int option = -1;
        // Loop while akan terus berjalan selama option < 0 atau option >= jumlah kelas yang tersedia dalam nameClass
        while (option < 0 || option >= nameClass.length) {
            System.out.println("\nChoose your class");
            // Inisialisasi variabel untuk menampilkan nomor urut pilihan kelas, dimulai dari 1
            int indexNameClas = 1;
            for (String className : nameClass) {
                System.out.println(indexNameClas + ". " + className);
                // Menaikkan indexNameClas agar nomor urut kelas bertambah
                indexNameClas++;
            }
            System.out.print("Option: ");
            // Membaca input pilihan dari pengguna, kemudian mengurangi 1 untuk menyesuaikan dengan indeks array
            option = input.nextInt() - 1;

            // Mengecek apakah pilihan yang dimasukkan tidak valid (kurang dari 0 atau lebih besar dari jumlah kelas)
            if (option < 0 || option >= nameClass.length) {
                // Jika pilihan tidak valid, menampilkan pesan error dan meminta pengguna mencoba lagi
                System.out.println("There is no class in the system \nPlease try again!");
            }
        }

        System.out.println("\nSetup your " + nameClass[option]);
        // Mendeklarasikan variabel healthAwal (kesehatan awal) dengan nilai 0
        int healthAwal = 0;
        // Memulai loop untuk meminta input kesehatan awal (HP) dari pemain
        while (true) {
            // Menampilkan pesan untuk meminta input HP berdasarkan nama karakter dan kelas yang dipilih
            System.out.print(nameCode + " the " + nameClass[option] + " HP = ");
            // Mengambil input dari pemain dan menyimpannya dalam variabel healthAwal
            healthAwal = input.nextInt();
            // Mengecek apakah HP yang dimasukkan kurang dari atau sama dengan 500
            if (healthAwal <= 500) {
                // Jika HP valid, keluar dari loop
                break;
            } else {
                // Jika HP lebih dari 500, menampilkan pesan kesalahan dan meminta input lagi
                System.out.println(nameClass[option] + " can't have that many hp Please try again!.");
            }

        }

        // Mendeklarasikan variabel attackAwal (serangan awal) dengan nilai 0
        int attackAwal = 0;
        // Memulai loop untuk meminta input serangan awal dari pemain
        while (true) {
            // Menampilkan pesan untuk meminta input attack berdasarkan nama karakter dan kelas yang dipilih
            System.out.print(nameCode + " the " + nameClass[option] + " Attack = ");
            // Mengambil input dari pemain dan menyimpannya dalam variabel attackAwal
            attackAwal = input.nextInt();
            // Mengecek apakah attack yang dimasukkan kurang dari atau sama dengan 100
            if (attackAwal <= 100) {
                // Jika attack valid, keluar dari loop
                break;
            } else {
                // Jika attack lebih dari 100, menampilkan pesan kesalahan dan meminta input lagi
                System.out.println(nameClass[option] + " can't have that many attack Please try again!");
            }
        }

        System.out.println("-------------------------------------");

        System.out.println("Enemy info");
        // Mendeklarasikan variabel opponentEnemy untuk menyimpan pilihan musuh yang akan dihadapi, diinisialisasi dengan -1
        int opponentEnemy = -1;
        // Memulai loop yang akan terus berjalan selama opponentEnemy < 0 atau opponentEnemy lebih besar atau sama dengan panjang array nameEnemy
        while (opponentEnemy < 0 || opponentEnemy >= nameEnemy.length) {
            // Inisialisasi variabel indexNameEnemy untuk menampilkan nomor urut musuh
            int indexNameEnemy = 1;
            // Melakukan iterasi untuk setiap elemen (kelas musuh) dalam array nameEnemy
            for (String className : nameEnemy) {
                // Menampilkan nomor urut dan nama kelas musuh
                System.out.println(indexNameEnemy + ". " + className);
                // Meningkatkan nomor urut untuk kelas berikutnya
                indexNameEnemy++;
            }

            System.out.print("Choose your opponent: ");
            // Mengambil input dan mengurangi 1 agar indeks sesuai dengan posisi dalam array (karena input pemain mulai dari 1)
            opponentEnemy = input.nextInt() - 1;

            // Mengecek apakah input yang dimasukkan berada di luar rentang yang valid (kurang dari 0 atau lebih dari panjang array)
            if (opponentEnemy < 0 || opponentEnemy >= nameEnemy.length) {
                // Jika tidak valid, menampilkan pesan kesalahan dan meminta pemain untuk mencoba lagi
                System.out.println("There is no class in the system \nPlease try again!");
            }
        }

        // Memulai switch statement berdasarkan nilai dari variabel 'option'
        switch (option) {
            // Kasus pertama: jika option = 0
            case 0:
                // Mengalikan attackAwal dengan 2
                attackAwal *= 2;
                // Keluar dari switch
                break;

            // Kasus kedua: jika option = 1
            case 1:
                // Mengalikan healthAwal dengan 2
                healthAwal *= 2;
                // Keluar dari switch
                break;

            // Kasus ketiga: jika option = 2
            case 2:
                // Mengalikan healthAwal dan attackAwal dengan 2
                healthAwal *= 2;
                attackAwal *= 2;
                // Keluar dari switch
                break;

            // Kasus keempat: jika option = 3
            case 3:
                // Membagi healthAwal dengan 4
                healthAwal /= 4;
                // Mengalikan attackAwal dengan 4
                attackAwal *= 4;
                // Keluar dari switch
                break;

            // Kasus kelima: jika option = 4
            case 4:
                // Mengalikan healthAwal dengan 7
                healthAwal *= 7;
                // Mengalikan attackAwal dengan 10
                attackAwal *= 10;
                // Keluar dari switch
                break;
        }

        // Mendeklarasikan variabel attackEnemy dan healthEnemy, keduanya diinisialisasi dengan nilai 0
        int attackEnemy = 0, healthEnemy = 0;

        // Memulai switch statement berdasarkan nilai variabel opponentEnemy
        switch (opponentEnemy) {
            // Kasus pertama: jika opponentEnemy = 0
            case 0:
                // Menetapkan nilai healthEnemy menjadi 1200 dan attackEnemy menjadi 80
                healthEnemy = 1200;
                attackEnemy = 80;
                // Keluar dari switch setelah eksekusi
                break;

            // Kasus kedua: jika opponentEnemy = 1
            case 1:
                // Menetapkan nilai healthEnemy menjadi 700 dan attackEnemy menjadi 60
                healthEnemy = 700;
                attackEnemy = 60;
                // Keluar dari switch setelah eksekusi
                break;

            // Kasus ketiga: jika opponentEnemy = 2
            case 2:
                // Menetapkan nilai healthEnemy menjadi 800 dan attackEnemy menjadi 110
                healthEnemy = 800;
                attackEnemy = 110;
                // Keluar dari switch setelah eksekusi
                break;

            // Kasus keempat: jika opponentEnemy = 3
            case 3:
                // Menetapkan nilai healthEnemy menjadi 8000 dan attackEnemy menjadi 27
                healthEnemy = 8000;
                attackEnemy = 27;
                // Keluar dari switch setelah eksekusi
                break;
        }

        // Displaying battle stats
        System.out.println("\n" + nameCode + " the " + nameClass[option] + " vs " + nameEnemy[opponentEnemy]);
        System.out.println("-------------------------------------");
        System.out.println("Battle statistics");

        System.out.println(nameClass[option] + " HP " + healthAwal);
        System.out.println(nameClass[option] + " Attack " + attackAwal);

        System.out.println("\n" + nameEnemy[opponentEnemy] + " HP " + healthEnemy);
        System.out.println(nameEnemy[opponentEnemy] + " Attack " + attackEnemy);
        System.out.println("-------------------------------------");

        // Menghitung jumlah pukulan yang diperlukan untuk mengalahkan musuh berdasarkan healthEnemy dan attackAwal
        int hitsToDefeatEnemy = healthEnemy / attackAwal;

        // Mengecek jika sisa pembagian healthEnemy dengan attackAwal tidak sama dengan 0
        if (healthEnemy % attackAwal != 0) {
            // Jika ada sisa, artinya masih ada sisa HP musuh yang perlu satu pukulan tambahan
            hitsToDefeatEnemy += 1;
        }

        // Menghitung jumlah pukulan yang diperlukan untuk mengalahkan karakter (Operative) berdasarkan healthAwal dan attackEnemy
        int hitsToDefeatOperative = healthAwal / attackEnemy;

        // Mengecek jika sisa pembagian healthAwal dengan attackEnemy tidak sama dengan 0
        if (healthAwal % attackEnemy != 0) {
            // Jika ada sisa, artinya masih ada sisa HP karakter yang perlu satu pukulan tambahan
            hitsToDefeatOperative += 1;
        }

        System.out.println(nameCode + " the " + nameClass[option] + " needs " + hitsToDefeatEnemy + " hit to defeat " + nameEnemy[opponentEnemy]);
        System.out.println(nameEnemy[opponentEnemy] + " needs " + hitsToDefeatOperative + " hit to defeat " + nameCode + " the " + nameClass[option]);
        input.close();

    }
}
