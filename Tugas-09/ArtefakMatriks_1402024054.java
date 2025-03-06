// Zild Jian Xto
// 1402024054

import java.util.Arrays; // Mengimpor kelas Arrays untuk memudahkan manipulasi array
import java.util.Scanner; // Mengimpor kelas Scanner untuk mengambil input dari pengguna

public class ArtefakMatriks_1402024054 {

    public static void main(String[] Jian) {
        Scanner inputPengguna = new Scanner(System.in); // Membuat objek Scanner untuk input pengguna

        String[][] name = {
            {
                Jian[0] // Mengambil nama dari argumen 
            }
        };

        // Menampilkan pembuka cerita dan informasi tentang Artefak Matriks
        System.out.println("===================================================================================================================================");
        System.out.println("||                                                   Legenda Artefak Matriks ASCII                                              ||");
        System.out.println("||                                               Dibuat oleh: Zild Jian XTO / 1402024054                                        ||");
        System.out.println("===================================================================================================================================");
        // variable name[0][0] dari isiya dari argumen 
        System.out.println("Selamat datang di Petualangan di Dunia ASCII, " + name[0][0] + " Si Sang Penjelajah!\n");
        System.out.println("Kamu kini terperangkap dalam dunia tersembunyi di balik layar digital.");
        System.out.println("Dunia ini dijaga oleh Artefak Matriks ASCII, sebuah artefak kuno yang diyakini memiliki kekuatan untuk meretas dimensi waktu dan ruang.");
        System.out.println("Hanya mereka yang dapat menguasai teka-teki matriks ini yang bisa kembali ke realitas. Jalanmu masih panjang, " + name[0][0] + "! Buktikan bahwa kamu layak!");
        System.out.println("===========================================================================================");
        System.out.println("Masukkan 9 simbol kuno yang tersembunyi berupa karakter ke dalam Artefak Matriks berordo 3x3:");

        // Inisialisasi matriks 3x3 untuk menyimpan input String pengguna
        char[][] charSimbol = new char[3][3];

        // Mengambil input simbol dari pengguna satu per satu
        System.out.print("Masukan simbol ke-1: ");
        // Mengambil input dari pengguna, mengambil karakter pertama dari input dan menyimpannya di charSimbol[0][0]
        charSimbol[0][0] = inputPengguna.nextLine().charAt(0);//a

        System.out.print("Masukan simbol ke-2: ");
        // Mengambil input simbol kedua
        charSimbol[0][1] = inputPengguna.nextLine().charAt(0);//b

        System.out.print("Masukan simbol ke-3: ");
        // Mengambil input simbol ketiga
        charSimbol[0][2] = inputPengguna.nextLine().charAt(0);//c

        System.out.print("Masukan simbol ke-4: ");
        // Mengambil input simbol keempat
        charSimbol[1][0] = inputPengguna.nextLine().charAt(0);//d

        System.out.print("Masukan simbol ke-5: ");
        // Mengambil input simbol kelima
        charSimbol[1][1] = inputPengguna.nextLine().charAt(0);//e

        System.out.print("Masukan simbol ke-6: ");
        // Mengambil input simbol keenam
        charSimbol[1][2] = inputPengguna.nextLine().charAt(0);//f

        System.out.print("Masukan simbol ke-7: ");
        // Mengambil input simbol ketujuh
        charSimbol[2][0] = inputPengguna.nextLine().charAt(0);//g

        System.out.print("Masukan simbol ke-8: ");
        // Mengambil input simbol kedelapan
        charSimbol[2][1] = inputPengguna.nextLine().charAt(0);//h

        System.out.print("Masukan simbol ke-9: ");
        // Mengambil input simbol kesembilan
        charSimbol[2][2] = inputPengguna.nextLine().charAt(0);//i

        // Menampilkan matriks simbol yang telah diinput
        System.out.println("===================================================================================================================================");
        System.out.println("Artefak Matriks berordo 3x3 Berhasil Diaktifkan: ");

        // Menampilkan elemen array charSimbol pada indeks 0
        System.out.println(Arrays.toString(charSimbol[0]));

        // Menampilkan elemen array charSimbol pada indeks 1
        System.out.println(Arrays.toString(charSimbol[1]));

        // Menampilkan elemen array charSimbol pada indeks 2
        System.out.println(Arrays.toString(charSimbol[2]));

        System.out.println("===================================================================================================================================");
        System.out.println("Simbol-simbol kuno ini kini telah terungkap dalam angka ASCII yang mewakili kekuatan tersembunyi:");

        // Membuat matriks keluaran simbol dengan representasi karakter
        int[][][] keluaranSimbol = {
            {
                {charSimbol[0][0], charSimbol[0][1], charSimbol[0][2]}, // Baris pertama
                {charSimbol[1][0], charSimbol[1][1], charSimbol[1][2]}, // Baris kedua
                {charSimbol[2][0], charSimbol[2][1], charSimbol[2][2]} // Baris ketiga
            }
        };

        // Menampilkan angka ASCII untuk setiap simbol
        // Menampilkan elemen array keluaranSimbol pada baris 0 dan kolom 0
        System.out.println(Arrays.toString(keluaranSimbol[0][0]));

        // Menampilkan elemen array keluaranSimbol pada baris 0 dan kolom 1
        System.out.println(Arrays.toString(keluaranSimbol[0][1]));

        // Menampilkan elemen array keluaranSimbol pada baris 0 dan kolom 2
        System.out.println(Arrays.toString(keluaranSimbol[0][2]));
        System.out.println("===================================================================================================================================");
        // variable name[0][0] dari isiya dari argumen
        System.out.println("Matriks kini tertransformasi menjadi Matriks Minor berordo 3x3 yang akan membantu " + name[0][0] + " mengungkap rahasia matriks tersembunyi:");

        // Menghitung matriks minor menggunakan rumus
        int[][] minorHasil = {
            {
                ((charSimbol[1][1] * charSimbol[2][2])) - ((charSimbol[1][2] * charSimbol[2][1])), // Elemen minor pertama
                ((charSimbol[1][0] * charSimbol[2][2])) - ((charSimbol[1][2] * charSimbol[2][0])), // Elemen minor kedua
                ((charSimbol[1][0] * charSimbol[2][1])) - ((charSimbol[1][1] * charSimbol[2][0])) // Elemen minor ketiga
            },
            {
                ((charSimbol[0][1] * charSimbol[2][2])) - ((charSimbol[0][2] * charSimbol[2][1])), // Elemen minor keempat
                ((charSimbol[0][0] * charSimbol[2][2])) - ((charSimbol[0][2] * charSimbol[2][0])), // Elemen minor kelima
                ((charSimbol[0][0] * charSimbol[2][1])) - ((charSimbol[0][1] * charSimbol[2][0])) // Elemen minor keenam
            },
            {
                ((charSimbol[0][1] * charSimbol[1][2])) - ((charSimbol[0][2] * charSimbol[1][1])), // Elemen minor ketujuh
                ((charSimbol[0][0] * charSimbol[1][2])) - ((charSimbol[0][2] * charSimbol[1][0])), // Elemen minor kedelapan
                ((charSimbol[0][0] * charSimbol[1][1])) - ((charSimbol[0][1] * charSimbol[1][0])) // Elemen minor kesembilan
            }
        };

        // Menampilkan hasil dari matriks minor
        // Menampilkan hasil dari baris pertama matriks minor
        System.out.println(Arrays.toString(minorHasil[0]));

        // Menampilkan hasil dari baris kedua matriks minor
        System.out.println(Arrays.toString(minorHasil[1]));

        // Menampilkan hasil dari baris ketiga matriks minor
        System.out.println(Arrays.toString(minorHasil[2]));

        System.out.println("===================================================================================================================================");
        // variable name[0][0] dari isiya dari argumen
        System.out.println("Tantangan dari Artefak Matriks untuk " + name[0][0] + " Sang Penjelajah:");

        // Mengisi tantangan yang bisa dipilih oleh pengguna
        String[][][] matrikIsi = {
            {
                {"Matriks Adjoin", "Matriks Kofaktor", "Matriks Rotasi 90 Derajat", "Matriks Flip Horizontal"},
                {"Membuka jalur tersembunyi dari dimensi lain", "Menemukan elemen tersembunyi dari dimensi gelap", "Memutar ruang waktu untuk menemukan kebenaran", "Mencerminkan dirimu di dunia yang berlawanan"}
            }
        };

        // Menampilkan pilihan tantangan
        System.out.println("1. " + matrikIsi[0][0][0] + " - " + matrikIsi[0][1][0]);
        System.out.println("2. " + matrikIsi[0][0][1] + " - " + matrikIsi[0][1][1]);
        System.out.println("3. " + matrikIsi[0][0][2] + " - " + matrikIsi[0][1][2]);
        System.out.println("4. " + matrikIsi[0][0][3] + " - " + matrikIsi[0][1][3]);

        // Mengambil input pilihan tantangan dari pengguna
        System.out.print("Pilih tantangan yang akan kamu hadapi: ");
        int penguranganInputTantangan = 1; // Mengurangi satu karena indeks array dimulai dari 0
        int pilihanTantangan = inputPengguna.nextByte() - penguranganInputTantangan;
        System.out.println("===================================================================================================================================");

        // Menampilkan tantangan yang dipilih
        System.out.println(name[0][0] + " telah memilih Tantangan " + matrikIsi[0][0][pilihanTantangan] + " yang akan " + matrikIsi[0][1][pilihanTantangan] + "...\n");
        System.out.println("Bersiaplah! Penjaga Matriks mulai mengawasi gerakanmu...");

        // Menyimpan hasil matriks berdasarkan pilihan tantangan
        int[][][][] hasilPilihTantangan = {
            {
                {
                    {minorHasil[0][0], minorHasil[1][0], minorHasil[2][0]},
                    {minorHasil[0][1], minorHasil[1][1], minorHasil[2][1]},
                    {minorHasil[0][2], minorHasil[1][2], minorHasil[2][2]}
                },
                {
                    {minorHasil[0][0], -minorHasil[0][1], minorHasil[0][2]},
                    {-minorHasil[1][0], minorHasil[1][1], -minorHasil[1][2]},
                    {minorHasil[2][0], -minorHasil[2][1], minorHasil[2][2]}
                },
                {
                    {minorHasil[2][0], minorHasil[1][0], minorHasil[0][0]},
                    {minorHasil[2][1], minorHasil[1][1], minorHasil[0][1]},
                    {minorHasil[2][2], minorHasil[1][2], minorHasil[0][2]}
                },
                {
                    {minorHasil[2][0], minorHasil[2][1], minorHasil[2][2]},
                    {minorHasil[1][0], minorHasil[1][1], minorHasil[1][2]},
                    {minorHasil[0][0], minorHasil[0][1], minorHasil[0][2]}
                }
            }

        };

        // Mengambil hasil matriks sesuai pilihan tantangan
        int[][] hasilPilihanMatriks = hasilPilihTantangan[0][pilihanTantangan];

        // Mencetak elemen dari baris pertama matriks hasilPilihanMatriks
        System.out.println(Arrays.toString(hasilPilihanMatriks[0]));

        // Mencetak elemen dari baris kedua matriks hasilPilihanMatriks
        System.out.println(Arrays.toString(hasilPilihanMatriks[1]));

        // Mencetak elemen dari baris ketiga matriks hasilPilihanMatriks
        // Menambahkan "\n" untuk menciptakan baris baru setelah output
        System.out.println(Arrays.toString(hasilPilihanMatriks[2]) + "\n");

        // Mengkonfirmasi bahwa tantangan berhasil
        System.out.println("Tantangan Berhasil!!!\n");
        System.out.println(name[0][0] + " telah menemukan " + matrikIsi[0][0][pilihanTantangan] + " yang membantunya " + matrikIsi[0][1][pilihanTantangan] + "!");
        System.out.println("===================================================================================================================================");
        System.out.println("Penjaga Matriks memberikan teka-teki akhir:\n");

        // Menghitung determinan dari matriks minor dan di simpan di variable determinan dengan tipe long
        long[] determinan = {
            hasilPilihTantangan[0][pilihanTantangan][0][0] * (hasilPilihTantangan[0][pilihanTantangan][1][1] * hasilPilihTantangan[0][pilihanTantangan][2][2] - hasilPilihTantangan[0][pilihanTantangan][1][2] * hasilPilihTantangan[0][pilihanTantangan][2][1])
            - hasilPilihTantangan[0][pilihanTantangan][0][1] * (hasilPilihTantangan[0][pilihanTantangan][1][0] * hasilPilihTantangan[0][pilihanTantangan][2][2] - hasilPilihTantangan[0][pilihanTantangan][1][2] * hasilPilihTantangan[0][pilihanTantangan][2][0])
            + hasilPilihTantangan[0][pilihanTantangan][0][2] * (hasilPilihTantangan[0][pilihanTantangan][1][0] * hasilPilihTantangan[0][pilihanTantangan][2][1] - hasilPilihTantangan[0][pilihanTantangan][1][1] * hasilPilihTantangan[0][pilihanTantangan][2][0])

        };

        // Menampilkan teka-teki akhir tentang determinan
        System.out.println("Berapa determinan dari " + matrikIsi[0][0][pilihanTantangan] + " yang telah kamu pilih?\n");
        System.out.println("Hasil Determinan Artefak " + matrikIsi[0][0][pilihanTantangan] + ": " + (int) determinan[0] + "\n");
        System.out.println("Dengan penemuan ini, " + name[0][0] + " melangkah lebih dekat menuju kebebasan!");
        System.out.println("Tapi jangan lengah... Masih banyak teka-teki yang menunggu di balik dunia Matriks ASCII ini.");
        System.out.println("==========================================================================================================================");

        System.out.println("Program Berakhir. Bersiaplah untuk petualangan berikutnya, " + name[0][0] + " Si Sang Penjelajah...");
    }
}
