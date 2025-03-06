
import java.util.Scanner;

public class Yan {

    public static void main(String[] Jiann) {
        System.out.println("==============================================================================");
        System.out.println("                         Program AA Tower Defense");
        System.out.println("                         Dibuat Oleh : Zild Jian Xto / 1402024054");
        System.out.println("                         Playable : No");
        System.out.println("==============================================================================");

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

        int[] limitCharacterBrow = {
            3, 3, 1, 4, 1, 3, 1, 4, 3, 4, 3, 5, 2, 3, 5
        };

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

        String[] arrTraitsSuccses = {"Unique unit gain 300% damage boost BUT limit the unit placement to 1", "Golden unit gain 40% damage boost for non-farm units, gain extra 15% Yen gain for farm units", "Devine unit gain 50% damage boost", "Celestial unit hace their placement limit double"};

        double[] characterDamage = {
            0, 300.0, 0, 1500.0, 5000.0, 2500.0, 7000.0, 2000.0, 3000.0, 2300.0, 3200.0, 2000.0, 4500.0, 2200.0, 1900.0
        };
        boolean[] diaDamage = {false, true, false, true, true, true, true, true, true, true, true, true, true, true, true};
        boolean[] diaFarm = {true, false, true, false, false, false, false, false, false, false, false, false, false, false, false};
        double[] characterFarm = {
            250, 0, 500, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        };

        boolean[] diaTypeDamage = new boolean[6];
        boolean[] diaTypeFarm = new boolean[6];
        double[] penyimpananDamage = new double[6];
        double[] penyimpananFarm = new double[6];
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

        String[] traitsNames = {
            "Unique",
            "Golden",
            "Divine",
            "Celestial"
        };

        double[] damageBuffCuy = {
            3, 0.40, 0.50, 0.0
        };
        double[] yenBuffCuy = {
            0.0, 0.15, 0.0, 0.0
        };

        boolean[] evolved = new boolean[16];
        boolean[] hasTrait = new boolean[16];

        System.out.println("Character List:");
        for (String character : characters) {
            System.out.println(character);
        }

        boolean[] pickedSlots = new boolean[16];
        Scanner inputPengguna = new Scanner(System.in);

        String[] party = new String[6];
        System.out.println("Assemble a party:");
        for (int i = 1; i <= 6; i++) {
            System.out.print("Slot " + i + ": ");
            int slotChoice = inputPengguna.nextInt();

            if (slotChoice < 1 || slotChoice > 15) {
                System.out.println("Invalid slot. Please choose a number between 1 and 15.");
                i--;
            } else if (pickedSlots[slotChoice]) {
                System.out.println(characterPilih[slotChoice - 1] + " is already in party, please pick another character");
                i--;
            } else {
                pickedSlots[slotChoice] = true;
                party[i - 1] = characterPilih[slotChoice - 1];
                diaTypeDamage[i - 1] = diaDamage[slotChoice - 1];
                diaTypeFarm[i - 1] = diaFarm[slotChoice - 1];
                penyimpananDamage[i - 1] = characterDamage[slotChoice - 1];
                penyimpananFarm[i - 1] = characterFarm[slotChoice - 1];

                System.out.println(characterPilih[slotChoice - 1] + " Picked");
            }
        }

        boolean stopProgram = false;

        while (!stopProgram) {
            System.out.println("\n========================================================================================");
            System.out.println("Party List:");
            for (int i = 0; i < party.length; i++) {
                System.out.print((i + 1) + "." + party[i]);
                if (i < party.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("\nActivities");
            System.out.println("1. Play");
            System.out.println("2. Traits");
            System.out.println("3. Evolve Unit");
            System.out.print("Select Activity: ");
            int activityChoice = inputPengguna.nextInt();

        }
    }
}