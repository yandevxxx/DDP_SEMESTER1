// Zild Jian Xto
// 1402024054

import java.util.Arrays;
import java.util.Scanner;

public class ArtefakMatriks_140202405412 {

    public static void main(String[] Jian) {
        // scanner ini untuk membuat inputan pengguna 
        Scanner inputPengguna = new Scanner(System.in);

        // untuk menyimpan hasil output dari nama pengguna menjadi string 
        String name = Jian[0];

        System.out.println("=================================================================================================================================================");

        System.out.println("||                                                          Legenda Artefak Matriks ASCII                                                      ||");

        System.out.println("||                                                      Dibuat oleh: Zild Jian XTO / 1402024054                                                ||");

        System.out.println("=================================================================================================================================================");

        // \n berguna untuk membuat barisan baru kosong supaya ada jarak
        // name memanggil nama dari output di variabel name yang bertipe string
        System.out.println("Selamat datang di Petualangan di Dunia ASCII, " + name + " Si Sang Penjelajah!\n");

        System.out.println("Kamu kini terperangkap dalam dunia tersembunyi di balik layar digital.");

        System.out.println("Dunia ini dijaga oleh Artefak Matriks ASCII, sebuah artefak kuno yang diyakini memiliki kekuatan untuk meretas dimensi waktu dan ruang.");

        System.out.println("Hanya mereka yang dapat menguasai teka-teki matriks ini yang bisa kembali ke realitas. Jalanmu masih panjang, " + name + "! Buktikan bahwa kamu layak!");

        System.out.println("===========================================================================================");

        System.out.println("Masukkan 9 simbol kuno yang tersembunyi berupa karakter ke dalam Artefak Matriks berordo 3x3:");

        System.out.print("Masukan simbol ke-1: ");
        //menyimpan inputan pengguna menjadi string
        String simbol1 = inputPengguna.nextLine();

        System.out.print("Masukan simbol ke-2: ");
        //menyimpan inputan pengguna menjadi string 
        String simbol2 = inputPengguna.nextLine();

        System.out.print("Masukan simbol ke-3: ");
        //menyimpan inputan pengguna menjadi string 
        String simbol3 = inputPengguna.nextLine();

        System.out.print("Masukan simbol ke-4: ");
        //menyimpan inputan pengguna menjadi string 
        String simbol4 = inputPengguna.nextLine();

        System.out.print("Masukan simbol ke-5: ");
        //menyimpan inputan pengguna menjadi string 
        String simbol5 = inputPengguna.nextLine();

        System.out.print("Masukan simbol ke-6: ");
        //menyimpan inputan pengguna menjadi string 
        String simbol6 = inputPengguna.nextLine();

        System.out.print("Masukan simbol ke-7: ");
        //menyimpan inputan pengguna menjadi string 
        String simbol7 = inputPengguna.nextLine();

        System.out.print("Masukan simbol ke-8: ");
        //menyimpan inputan pengguna menjadi string 
        String simbol8 = inputPengguna.nextLine();

        System.out.print("Masukan simbol ke-9: ");
        //menyimpan inputan pengguna menjadi string 
        String simbol9 = inputPengguna.nextLine();

        //membuat array of char 3x3 dan menyimpan hasil inputan pengguna dengan array dan di ambil hruf index yang ke 0 lalu convert ke char
        char[][] simbolChar = new char[3][3];
        simbolChar[0][0] = simbol1.charAt(0); // a
        simbolChar[0][1] = simbol2.charAt(0); // b
        simbolChar[0][2] = simbol3.charAt(0); // c
        simbolChar[1][0] = simbol4.charAt(0); // d
        simbolChar[1][1] = simbol5.charAt(0); // e
        simbolChar[1][2] = simbol6.charAt(0); // f 
        simbolChar[2][0] = simbol7.charAt(0); // g
        simbolChar[2][1] = simbol8.charAt(0); // h
        simbolChar[2][2] = simbol9.charAt(0); // i

        System.out.println("===============================================================================================================================================");
        System.out.println("Artefak Matriks berordo 3x3 Berhasil Diaktifkan: ");

        System.out.println(java.util.Arrays.toString(simbolChar[0]));
        System.out.println(java.util.Arrays.toString(simbolChar[1]));
        System.out.println(java.util.Arrays.toString(simbolChar[2]));
        System.out.println("===============================================================================================================================================");
        System.out.println("Simbol-simbol kuno ini kini telah terungkap dalam angka ASCII yang mewakili kekuatan tersembunyi:");

        int[] simbolCharAsci = {simbolChar[0][0], simbolChar[0][1], simbolChar[0][2]};
        int[] simbolCharAscii = {simbolChar[1][0], simbolChar[1][1], simbolChar[1][2]};
        int[] simbolCharAsciii = {simbolChar[2][0], simbolChar[2][1], simbolChar[2][2]};

        System.out.println(java.util.Arrays.toString(simbolCharAsci));
        System.out.println(java.util.Arrays.toString(simbolCharAscii));
        System.out.println(java.util.Arrays.toString(simbolCharAsciii));
        System.out.println("===============================================================================================================================================");
        // name memanggil nama dari output di variabel name yang bertipe string
        System.out.println("Matriks kini tertransformasi menjadi Matriks Minor berordo 3x3 yang akan membantu " + name + " mengungkap rahasia matriks tersembunyi:");

        // membuat sebuah array of int 3x3  yang menyimpan sebuah hasil dari perkalian array simbolchar
        int[][] minor = new int[3][3];
        minor[0][0] = (simbolChar[1][1] * simbolChar[2][2]) - (simbolChar[1][2] * simbolChar[2][1]);
        minor[0][1] = (simbolChar[1][0] * simbolChar[2][2]) - (simbolChar[1][2] * simbolChar[2][0]);
        minor[0][2] = (simbolChar[1][0] * simbolChar[2][1]) - (simbolChar[1][1] * simbolChar[2][0]);

        minor[1][0] = (simbolChar[0][1] * simbolChar[2][2]) - (simbolChar[0][2] * simbolChar[2][1]);
        minor[1][1] = (simbolChar[0][0] * simbolChar[2][2]) - (simbolChar[0][2] * simbolChar[2][0]);
        minor[1][2] = (simbolChar[0][0] * simbolChar[2][1]) - (simbolChar[0][1] * simbolChar[2][0]);

        minor[2][0] = (simbolChar[0][1] * simbolChar[1][2]) - (simbolChar[0][2] * simbolChar[1][1]);
        minor[2][1] = (simbolChar[0][0] * simbolChar[1][2]) - (simbolChar[0][2] * simbolChar[1][0]);
        minor[2][2] = (simbolChar[0][0] * simbolChar[1][1]) - (simbolChar[0][1] * simbolChar[1][0]);

        System.out.println(java.util.Arrays.toString(minor[0]));
        System.out.println(java.util.Arrays.toString(minor[1]));
        System.out.println(java.util.Arrays.toString(minor[2]));
        System.out.println("===============================================================================================================================================");
        // name memanggil nama dari output di variabel name yang bertipe string
        System.out.println("Tantangan dari Artefak Matriks untuk " + name + " Sang Penjelajah:");

        //membuat array of string 1x4 untuk menyimpan nama nama matriks 
        String[][] listMatriks = new String[1][4];
        listMatriks[0][0] = "Matriks Adjoin";
        listMatriks[0][1] = "Matriks Kofaktor";
        listMatriks[0][2] = "Matriks Rotasi 90 Derajat";
        listMatriks[0][3] = "Matriks Flip Horizontal";

        //membuat array of string 1x4 untuk menyimpan keterangan dalam masing masing matriks 
        String[][] keteranganMatriks = new String[1][4];
        keteranganMatriks[0][0] = "Membuka jalur tersembunyi dari dimensi lain";
        keteranganMatriks[0][1] = "Menemukan elemen tersembunyi dari dimensi gelap";
        keteranganMatriks[0][2] = "Memutar ruang waktu untuk menemukan kebenaran";
        keteranganMatriks[0][3] = "Mencerminkan dirimu di dunia yang berlawanan";

        System.out.println("1. " + listMatriks[0][0] + " - " + keteranganMatriks[0][0]);
        System.out.println("2. " + listMatriks[0][1] + " - " + keteranganMatriks[0][1]);
        System.out.println("3. " + listMatriks[0][2] + " - " + keteranganMatriks[0][2]);
        System.out.println("4. " + listMatriks[0][3] + " - " + keteranganMatriks[0][3]);
        System.out.print("Pilih tantangan yang akan kamu hadapi: ");
        // menyimpan hasil inputan pengguna ke int 
        int pilihanTantangan = inputPengguna.nextInt();
        System.out.println("===============================================================================================================================================");

        // \n berguna untuk membuat barisan baru kosong supaya ada jarak
        System.out.println(name + " telah memilih Tantangan " + listMatriks[0][pilihanTantangan - 1] + " yang akan " + keteranganMatriks[0][pilihanTantangan - 1] + "...\n");
        System.out.println("Bersiaplah! Penjaga Matriks mulai mengawasi gerakanmu...");

        // membuat array of int ini untuk menyimpan hasil pilihantantangan dan untuk mencari dia ingin memakai tantangan apa 
        int[][] hasilMatriks;

        // membuat array of int yang isinya rumus Matriks adjoin, ini bisa di pakai ketika pengguna milih 1
        int[][] adjoin = new int[3][3];
        adjoin[0][0] = minor[0][0];
        adjoin[0][1] = minor[1][0];
        adjoin[0][2] = minor[2][0];

        adjoin[1][0] = minor[0][1];
        adjoin[1][1] = minor[1][1];
        adjoin[1][2] = minor[2][1];

        adjoin[2][0] = minor[0][2];
        adjoin[2][1] = minor[1][2];
        adjoin[2][2] = minor[2][2];

        //membuat array of int yang isinya rumus Matriks Kofaktor, ini bisa di pakai ketika pengguna milih 2
        int[][] kofaktor = new int[3][3];
        kofaktor[0][0] = minor[0][0];
        kofaktor[0][1] = -minor[0][1];
        kofaktor[0][2] = minor[0][2];

        kofaktor[1][0] = -minor[1][0];
        kofaktor[1][1] = minor[1][1];
        kofaktor[1][2] = -minor[1][2];

        kofaktor[2][0] = minor[2][0];
        kofaktor[2][1] = -minor[2][1];
        kofaktor[2][2] = minor[2][2];

        //membuat array of int yang isinya rumus Matriks Rotasi 90 Derajat, ini bisa di pakai ketika pengguna milih 3
        int[][] rotasi = new int[3][3];
        rotasi[0][0] = minor[2][0];
        rotasi[0][1] = minor[1][0];
        rotasi[0][2] = minor[0][0];

        rotasi[1][0] = minor[2][1];
        rotasi[1][1] = minor[1][1];
        rotasi[1][2] = minor[0][1];

        rotasi[2][0] = minor[2][2];
        rotasi[2][1] = minor[1][2];
        rotasi[2][2] = minor[0][2];

        //membuat array of int yang isinya rumus Matriks Flip Horizontal, ini bisa di pakai ketika pengguna milih 4
        int[][] flip = new int[3][3];
        flip[0][0] = minor[2][0];
        flip[0][1] = minor[2][1];
        flip[0][2] = minor[2][2];

        flip[1][0] = minor[1][0];
        flip[1][1] = minor[1][1];
        flip[1][2] = minor[1][2];

        flip[2][0] = minor[0][0];
        flip[2][1] = minor[0][1];
        flip[2][2] = minor[0][2];

        // Mendefinisikan array tiga dimensi untuk menyimpan berbagai jenis matriks hasil dan ini bisa di pilih sesaui inputan pilihtantangan pengguna
        int[][][] hasil = {adjoin, kofaktor, rotasi, flip};

        // Memilih matriks hasil berdasarkan pilihan pengguna
        // pilihanTantangan berasal dari input pengguna, sehingga kita kurangi 1 untuk menyesuaikan dengan indeks array (dimulai dari 0)
        // ini gunanya untuk menyimpan hasil tantangan dan untuk memilih rumus mana yang ingin dia pakai 
        hasilMatriks = hasil[pilihanTantangan - 1];

        System.out.println(Arrays.toString(hasilMatriks[0]));
        System.out.println(Arrays.toString(hasilMatriks[1]));

        // \n berguna untuk membuat barisan baru kosong supaya ada jarak
        System.out.println(Arrays.toString(hasilMatriks[2]) + "\n");

        // \n berguna untuk membuat barisan baru kosong supaya ada jarak
        System.out.println("Tantangan Berhasil!!!\n");
        // name memanggil nama dari output di variabel name yang bertipe string
        System.out.println(name + " telah menemukan " + listMatriks[0][pilihanTantangan - 1] + "yang membantunya" + keteranganMatriks[0][pilihanTantangan - 1] + "!");
        // name memanggil nama dari output di variabel name yang bertipe string
        System.out.println("Kekuatan artefak mulai terungkap dihadapanmu, " + name + "...");
        System.out.println("===============================================================================================================================================");
        // \n berguna untuk membuat barisan baru kosong supaya ada jarak
        System.out.println("Penjaga Matriks memberikan teka-teki akhir:\n");

        //membuat tipe data long untuk menyimpan hasil rumus determinan yang hasilnya dari pengurangan, pertambahan dan pengalian dari minor.
        long determinan = minor[0][0] * (minor[1][1] * minor[2][2] - minor[1][2] * minor[2][1])
                - minor[0][1] * (minor[1][0] * minor[2][2] - minor[1][2] * minor[2][0])
                + minor[0][2] * (minor[1][0] * minor[2][1] - minor[1][1] * minor[2][0]);

        // \n berguna untuk membuat barisan baru kosong supaya ada jarak
        System.out.println("Berapa determinan dari " + listMatriks[0][pilihanTantangan - 1] + " yang telah kamu pilih?\n");

        // \n berguna untuk membuat barisan baru kosong supaya ada jarak
        //lalu determinan di casting di sini
        System.out.println("Hasil Determinan Artefak " + listMatriks[0][pilihanTantangan - 1] + ": " + (int) determinan + "\n");

        // name memanggil nama dari output di variabel name yang bertipe string
        System.out.println("Dengan penemuan ini, " + name + " melangkah lebih dekat menuju kebebasan!");
        System.out.println("Tapi jangan lengah... Masih banyak teka-teki yang menunggu di balik dunia Matriks ASCII ini.");
        System.out.println("==========================================================================================================================");
        System.out.println("Program Berakhir. Bersiaplah untuk petualangan berikutnya, " + name + " Si Sang Penjelajah...");
    }
}
