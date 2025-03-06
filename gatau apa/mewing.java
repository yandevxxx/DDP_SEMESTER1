
import java.util.Scanner;

public class mewing {

    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("-----------------Program MGR Battle-----------------");
        System.out.println("-------------nama/npm-------------");
        System.out.println("====================================================");
        System.out.println("Welcome Operative!");
        System.out.print("Enter Codename: ");
        String masukkanNama = inputan.nextLine();

        String[] pilihanKelas = {"Cyborg Ninja", "Samurai Swordsman", "Tech Specialist", "Stealth Operative"};

        String[] pilihanMusuh = {"Jetstream Sam", "Sundowner", "Senator Armstrong"};

        int pilihKelas = -1;

        do {
            int indexClas = 1;
            for (String classFang : pilihanKelas) {
                System.out.println(indexClas + ". " + classFang);
                indexClas++;
            }
            System.out.print("Option: ");
            pilihKelas = inputan.nextInt();

            if (pilihKelas <= 4) {
                break;
            } else {
                System.out.println("There is no class in the system Please try again!");
            }
        } while (true);

        System.out.println("");
        System.out.println("Setup your " + pilihanKelas[pilihKelas - 1]);
        System.out.print(masukkanNama + " the " + pilihanKelas[pilihKelas - 1] + " HP = ");
        int masukkanHP = inputan.nextInt();
        System.out.print(masukkanNama + " the " + pilihanKelas[pilihKelas - 1] + " Attack  = ");
        int masukkanAttack = inputan.nextInt();

        System.out.println("-------------------------------------");
        System.out.println("Enemy info");
        System.out.println("1. " + pilihanMusuh[0]);
        System.out.println("2. " + pilihanMusuh[1]);
        System.out.println("3. " + pilihanMusuh[2]);
        System.out.print("Choose your opponent : ");
        int pilihMusuh = inputan.nextInt();

        System.out.println("-------------------------------------");
        switch (pilihKelas) {
            case 0:
                masukkanHP *= 2;
                break;
            case 1:
                masukkanHP *= 2;
                break;
            case 2:
                masukkanHP *= 2;
                masukkanHP *= 2;
                break;
            case 3:
                masukkanHP /= 4;
                masukkanHP *= 4;
        }

        int[][] darahMusuh = {
            {1200, 700, 800}
        };

        int[][] attackMusuh = {
            {80, 60, 110}
        };

        System.out.println("");
        System.out.println(masukkanNama + " the " + pilihanKelas[pilihKelas - 1] + " vs " + pilihanMusuh[pilihMusuh - 1]);
        System.out.println("-------------------------------------");
        System.out.println("Batle Statistic");
        System.out.println("");
        System.out.println(pilihanKelas[pilihKelas - 1] + " HP :" + masukkanHP);
        System.out.println(pilihanKelas[pilihKelas - 1] + " HP :" + masukkanAttack);
        System.out.println("");
        System.out.println(" HP " + pilihanMusuh[pilihMusuh - 1] + " : " + darahMusuh[0][pilihMusuh - 1]);
        System.out.println(" Attack " + pilihanMusuh[pilihMusuh - 1] + " : " + attackMusuh[0][pilihMusuh - 1]);

    }
}
