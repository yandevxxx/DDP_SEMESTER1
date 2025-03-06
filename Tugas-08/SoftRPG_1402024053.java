//Yaumil Hamida
//1402024053

import java.util.Scanner;

public class SoftRPG_1402024053 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menangani input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan header program
        System.out.println("================================================");
        System.out.println("------------Program Naypos Adventure------------");
        System.out.println("-----------Yaumil Hamida / 1402024053-----------");
        System.out.println("================================================");

        // Mendeklarasikan dan menginisialisasi array senjata
        String[] listSenjata = new String[5];
        listSenjata[0] = "All-D-Staff";
        listSenjata[1] = "Eren-Dagger";
        listSenjata[2] = "Faiz-Sword";
        listSenjata[3] = "Soft-Whip";
        listSenjata[4] = "Yarsi-Spear";

        // Menampilkan daftar senjata 
        System.out.println("List Senjata-senjata Character:");
        System.out.println("1. " + listSenjata[0]);
        System.out.println("2. " + listSenjata[1]);
        System.out.println("3. " + listSenjata[2]);
        System.out.println("4. " + listSenjata[3]);
        System.out.println("5. " + listSenjata[4]);

        // Meminta pengguna untuk memilih senjata
        System.out.print("Pilih Senjata Character: ");
        int pilihSenjata = scanner.nextInt() - 1; // Mengurangi 1 untuk mendapatkan indeks yang benar

        System.out.println("-----------------------------------------------");

        // Mendeklarasikan dan menginisialisasi array armor
        String[] armorList = new String[5];
        armorList[0] = "Plot-Armor";
        armorList[1] = "Diamond-Armor";
        armorList[2] = "Dark-Armor";
        armorList[3] = "Light-Armor";
        armorList[4] = "Hawaii-Leather";

        // Menampilkan daftar armor
        System.out.println(
                "List Armor-armor Character:");
        System.out.println(
                "1. " + armorList[0]);
        System.out.println(
                "2. " + armorList[1]);
        System.out.println(
                "3. " + armorList[2]);
        System.out.println(
                "4. " + armorList[3]);
        System.out.println(
                "5. " + armorList[4]);

        // Meminta pengguna untuk memilih armor
        System.out.print(
                "Pilih Armor Character: ");
        int pilihArmor = scanner.nextInt() - 1; // Mengurangi 1 untuk mendapatkan indeks yang benar

        System.out.println(
                "-----------------------------------------------");

        // Mendeklarasikan dan menginisialisasi array spell
        String[] listPel = new String[5];
        listPel[0] = "Gudang Ramuan";
        listPel[1] = "Kutukan PenitiSuper";
        listPel[2] = "Lompatan Morelong";
        listPel[3] = "Panggilan Unta";
        listPel[4] = "Nice Light";

        // Menampilkan daftar spell
        System.out.println(
                "List Spell Character:");
        System.out.println(
                "1. " + listPel[0]);
        System.out.println(
                "2. " + listPel[1]);
        System.out.println(
                "3. " + listPel[2]);
        System.out.println(
                "4. " + listPel[3]);
        System.out.println(
                "5. " + listPel[4]);

        // Meminta pengguna untuk memilih tiga spell
        System.out.print(
                "Pilih Spell Pertama Character: ");
        int spellPertama = scanner.nextInt() - 1;

        System.out.print(
                "Pilih Spell Kedua Character: ");
        int spellKedua = scanner.nextInt() - 1;

        System.out.print(
                "Pilih Spell Ketiga Character: ");
        int spellKetiga = scanner.nextInt() - 1;

        System.out.println(
                "-----------------------------------------------");

        // Menyusun hasil pilihan pengguna
        String selectedSpells = listPel[spellPertama] + ", " + listPel[spellKedua] + ", " + listPel[spellKetiga];
        String selectedArmor = armorList[pilihArmor];
        String selectedWeapon = listSenjata[pilihSenjata];

        // Menampilkan informasi karakter yang dipilih
        System.out.println(
                "Nama Character      : Naypos");
        System.out.println(
                "Weapon Character    : " + selectedWeapon);
        System.out.println(
                "Armor Character     : " + selectedArmor);
        System.out.println(
                "Spell Character     : [" + selectedSpells + "]");

        System.out.println(
                "-----------------------------------------------");

        // Mendeklarasikan nilai dasar karakter
        double healthNaypos = 100.0;
        double powerNaypos = 50.0;
        double aglityNaypos = 50.0;

        // Mendeklarasikan buff untuk senjata dan armor
        double[] buffWeap = {0.20, 0.25, 0.45, 0.15, 0.35};
        double[] buffMor = {1.00, 0.40, 0.35, 0.10, 0.02};

        // Menghitung total health karakter dengan mempertimbangkan armor yang dipilih
        double seluruhHelathNaypos = healthNaypos + (buffMor[pilihArmor] * healthNaypos);

        // Menghitung total power karakter dengan mempertimbangkan senjata yang dipilih
        double seluruhPowerNaypos = powerNaypos + (powerNaypos * buffWeap[pilihSenjata] * 2);

        // Menghitung total agility karakter dengan mempertimbangkan senjata dan armor
        double seluruhAglityNaypos = aglityNaypos * (1 + buffWeap[pilihSenjata] + buffMor[pilihArmor]);

        // Menampilkan statistik dasar karakter
        System.out.println(
                "Base Stat Character");
        System.out.println(
                "Health : " + healthNaypos
        );
        System.out.println(
                "Power  : " + powerNaypos
        );
        System.out.println(
                "Aglity : " + aglityNaypos
        );
        System.out.println(
                "Stat Character Dengan Equipment dan Spell");
        System.out.println(
                "Helath Dengan Plat Armor : " + seluruhHelathNaypos
        );
        System.out.println(
                "Power Dengan Senjata     : " + seluruhPowerNaypos
        );
        System.out.println(
                "Aglity Dengan Equipment : " + (float) seluruhAglityNaypos
        );

        // Menutup Scanner untuk mencegah kebocoran sumber daya
        scanner.close();
    }
}
