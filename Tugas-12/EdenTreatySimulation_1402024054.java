// 1402024054
// Zild Jian X TO

import java.util.Arrays;  //Import library Arrays yang diperlukan untuk tugas ini
import java.util.Scanner; //Import library Scanner yang diperlukan untuk tugas ini

public class EdenTreatySimulation_1402024054 {

    public static void main(String[] output) {
        //mengambil input dari pengguna melalui konsol atau terminal
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("------------------Selamat datang di Simulasi Raid Blue Archive---------------------");
        System.out.println("--------------------Dibuat oleh [Zild Jian X TO / 1402024054-----------------------");
        System.out.println("-----------------------------------------------------------------------------------");

        // array of arrays Ini berguna untuk menyimpan data nama nama roster
        String[] listAcademy = {
            "Gehenna",
            "Trinity"
        };

        // array of arrays Ini berguna untuk menyimpan data nama nama Character
        String[][] listAcademyCharacter = {
            {
                "Amau Ako",
                "Sorasaki Hina"
            },
            {
                "Misono Mika",
                "Kirifuji Nagisa"
            }
        };

        // array of arrays ini berguna untuk menyimpan data data dari nama nama skil yang akan di pakai untuk character
        String[][] exSkill = {
            {
                "Share Reconnaissance Data",
                "Ishboshet"
            },
            {
                "Kyrie Eleison",
                "Time On Target"
            }
        };

        // array of arrays ini berguna untuk menyimpan data data dari nama nama equipment yang akan di pakai untuk character
        String[][] uniqEquipChar = {
            {
                "Hot Shot",
                "Destroyer"
            },
            {
                "Quis ut Deus",
                "Royal Blend"
            }
        };

        // array of arrays ini berguna untuk menyimpan data data dari kerentanan bos
        String[][] type = {
            {
                "Mystic",
                "Explosion"
            },
            {
                "Penetration",
                "Explosion"
            },
            {
                "Explosion",
                "Mystic"
            },
            {
                "Explosion",
                "Penetration"
            },
            {
                "Penetration",
                "Mystic"
            }
        };

        // array of arrays ini berguna untuk menyimpan keterangan dari setiap ex skill 
        String[][] keterangan = {
            {
                " Ako Menimbulkan Mystic DMG setara dengan 50% HP Maks Ako ke satu boss.",
                " Hina Menimbulkan 255% ATK sebagai DMG tipe Explosion ke semua boss."
            },
            {
                " Mika Menghantarkan Penetration DMG 165% ATK Mika ke satu boss.",
                " Nagisa Menghantarkan Explosion DMG setara dengan 180% ATK Nagisa ke semua boss."
            }
        };

        double perkalianAttack = 0.5;

        // array of arrays ini berguna untuk menyimpan damage pasif yang dimana hasilnya dari (attack + attack lalu di kalikan dengan 2) ini berguna ketika pengguna memilih n di bagian mencoba skill
        double[][] listAcademyStatistickAttackPasif = {
            {
                45 + 45 * perkalianAttack, //ini 0.5 karna dari hints Unique Equipment mempunyai pasif yang menambah +50% atk
                99 + 99 * perkalianAttack //ini 0.5 karna dari hints Unique Equipment mempunyai pasif yang menambah +50% atk
            },
            {
                105 + 105 * perkalianAttack, //ini 0.5 karna dari hints Unique Equipment mempunyai pasif yang menambah +50% atk
                69 + 69 * perkalianAttack //ini 0.5 karna dari hints Unique Equipment mempunyai pasif yang menambah +50% atk
            }
        };

        // array of arrays ini berguna untuk menyimpan damage pasif yang dimana hasilnya dari (health + health lalu di kalikan dengan sesuai dengan kerentanan weak, resist dan , normal) ini berguna ketika pengguna memilih y di bagian mencoba skill
        double[][] listAcademyStatistickAttackExSkill = {
            {
                220 + 220 * 0.5,
                99 + 99 * 2.55
            },
            {
                105 + 105 * 1.65,
                69 + 69 * 1.80
            }
        };

        // array of array yang berguna untuk menyimpan list nama nama dari bos
        String[] listBoss = {
            "Kaiten FX MK.0",
            "Binah",
            "Perorodzilla"
        };

        // array of array yang berguna untuk menyimpan list nama nama armor yang bos gunakan
        String[] armorBoss = {
            "Light Armor",
            "Heavy Armor",
            "Special Armor"
        };

        System.out.println("Roster Yang Tersedia");
        // Menampilkan tim pertama dari daftar listAcademy yang pertama
        System.out.println("1. " + listAcademy[0]);
        // Menampilkan tim pertama dari daftar listAcademy yang kedua
        System.out.println("2. " + listAcademy[1]);
        // Meminta input dari pengguna untuk memilih tim
        System.out.print("Pilih Team: ");
        // menyimpan input tim yang dipilih oleh pengguna
        int pilihanTeamPengguna = input.nextInt();
        // Mengonsumsi karakter newline yang tersisa setelah membaca angka
        input.nextLine();

        System.out.println("--------------------------------------------");

        // Memastikan bahwa input tim berada dalam rentang yang benar 1 atau 2
        if (pilihanTeamPengguna == 1 || pilihanTeamPengguna == 2) {

            System.out.println("Character yang tersedia:");
            // Menampilkan daftar karakter yang tersedia untuk tim yang dipilih pengguna
            // Pilihan tim dikurangi 1 karena indeks array dimulai dari 0, sementara input tim dimulai dari 1
            System.out.println(Arrays.toString(listAcademyCharacter[pilihanTeamPengguna - 1]));
            System.out.print("Pilih Character: ");
            // menyimpan input tim yang yang di ketik berupa huruf oleh pengguna
            String inputPilihCharacter = input.nextLine();

            System.out.println("--------------------------------------------");

            // Inisialisasi variabel indexCharacter dengan nilai -1 (belum ada karakter yang dipilih)
            byte indexCharacter = -1;

            // Mengecek apakah pilihan tim pengguna adalah tim 1
            if (pilihanTeamPengguna == 1) {

                // Membandingkan inputPilihCharacter dengan nama karakter pertama di tim 1 (listAcademyCharacter[0][0])
                if (inputPilihCharacter.equalsIgnoreCase(listAcademyCharacter[0][0])) {
                    // Jika nama karakter cocok, set indexCharacter ke 0 (karakter pertama tim 1)
                    indexCharacter = 0;
                } // Membandingkan inputPilihCharacter dengan nama karakter kedua di tim 1 (listAcademyCharacter[0][1])
                else if (inputPilihCharacter.equalsIgnoreCase(listAcademyCharacter[0][1])) {
                    // Jika nama karakter cocok, set indexCharacter ke 1 (karakter kedua tim 1)
                    indexCharacter = 1;
                }

            } // Mengecek apakah pilihan tim pengguna adalah tim 2
            else if (pilihanTeamPengguna == 2) {

                // Membandingkan inputPilihCharacter dengan nama karakter pertama di tim 2 (listAcademyCharacter[1][0])
                if (inputPilihCharacter.equalsIgnoreCase(listAcademyCharacter[1][0])) {
                    // Jika nama karakter cocok, set indexCharacter ke 0 (karakter pertama tim 2)
                    indexCharacter = 0;
                } // Membandingkan inputPilihCharacter dengan nama karakter kedua di tim 2 (listAcademyCharacter[1][1])
                else if (inputPilihCharacter.equalsIgnoreCase(listAcademyCharacter[1][1])) {
                    // Jika nama karakter cocok, set indexCharacter ke 1 (karakter kedua tim 2)
                    indexCharacter = 1;
                }
            }

            // Mengecek apakah index karakter yang dipilih valid
            if (indexCharacter == 1 || indexCharacter == 0) {

                System.out.println("Academy dari Character yang anda pilih: " + listAcademy[pilihanTeamPengguna - 1] + "-" + listAcademyCharacter[pilihanTeamPengguna - 1][indexCharacter]);
                System.out.println("Attack Type Character: " + type[pilihanTeamPengguna - 1][indexCharacter]);
                System.out.println("EX Skill Character: " + exSkill[pilihanTeamPengguna - 1][indexCharacter]);
                System.out.println("Unique Equipment Character: " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter]);

                System.out.println("--------------------------------------------");

                System.out.println("Check status Character dan EX skill: ");
                System.out.println("1. Nama Character: " + listAcademyCharacter[pilihanTeamPengguna - 1][indexCharacter]);
                System.out.println("2. EX Skill: " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + " ->" + keterangan[pilihanTeamPengguna - 1][indexCharacter]);

                System.out.println("--------------------------------------------");

                System.out.println("Cek pasif Unique Equipment: ");
                // Mendapatkan nilai pasif serangan karakter yang dipilih
                double pasif = listAcademyStatistickAttackPasif[pilihanTeamPengguna - 1][indexCharacter];
                System.out.println(uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + " -> " + pasif + " damage/shot");

                System.out.println("--------------------------------------------");

                System.out.println("Check status Boss:");
                // Menampilkan informasi tentang boss pertama, kedua, dan ketiga, termasuk tipe armor dan tipe serangan yang rentan terhadap armor tersebut.
                System.out.println("1. " + listBoss[0] + " memiliki Armor bertipe " + armorBoss[0] + " yang rentan terhadap tipe Attack -> " + Arrays.toString(type[2]));
                System.out.println("2. " + listBoss[1] + " memiliki Armor bertipe " + armorBoss[1] + " yang rentan terhadap tipe Attack -> " + Arrays.toString(type[3]));
                System.out.println("3. " + listBoss[2] + " memiliki Armor bertipe " + armorBoss[2] + " yang rentan terhadap tipe Attack -> " + Arrays.toString(type[4]));

                System.out.println("--------------------------------------------");

                System.out.print("Apakah anda ingin mencoba EX Skill? (y/n): ");

                // Membaca input dari pengguna mengenai apakah mereka ingin menggunakan EX Skill atau tidak
                String cobaSkill = input.nextLine();  // Membaca input berupa string dari pengguna (y/n)

                System.out.println("--------------------------------------------");

                // Memeriksa apakah pengguna memilih untuk menggunakan EX Skill dengan memasukkan 'y'
                if (cobaSkill.equalsIgnoreCase("y")) {

                    // Mengecek apakah karakter yang dipilih adalah "Sorasaki Hina" atau "Kirifuji Nagisa"
                    if (listAcademyCharacter[pilihanTeamPengguna - 1][indexCharacter].equalsIgnoreCase("Sorasaki Hina") || listAcademyCharacter[pilihanTeamPengguna - 1][indexCharacter].equalsIgnoreCase("kirifuji nagisa")) {

                        // Mengambil nilai damage dari statistik karakter untuk yang normal
                        double damage = listAcademyStatistickAttackExSkill[pilihanTeamPengguna - 1][indexCharacter];

                        // Menghitung damage dengan efek Kaiten (double damage) karena weak
                        double damageKaiten = damage * 2;

                        // Menghitung damage dengan efek Perorodzila (mengurangi damage 30%) karena resistance
                        double damagePerorodzila = damage - (damage * 0.3);

                        System.out.print("Masukkan Healthpoint " + listBoss[0] + " (750 - 1500): ");

                        // menyimpan inputan pengguna sebagai darah boss kaiten
                        double healthPointKaiten = input.nextInt();

                        // Validasi inputan agar sesuai dengan range health point Kaiten
                        if (healthPointKaiten >= 750 && healthPointKaiten <= 1500) {

                            System.out.print("Masukkan Healthpoint " + listBoss[1] + " (750 - 1500): ");

                            // menyimpan inputan pengguna sebagai darah boss binah
                            double healthPointBinah = input.nextInt();

                            // Validasi inputan agar sesuai dengan range health point binah
                            if (healthPointBinah >= 750 && healthPointBinah <= 1500) {

                                System.out.print("Masukkan Healthpoint " + listBoss[2] + " (750 - 1500): ");

                                // menyimpan inputan pengguna sebagai darah boss Perorodzila
                                double healthPointPerorodzila = input.nextInt();

                                // Validasi inputan agar sesuai dengan range health point perorodzila
                                if (healthPointPerorodzila >= 750 && healthPointPerorodzila <= 1500) {

                                    System.out.println("Anda telah menggunakan EX Skill " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                    System.out.println(listBoss[0] + " terkena serangan sebesar " + (float) damageKaiten + " karena \nArmor Boss Weak");
                                    System.out.println(listBoss[1] + " terkena serangan sebesar " + (float) damage);
                                    System.out.println(listBoss[2] + " terkena serangan sebesar " + (float) damagePerorodzila + " karena \nDMG RES");
                                    System.out.println("--------------------------------------------");
                                    System.out.println("Healthpoint " + listBoss[0] + " tersisa " + (healthPointKaiten - damageKaiten));
                                    System.out.println("Healthpoint " + listBoss[1] + " tersisa " + (healthPointBinah - damage));
                                    System.out.println("Healthpoint " + listBoss[2] + " tersisa " + (healthPointPerorodzila - damagePerorodzila));
                                    System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                } else {

                                    // Menampilkan pesan error jika health point Perorodzila tidak sesuai range
                                    System.out.println("HP harus Sesuai range input");

                                }
                            } else {

                                // Menampilkan pesan error jika health point Binah tidak sesuai range
                                System.out.println("HP harus Sesuai range input");

                            }
                        } else {

                            // Menampilkan pesan error jika health point Kaiten tidak sesuai range
                            System.out.println("HP harus Sesuai range input");

                        }

                        //  jika karakter yang dipilih bukan "Sorasaki Hina" atau "Kirifuji Nagisa" maka akan melakukan pengcekan yang lain 
                    } else {

                        System.out.println("1. " + listBoss[0]);
                        System.out.println("2. " + listBoss[1]);
                        System.out.println("3. " + listBoss[2]);
                        // Meminta pengguna memilih boss yang akan diserang dan menyimpan pilihan tersebut
                        System.out.print("Pilih Boss untuk diserang: ");
                        int pilihBoss = input.nextInt() - 1;

                        // Memeriksa apakah pilihan boss valid (dalam rentang 0 - 2)
                        if (pilihBoss == 0 || pilihBoss == 1 || pilihBoss == 2) {

                            System.out.println("--------------------------------------------");

                            System.out.print("Masukkan Healthpoint " + listBoss[pilihBoss] + " (750 - 1500): ");
                            double healthPoint = input.nextInt(); // Meminta pengguna meng input health boss yang akan diserang dan menyimpan pilihan tersebut

                            // Memeriksa apakah Healthpoint yang dimasukkan berada dalam rentang yang valid (750 - 1500)
                            if (healthPoint >= 750 && healthPoint <= 1500) {

                                // Mengambil nilai damage dan jenis serangan dari statistik EX Skill karakter yang dipilih
                                double damage = listAcademyStatistickAttackExSkill[pilihanTeamPengguna - 1][indexCharacter];
                                String attackType = type[pilihanTeamPengguna - 1][indexCharacter];

                                // Memeriksa apakah boss yang dipilih adalah boss pertama
                                if (listBoss[pilihBoss].equalsIgnoreCase(listBoss[0])) {

                                    // Jika tipe serangan adalah "Explosion"
                                    if (attackType.equalsIgnoreCase("Explosion")) {

                                        // Damage dikalikan 2 karena boss ini rentan terhadap tipe Explosion
                                        damage *= 2;

                                        System.out.println("Anda telah menggunakan EX Skill " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                        System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena Armor Boss Weak");
                                        System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                        System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                        // Jika tipe serangan adalah "Mystic"
                                    } else if (attackType.equalsIgnoreCase("Mystic")) {

                                        // Mengurangi damage sebesar 30% karena resistansi boss terhadap Mystic
                                        damage -= damage * 0.3;

                                        System.out.println("Anda telah menggunakan EX Skill " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                        System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena DMG RES");
                                        System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                        System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                        // Jika tipe serangan bukan Explosion atau Mystic berarti normal yaitu tidak terdapat tambahan / pengurangan apapun terhadap damage 
                                    } else {

                                        System.out.println("Anda telah menggunakan EX Skill " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                        System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage);
                                        System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                        System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                    }

                                    // Memeriksa apakah boss yang dipilih adalah boss kedua
                                } else if (listBoss[pilihBoss].equalsIgnoreCase(listBoss[1])) {

                                    // Jika tipe serangan adalah "Penetration"
                                    if (attackType.equalsIgnoreCase("Penetration")) {

                                        // Damage dikalikan 2 karena boss ini rentan terhadap tipe Penetration
                                        damage *= 2;

                                        System.out.println("Anda telah menggunakan EX Skill " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                        System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena Armor Boss Weak");
                                        System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                        System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                        // Jika tipe serangan adalah "Mystic"
                                    } else if (attackType.equalsIgnoreCase("Mystic")) {

                                        // Mengurangi damage sebesar 30% karena resistansi boss terhadap Mystic
                                        damage -= damage * 0.3;

                                        System.out.println("Anda telah menggunakan EX Skill " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                        System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena DMG RES");
                                        System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                        System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                        // Jika tipe serangan bukan Penetration atau Mystic berarti normal yaitu tidak terdapat tambahan / pengurangan apapun terhadap damage 
                                    } else {

                                        System.out.println("Anda telah menggunakan EX Skill " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                        System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage);
                                        System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                        System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");
                                    }

                                    // Memeriksa apakah boss yang dipilih adalah boss kedua
                                } else if (listBoss[pilihBoss].equalsIgnoreCase(listBoss[2])) {

                                    // Jika tipe serangan adalah "Mystic"
                                    if (attackType.equalsIgnoreCase("Mystic")) {

                                        // Damage dikalikan 2 karena boss ini rentan terhadap tipe Penetration
                                        damage *= 2;

                                        System.out.println("Anda telah menggunakan EX Skill " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                        System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena Armor Boss Weak");
                                        System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                        System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                        // Jika tipe serangan adalah "Mystic"
                                    } else if (attackType.equalsIgnoreCase("Explosion")) {

                                        // Mengurangi damage sebesar 30% karena resistansi boss terhadap Mystic
                                        damage -= damage * 0.3;

                                        System.out.println("Anda telah menggunakan EX Skill " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                        System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena DMG RES");
                                        System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                        System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                        // Jika tipe serangan bukan Penetration  atau Mystic berarti normal yaitu tidak terdapat tambahan / pengurangan apapun terhadap damage 
                                    } else {

                                        System.out.println("Anda telah menggunakan EX Skill " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                        System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage);
                                        System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                        System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");
                                    }
                                }

                            } else {

                                // Jika HP yang dimasukkan tidak dalam rentang yang valid, maka tampilkan pesan Ini
                                System.out.println("HP harus Sesuai range input");

                            }

                        } else {

                            // Jika HP yang dimasukkan tidak dalam rentang yang valid, maka tampilkan pesan Ini
                            System.out.println("Opsi Boss tidak tersedia!");
                        }
                    }

                    // Kondisi ini akan dijalankan jika pemain memilih untuk tidak menggunakan EX Skill
                    // Artinya pemain memilih untuk menggunakan Unique Equipment, yang disimbolkan dengan 'n'
                } else if (cobaSkill.equalsIgnoreCase("n")) {

                    System.out.println("1. " + listBoss[0]);
                    System.out.println("2. " + listBoss[1]);
                    System.out.println("3. " + listBoss[2]);
                    // Meminta pemain untuk memilih boss yang ingin diserang
                    System.out.print("Pilih Boss untuk diserang: ");
                    // Input pemilihan boss, dikurangi 1 karena array index dimulai dari 0
                    int pilihBoss = input.nextInt() - 1;

                    // Kondisi Pengecekan apakah pilihan boss yang dimasukkan berada dalam range yang valid (0, 1, atau 2)
                    if (pilihBoss == 0 || pilihBoss == 1 || pilihBoss == 2) {

                        System.out.println("--------------------------------------------");
                        // Meminta pemain untuk memasukkan healthpoint boss yang dipilih
                        System.out.print("Masukkan Healthpoint " + listBoss[pilihBoss] + " (750 - 1500): ");
                        // Input healthpoint boss yang dipilih oleh pemain
                        double healthPoint = input.nextInt();

                        // Kondisi Pengecekan healthpoint yang dimasukkan dalam rentang yang valid (750 hingga 1500)
                        if (healthPoint >= 750 && healthPoint <= 1500) {

                            // Variabel damage diatur sesuai dengan damage dasar dari Unique Equipment
                            double damage = pasif;

                            // Jenis serangan yang dimiliki oleh karakter yang dipilih oleh pemain akan di simpan di variable ini dengan tipe string
                            String attackType = type[pilihanTeamPengguna - 1][indexCharacter];

                            // Pemeriksaan apakah boss yang dipilih adalah boss pertama (listBoss[0])
                            if (listBoss[pilihBoss].equalsIgnoreCase(listBoss[0])) {

                                // Jika tipe serangan adalah "Explosion", maka damage dikalikan 2 karena boss ini lemah terhadap Explosion
                                if (attackType.equalsIgnoreCase("Explosion")) {

                                    // hasil damage di kalikan 2 
                                    damage *= 2;

                                    System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                    System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena Armor Boss Weak");
                                    System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                    System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                    // Jika tipe serangan adalah "Mystic", maka damage dikurangi 30% karena resistansi boss terhadap Mystic
                                } else if (attackType.equalsIgnoreCase("Mystic")) {

                                    // hasil damage di kurangi 30%
                                    damage -= damage * 0.3;

                                    System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                    System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena DMG RES");
                                    System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                    System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                    // Jika tipe serangan bukan Penetration  atau Mystic berarti normal yaitu tidak terdapat tambahan / pengurangan apapun terhadap damage 
                                } else {

                                    System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                    System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage);
                                    System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                    System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                }

                                // Pemeriksaan jika boss yang dipilih adalah boss kedua (listBoss[1])
                            } else if (listBoss[pilihBoss].equalsIgnoreCase(listBoss[1])) {

                                // Jika tipe serangan adalah "Penetration", damage dikalikan 2 karena boss ini lemah terhadap Penetration
                                if (attackType.equalsIgnoreCase("Penetration")) {

                                    // hasil damage di kalikan 2
                                    damage *= 2;

                                    System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                    System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena Armor Boss Weak");
                                    System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                    System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                    // Jika tipe serangan adalah "Mystic", maka damage dikurangi 30% karena resistansi boss terhadap Mystic
                                } else if (attackType.equalsIgnoreCase("Mystic")) {

                                    //hasil dikurangi 30%
                                    damage -= damage * 0.3;

                                    System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                    System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena DMG RES");
                                    System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                    System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                    // Jika tipe serangan bukan Penetration atau Mystic, serangan akan dilakukan dengan damage normal
                                } else {

                                    System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                    System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage);
                                    System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                    System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");
                                }

                                // Pemeriksaan jika boss yang dipilih adalah boss ketiga (listBoss[2])
                            } else if (listBoss[pilihBoss].equalsIgnoreCase(listBoss[2])) {

                                // Jika tipe serangan adalah "Mystic", damage dikalikan 2 karena boss ini lemah terhadap Penetration
                                if (attackType.equalsIgnoreCase("Mystic")) {

                                    // hasil damage di kalikan 2
                                    damage *= 2;

                                    System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                    System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena Armor Boss Weak");
                                    System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                    System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                    // Jika tipe serangan adalah "Explosion", maka damage dikurangi 30% karena resistansi boss terhadap Mystic
                                } else if (attackType.equalsIgnoreCase("Explosion")) {

                                    //hasil dikurangi 30%
                                    damage -= damage * 0.3;

                                    System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                    System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena DMG RES");
                                    System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                    System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                    // Jika tipe serangan bukan Penetration atau Mystic, serangan akan dilakukan dengan damage normal
                                } else {

                                    System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                    System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage);
                                    System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                    System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                                }
                            }

                            // Jika input healthpoint tidak valid (di luar rentang 750 - 1500)
                        } else {
                            System.out.println("HP harus Sesuai range input");
                        }

                        // Jika pilihan boss tidak valid (di luar rentang 1 - 3) maka akan kelar print di bawah
                    } else {
                        System.out.println("Opsi Boss tidak tersedia!");
                    }

                    // Jika input tidak valid (selain 'y' atau 'n') untuk memilih EX Skill atau Unique Equipment maka akan keluar print di bawah
                } else {
                    System.out.println("Berikan input yang valid!");
                }

                // Jika karakter yang dipilih tidak tersedia
            } else {
                // Menampilkan pesan kesalahan bahwa karakter yang dipilih tidak ada atau tidak valid
                System.out.println("Maaf Character Yang Anda Pilih Tidak Tersedia.");
            }

            // Jika roster yang dipilih tidak valid
        } else {
            // Menampilkan pesan kesalahan bahwa roster yang dipilih tidak ada atau tidak valid
            System.out.println("Maaf Roster Yang Anda Pilih Tidak Tersedia!");
        }

        // Menutup scanner setelah input selesai untuk mencegah memory leaks
        input.close();
    }
}
