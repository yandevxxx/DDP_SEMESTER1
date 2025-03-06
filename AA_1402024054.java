//ZILD JIAN XTO 
//1402024054

import java.util.Scanner; // Import untuk menggunakan kelas Scanner untuk input dari pengguna

public class AA_1402024054 {

    public static void main(String[] Jiann) { // Method utama yang menjalankan program
        System.out.println("==============================================================================");
        System.out.println("                         Program AA Tower Defense");
        System.out.println("                         Dibuat Oleh : Zild Jian Xto / 1402024054");
        System.out.println("                         Playable : Yes");
        System.out.println("==============================================================================");

        // Array of Strings yang menyimpan daftar karakter beserta harga dan batas penempatan mereka
        String[] characters = {
            "1. Speedwagon    ¥500    3 Placement Limit",
            "2. Gojo          ¥1800   3 Placement Limit",
            "3. Bulma         ¥800    1 Placement Limit",
            "4. Choso         ¥1200   4 Placement Limit",
            "5. Gon           ¥2000   1 Placement Limit",
            "6. Guts          ¥1600   3 Placement Limit",
            "7. Araragi       ¥2000   1 Placement Limit",
            "8. Sasuke        ¥1200   4 Placement Limit",
            "9. Tengen        ¥1500   3 Placement Limit",
            "10. Artoria      ¥1100   4 Placement Limit",
            "11. Homura       ¥1400   3 Placement Limit",
            "12. Usopp        ¥1000   5 Placement Limit",
            "13. Dazai        ¥1800   2 Placement Limit",
            "14. Asuna        ¥1450   3 Placement Limit",
            "15. Tatsumaki    ¥1000   5 Placement Limit"

        };

        // Array untuk menyimpan batas penempatan masing-masing karakter
        int[] limitedCharacterBrow = {
            3, 3, 1, 4, 1, 3, 1, 4, 3, 4, 3, 5, 2, 3, 5
        };

        // Array untuk menyimpan nama karakter pilihan
        String[] characterPilih = {
            "Speedwagon",
            "Gojo",
            "Bulma",
            "Choso",
            "Gon",
            "Guts",
            "Araragi",
            "Sasuke",
            "Tengen",
            "Artoria",
            "Homura",
            "Usopp",
            "Dazai",
            "Asuna",
            "Tatsumaki"

        };

        // Array untuk menyimpan trait yang tersedia untuk karakter
        String[] traitPilihanSuccess = {"Unique unit gain 300% damage boost BUT limit the unit placement to 1", "Golden unit gain 40% damage boost for non-farm units, gain extra 15% Yen gain for farm units", "Devine unit gain 50% damage boost", "Celestial unit hace their placement limit double"};

        // Array untuk menyimpan damage masing-masing karakter
        double[] characterDamage = {
            0, 300.0, 0, 1500.0, 5000.0, 2500.0, 7000.0, 2000.0, 3000.0, 2300.0, 3200.0, 2000.0, 4500.0, 2200.0, 1900.0
        };

        // Array untuk menentukan apakah karakter memiliki damage
        boolean[] diaDamage = {false, true, false, true, true, true, true, true, true, true, true, true, true, true, true};

        // Array untuk menentukan apakah karakter berfungsi sebagai farm
        boolean[] diaFarm = {true, false, true, false, false, false, false, false, false, false, false, false, false, false, false};

        // Array untuk menyimpan nilai damage karakter untuk setiap slot dalam party
        double[] characterFarm = {
            250, 0, 500, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        };

        // Array untuk menyimpan apakah karakter berfokus pada tipe damage atau tidak
        boolean[] diaTypeDamage = new boolean[6];  // Array dengan 6 elemen (untuk 6 karakter party), berisi nilai boolean apakah karakter memiliki tipe damage

        // Array untuk menyimpan apakah karakter berfungsi sebagai unit farm atau tidak
        boolean[] diaTypeFarm = new boolean[6];    // Array dengan 6 elemen (untuk 6 karakter party), berisi nilai boolean apakah karakter adalah unit farm

        // Array untuk menyimpan nilai damage yang dimiliki oleh setiap karakter dalam party
        double[] penyimpananDamage = new double[6]; // Array dengan 6 elemen untuk menyimpan nilai damage karakter masing-masing

        // Array untuk menyimpan nama atau status evolusi dari setiap karakter dalam party
        String[] arrPartyEvolve = new String[6];   // Array dengan 6 elemen untuk menyimpan nama karakter setelah evolusi, misalnya "Speedwagon (Founder)"

        // Array untuk menyimpan nilai damage asli karakter, sebelum ada perubahan apapun
        double[] penyimpananDamageNoUbah = new double[6]; // Array dengan 6 elemen untuk menyimpan nilai damage asli dari karakter (tanpa perubahan)

        // Array untuk menyimpan nilai farm (misalnya yen atau sumber daya yang dihasilkan) untuk setiap karakter
        double[] penyimpananFarm = new double[6];   // Array dengan 6 elemen untuk menyimpan nilai hasil farm (produksi yen) karakter masing-masing

        // Array Menyimpan Nama Eveloved 
        String[] evolvedNames = {
            "Speedwagon (Founder)",
            "Gojo (Six Eyes)",
            "Bulma (Mother)",
            "Choso (Big Bro)",
            "Gon (Adult)",
            "Guts (Berserk)",
            "Araragi (KING)",
            "Sasuke (Eternal)",
            "Tengen (Flashiness Master)",
            "Artoria (Avalon Le Fae)",
            "Homura (Magical Girl)",
            "Usopp (God)",
            "Dazai (No Longer Human)",
            "Asuna (Flash)",
            "Tatsumaki (Tornado)"

        };

        //Arrays Menyimpan Naama Traits
        String[] traitsNames = {
            "Unique",
            "Golden",
            "Divine",
            "Celestial"

        };

        // Array untuk buff damage dan yen untuk setiap jenis trait
        double[] damageBuffCuy = {
            3, 0.4, 0.5, 0.0

        };

        double[] yenBuffCuy = {
            0.0, 0.15, 0.0, 0.0

        };

        // Array untuk menyimpan batas jumlah penempatan (placement limit) untuk setiap karakter
        int[] simpanPlace = new int[16];  // Array dengan 16 elemen, masing-masing untuk menyimpan nilai batas penempatan (placement limit) karakter (misalnya, karakter hanya bisa ditempatkan di map sebanyak 3 kali)

        // Array untuk menyimpan status apakah karakter telah berevolusi atau belum
        boolean[] evolved = new boolean[16]; // Array dengan 16 elemen, berisi nilai boolean yang menunjukkan apakah karakter telah berevolusi atau belum

        // Array untuk menyimpan status apakah karakter sudah memiliki trait (kemampuan khusus) atau belum
        boolean[] hasTrait = new boolean[16]; // Array dengan 16 elemen, berisi nilai boolean yang menunjukkan apakah karakter sudah memiliki trait tertentu atau belum

        System.out.println("Character List:");

        // Looping untuk menampilkan semua karakter yang ada di dalam array characters
        for (String character : characters) {  // for-each loop untuk iterasi setiap elemen dalam array characters

            System.out.println(character);  // Menampilkan setiap karakter dari array characters satu per satu

        }

        // Array untuk menyimpan status pemilihan slot karakter
        boolean[] pickedSlots = new boolean[16];  // Array dengan 16 elemen untuk menyimpan status apakah slot karakter sudah dipilih atau belum

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner inputPengguna = new Scanner(System.in);  // Scanner untuk mengambil input dari pengguna melalui keyboard

        // Array untuk menyimpan daftar karakter yang dipilih oleh pengguna untuk dimasukkan ke dalam party
        String[] party = new String[6];  // Array dengan 6 elemen untuk menyimpan nama karakter yang dipilih oleh pengguna untuk party

        System.out.println("Assemble a party:");

        // Loop untuk memilih 6 karakter dan memasukkannya ke dalam party
        for (int i = 1; i <= 6; i++) {  // Mengulangi sebanyak 6 kali, satu kali untuk setiap slot dalam party

            System.out.print("Slot " + i + ": ");
            int slotChoice = inputPengguna.nextInt();  // Membaca input pilihan slot karakter dari pengguna

            // Cek apakah slotChoice berada di luar jangkauan 1-15
            if (slotChoice < 1 || slotChoice > 15) {  // Jika pilihan slot kurang dari 1 atau lebih dari 15

                System.out.println("Invalid slot. Please choose a number between 1 and 15.");
                i--;  // Mengurangi i, sehingga loop akan meminta input lagi untuk slot ini

            } // Cek apakah karakter di slotChoice sudah dipilih
            else if (pickedSlots[slotChoice]) {  // Jika slotChoice sudah dipilih sebelumnya (pickedSlots[slotChoice] = true)

                System.out.println(characterPilih[slotChoice - 1] + " is already in party, please pick another character");
                i--;  // Mengurangi i, sehingga loop akan meminta input lagi untuk slot ini

            } else {
                // Jika slot valid dan karakter belum dipilih
                pickedSlots[slotChoice] = true;  // Tandai slot tersebut sudah dipilih
                party[i - 1] = characterPilih[slotChoice - 1];  // Menyimpan karakter yang dipilih ke dalam array party
                arrPartyEvolve[i - 1] = evolvedNames[slotChoice - 1];  // Menyimpan nama karakter yang sudah berevolusi ke dalam array arrPartyEvolve
                diaTypeDamage[i - 1] = diaDamage[slotChoice - 1];  // Menyimpan status damage dari karakter yang dipilih
                diaTypeFarm[i - 1] = diaFarm[slotChoice - 1];  // Menyimpan status farm dari karakter yang dipilih
                penyimpananDamage[i - 1] = characterDamage[slotChoice - 1];  // Menyimpan damage karakter yang dipilih ke dalam array penyimpananDamage
                
                simpanPlace[i - 1] = limitedCharacterBrow[slotChoice - 1];  // Menyimpan jumlah tempat karakter yang bisa ditempatkan
                
                penyimpananDamageNoUbah[i - 1] = characterDamage[slotChoice - 1];  // Menyimpan damage awal karakter yang dipilih
                penyimpananFarm[i - 1] = characterFarm[slotChoice - 1];  // Menyimpan yen per detik karakter yang dipilih
                System.out.println(characterPilih[slotChoice - 1] + " Picked");

            }
        }

        boolean stopProgram = false;

        while (!stopProgram) {

            System.out.println("========================================================================================");
            System.out.println("Party List:");

            // Melakukan perulangan melalui setiap elemen dalam array party
            for (int i = 0; i < party.length; i++) {

                // Mencetak indeks (i + 1) diikuti dengan titik, dan elemen party[i]
                System.out.print((i + 1) + "." + party[i]);

                // Memeriksa apakah ini bukan elemen terakhir dalam array
                if (i < party.length - 1) {
                    // Jika bukan elemen terakhir, cetak koma dan spasi
                    System.out.print(", ");
                }
            }

            System.out.println(",\nActivities");
            System.out.println("1. Play");
            System.out.println("2. Traits");
            System.out.println("3. Evolve Unit");
            System.out.print("Select Activity: ");

            // Mengambil input dari pengguna dan menyimpannya dalam variabel activityChoice
            int activityChoice = inputPengguna.nextInt();

            // Memeriksa apakah nilai yang dimasukkan oleh pengguna adalah 3
            if (activityChoice == 3) {

                // Evolve Unit
                System.out.println("\n========================================================================================");
                System.out.println("Which character are you evolving?");

                // Melakukan perulangan melalui setiap elemen dalam array 'party'
                for (int i = 0; i < party.length; i++) {

                    // Mencetak indeks (i + 1) diikuti dengan titik dan nama anggota party[i]
                    System.out.println((i + 1) + ". " + party[i]);

                }

                System.out.print("Select a character: ");
                // Mengambil input pilihan pengguna untuk evolusi karakter
                int evolveChoice = inputPengguna.nextInt();

                // Memeriksa apakah pilihan evolusi tidak valid (kurang dari 1 atau lebih dari 6)
                if (evolveChoice < 1 || evolveChoice > 6) {

                    System.out.println("Invalid choice.");

                } else {

                    // Menyimpan nama karakter yang dipilih untuk evolusi
                    String chosenCharacter = party[evolveChoice - 1];

                    // Mencari indeks karakter yang dipilih dalam array party
                    int characterIndex = -1;
                    for (int i = 0; i < party.length; i++) {

                        if (party[i].equals(chosenCharacter)) {

                            characterIndex = i;
                            break;

                        }
                    }

                    // Jika karakter tidak ditemukan dalam array party, cetak pesan kesalahan
                    if (characterIndex == -1) {

                        System.out.println("Error: Character not found in list.");
                        return;

                    }

                    // Memeriksa apakah karakter sudah pernah berevolusi
                    if (evolved[evolveChoice - 1]) {

                        System.out.println("character " + arrPartyEvolve[evolveChoice - 1] + " has already been evolved");

                    } else {

                        System.out.println("\n========================================================================================");
                        System.out.println("Character " + chosenCharacter + " will evolve to " + arrPartyEvolve[evolveChoice - 1]);
                        System.out.print("Are you sure? (Y/N) ");
                        String confirmation = inputPengguna.next();

                        // Memastikan pengguna mengonfirmasi evolusi
                        if (confirmation.equalsIgnoreCase("Y")) {

                            // Jika pengguna mengonfirmasi, karakter berevolusi
                            evolved[evolveChoice - 1] = true; // Menandai bahwa karakter sudah berevolusi
                            party[evolveChoice - 1] = arrPartyEvolve[evolveChoice - 1]; // Mengganti nama karakter dengan nama evolusinya
                            double saveDamage = penyimpananDamage[evolveChoice - 1]; // Menyimpan damage karakter sebelum evolusi
                            penyimpananDamage[evolveChoice - 1] *= 1.5; // Meningkatkan damage karakter setelah evolusi
                            System.out.println(chosenCharacter + " has evolved to " + arrPartyEvolve[evolveChoice - 1]);
                            System.out.println(arrPartyEvolve[evolveChoice - 1] + " damage has increased from " + saveDamage + " -> " + penyimpananDamage[evolveChoice - 1]);

                        } else {

                            // Jika pengguna membatalkan evolusi
                            System.out.println("Evolution cancelled.");

                        }
                    }
                }
            } else if (activityChoice == 2) {
                // Traits
                System.out.println("\n========================================================================================");
                System.out.println("Which character are you putting traits on?");
                // Menampilkan daftar karakter dalam party
                for (int i = 0; i < party.length; i++) {

                    System.out.println((i + 1) + ". " + party[i]);

                }

                System.out.print("Select a character: ");
                // Meminta pengguna untuk memilih karakter
                int traitsChoice = inputPengguna.nextInt();

                // Validasi pilihan karakter (memastikan dalam rentang yang valid)
                if (traitsChoice < 1 || traitsChoice > 6) {

                    System.out.println("Invalid choice.");

                } else {

                    System.out.println("\n========================================================================================");
                    System.out.println("Traits list:");

                    // Menampilkan daftar trait yang tersedia
                    for (int i = 0; i < traitsNames.length; i++) {
                        System.out.println((i + 1) + ". " + traitsNames[i]);
                    }
                    System.out.print("Select a trait: ");
                    // Meminta pengguna untuk memilih trait
                    int traitChoice = inputPengguna.nextInt();

                    // Validasi pilihan trait (memastikan dalam rentang yang valid)
                    if (traitsChoice < 1 || traitsChoice > 5) {

                        System.out.println("Invalid trait.");

                    } else {

                        String chosenTrait = traitsNames[traitChoice - 1]; // Trait yang dipilih
                        System.out.println("\n========================================================================================");
                        System.out.println("You are putting " + chosenTrait + " on " + party[traitsChoice - 1]);

                        System.out.print("Are you sure? (Y/N) ");

                        // Mengonfirmasi apakah pengguna yakin dengan pilihannya
                        String confirmation = inputPengguna.next();

                        // Memeriksa apakah karakter sudah memiliki trait (sudah berevolusi)
                        if (hasTrait[traitsChoice - 1]) {

                            System.out.println("character " + party[traitsChoice - 1] + " has already been evolved");

                        } else if (confirmation.equalsIgnoreCase("Y")) {

                            // Menerapkan trait yang dipilih pada karakter
                            hasTrait[traitsChoice - 1] = true;
                            party[traitsChoice - 1] = chosenTrait + " " + party[traitsChoice - 1];
                            System.out.println("Your " + party[traitsChoice - 1].substring(party[traitsChoice - 1].indexOf(" ")) + " has become " + party[traitsChoice - 1]);
                            System.out.println(traitPilihanSuccess[traitChoice - 1]);

                            // Bagian Menangani efek trait untuk tipe unit damage atau farm
                            if (diaTypeDamage[traitsChoice] && traitChoice == 2) {

                                System.out.println(party[traitsChoice - 1] + " is a damage unit, it will gain 40% damage boost");
                                double penyimpananDamageDua = penyimpananDamage[traitsChoice - 1];

                                // Menerapkan buff damage
                                penyimpananDamage[traitsChoice - 1] = (penyimpananDamageNoUbah[traitsChoice - 1] * damageBuffCuy[traitChoice - 1]) + penyimpananDamage[traitsChoice - 1];
                                System.out.println("Your " + party[traitsChoice - 1] + " damage has increased from " + penyimpananDamageDua + " -> " + penyimpananDamage[traitsChoice - 1]);

                            } else if (diaTypeFarm[traitsChoice] && traitChoice == 2) {

                                System.out.println(party[traitsChoice - 1] + " is a farm unit, it will gain 15% Yen Production");
                                double penyimpananFarmDua = penyimpananFarm[traitsChoice - 1];

                                // Menerapkan buff produksi farm
                                penyimpananFarm[traitsChoice - 1] = (penyimpananFarm[traitsChoice - 1] * yenBuffCuy[traitChoice - 1]) + penyimpananFarm[traitsChoice - 1];
                                System.out.println("Your " + party[traitsChoice - 1] + " Yen Production has increased from " + (int) penyimpananFarmDua + " -> " + (int) penyimpananFarm[traitsChoice - 1]);

                            } else if (traitChoice == 3) {

                                // Jika trait yang dipilih adalah pilihan 3, terapkan logika tambahan damage
                                penyimpananDamage[traitsChoice - 1] = (penyimpananDamageNoUbah[traitsChoice - 1] * damageBuffCuy[traitChoice]) + penyimpananDamage[traitsChoice - 1];
                                limitedCharacterBrow[traitsChoice - 1] = 1;
                                System.out.println("Your " + party[traitsChoice - 1] + " damage has increased from " + penyimpananDamage[traitsChoice - 1] + " -> " + penyimpananDamage[traitsChoice - 1]);

                            } else if (traitChoice == 1) {

                                // Jika trait yang dipilih adalah pilihan 1, terapkan buff damage
                                double simpanDamage = penyimpananDamage[traitsChoice - 1];
                                penyimpananDamage[traitsChoice - 1] = (penyimpananDamageNoUbah[traitsChoice - 1] * damageBuffCuy[traitChoice - 1]) + penyimpananDamage[traitsChoice - 1];
                                System.out.println("Your " + party[traitsChoice - 1] + " damage has increased from " + simpanDamage + " -> " + penyimpananDamage[traitsChoice - 1]);

                            } else if (traitChoice == 4) {

                                // Jika trait yang dipilih adalah pilihan 4, gandakan batasan tempat (placement limit)
                                int savePlace = simpanPlace[traitsChoice - 1];
                                simpanPlace[traitsChoice - 1] *= 2;
                                System.out.println(party[traitsChoice - 1] + " placement limit has doubled from " + savePlace + " -> " + simpanPlace[traitsChoice - 1]);

                            } else {

                                System.out.println("Trait application cancelled.");

                            }
                        }
                    }

                }
            }
            // Pilihan untuk menghentikan program
            System.out.print("\nStop The Program? (Y/N): ");
            String stopChoice = inputPengguna.next();
            if (stopChoice.equalsIgnoreCase("Y")) {
                stopProgram = true;
                System.out.println("Stopping Program");
            }
        }
    }
}
