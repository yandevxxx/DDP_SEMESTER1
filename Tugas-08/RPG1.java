//adhinata prasetya
//1402024003

import java.util.Scanner;

public class RPG1 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menangani input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan header program
        System.out.println("================================================");
        System.out.println("------------Program Naypos Adventure------------");
        System.out.println("---------adhinata prasetya / 1402024003---------");
        System.out.println("================================================");

        // Mendeklarasikan dan menginisialisasi array senjata
        String[] senjataNaypos = {
            "All-D-Staff",
            "Eren-Dagger",
            "Faiz-Sword",
            "Soft-Whip",
            "Yarsi-Spear"
        };

        // Menampilkan daftar senjata 
        System.out.println("List Senjata-senjata Character:");
        System.out.println("1. " + senjataNaypos[0]);
        System.out.println("2. " + senjataNaypos[1]);
        System.out.println("3. " + senjataNaypos[2]);
        System.out.println("4. " + senjataNaypos[3]);
        System.out.println("5. " + senjataNaypos[4]);

        // Meminta pengguna untuk memilih senjata
        System.out.print("Pilih Senjata Character: ");
        int pilih1 = scanner.nextInt() - 1; // Mengurangi 1 untuk mendapatkan indeks yang benar

        System.out.println("-----------------------------------------------");

        // Mendeklarasikan dan menginisialisasi array armor
        String[] armorNaypos = {
            "Plot-Armor",
            "Diamond-Armor",
            "Dark-Armor",
            "Light-Armor",
            "Hawaii-Leather"
        };

        // Menampilkan daftar armor 
        System.out.println("List Armor-armor Character:");
        System.out.println("1. " + armorNaypos[0]);
        System.out.println("2. " + armorNaypos[1]);
        System.out.println("3. " + armorNaypos[2]);
        System.out.println("4. " + armorNaypos[3]);
        System.out.println("5. " + armorNaypos[4]);

        // Meminta pengguna untuk memilih armor
        System.out.print("Pilih Armor Character: ");
        int pilih2 = scanner.nextInt() - 1; // Mengurangi 1 untuk mendapatkan indeks yang benar

        System.out.println("-----------------------------------------------");

        // Mendeklarasikan dan menginisialisasi array spell
        String[] spellNaypos = {
            "Gudang Ramuan",
            "Kutukan PenitiSuper",
            "Lompatan Morelong",
            "Panggilan Unta",
            "Nice Light"
        };

        // Menampilkan daftar spell 
        System.out.println("List Spell Character:");
        System.out.println("1. " + spellNaypos[0]);
        System.out.println("2. " + spellNaypos[1]);
        System.out.println("3. " + spellNaypos[2]);
        System.out.println("4. " + spellNaypos[3]);
        System.out.println("5. " + spellNaypos[4]);

        // Meminta pengguna untuk memilih tiga spell
        System.out.print("Pilih Spell Pertama Character: ");
        int spell3 = scanner.nextInt() - 1; // Mengurangi 1 untuk mendapatkan indeks yang benar
        System.out.print("Pilih Spell Kedua Character: ");
        int spell4 = scanner.nextInt() - 1; // Mengurangi 1 untuk mendapatkan indeks yang benar
        System.out.print("Pilih Spell Ketiga Character: ");
        int spell5 = scanner.nextInt() - 1; // Mengurangi 1 untuk mendapatkan indeks yang benar

        System.out.println("-----------------------------------------------");

        // Menyusun hasil pilihan pengguna
        String selectSpells = spellNaypos[spell3] + ", " + spellNaypos[spell4] + ", " + spellNaypos[spell5];
        String selectArmor = armorNaypos[pilih2];
        String selectWeapon = senjataNaypos[pilih1];

        // Menampilkan informasi karakter yang dipilih
        System.out.println("Nama Character      : Naypos");
        System.out.println("Weapon Character    : " + selectWeapon);
        System.out.println("Armor Character     : " + selectArmor);
        System.out.println("Spell Character     : [" + selectSpells + "]");

        System.out.println("-----------------------------------------------");

        // Mendeklarasikan nilai dasar karakter
        double healthNay = 100.0;
        double powerNay = 50.0;
        double aglityNay = 50.0;

        // Mendeklarasikan buff untuk senjata dan armor
        double[] buffWeapNaypos = {0.20, 0.25, 0.45, 0.15, 0.35};
        double[] buffMorNaypos = {1.00, 0.40, 0.35, 0.10, 0.02};

        // Menghitung total health karakter dengan mempertimbangkan armor yang dipilih
        double seluruhHelathNaypos = healthNay + (buffMorNaypos[pilih2] * healthNay);

        // Menghitung total power karakter dengan mempertimbangkan senjata yang dipilih
        double apaAjah = (powerNay * buffWeapNaypos[pilih1]) * 2;
        double seluruhpowerNay = powerNay + apaAjah;

        // Menghitung total agility karakter dengan mempertimbangkan senjata dan armor
        double seluruhaglityNay = aglityNay * (1 + buffWeapNaypos[pilih1] + buffMorNaypos[pilih2]);

        // Menampilkan statistik dasar karakter
        System.out.println("Base Stat Character");
        System.out.println("Health : " + healthNay);
        System.out.println("Power  : " + powerNay);
        System.out.println("Aglity : " + aglityNay);
        System.out.println("Stat Character Dengan Equipment dan Spell");
        System.out.println("Helath Dengan Plat Armor : " + seluruhHelathNaypos);
        System.out.println("Power Dengan Senjata     : " + seluruhpowerNay);
        System.out.println("Aglity Dengan Equipment : " + (float) seluruhaglityNay);

        // Menutup Scanner untuk mencegah kebocoran sumber daya
        scanner.close();
    }
}
