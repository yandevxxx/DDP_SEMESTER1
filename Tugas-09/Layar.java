
import java.util.Arrays;
import java.util.Scanner;

public class Layar {

    public static void main(String[] input) {
        Scanner sc = new Scanner(System.in);
        String name = input[0];
        System.out.println("======================================================================================================================================================");
        System.out.println("                                                            Legenda Artefak Matriks ASCII                                                            ");
        System.out.println("                                                     Dibuat oleh: Azhar Aulia Priatna/1402024013                                                     ");
        System.out.println("======================================================================================================================================================");
        System.out.println("Selamat datang di Petualangan di Dunia ASCII, " + name + " Si Sang Penjelajah\n");
        System.out.println("Kamu kini terperangkap dalam dunia tersembunyi di balik layar digital.");
        System.out.println("Dunia ini dijaga oleh Artefak Matriks ASCII, sebuah artefak kuno yang diyakini memiliki kekuatan untuk meretas dimensi waktu dan ruang.");
        System.out.println("Hanya mereka yang dapat menguasai teka-teki matriks ini yang bisa kembali ke realitas. Jalanmu masih panjang, " + name + " Buktikanlah bahwa kamu layak!");
        System.out.println("==================================================");
        System.out.println("Masukan 9 simbol kuno yang tersembunyi ke dalam Artefak Matriks berordo 3x3:");
        System.out.print("Masukan simbol ke-1: ");
        String simbol1 = sc.nextLine();
        System.out.print("Masukan simbol ke-2: ");
        String simbol2 = sc.nextLine();
        System.out.print("Masukan simbol ke-3: ");
        String simbol3 = sc.next();
        System.out.print("Masukan simbol ke-4: ");
        String simbol4 = sc.next();
        System.out.print("Masukan simbol ke-5: ");
        String simbol5 = sc.next();
        System.out.print("Masukan simbol ke-6: ");
        String simbol6 = sc.next();
        System.out.print("Masukan simbol ke-7: ");
        String simbol7 = sc.next();
        System.out.print("Masukan simbol ke-8: ");
        String simbol8 = sc.nextLine();
        System.out.print("Masukan simbol ke-9: ");
        String simbol9 = sc.nextLine();

        char[][] arrSimbolChar = {
            {simbol1.charAt(0), simbol2.charAt(0), simbol3.charAt(0)},
            {simbol4.charAt(0), simbol5.charAt(0), simbol6.charAt(0)},
            {simbol7.charAt(0), simbol8.charAt(0), simbol9.charAt(0)}
        };

        System.out.println("======================================================================================================================================================");
        System.out.println("Artefak Matriks berordo 3x3 Berhasil Diaktifkan:");
        System.out.println(Arrays.toString(arrSimbolChar[0]));
        System.out.println(Arrays.toString(arrSimbolChar[1]));
        System.out.println(Arrays.toString(arrSimbolChar[2]));

        long[][] arrSimbolInt = {
            {(int) arrSimbolChar[0][0], (int) arrSimbolChar[0][1], (int) arrSimbolChar[0][2]},
            {(int) arrSimbolChar[1][0], (int) arrSimbolChar[1][1], (int) arrSimbolChar[1][2]},
            {(int) arrSimbolChar[2][0], (int) arrSimbolChar[2][1], (int) arrSimbolChar[2][2]}
        };

        System.out.println("======================================================================================================================================================");
        System.out.println("Artefak Matriks berordo 3x3 Berhasil Diaktifkan:");
        System.out.println(Arrays.toString(arrSimbolChar[0]));
        System.out.println(Arrays.toString(arrSimbolChar[1]));
        System.out.println(Arrays.toString(arrSimbolChar[2]));

        System.out.println("======================================================================================================================================================");
        System.out.println("Simbol-simbol kuno ini kini telah terungkap dalam angka ASCII yang mewakili kekuatan tersembunyi:");
        System.out.println(Arrays.toString(arrSimbolInt[0]));
        System.out.println(Arrays.toString(arrSimbolInt[1]));
        System.out.println(Arrays.toString(arrSimbolInt[2]));

        long[][][] arrMatrixMinor = {
            {
                {arrSimbolInt[1][1] * arrSimbolInt[2][2] - arrSimbolInt[1][2] * arrSimbolInt[2][1],
                    arrSimbolInt[1][0] * arrSimbolInt[2][2] - arrSimbolInt[1][2] * arrSimbolInt[2][0],
                    arrSimbolInt[1][0] * arrSimbolInt[2][1] - arrSimbolInt[1][1] * arrSimbolInt[2][0]},
                {arrSimbolInt[0][1] * arrSimbolInt[2][2] - arrSimbolInt[0][2] * arrSimbolInt[2][1],
                    arrSimbolInt[0][0] * arrSimbolInt[2][2] - arrSimbolInt[0][2] * arrSimbolInt[2][0],
                    arrSimbolInt[0][0] * arrSimbolInt[2][1] - arrSimbolInt[0][1] * arrSimbolInt[2][0]},
                {arrSimbolInt[0][1] * arrSimbolInt[1][2] - arrSimbolInt[0][2] * arrSimbolInt[1][1],
                    arrSimbolInt[0][0] * arrSimbolInt[1][2] - arrSimbolInt[0][2] * arrSimbolInt[1][0],
                    arrSimbolInt[0][0] * arrSimbolInt[1][1] - arrSimbolInt[0][1] * arrSimbolInt[1][0]}
            }
        };

        System.out.println("======================================================================================================================================================");
        System.out.println("Matriks kini tertransdormasi menjadi Matriks Minor berordo 3x3 yang akan membantu " + name + " mengungkap rahasia metriks tersembunyi:");
        System.out.println(Arrays.toString(arrMatrixMinor[0]));
        System.out.println(Arrays.toString(arrMatrixMinor[1]));
        System.out.println(Arrays.toString(arrMatrixMinor[2]));
        System.out.println("======================================================================================================================================================");
        String[][] arrChalange = {
            {"Matriks Adjoin", "Matriks Kofaktor", "Matriks Rotasi 90 Derajat", "Matriks Flip Horizontal"},
            {"Membuka jalur tersembunyi dari dimensi lain", "Menemukan elemen tersembunyi dari dimensi gelap", "Memutar ruang waktu untuk menemukan kebenaran", "Mencerminkan dirimu di dunia yang berlawanan"}
        };
        System.out.println("Tantangan dari Artefak untuk " + name + " Sang Penjelajah:");
        System.out.println("1. " + arrChalange[0][0] + " - " + arrChalange[1][0]);
        System.out.println("2. " + arrChalange[0][1] + " - " + arrChalange[1][1]);
        System.out.println("3. " + arrChalange[0][2] + " - " + arrChalange[1][2]);
        System.out.println("4. " + arrChalange[0][3] + " - " + arrChalange[1][3]);
        System.out.print("Pilih tantangan yang akan kamu hadapi: ");
        int chooseChalange = sc.nextInt();
        System.out.println("======================================================================================================================================================");

        // Define each 2D array separately
        long[][][] arrMatrixMinor = {
            {
                {1}, {2}, {3}
            },
            {
                {4}, {5}, {6}
            },
            {
                {7}, {8}, {9}
            }
        };

        // Define each 2D array separately
        long[][] arrMatrix1 = {
            {arrMatrixMinor[0][0][0], arrMatrixMinor[1][0][0], arrMatrixMinor[2][0][0]},
            {arrMatrixMinor[0][1][0], arrMatrixMinor[1][1][0], arrMatrixMinor[2][1][0]},
            {arrMatrixMinor[0][2][0], arrMatrixMinor[1][2][0], arrMatrixMinor[2][2][0]}
        };

        long[][] arrMatrix2 = {
            {arrMatrixMinor[0][0][0], -arrMatrixMinor[0][1][0], arrMatrixMinor[0][2][0]},
            {-arrMatrixMinor[1][0][0], arrMatrixMinor[1][1][0], -arrMatrixMinor[1][2][0]},
            {arrMatrixMinor[2][0][0], -arrMatrixMinor[2][1][0], arrMatrixMinor[2][2][0]}
        };

        long[][] arrMatrix3 = {
            {arrMatrixMinor[2][0][0], arrMatrixMinor[1][0][0], arrMatrixMinor[0][0][0]},
            {arrMatrixMinor[2][1][0], arrMatrixMinor[1][1][0], arrMatrixMinor[0][1][0]},
            {arrMatrixMinor[2][2][0], arrMatrixMinor[1][2][0], arrMatrixMinor[0][2][0]}
        };

        long[][] arrMatrix4 = {
            {arrMatrixMinor[2][0][0], arrMatrixMinor[2][1][0], arrMatrixMinor[2][2][0]},
            {arrMatrixMinor[1][0][0], arrMatrixMinor[1][1][0], arrMatrixMinor[1][2][0]},
            {arrMatrixMinor[0][0][0], arrMatrixMinor[0][1][0], arrMatrixMinor[0][2][0]}
        };

        long[][][] arrListChalange = {arrMatrix1, arrMatrix2, arrMatrix3, arrMatrix4};

        // Calculate determinants individually
        long det1 = arrListChalange[0][0][0] * (arrListChalange[0][1][1] * arrListChalange[0][2][2] - arrListChalange[0][1][2] * arrListChalange[0][2][1])
                - arrListChalange[0][0][1] * (arrListChalange[0][1][0] * arrListChalange[0][2][2] - arrListChalange[0][1][2] * arrListChalange[0][2][0])
                + arrListChalange[0][0][2] * (arrListChalange[0][1][0] * arrListChalange[0][2][1] - arrListChalange[0][1][1] * arrListChalange[0][2][0]);

        long det2 = arrListChalange[1][0][0] * (arrListChalange[1][1][1] * arrListChalange[1][2][2] - arrListChalange[1][1][2] * arrListChalange[1][2][1])
                - arrListChalange[1][0][1] * (arrListChalange[1][1][0] * arrListChalange[1][2][2] - arrListChalange[1][1][2] * arrListChalange[1][2][0])
                + arrListChalange[1][0][2] * (arrListChalange[1][1][0] * arrListChalange[1][2][1] - arrListChalange[1][1][1] * arrListChalange[1][2][0]);

        long det3 = arrListChalange[2][0][0] * (arrListChalange[2][1][1] * arrListChalange[2][2][2] - arrListChalange[2][1][2] * arrListChalange[2][2][1])
                - arrListChalange[2][0][1] * (arrListChalange[2][1][0] * arrListChalange[2][2][2] - arrListChalange[2][1][2] * arrListChalange[2][2][0])
                + arrListChalange[2][0][2] * (arrListChalange[2][1][0] * arrListChalange[2][2][1] - arrListChalange[2][1][1] * arrListChalange[2][2][0]);

        long det4 = arrListChalange[3][0][0] * (arrListChalange[3][1][1] * arrListChalange[3][2][2] - arrListChalange[3][1][2] * arrListChalange[3][2][1])
                - arrListChalange[3][0][1] * (arrListChalange[3][1][0] * arrListChalange[3][2][2] - arrListChalange[3][1][2] * arrListChalange[3][2][0])
                + arrListChalange[3][0][2] * (arrListChalange[3][1][0] * arrListChalange[3][2][1] - arrListChalange[3][1][1] * arrListChalange[3][2][0]);

        long[] arrMatriksDeterminan = {det1, det2, det3, det4};
        System.out.println(name + " telah memilih Tantangan " + arrChalange[0][chooseChalange - 1] + " yang akan " + arrChalange[1][chooseChalange - 1] + "...");
        System.out.println("\nBersiaplah! Penjaga Matrix mulai mengawasi gerakanmu...");
        System.out.println(Arrays.toString(arrListChalange[chooseChalange - 1][0]));
        System.out.println(Arrays.toString(arrListChalange[chooseChalange - 1][1]));
        System.out.println(Arrays.toString(arrListChalange[chooseChalange - 1][2]));
        System.out.println("\nTantangan Berhasil!!!");
        System.out.println("\n" + name + " telah menemukan " + arrChalange[0][chooseChalange - 1] + " yang membantunya " + arrChalange[1][chooseChalange - 1] + "!");
        System.out.println("Kekuatan artefak mulai terungkap di hadapanmu, " + name + "...");
        System.out.println("======================================================================================================================================================");
        System.out.println("Penjaga Matriks memberikan teka-teki akhir:");
        System.out.println("\nBerapa determinan dari " + arrChalange[0][chooseChalange - 1] + " yang telah kamu pilih?");
        System.out.println("\nHasil determinan Artefak " + arrChalange[0][chooseChalange - 1] + ": " + arrMatriksDeterminan[chooseChalange - 1]);
        System.out.println("\nDengan penemuan ini " + name + " melangkah lebih dekat menuju kebebasan!");
        System.out.println("Tapi jangan lengah... Masih banyak teka-teki yang menunggu di balik dunia Matriks ASCII ini.");
        System.out.println("======================================================================================================================================================");
        System.out.println("Program Berakhir. Bersiaplah untuk petualangan berikutnya, " + name + "SI Sang penjelajah...");
    }
}
