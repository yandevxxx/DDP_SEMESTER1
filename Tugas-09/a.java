
import java.util.Arrays;
import java.util.Scanner;

public class a {

    public static void main(String[] Jian) {
        Scanner inputPengguna = new Scanner(System.in);
        String name = Jian[0];

        System.out.println("=================================================================================================================================================");
        System.out.println("||                                                          Legenda Artefak Matriks ASCII                                                      ||");
        System.out.println("||                                                      Dibuat oleh: Zild Jian XTO / 1402024054                                                ||");
        System.out.println("=================================================================================================================================================");
        System.out.println("Selamat datang di Petualangan di Dunia ASCII, " + name + " Si Sang Penjelajah!\n");
        System.out.println("Kamu kini terperangkap dalam dunia tersembunyi di balik layar digital.");
        System.out.println("Dunia ini dijaga oleh Artefak Matriks ASCII, sebuah artefak kuno yang diyakini memiliki kekuatan untuk meretas dimensi waktu dan ruang.");
        System.out.println("Hanya mereka yang dapat menguasai teka-teki matriks ini yang bisa kembali ke realitas. Jalanmu masih panjang, " + name + "! Buktikan bahwa kamu layak!");
        System.out.println("===========================================================================================");
        System.out.println("Masukkan 9 simbol kuno yang tersembunyi berupa karakter ke dalam Artefak Matriks berordo 3x3:");

        // 3D array for simbolChar
        char[][][] simbolChar = new char[1][3][3];

        // Input symbols directly without loops
        System.out.print("Masukan simbol ke-1: ");
        simbolChar[0][0][0] = inputPengguna.nextLine().charAt(0);
        System.out.print("Masukan simbol ke-2: ");
        simbolChar[0][0][1] = inputPengguna.nextLine().charAt(0);
        System.out.print("Masukan simbol ke-3: ");
        simbolChar[0][0][2] = inputPengguna.nextLine().charAt(0);
        System.out.print("Masukan simbol ke-4: ");
        simbolChar[0][1][0] = inputPengguna.nextLine().charAt(0);
        System.out.print("Masukan simbol ke-5: ");
        simbolChar[0][1][1] = inputPengguna.nextLine().charAt(0);
        System.out.print("Masukan simbol ke-6: ");
        simbolChar[0][1][2] = inputPengguna.nextLine().charAt(0);
        System.out.print("Masukan simbol ke-7: ");
        simbolChar[0][2][0] = inputPengguna.nextLine().charAt(0);
        System.out.print("Masukan simbol ke-8: ");
        simbolChar[0][2][1] = inputPengguna.nextLine().charAt(0);
        System.out.print("Masukan simbol ke-9: ");
        simbolChar[0][2][2] = inputPengguna.nextLine().charAt(0);

        System.out.println("===============================================================================================================================================");
        System.out.println("Artefak Matriks berordo 3x3 Berhasil Diaktifkan: ");
        System.out.println(Arrays.toString(simbolChar[0][0]));
        System.out.println(Arrays.toString(simbolChar[0][1]));
        System.out.println(Arrays.toString(simbolChar[0][2]));
        System.out.println("===============================================================================================================================================");

        // 3D array for simbolCharAscii
        int[][][] simbolCharAscii = new int[1][3][3];

        // Convert symbols to ASCII values without loops
        simbolCharAscii[0][0][0] = simbolChar[0][0][0];
        simbolCharAscii[0][0][1] = simbolChar[0][0][1];
        simbolCharAscii[0][0][2] = simbolChar[0][0][2];
        simbolCharAscii[0][1][0] = simbolChar[0][1][0];
        simbolCharAscii[0][1][1] = simbolChar[0][1][1];
        simbolCharAscii[0][1][2] = simbolChar[0][1][2];
        simbolCharAscii[0][2][0] = simbolChar[0][2][0];
        simbolCharAscii[0][2][1] = simbolChar[0][2][1];
        simbolCharAscii[0][2][2] = simbolChar[0][2][2];

        System.out.println("Simbol-simbol kuno ini kini telah terungkap dalam angka ASCII yang mewakili kekuatan tersembunyi:");
        System.out.println(Arrays.toString(simbolCharAscii[0][0]));
        System.out.println(Arrays.toString(simbolCharAscii[0][1]));
        System.out.println(Arrays.toString(simbolCharAscii[0][2]));
        System.out.println("===============================================================================================================================================");

        // 3D array for minor matrix
        int[][][] minor = new int[1][3][3];

        // Minor matrix calculations
        minor[0][0][0] = (simbolChar[0][1][1] * simbolChar[0][2][2]) - (simbolChar[0][1][2] * simbolChar[0][2][1]);
        minor[0][0][1] = (simbolChar[0][1][0] * simbolChar[0][2][2]) - (simbolChar[0][1][2] * simbolChar[0][2][0]);
        minor[0][0][2] = (simbolChar[0][1][0] * simbolChar[0][2][1]) - (simbolChar[0][1][1] * simbolChar[0][2][0]);

        minor[0][1][0] = (simbolChar[0][0][1] * simbolChar[0][2][2]) - (simbolChar[0][0][2] * simbolChar[0][2][1]);
        minor[0][1][1] = (simbolChar[0][0][0] * simbolChar[0][2][2]) - (simbolChar[0][0][2] * simbolChar[0][2][0]);
        minor[0][1][2] = (simbolChar[0][0][0] * simbolChar[0][2][1]) - (simbolChar[0][0][1] * simbolChar[0][2][0]);

        minor[0][2][0] = (simbolChar[0][0][1] * simbolChar[0][1][2]) - (simbolChar[0][0][2] * simbolChar[0][1][1]);
        minor[0][2][1] = (simbolChar[0][0][0] * simbolChar[0][1][2]) - (simbolChar[0][0][2] * simbolChar[0][1][0]);
        minor[0][2][2] = (simbolChar[0][0][0] * simbolChar[0][1][1]) - (simbolChar[0][0][1] * simbolChar[0][1][0]);

        System.out.println("Matriks Minor:");
        System.out.println(Arrays.toString(minor[0][0]));
        System.out.println(Arrays.toString(minor[0][1]));
        System.out.println(Arrays.toString(minor[0][2]));
        System.out.println("===============================================================================================================================================");

        System.out.println("Tantangan dari Artefak Matriks untuk " + name + " Sang Penjelajah:");
        String[][] listMatriks = {
            {"Matriks Adjoin", "Matriks Kofaktor", "Matriks Rotasi 90 Derajat", "Matriks Flip Horizontal"},
            {"Membuka jalur tersembunyi dari dimensi lain", "Menemukan elemen tersembunyi dari dimensi gelap", "Memutar ruang waktu untuk menemukan kebenaran", "Mencerminkan dirimu di dunia yang berlawanan"}
        };

        System.out.println("1. " + listMatriks[0][0] + " - " + listMatriks[1][0]);
        System.out.println("2. " + listMatriks[0][1] + " - " + listMatriks[1][1]);
        System.out.println("3. " + listMatriks[0][2] + " - " + listMatriks[1][2]);
        System.out.println("4. " + listMatriks[0][3] + " - " + listMatriks[1][3]);

        System.out.print("Pilih tantangan yang akan kamu hadapi: ");
        int pilihanTantangan = inputPengguna.nextInt();
        System.out.println("===============================================================================================================================================");

        System.out.println(name + " telah memilih Tantangan " + listMatriks[0][pilihanTantangan - 1] + " yang akan " + listMatriks[1][pilihanTantangan - 1] + "...\n");
        System.out.println("Bersiaplah! Penjaga Matriks mulai mengawasi gerakanmu...");

        int[][][] hasil = {
            {
                {minor[0][0][0], minor[0][1][0], minor[0][2][0]},
                {minor[0][0][1], minor[0][1][1], minor[0][2][1]},
                {minor[0][0][2], minor[0][1][2], minor[0][2][2]}
            },
            {
                {minor[0][0][0], -minor[0][0][1], minor[0][0][2]},
                {-minor[0][1][0], minor[0][1][1], -minor[0][1][2]},
                {minor[0][2][0], -minor[0][2][1], minor[0][2][2]}
            },
            {
                {minor[0][2][0], minor[0][1][0], minor[0][0][0]},
                {minor[0][2][1], minor[0][1][1], minor[0][0][1]},
                {minor[0][2][2], minor[0][1][2], minor[0][0][2]}
            },
            {
                {minor[0][2][0], minor[0][2][1], minor[0][2][2]},
                {minor[0][1][0], minor[0][1][1], minor[0][1][2]},
                {minor[0][0][0], minor[0][0][1], minor[0][0][2]}
            }
        };

        int[][] hasilMatriks = hasil[pilihanTantangan - 1];

        System.out.println(Arrays.toString(hasilMatriks[0]));
        System.out.println(Arrays.toString(hasilMatriks[1]));
        System.out.println(Arrays.toString(hasilMatriks[2]) + "\n");

        System.out.println("Tantangan Berhasil!!!\n");
        System.out.println(name + " telah menemukan " + listMatriks[0][pilihanTantangan - 1] + " yang membantunya " + listMatriks[1][pilihanTantangan - 1] + "!");
        System.out.println("Kekuatan artefak mulai terungkap dihadapanmu, " + name + "...");
        System.out.println("===============================================================================================================================================");

        System.out.println("Penjaga Matriks memberikan teka-teki akhir:\n");

        long determinan = minor[0][0][0] * (minor[0][1][1] * minor[0][2][2] - minor[0][1][2] * minor[0][2][1])
                - minor[0][0][1] * (minor[0][1][0] * minor[0][2][2] - minor[0][1][2] * minor[0][2][0])
                + minor[0][0][2] * (minor[0][1][0] * minor[0][2][1] - minor[0][1][1] * minor[0][2][0]);

        System.out.println("Berapa determinan dari " + listMatriks[0][pilihanTantangan - 1] + " yang telah kamu pilih?\n");
        System.out.println("Hasil Determinan Artefak " + listMatriks[0][pilihanTantangan - 1] + ": " + (int) determinan + "\n");
        System.out.println("Dengan penemuan ini, " + name + " melangkah lebih dekat menuju kebebasan!");
        System.out.println("Tapi jangan lengah... Masih banyak teka-teki yang menunggu di balik dunia Matriks ASCII ini.");
        System.out.println("==========================================================================================================================");
        System.out.println("Program Berakhir. Bersiaplah untuk petualangan berikutnya, " + name + " Si Sang Penjelajah...");
    }
}
