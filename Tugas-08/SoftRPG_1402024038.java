// Muhammad Nur Akbar
// 1402024038

import java.util.Scanner;

public class SoftRPG_1402024038 {

    public static void main(String[] akbar) {
        // Membuat objek Scanner 
        Scanner inputan = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("------------Program Naypos Adventure------------");
        System.out.println("---------Muhammad Nur Akbar / 1402024038--------");
        System.out.println("================================================");


        /*================================================ Pemilihan Weapon ======================================================*/
        // Membuat Daftar senjata 
        String[][] weapList = {
            {"All-D-Staff"},
            {"Eren-Dagger"},
            {"Faiz-Sword"},
            {"Soft-Whip"},
            {"Yarsi-Spear"}
        };

        // Pemilihan Senjata
        System.out.println("List Senjata-senjata Character:");
        System.out.println("1. " + weapList[0][0]);
        System.out.println("2. " + weapList[1][0]);
        System.out.println("3. " + weapList[2][0]);
        System.out.println("4. " + weapList[3][0]);
        System.out.println("5. " + weapList[4][0]);
        System.out.print("Pilih Senjata Character: ");

        // Membaca input dari pengguna dan menyimpannya dalam variabel weapPemilihan
        // scanner.nextInt() digunakan untuk membaca input sebagai integer
        int weapPemilihan = inputan.nextInt() - 1;

        System.out.println("-----------------------------------------------");

        /*================================================ Pemilihan Armor ======================================================*/
        // Membuat Daftar armor 
        String[][] listMor = {
            {"Plot-Armor"},
            {"Diamond-Armor"},
            {"Dark-Armor"},
            {"Light-Armor"},
            {"Hawaii-Leather"}
        };

        // Pemilihan Armor
        System.out.println("List Armor-armor Character:");
        System.out.println("1. " + listMor[0][0]);
        System.out.println("2. " + listMor[1][0]);
        System.out.println("3. " + listMor[2][0]);
        System.out.println("4. " + listMor[3][0]);
        System.out.println("5. " + listMor[4][0]);
        System.out.print("Pilih Armor Character: ");

        // Membaca input dari pengguna dan menyimpannya dalam variabel armorPemilihan
        // scanner.nextInt() digunakan untuk membaca input sebagai integer
        int armorPemilihan = inputan.nextInt() - 1;

        System.out.println("-----------------------------------------------");

        /*================================================ Pemilihan Spell ======================================================*/
        // Membuat Daftar spell
        String[][] listPel = {
            {"Gudang Ramuan"},
            {"Kutukan PenitiSuper"},
            {"Lompatan Morelong"},
            {"Panggilan Unta"},
            {"Nice Light"}
        };

        System.out.println("List Spell Character:");
        System.out.println("1. " + listPel[0][0]);
        System.out.println("2. " + listPel[1][0]);
        System.out.println("3. " + listPel[2][0]);
        System.out.println("4. " + listPel[3][0]);
        System.out.println("5. " + listPel[4][0]);

        System.out.print("Pilih Spell Pertama Character: ");
        // Membaca input pengguna untuk spell pertama dan mengurangi 1 dari input
        // Menggunakan tipe data int karena pilihan spell biasanya berupa angka bulat
        long spellPemilihanPertama = inputan.nextInt() - 1;

        System.out.print("Pilih Spell Kedua Character: ");
        // Membaca input pengguna untuk spell kedua dan mengurangi 1 dari input
        // Menggunakan int untuk konsistensi dengan pilihan yang berupa angka bulat
        long spellPemilihanKedua = inputan.nextInt() - 1;

        System.out.print("Pilih Spell Ketiga Character: ");
        // Membaca input pengguna untuk spell ketiga dan mengurangi 1 dari input
        // Tipe data int memudahkan pemrosesan pilihan yang diinputkan
        long spellPemilihanTiga = inputan.nextInt() - 1;

        System.out.println("-----------------------------------------------");

        // Mendeklarasikan array pilihanTampilan dengan ukuran 3
        String[] pilihanTampilan = new String[3];

        // Mengisi elemen pertama array dengan kombinasi nama pelajaran dari indeks yang dipilih
        pilihanTampilan[0] = listPel[(int) spellPemilihanPertama][0] + ", " + listPel[(int) spellPemilihanKedua][0] + ", " + listPel[(int) spellPemilihanTiga][0];

        // Mengisi elemen kedua array dengan nama armor yang dipilih
        pilihanTampilan[1] = listMor[armorPemilihan][0];

        // Mengisi elemen ketiga array dengan nama senjata yang dipilih
        pilihanTampilan[2] = weapList[weapPemilihan][0];

        // Mengambil nilai dari elemen pertama array pilihanTampilan untuk digunakan lebih lanjut
        String pilihanString = pilihanTampilan[0];

        /*================================================ Bagian Penjumlahan ======================================================*/
        // Menampilkan Pilihan
        System.out.println("Nama Character      : Naypos");
        System.out.println("Weapon Character    : " + pilihanTampilan[2]);
        System.out.println("Armor Character     : " + pilihanTampilan[1]);
        System.out.println("Spell Character     : " + "[" + pilihanString + "]");

        System.out.println("-----------------------------------------------");

        // Menyimpan nilai buff dalam array multidimensi
        double[][] characterStats = {
            {100.0},
            {50.0},
            {50.0}
        };

        // Menyimpan nilai Darah karakter 
        double healthCharacterNaypos = characterStats[0][0];

        // Menyimpan nilai kekuatan karakter 
        double powerCharacterNaypos = characterStats[1][0];

        // Menyimpan nilai kelincahan karakter
        double agilityCharacterNaypos = characterStats[2][0];

        /*================================================ Stats Buff ======================================================*/
        // Array yang menyimpan buff untuk senjata
        double[] buffWeap = {0.20, 0.25, 0.45, 0.15, 0.35};

        // Array yang menyimpan buff untuk armor
        double[] buffMor = {1.00, 0.40, 0.35, 0.10, 0.02};

        // Menghitung total kesehatan karakter dengan memperhitungkan buff dari armor
        double seluruhHelath = ((float) healthCharacterNaypos + ((buffMor[armorPemilihan] * healthCharacterNaypos)));

        // Menghitung total power karakter dengan memperhitungkan buff dari senjata
        double seluruhPower = ((float) powerCharacterNaypos + ((powerCharacterNaypos * buffWeap[weapPemilihan])));

        // Mendeklarasikan sebuah string bernama namaSatu dan menginisialisasinya dengan "1234"
        String namaSatu = "1234";

        // Mengambil karakter pertama dari namaSatu, mengconvert ke integer, dan menyimpannya di variabel angka
        int angka = Integer.parseInt(namaSatu.substring(0, 1)); // Mengambil substring dari indeks 0 hingga 1 (karakter pertama)

        // Menghitung total aglity karakter dengan memperhitungkan buff dari senjata dan armor
        double seluruhAglity = ((float) agilityCharacterNaypos * ((((int) angka) + buffWeap[weapPemilihan] + buffMor[armorPemilihan])));

        String[][] KeluaranCuy = new String[2][5];
        KeluaranCuy[0][0] = "";
        KeluaranCuy[0][1] = "Health : " + (float) healthCharacterNaypos;
        KeluaranCuy[0][2] = "Power  : " + (float) powerCharacterNaypos;
        KeluaranCuy[0][3] = "Aglity : " + (float) agilityCharacterNaypos;
        KeluaranCuy[0][4] = "";
        KeluaranCuy[1][0] = "Stat Character Dengan Equipment dan Spell";
        KeluaranCuy[1][1] = "";
        KeluaranCuy[1][2] = "Helath Dengan Plat Armor : " + (float) seluruhHelath;
        KeluaranCuy[1][3] = "Power Dengan Senjata     : " + (float) seluruhPower;
        KeluaranCuy[1][4] = "agility Dengan Equipment : " + (float) seluruhAglity;

        System.out.println("Base Stat Character");
        System.out.println(KeluaranCuy[0][0]);
        System.out.println(KeluaranCuy[0][1]);
        System.out.println(KeluaranCuy[0][2]);
        System.out.println(KeluaranCuy[0][3]);
        System.out.println(KeluaranCuy[0][4]);
        System.out.println(KeluaranCuy[1][0]);
        System.out.println(KeluaranCuy[1][1]);
        System.out.println(KeluaranCuy[1][2]);
        System.out.println(KeluaranCuy[1][3]);
        System.out.println(KeluaranCuy[1][4]);

        //mengclose program scanner
        inputan.close();
    }
}
