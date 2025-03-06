
import java.util.Arrays;
import java.util.Scanner;

public class ap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] listAcademy = {
            "Gehena",
            "Trinity"
        };

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

        double[][] listAcademyStatistickAttack = {
            {
                45 + 45 * 0.5,
                99 + 99 * 0.5
            },
            {
                105 + 105 * 0.5,
                69 + 69 * 0.5
            }
        };

        String[] listBoss = {
            "Kaiten FX MK.0",
            "Binah",
            "Perorodzilla"
        };

        String[] kelemahanBoss = {
            "Weak",
            "Normal",
            "Resist"
        };

        String[] armorBoss = {
            "Light Armor",
            "Heavy Armor",
            "Special Armor"
        };

        int[][] listAcademyStatistickHealth = {
            {
                220,
                133
            },
            {
                167,
                148
            }
        };

        System.out.println("Roster Yang Tersedia");
        System.out.println("1. " + listAcademy[0]);
        System.out.println("2. " + listAcademy[1]);
        System.out.print("Pilih Team: ");
        int pilihanTeamPengguna = input.nextInt();
        input.nextLine();

        System.out.println("--------------------------------------------");

        if (pilihanTeamPengguna >= 1 && pilihanTeamPengguna <= 2) {
            System.out.println("Character yang tersedia:");
            System.out.println(Arrays.toString(listAcademyCharacter[pilihanTeamPengguna - 1]));
            System.out.print("Pilih Character: ");
            String inputPilihCharacter = input.nextLine();
            System.out.println("--------------------------------------------");

            int indexCharacter = -1;

            if (pilihanTeamPengguna == 1) {
                if (inputPilihCharacter.equalsIgnoreCase(listAcademyCharacter[0][0])) {
                    indexCharacter = 0;
                } else if (inputPilihCharacter.equalsIgnoreCase(listAcademyCharacter[0][1])) {
                    indexCharacter = 1;
                }
            } else if (pilihanTeamPengguna == 2) {
                if (inputPilihCharacter.equalsIgnoreCase(listAcademyCharacter[1][0])) {
                    indexCharacter = 0;
                } else if (inputPilihCharacter.equalsIgnoreCase(listAcademyCharacter[1][1])) {
                    indexCharacter = 1;
                }
            }

            if (indexCharacter != -1) {
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
                double pasif = listAcademyStatistickAttack[pilihanTeamPengguna - 1][indexCharacter];
                System.out.println(uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + " -> " + pasif + " damage/shot");
                System.out.println("--------------------------------------------");
                System.out.println("Check status Boss:");
                System.out.println("1. " + listBoss[0] + " memiliki Armor bertipe " + armorBoss[0] + " yang rentan terhadap tipe Attack -> " + Arrays.toString(type[2]));
                System.out.println("2. " + listBoss[1] + " memiliki Armor bertipe " + armorBoss[1] + " yang rentan terhadap tipe Attack -> " + Arrays.toString(type[3]));
                System.out.println("3. " + listBoss[2] + " memiliki Armor bertipe " + armorBoss[2] + " yang rentan terhadap tipe Attack -> " + Arrays.toString(type[4]));

                System.out.println("--------------------------------------------");

                System.out.print("Apakah anda ingin mencoba EX Skill? (y/n): ");

                String cobaSkill = input.nextLine();

                System.out.println("--------------------------------------------");

                if (cobaSkill.equalsIgnoreCase("y")) {
                    System.out.println("1. " + listBoss[0]);
                    System.out.println("2. " + listBoss[1]);
                    System.out.println("3. " + listBoss[2]);
                    System.out.print("Pilih Boss untuk diserang: ");
                    int pilihBoss = input.nextInt() - 1;
                    if (pilihBoss >= 0 && pilihBoss <= 2) {
                        System.out.println("--------------------------------------------");
                        System.out.print("Masukkan Healthpoint " + listBoss[pilihBoss] + " (750 - 1500): ");
                        double healthPoint = input.nextInt();
                        if (healthPoint >= 750 && healthPoint <= 1500) {
                            double damage = pasif;
                            if (kelemahanBoss[pilihBoss].equalsIgnoreCase("Weak")) {
                                damage *= 2;
                                System.out.println("Anda telah menggunakan Unique Equipment " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage);
                                System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                            } else if (kelemahanBoss[pilihBoss].equalsIgnoreCase("Normal")) {

                                System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) listAcademyStatistickAttack[pilihanTeamPengguna - 1][indexCharacter]);
                                System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - listAcademyStatistickAttack[pilihanTeamPengguna - 1][indexCharacter]));
                                System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                            } else if (kelemahanBoss[pilihBoss].equalsIgnoreCase("Resist")) {
                                damage -= 30;
                                damage += 110 + 45;
                                System.out.println("Anda telah menggunakan Unique Equipment " + exSkill[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena Armor Boss Weak");
                                System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");
                            }
                        } else {
                            System.out.println("HP harus Sesuai range input");
                        }
                    } else {
                        System.out.println("Opsi Boss tidak tersedia!");
                    }
                } else if (cobaSkill.equalsIgnoreCase("n")) {
                    System.out.println("1. " + listBoss[0]);
                    System.out.println("2. " + listBoss[1]);
                    System.out.println("3. " + listBoss[2]);
                    System.out.print("Pilih Boss untuk diserang: ");
                    int pilihBoss = input.nextInt() - 1;
                    if (pilihBoss >= 0 && pilihBoss <= 2) {
                        System.out.println("--------------------------------------------");
                        System.out.print("Masukkan Healthpoint " + listBoss[pilihBoss] + " (750 - 1500): ");
                        double healthPoint = input.nextInt();
                        if (healthPoint >= 750 && healthPoint <= 1500) {

                            double damage = pasif;

                            if (kelemahanBoss[pilihBoss].equalsIgnoreCase("Weak")) {

                                System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage);
                                System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                            } else if (kelemahanBoss[pilihBoss].equalsIgnoreCase("Normal")) {

                                System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage);
                                System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                            } else if (kelemahanBoss[pilihBoss].equalsIgnoreCase("Resist")) {

                                System.out.println("Anda telah menggunakan Unique Equipment " + uniqEquipChar[pilihanTeamPengguna - 1][indexCharacter] + "!");
                                System.out.println(listBoss[pilihBoss] + " terkena serangan sebesar " + (float) damage + " karena DMG RES");
                                System.out.println("Healthpoint " + listBoss[pilihBoss] + " tersisa " + (healthPoint - damage));
                                System.out.println("Terima Kasih sudah menyelesaikan Daily Raid Hari ini!");

                            }
                        } else {
                            System.out.println("HP harus Sesuai range input");
                        }
                    } else {
                        System.out.println("Opsi Boss tidak tersedia!");
                    }
                } else {
                    System.out.println("Berikan input yang valid!");
                }
            } else {
                System.out.println("Maaf Character Yang Anda Pilih Tidak Tersedia.");
            }

        } else {
            System.out.println("Maaf Roster Yang Anda Pilih Tidak Tersedia!");
        }

        input.close();
    }
}
