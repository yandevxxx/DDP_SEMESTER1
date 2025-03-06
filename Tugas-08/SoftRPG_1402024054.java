
import java.util.Arrays;
import java.util.Scanner;

public class SoftRPG_1402024054 {

    public static void main(String[] args) {

        // Membuat Inputan Pengguna untuk memilih list senjata , armor dan spell 
        Scanner inputPengguna = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("------------Program Naypos Adventure------------");
        System.out.println("-----------Zild Jian XTO / 1402024054-----------");
        System.out.println("================================================");

        //Membuat List Senjata dengan array multidimensi yang akan di pilih oleh pengguna 
        String[][] listSenjataPlayer = new String[1][6];
        listSenjataPlayer[0][0] = "List Senjata-senjata Character:";
        listSenjataPlayer[0][1] = "All-D-Staff";
        listSenjataPlayer[0][2] = "Eren-Dagger";
        listSenjataPlayer[0][3] = "Faiz-Sword";
        listSenjataPlayer[0][4] = "Soft-Whip";
        listSenjataPlayer[0][5] = "Yarsi-Spear";

        //Keluaran list senjata pada saat Program di jalankan 
        System.out.println(listSenjataPlayer[0][0]);
        System.out.println("1. " + listSenjataPlayer[0][1]);
        System.out.println("2. " + listSenjataPlayer[0][2]);
        System.out.println("3. " + listSenjataPlayer[0][3]);
        System.out.println("4. " + listSenjataPlayer[0][4]);
        System.out.println("5. " + listSenjataPlayer[0][5]);
        System.out.print("Pilih Senjata Character: ");

        //Menyimpan Inputan Pengguna yang memilih type senjata menjadi tipe data long 
        long playerPilihGun = inputPengguna.nextLong();

        System.out.println("-----------------------------------------------");

        //membuat list armor dengan array multidimensi yang akan di pilih oleh pengguna 
        String[][] armorListPlayer = new String[6][6];
        armorListPlayer[0][0] = "List Armor-armor Character:";
        armorListPlayer[1][1] = "Plot-Armor";
        armorListPlayer[2][2] = "Diamond-Armor";
        armorListPlayer[3][3] = "Dark-Armor";
        armorListPlayer[4][4] = "Light-Armor";
        armorListPlayer[5][5] = "Hawaii-Leather";

        //Keluaran pada saat pengguna sudah memilih armor 
        System.out.println(armorListPlayer[0][0]);
        System.out.println("1. " + armorListPlayer[1][1]);
        System.out.println("2. " + armorListPlayer[2][2]);
        System.out.println("3. " + armorListPlayer[3][3]);
        System.out.println("4. " + armorListPlayer[4][4]);
        System.out.println("5. " + armorListPlayer[5][5]);
        System.out.print("Pilih Armor Character: ");

        //Menyimpan Inputan Pengguna yang memilih armor menjadi tipe data byte 
        byte pilihArmor = inputPengguna.nextByte();

        System.out.println("-----------------------------------------------");

        //membuat list Spell menggunakan array biasa yang akan di pilih oleh pengguna 
        String[] listPelPlayer = new String[9];
        listPelPlayer[0] = "List Spell Character:";
        listPelPlayer[1] = "Pilih Spell Pertama Character: ";
        listPelPlayer[2] = "Pilih Spell Kedua Character: ";
        listPelPlayer[3] = "Pilih Spell Ketiga Character: ";
        listPelPlayer[4] = "Gudang Ramuan";
        listPelPlayer[5] = "Kutukan PenitiSuper";
        listPelPlayer[6] = "Lompatan Morelong";
        listPelPlayer[7] = "Panggilan Unta";
        listPelPlayer[8] = "Nice Light";

        //Keluaran pada saat pengguna sudah memilih 3 Spell
        System.out.println(listPelPlayer[0]);
        System.out.println("1. " + listPelPlayer[4]);
        System.out.println("2. " + listPelPlayer[5]);
        System.out.println("3. " + listPelPlayer[6]);
        System.out.println("4. " + listPelPlayer[7]);
        System.out.println("5. " + listPelPlayer[8]);

        // Meminta pengguna untuk memilih spell pertama
        System.out.print(listPelPlayer[1]); // Menampilkan prompt untuk memilih spell pertama

        // Mengambil input dan menambahkan 3 untuk indeks array
        int spellPertama = inputPengguna.nextInt() + 3;

        // Meminta pengguna untuk memilih spell kedua
        System.out.print(listPelPlayer[2]); // Menampilkan prompt untuk memilih spell kedua

        // Mengambil input dan menambahkan 3 untuk indeks array
        int spellKedua = inputPengguna.nextByte() + 3;

        // Meminta pengguna untuk memilih spell ketiga
        System.out.print(listPelPlayer[3]); // Menampilkan prompt untuk memilih spell ketiga

        // Mengambil input dan menambahkan 3 untuk indeks array
        int SpellKetiga = inputPengguna.nextInt() + 3;

        System.out.println("-----------------------------------------------");

        // Mendefinisikan array untuk menyimpan pilihan spell pemain
        String[] allPilihPengguna = new String[1];

        // Menggabungkan pilihan spell menjadi satu string
        allPilihPengguna[0] = listPelPlayer[spellPertama] + ", " + listPelPlayer[spellKedua] + ", " + listPelPlayer[SpellKetiga];

        // Menampilkan informasi karakter
        System.out.println("Nama Character      : Naypos");
        System.out.println("Weapon Character    : " + listSenjataPlayer[0][(int) playerPilihGun]);
        System.out.println("Armor Character     : " + armorListPlayer[pilihArmor][pilihArmor]);
        System.out.println("Spell Character     : " + Arrays.toString(allPilihPengguna));
        System.out.println("-----------------------------------------------");

        // Mendefinisikan array untuk menyimpan statistik kesehatan, kekuatan, dan kelincahan pemain
        double[] players = new double[3];
        players[0] = 100.0; // Kesehatan
        players[1] = 50.0;  // Kekuatan
        players[2] = 50.0;  // Kelincahan

        // Membuat array multidimensi untuk menampilkan statistik karakter
        String[][] statsPlayer = new String[2][3];
        statsPlayer[0][0] = "Base Stat Character";
        statsPlayer[0][1] = "";
        statsPlayer[0][2] = "Health   : " + players[0];
        statsPlayer[1][0] = "Power    : " + players[1];
        statsPlayer[1][1] = "Aglity   : " + players[2];
        statsPlayer[1][2] = "";

        // Menampilkan statistik karakter
        System.out.println(statsPlayer[0][0]);
        System.out.println(statsPlayer[0][1]);
        System.out.println(statsPlayer[0][2]);
        System.out.println(statsPlayer[1][0]);
        System.out.println(statsPlayer[1][1]);
        System.out.println(statsPlayer[1][2]);

        // Mendefinisikan buff untuk senjata dan armor
        double[][] buffSenjata = new double[1][5];
        buffSenjata[0][0] = 0.20; // Buff untuk senjata
        buffSenjata[0][1] = 0.25; // Buff untuk senjata
        buffSenjata[0][2] = 0.45; // Buff untuk senjata
        buffSenjata[0][3] = 0.15; // Buff untuk senjata
        buffSenjata[0][4] = 0.35; // Buff untuk senjata

        double[][] buffArmor = new double[1][5];
        buffArmor[0][0] = 1.00; // Buff untuk armor
        buffArmor[0][1] = 0.40; // Buff untuk armor
        buffArmor[0][2] = 0.35; // Buff untuk armor
        buffArmor[0][3] = 0.10; // Buff untuk armor
        buffArmor[0][4] = 0.02; // Buff untuk armor

        // Menghitung hasil statistik setelah buff
        double[][] hasil = new double[1][3]; // Mendefinisikan array untuk menyimpan hasil statistik

        // Menghitung kesehatan setelah buff armor
        hasil[0][0] = players[0] + (buffArmor[0][pilihArmor - 1] * players[0]);
        // Kesehatan dihitung dengan menambahkan buff armor ke nilai kesehatan dasar

        // Menghitung kekuatan setelah buff senjata
        hasil[0][1] = players[1] + (players[1] * buffSenjata[0][(int) playerPilihGun - 1]) * 2;
        // Kekuatan dihitung dengan menerapkan buff senjata, dikalikan dua untuk meningkatkan efek

        // Menghitung kelincahan setelah buff senjata dan armor
        hasil[0][2] = (float) players[2] * (1 + buffSenjata[0][(int) playerPilihGun - 1] + buffArmor[0][pilihArmor - 1]);
        // Kelincahan dihitung dengan mengalikan kelincahan dasar dengan total buff dari senjata dan armor

        // Menampilkan hasil statistik karakter setelah penerapan buff
        System.out.println("Stat Character Dengan Equipment");
        System.out.println("");
        System.out.println("Health Dengan " + armorListPlayer[pilihArmor][pilihArmor] + "  : " + hasil[0][0]);
        System.out.println("Power Dengan " + listSenjataPlayer[0][(int) playerPilihGun] + "  : " + hasil[0][1]);
        System.out.println("Agility Dengan Equipment : " + (float) hasil[0][2]);

    }
}
