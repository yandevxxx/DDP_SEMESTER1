//Yaumil Hamida 1402024053

import java.util.Arrays;
import java.util.Scanner;

public class ArtefakMatriks_1402024053 {

    public static void main(String[] args) {

        Scanner masukanPengguna = new Scanner(System.in);
        String inisial = args[0];

        System.out.println("=================================================================================================================================================");
        System.out.println("||                                                          Legenda Artefak Matriks ASCII                                                         ||");
        System.out.println("||                                                      Dibuat oleh: Yaumil Hamida / 1402024053                                     ||");
        System.out.println("=================================================================================================================================================");
        System.out.println("Selamat datang di Petualangan di Dunia ASCII, " + inisial + " Si Sang Penjelajah!");
        System.out.println("");
        System.out.println("Kamu kini terperangkap dalam dunia tersembunyi di balik layar digital.");
        System.out.println("Dunia ini dijaga oleh Artefak Matriks ASCII, sebuah artefak kuno yang diyakini memiliki kekuatan untuk meretas dimensi waktu dan ruang.");
        System.out.println("Hanya mereka yang dapat menguasai teka-teki matriks ini yang bisa kembali ke realitas. Jalanmu masih panjang, " + inisial + "! Buktikan bahwa kamu layak!");
        System.out.println("===========================================================================================");
        System.out.println("Masukkan 9 simbol kuno yang tersembunyi berupa karakter ke dalam Artefak Matriks berordo 3x3:");

        System.out.print("Masukan simbol ke-1: ");
        String a = masukanPengguna.next();
        System.out.print("Masukan simbol ke-2: ");
        String b = masukanPengguna.next();
        System.out.print("Masukan simbol ke-3: ");
        String c = masukanPengguna.next();
        System.out.print("Masukan simbol ke-4: ");
        String d = masukanPengguna.next();
        System.out.print("Masukan simbol ke-5: ");
        String e = masukanPengguna.next();
        System.out.print("Masukan simbol ke-6: ");
        String f = masukanPengguna.next();
        System.out.print("Masukan simbol ke-7: ");
        String g = masukanPengguna.next();
        System.out.print("Masukan simbol ke-8: ");
        String h = masukanPengguna.next();
        System.out.print("Masukan simbol ke-9: ");
        String i = masukanPengguna.next();

        String[][] simbolPilihanPengguna = {
            {a, b, c},
            {d, e, f},
            {g, h, i}
        };

        char[][] simbolPilihan = {
            {simbolPilihanPengguna[0][0].charAt(0), simbolPilihanPengguna[0][1].charAt(0), simbolPilihanPengguna[0][2].charAt(0)},
            {simbolPilihanPengguna[1][0].charAt(0), simbolPilihanPengguna[1][1].charAt(0), simbolPilihanPengguna[1][2].charAt(0)},
            {simbolPilihanPengguna[2][0].charAt(0), simbolPilihanPengguna[2][1].charAt(0), simbolPilihanPengguna[2][2].charAt(0)}
        };

        System.out.println("===============================================================================================================================================");
        System.out.println("Artefak Matriks berordo 3x3 Berhasil Diaktifkan: ");

        System.out.println(Arrays.toString(simbolPilihan[0]));
        System.out.println(Arrays.toString(simbolPilihan[1]));
        System.out.println(Arrays.toString(simbolPilihan[2]));

        System.out.println("===============================================================================================================================================");
        System.out.println("Simbol-simbol kuno ini kini telah terungkap dalam angka ASCII yang mewakili kekuatan tersembunyi:");

        long[][] arrSimbolInt = {
            {(int) simbolPilihan[0][0], (int) simbolPilihan[0][1], (int) simbolPilihan[0][2]},
            {(int) simbolPilihan[1][0], (int) simbolPilihan[1][1], (int) simbolPilihan[1][2]},
            {(int) simbolPilihan[2][0], (int) simbolPilihan[2][1], (int) simbolPilihan[2][2]}
        };

        System.out.println(Arrays.toString(arrSimbolInt[0]));
        System.out.println(Arrays.toString(arrSimbolInt[1]));
        System.out.println(Arrays.toString(arrSimbolInt[2]));

        System.out.print("");
        System.out.println("Matriks kini tertransformasi menjadi Matriks minorRumus berordo 3x3 yang akan membantu " + inisial + " mengungkap rahasia matriks tersembunyi:");

        int[][][] minorRumus = new int[1][3][3];
        minorRumus[0][0][0] = (simbolPilihan[1][1] * simbolPilihan[2][2]) - (simbolPilihan[1][2] * simbolPilihan[2][1]);
        minorRumus[0][0][1] = (simbolPilihan[1][0] * simbolPilihan[2][2]) - (simbolPilihan[1][2] * simbolPilihan[2][0]);
        minorRumus[0][0][2] = (simbolPilihan[1][0] * simbolPilihan[2][1]) - (simbolPilihan[1][1] * simbolPilihan[2][0]);

        minorRumus[0][1][0] = (simbolPilihan[0][1] * simbolPilihan[2][2]) - (simbolPilihan[0][2] * simbolPilihan[2][1]);
        minorRumus[0][1][1] = (simbolPilihan[0][0] * simbolPilihan[2][2]) - (simbolPilihan[0][2] * simbolPilihan[2][0]);
        minorRumus[0][1][2] = (simbolPilihan[0][0] * simbolPilihan[2][1]) - (simbolPilihan[0][1] * simbolPilihan[2][0]);

        minorRumus[0][2][0] = (simbolPilihan[0][1] * simbolPilihan[1][2]) - (simbolPilihan[0][2] * simbolPilihan[1][1]);
        minorRumus[0][2][1] = (simbolPilihan[0][0] * simbolPilihan[1][2]) - (simbolPilihan[0][2] * simbolPilihan[1][0]);
        minorRumus[0][2][2] = (simbolPilihan[0][0] * simbolPilihan[1][1]) - (simbolPilihan[0][1] * simbolPilihan[1][0]);

        System.out.println(java.util.Arrays.toString(minorRumus[0][0]));
        System.out.println(java.util.Arrays.toString(minorRumus[0][1]));
        System.out.println(java.util.Arrays.toString(minorRumus[0][2]));
        System.out.println("===============================================================================================================================================");
        System.out.println("Tantangan dari Artefak Matriks untuk " + inisial + " Sang Penjelajah:");

        System.out.println("Tantangan dari Artefak Matriks untuk  Sang Penjelajah:");
        System.out.println("1. Matriks Adjoin - Membuka jalur tersembunyi dari dimensi lain");
        System.out.println("2. Matriks Kofaktor - Menemukan elemen tersembunyi dari dimensi gelap");
        System.out.println("3. Matriks Rotasi 90 Derajat - Memutar ruang waktu untuk menemukan kebenaran");
        System.out.println("4. Matriks Flip Horizontal - Mencerminkan dirimu di dunia yang berlawanan");
        System.out.print("Pilih tantangan yang akan kamu hadapi: ");
        int pilihanTantangan = masukanPengguna.nextInt();

        String[][] pilihanMtriks = new String[1][4];
        pilihanMtriks[0][0] = "Matriks Adjoin";
        pilihanMtriks[0][1] = "Matriks Kofaktor";
        pilihanMtriks[0][2] = "Matriks Rotasi 90 Derajat";
        pilihanMtriks[0][3] = "Matriks Flip Horizontal";

        System.out.println("===============================================================================================================================================");

        String[][] isiMatriksKeterangan = new String[1][4];
        isiMatriksKeterangan[0][0] = "Membuka jalur tersembunyi dari dimensi lain";
        isiMatriksKeterangan[0][1] = "Menemukan elemen tersembunyi dari dimensi gelap";
        isiMatriksKeterangan[0][2] = "Memutar ruang waktu untuk menemukan kebenaran";
        isiMatriksKeterangan[0][3] = "Mencerminkan dirimu di dunia yang berlawanan";

        System.out.println(inisial + " telah memilih Tantangan " + pilihanMtriks[0][pilihanTantangan - 1] + " yang akan " + isiMatriksKeterangan[0][pilihanTantangan - 1] + "...");
        System.out.println("");
        System.out.println("Bersiaplah! Penjaga Matriks mulai mengawasi gerakanmu...");

        int[][] hasilMatriks;

        int[][] adjoin = {
            {minorRumus[0][0][0], minorRumus[0][1][0], minorRumus[0][2][0]},
            {minorRumus[0][0][1], minorRumus[0][1][1], minorRumus[0][2][1]},
            {minorRumus[0][0][2], minorRumus[0][1][2], minorRumus[0][2][2]}
        };

        int[][] kofaktor = {
            {minorRumus[0][0][0], -minorRumus[0][0][1], minorRumus[0][0][2]},
            {-minorRumus[0][1][0], minorRumus[0][1][1], -minorRumus[0][1][2]},
            {minorRumus[0][2][0], -minorRumus[0][2][1], minorRumus[0][2][2]}
        };

        int[][] rotasi = {
            {minorRumus[0][2][0], minorRumus[0][1][0], minorRumus[0][0][0]},
            {minorRumus[0][2][1], minorRumus[0][1][1], minorRumus[0][0][1]},
            {minorRumus[0][2][2], minorRumus[0][1][2], minorRumus[0][0][2]}
        };

        int[][] flip = {
            {minorRumus[0][2][0], minorRumus[0][2][1], minorRumus[0][2][2]},
            {minorRumus[0][1][0], minorRumus[0][1][1], minorRumus[0][1][2]},
            {minorRumus[0][0][0], minorRumus[0][0][1], minorRumus[0][0][2]}
        };

        int[][][] hasil = {adjoin, kofaktor, rotasi, flip};

        hasilMatriks = hasil[pilihanTantangan - 1];

        System.out.println(Arrays.toString(hasilMatriks[0]));
        System.out.println(Arrays.toString(hasilMatriks[1]));

        System.out.println(Arrays.toString(hasilMatriks[2]));
        System.out.println("");

        long[][][] determinanRumus = {
            {
                {(long) minorRumus[0][0][0], (long) minorRumus[0][1][0], (long) minorRumus[0][2][0]},
                {(long) minorRumus[0][0][1], (long) minorRumus[0][1][1], (long) minorRumus[0][2][1]},
                {(long) minorRumus[0][0][2], (long) minorRumus[0][1][2], (long) minorRumus[0][2][2]}
            },
            {
                {(long) minorRumus[0][0][0], -(long) minorRumus[0][0][1], (long) minorRumus[0][0][2]},
                {-(long) minorRumus[0][1][0], (long) minorRumus[0][1][1], -(long) minorRumus[0][1][2]},
                {(long) minorRumus[0][2][0], -(long) minorRumus[0][2][1], (long) minorRumus[0][2][2]}
            },
            {
                {(long) minorRumus[0][2][0], (long) minorRumus[0][1][0], (long) minorRumus[0][0][0]},
                {(long) minorRumus[0][2][1], (long) minorRumus[0][1][1], (long) minorRumus[0][0][1]},
                {(long) minorRumus[0][2][2], (long) minorRumus[0][1][2], (long) minorRumus[0][0][2]}
            },
            {
                {(long) minorRumus[0][2][0], (long) minorRumus[0][2][1], (long) minorRumus[0][2][2]},
                {(long) minorRumus[0][1][0], (long) minorRumus[0][1][1], (long) minorRumus[0][1][2]},
                {(long) minorRumus[0][0][0], (long) minorRumus[0][0][1], (long) minorRumus[0][0][2]}
            }
        };
        long determinanA = determinanRumus[pilihanTantangan - 1][0][0] * (determinanRumus[pilihanTantangan - 1][1][1] * determinanRumus[pilihanTantangan - 1][2][2] - determinanRumus[pilihanTantangan - 1][1][2] * determinanRumus[pilihanTantangan - 1][2][1])
                - determinanRumus[pilihanTantangan - 1][0][1] * (determinanRumus[pilihanTantangan - 1][1][0] * determinanRumus[pilihanTantangan - 1][2][2] - determinanRumus[pilihanTantangan - 1][1][2] * determinanRumus[pilihanTantangan - 1][2][0])
                + determinanRumus[pilihanTantangan - 1][0][2] * (determinanRumus[pilihanTantangan - 1][1][0] * determinanRumus[pilihanTantangan - 1][2][1] - determinanRumus[pilihanTantangan - 1][1][1] * determinanRumus[pilihanTantangan - 1][2][0]);

        System.out.println("Tantangan Berhasil!!!");
        System.out.println("");
        System.out.println(inisial + " telah menemukan " + pilihanMtriks[0][pilihanTantangan - 1] + "yang membantunya" + isiMatriksKeterangan[0][pilihanTantangan - 1] + "!");
        System.out.println("Kekuatan artefak mulai terungkap dihadapanmu, " + inisial + "...");
        System.out.println("===============================================================================================================================================");
        System.out.println("Penjaga Matriks memberikan teka-teki akhir:");
        System.out.println("");

        System.out.println("Berapa determinan dari " + pilihanMtriks[0][pilihanTantangan - 1] + " yang telah kamu pilih?");
        System.out.println("");

        System.out.println("Hasil Determinan Artefak " + pilihanMtriks[0][pilihanTantangan - 1] + ": " + (int) determinanA);
        System.out.println("");

        System.out.println("Dengan penemuan ini, " + inisial + " melangkah lebih dekat menuju kebebasan!");
        System.out.println("Tapi jangan lengah... Masih banyak teka-teki yang menunggu di balik dunia Matriks ASCII ini.");
        System.out.println("==========================================================================================================================");
        System.out.println("Program Berakhir. Bersiaplah untuk petualangan berikutnya, " + inisial + " Si Sang Penjelajah...");
    }
}
