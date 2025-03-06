
import java.util.Scanner;

public class RPG {

    public static void main(String[] Jian) {
        // Membuat objek Scanner untuk input
        Scanner jian = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("------------Program Naypos Adventure------------");
        System.out.println("-----------Zild Jian XTO / 1402024054-----------");
        System.out.println("================================================");

        // Mendeklarasikan array 2D untuk daftar senjata (String)
        String[][] listSenjata = new String[1][5];
        // Menginisialisasi nama-nama senjata
        listSenjata[0][0] = "All-D-Staff";
        listSenjata[0][1] = "Eren-Dagger";
        listSenjata[0][2] = "Faiz-Sword";
        listSenjata[0][3] = "Soft-Whip";
        listSenjata[0][4] = "Yarsi-Spear";

        // Menampilkan daftar senjata
        System.out.println("List Senjata-senjata Character:");
        System.out.println("1. " + listSenjata[0][0]);
        System.out.println("2. " + listSenjata[0][1]);
        System.out.println("3. " + listSenjata[0][2]);
        System.out.println("4. " + listSenjata[0][3]);
        System.out.println("5. " + listSenjata[0][4]);
        System.out.print("Pilih Senjata Character: ");

        // Membaca indeks senjata yang dipilih (int)
        int pilihSenjata = jian.nextInt() - 1;

        System.out.println("-----------------------------------------------");

        // Mendeklarasikan array 2D untuk daftar armor (String)
        String[][] armorList = new String[1][5];
        // Menginisialisasi nama-nama armor
        armorList[0][0] = "Plot-Armor";
        armorList[0][1] = "Diamond-Armor";
        armorList[0][2] = "Dark-Armor";
        armorList[0][3] = "Light-Armor";
        armorList[0][4] = "Hawaii-Leather";

        // Menampilkan daftar armor
        System.out.println("List Armor-armor Character:");
        System.out.println("1. " + armorList[0][0]);
        System.out.println("2. " + armorList[0][1]);
        System.out.println("3. " + armorList[0][2]);
        System.out.println("4. " + armorList[0][3]);
        System.out.println("5. " + armorList[0][4]);
        System.out.print("Pilih Armor Character: ");

        // Membaca indeks armor yang dipilih (int)
        int pilihArmor = jian.nextInt() - 1;

        System.out.println("-----------------------------------------------");

        // Mendeklarasikan array 2D untuk daftar spell (String)
        String[][] listPel = new String[1][5];
        // Menginisialisasi nama-nama spell
        listPel[0][0] = "Gudang Ramuan";
        listPel[0][1] = "Kutukan PenitiSuper";
        listPel[0][2] = "Lompatan Morelong";
        listPel[0][3] = "Panggilan Unta";
        listPel[0][4] = "Nice Light";

        // Menampilkan daftar spell
        System.out.println("List Spell Character:");
        System.out.println("1. " + listPel[0][0]);
        System.out.println("2. " + listPel[0][1]);
        System.out.println("3. " + listPel[0][2]);
        System.out.println("4. " + listPel[0][3]);
        System.out.println("5. " + listPel[0][4]);

        // Membaca indeks spell yang dipilih (long, tetapi akan di-cast ke int)
        // Meminta pengguna untuk memilih spell pertama karakter dan menyimpan indeks yang dipilih
        // Indeks dikurangi 1 karena pilihan pengguna dimulai dari 1, sedangkan array dimulai dari 0
        System.out.print("Pilih Spell Pertama Character: ");
        long spellPertama = jian.nextInt() - 1; // Mengurangi 1 untuk mendapatkan indeks yang benar

        // Meminta pengguna untuk memilih spell kedua karakter dan menyimpan indeks yang dipilih
        System.out.print("Pilih Spell Kedua Character: ");
        long spellKedua = jian.nextInt() - 1; // Mengurangi 1 untuk mendapatkan indeks yang benar

        // Meminta pengguna untuk memilih spell ketiga karakter dan menyimpan indeks yang dipilih
        System.out.print("Pilih Spell Ketiga Character: ");
        long SpellKetiga = jian.nextInt() - 1; // Mengurangi 1 untuk mendapatkan indeks yang benar

        System.out.println("-----------------------------------------------");

        // Membuat array untuk menyimpan nilai tampilan yang dipilih
        String[] tampil = new String[3];

        // Menyiapkan tampilan spell yang dipilih
        // Menggabungkan nama spell yang dipilih menjadi satu string, dipisahkan dengan koma
        tampil[0] = listPel[0][(int) spellPertama] + ", " + listPel[0][(int) spellKedua] + ", " + listPel[0][(int) SpellKetiga];

        // Menetapkan armor dan senjata yang dipilih ke dalam array tampil
        // armorList menyimpan armor yang dipilih berdasarkan indeks pilihan pengguna
        tampil[1] = armorList[0][pilihArmor];

        // listSenjata menyimpan senjata yang dipilih berdasarkan indeks pilihan pengguna
        tampil[2] = listSenjata[0][pilihSenjata];

        // Menyimpan tampilan spell yang telah disiapkan dalam variabel sementara
        String pilihTampil = tampil[0];

        // Menampilkan informasi karakter ke konsol
        System.out.println("Nama Character      : Naypos"); // Menampilkan nama karakter
        System.out.println("Weapon Character    : " + tampil[2]); // Menampilkan senjata yang dipilih
        System.out.println("Armor Character     : " + tampil[1]); // Menampilkan armor yang dipilih
        System.out.println("Spell Character     : " + "[" + pilihTampil + "]"); // Menampilkan spell yang dipilih

        System.out.println("-----------------------------------------------");

        // Variabel healthNaypos menyimpan total kesehatan karakter, diinisialisasi dengan nilai 100.0
        double healthNaypos = 100.0;

        // Variabel powerNaypos menyimpan total kekuatan serangan karakter, diinisialisasi dengan nilai 50.0
        double powerNaypos = 50.0;

        // Variabel aglityNaypos menyimpan total kelincahan karakter, diinisialisasi dengan nilai 50.0
        double aglityNaypos = 50.0;

        // Array yang menyimpan buff untuk senjata (double)
        double[] buffWeap = {0.20, 0.25, 0.45, 0.15, 0.35};

        // Array yang menyimpan buff untuk armor (double)
        double[] buffMor = {1.00, 0.40, 0.35, 0.10, 0.02};

        // Menghitung total health karakter dengan mempertimbangkan armor yang dipilih
        // buffMor[pilihArmor] memberikan faktor peningkatan untuk health berdasarkan armor
        double seluruhHelathNaypos = healthNaypos + (buffMor[pilihArmor] * healthNaypos);

        // Menghitung total power karakter dengan mempertimbangkan senjata yang dipilih
        // buffWeap[pilihSenjata] memberikan faktor peningkatan untuk power berdasarkan senjata
        double seluruhPowerNaypos = powerNaypos + (powerNaypos * buffWeap[pilihSenjata]);

        // Menghitung total agility karakter dengan mempertimbangkan senjata dan armor
        // Peningkatan agility adalah hasil dari penambahan buff dari senjata dan armor
        double seluruhAglityNaypos = aglityNaypos * (1 + buffWeap[pilihSenjata] + buffMor[pilihArmor]);

        // Mendeklarasikan array 2D untuk statistik output (String)
        String[][] KeluaranCuy = new String[2][5];
        KeluaranCuy[0][0] = "";
        KeluaranCuy[0][1] = "Health : " + (float) healthNaypos; // Cast ke float untuk tampilan
        KeluaranCuy[0][2] = "Power  : " + (float) powerNaypos; // Cast ke float untuk tampilan
        KeluaranCuy[0][3] = "Aglity : " + (float) aglityNaypos; // Cast ke float untuk tampilan
        KeluaranCuy[0][4] = "";
        KeluaranCuy[1][0] = "Stat Character Dengan Equipment dan Spell";
        KeluaranCuy[1][1] = "";
        KeluaranCuy[1][2] = "Helath Dengan Plat Armor : " + (float) seluruhHelathNaypos; // Cast ke float untuk tampilan
        KeluaranCuy[1][3] = "Power Dengan Senjata     : " + (float) seluruhPowerNaypos; // Cast ke float untuk tampilan
        KeluaranCuy[1][4] = "agility Dengan Equipment : " + (float) seluruhAglityNaypos; // Cast ke float untuk tampilan

        // Menampilkan statistik dasar
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

        // Menutup Scanner untuk mencegah kebocoran sumber daya
        jian.close();
    }
}
