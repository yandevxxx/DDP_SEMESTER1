
import java.util.Arrays;
import java.util.Scanner;

public class Aw {

    public static void main(String[] args) {
        System.out.println("================================================================================================");
        System.out.println("||                                Legenda Artefak Matriks ASCII                               ||");
        System.out.println("||                     Dibuat Oleh: Askhabul Nur Ardhiansyakh / 1402024012                    ||");
        System.out.println("================================================================================================");

        String namaOrangTi = args[0];
        System.out.println("Selamat datang di Petualangan di Dunia ASCII, " + namaOrangTi + " Si Sang Penjajah!  ");
        System.out.println("                                                                      ");
        System.out.println("Kamu kini terperangkap dalam dunia tersembunyi di balik layar digital.");
        System.out.println("Dunia ini dijaga oleh Artefak Matriks ASCII, sebuah artefak kuno yang diyakini memiliki kekuatan untuk meretas dimensi waktu dan ruang.");
        System.out.println("Hanya mereka yang dapat menguasai teka-teki matriks ini yang bisa kembali ke realitas. Jalanmu masih panjang, " + namaOrangTi + "!" + " Buktikan bahwa kamu layak");
        System.out.println("=============================================================================================");
        System.out.println("Masukkan 9 simbol kuno yang tersembunyi berupa karakter ke dalam Artefak Matriks berordo 3x3: ");

        Scanner simbolSembilan = new Scanner(System.in);
        System.out.print("Masukan simbol ke-1: ");
        String masukanSimbol1 = simbolSembilan.nextLine();
        System.out.print("Masukan simbol ke-2: ");
        String masukanSimbol2 = simbolSembilan.nextLine();
        System.out.print("Masukan simbol ke-3: ");
        String masukanSimbol3 = simbolSembilan.nextLine();
        System.out.print("Masukan simbol ke-4: ");
        String masukanSimbol4 = simbolSembilan.nextLine();
        System.out.print("Masukan simbol ke-5: ");
        String masukanSimbol5 = simbolSembilan.nextLine();
        System.out.print("Masukan simbol ke-6: ");
        String masukanSimbol6 = simbolSembilan.nextLine();
        System.out.print("Masukan simbol ke-7: ");
        String masukanSimbol7 = simbolSembilan.nextLine();
        System.out.print("Masukan simbol ke-8: ");
        String masukanSimbol8 = simbolSembilan.nextLine();
        System.out.print("Masukan simbol ke-9: ");
        String masukanSimbol9 = simbolSembilan.nextLine();
        System.out.println("=====================================================================================");
        System.out.println("Artefak Matriks berordo 3x3 Berhasil Diaktifkan:");

        char[][] hasilSimbolAktif = {{masukanSimbol1.charAt(0), masukanSimbol2.charAt(0), masukanSimbol3.charAt(0)}};
        System.out.println(Arrays.toString(hasilSimbolAktif[0]));
        char[] hasilSimbolAktif1 = {masukanSimbol4.charAt(0), masukanSimbol5.charAt(0), masukanSimbol6.charAt(0)};
        System.out.println(Arrays.toString(hasilSimbolAktif1));
        char[] hasilSimbolAktif3 = {masukanSimbol7.charAt(0), masukanSimbol8.charAt(0), masukanSimbol9.charAt(0)};
        System.out.println(Arrays.toString(hasilSimbolAktif3));

        System.out.println("=====================================================================================");
        System.out.println("Simbol-simbol kuno ini kini telah terungkap dalam angka ASCII yang mewakili kekuatan tersembunyi:");
        long[][] hasilSimbolAscii = {{hasilSimbolAktif[0][0], hasilSimbolAktif[0][1], hasilSimbolAktif[0][2]}};
        System.out.println(Arrays.toString(hasilSimbolAscii[0]));
        long[][] hasilSimbolAscii1 = {{hasilSimbolAktif1[0], hasilSimbolAktif1[1], hasilSimbolAktif1[2]}};
        System.out.println(Arrays.toString(hasilSimbolAscii1[0]));
        long[][] hasilSimbolAscii2 = {{hasilSimbolAktif3[0], hasilSimbolAktif3[1], hasilSimbolAktif3[2]}};
        System.out.println(Arrays.toString(hasilSimbolAscii2[0]));

        System.out.println("Matriks kini tertransformasi menjadi Matriks Minor berordo 3x3 yang akan membantu " + namaOrangTi + " mengungkap rahasia matriks tersembunyi:");

        // Rumus Minor
        int[][] kodeMatriks = new int[3][3];
        kodeMatriks[0][0] = (hasilSimbolAktif1[1] * hasilSimbolAktif3[2]) - (hasilSimbolAktif1[2] * hasilSimbolAktif3[1]);
        kodeMatriks[0][1] = (hasilSimbolAktif1[0] * hasilSimbolAktif3[2]) - (hasilSimbolAktif1[2] * hasilSimbolAktif3[0]);
        kodeMatriks[0][2] = (hasilSimbolAktif1[0] * hasilSimbolAktif3[1]) - (hasilSimbolAktif1[1] * hasilSimbolAktif3[0]);

        kodeMatriks[1][0] = (hasilSimbolAktif[0][1] * hasilSimbolAktif3[2]) - (hasilSimbolAktif[0][2] * hasilSimbolAktif3[1]);
        kodeMatriks[1][1] = (hasilSimbolAktif[0][0] * hasilSimbolAktif3[2]) - (hasilSimbolAktif[0][2] * hasilSimbolAktif3[0]);
        kodeMatriks[1][2] = (hasilSimbolAktif[0][0] * hasilSimbolAktif3[1]) - (hasilSimbolAktif[0][1] * hasilSimbolAktif3[0]);

        kodeMatriks[2][0] = (hasilSimbolAktif[0][1] * hasilSimbolAktif1[2]) - (hasilSimbolAktif[0][2] * hasilSimbolAktif1[1]);
        kodeMatriks[2][1] = (hasilSimbolAktif[0][0] * hasilSimbolAktif1[2]) - (hasilSimbolAktif[0][2] * hasilSimbolAktif1[0]);
        kodeMatriks[2][2] = (hasilSimbolAktif[0][0] * hasilSimbolAktif1[1]) - (hasilSimbolAktif[0][1] * hasilSimbolAktif1[0]);

        int[][] hasilKodeMatriks = {{kodeMatriks[0][0], kodeMatriks[0][1], kodeMatriks[0][2]}};
        System.out.println(Arrays.toString(hasilKodeMatriks[0]));
        int[][] hasilKodeMatriks1 = {{kodeMatriks[1][0], kodeMatriks[1][1], kodeMatriks[1][2]}};
        System.out.println(Arrays.toString(hasilKodeMatriks1[0]));
        int[][] hasilKodeMatriks2 = {{kodeMatriks[2][0], kodeMatriks[2][1], kodeMatriks[2][2]}};
        System.out.println(Arrays.toString(hasilKodeMatriks2[0]));

        System.out.println("================================================================================");
        System.out.println("Tantangan dari Artefak Matriks untuk " + namaOrangTi + " Sang Penjelajah:");

        String[][] jenisMatriks = {{"Martiks Adjoin", "Matriks Kofaktor", "Matriks Rotasi 90 Derajat", "Matriks Flip Horizontal"}};
        String[][] isiMatriks = {
            {
                "Membuka jalur tersembunyi dari dimensi lain",
                "Menemukan elemen tersembunyi dari dimensi gelap",
                "Memutar ruang waktu untuk menemukan kebenaran",
                "Mencerminkan dirimu di dunia yang berlawanan"
            }
        };

        System.out.println("1. " + jenisMatriks[0][0] + " - " + isiMatriks[0][0]);
        System.out.println("2. " + jenisMatriks[0][1] + " - " + isiMatriks[0][1]);
        System.out.println("3. " + jenisMatriks[0][2] + " - " + isiMatriks[0][2]);
        System.out.println("4. " + jenisMatriks[0][3] + " - " + isiMatriks[0][3]);

        System.out.print("Pilih tantangan yang akan kamu hadapi: ");
        int penguranganInput = 1;
        int tantangan = simbolSembilan.nextInt();
        System.out.println("=====================================================================================");

        System.out.println(namaOrangTi + " telah memilih Tantangan " + jenisMatriks[0][tantangan - penguranganInput] + " yang akan " + isiMatriks[0][tantangan - penguranganInput] + "...");
        System.out.println("                                                        ");
        System.out.println("Bersiaplah! Penjaga Matriks mulai mengawasi gerakanmu...");

        //Rumus Adjoin
        int[][] kodeAdjoin = new int[3][3];
        kodeAdjoin[0][0] = (hasilSimbolAktif1[1] * hasilSimbolAktif3[2]) - (hasilSimbolAktif1[2] * hasilSimbolAktif3[1]);
        kodeAdjoin[0][1] = (hasilSimbolAktif[0][1] * hasilSimbolAktif3[2]) - (hasilSimbolAktif[0][2] * hasilSimbolAktif3[1]);
        kodeAdjoin[0][2] = (hasilSimbolAktif[0][1] * hasilSimbolAktif1[2]) - (hasilSimbolAktif[0][2] * hasilSimbolAktif1[1]);

        kodeAdjoin[1][0] = (hasilSimbolAktif1[0] * hasilSimbolAktif3[2]) - (hasilSimbolAktif1[2] * hasilSimbolAktif3[0]);
        kodeAdjoin[1][1] = (hasilSimbolAktif[0][0] * hasilSimbolAktif3[2]) - (hasilSimbolAktif[0][2] * hasilSimbolAktif3[0]);
        kodeAdjoin[1][2] = (hasilSimbolAktif[0][0] * hasilSimbolAktif1[2]) - (hasilSimbolAktif[0][2] * hasilSimbolAktif1[0]);

        kodeAdjoin[2][0] = (hasilSimbolAktif1[0] * hasilSimbolAktif3[1]) - (hasilSimbolAktif1[1] * hasilSimbolAktif3[0]);
        kodeAdjoin[2][1] = (hasilSimbolAktif[0][0] * hasilSimbolAktif3[1]) - (hasilSimbolAktif[0][1] * hasilSimbolAktif3[0]);
        kodeAdjoin[2][2] = (hasilSimbolAktif[0][0] * hasilSimbolAktif1[1]) - (hasilSimbolAktif[0][1] * hasilSimbolAktif1[0]);

        // Rumus Kafaktor
        int[][] kodeKafaktor = new int[3][3];
        kodeKafaktor[0][0] = kodeMatriks[0][0];
        kodeKafaktor[0][1] = -kodeMatriks[0][1];
        kodeKafaktor[0][2] = kodeMatriks[0][2];

        kodeKafaktor[1][0] = -kodeMatriks[1][0];
        kodeKafaktor[1][1] = kodeMatriks[1][1];
        kodeKafaktor[1][2] = -kodeMatriks[1][2];

        kodeKafaktor[2][0] = kodeMatriks[2][0];
        kodeKafaktor[2][1] = -kodeMatriks[2][1];
        kodeKafaktor[2][2] = kodeMatriks[2][2];

        // Rumus Rotasi 90
        int[][] kodeRotasiDiputar = new int[3][3];
        kodeRotasiDiputar[0][0] = kodeMatriks[2][0];
        kodeRotasiDiputar[0][1] = kodeMatriks[1][0];
        kodeRotasiDiputar[0][2] = kodeMatriks[0][0];

        kodeRotasiDiputar[1][0] = kodeMatriks[2][1];
        kodeRotasiDiputar[1][1] = kodeMatriks[1][1];
        kodeRotasiDiputar[1][2] = kodeMatriks[0][1];

        kodeRotasiDiputar[2][0] = kodeMatriks[2][2];
        kodeRotasiDiputar[2][1] = kodeMatriks[1][2];
        kodeRotasiDiputar[2][2] = kodeMatriks[0][2];

        //Rumus Flip Horizontal
        int[][] kodeFlipMiring = new int[3][3];
        kodeFlipMiring[0][0] = kodeMatriks[2][0];
        kodeFlipMiring[0][1] = kodeMatriks[2][1];
        kodeFlipMiring[0][2] = kodeMatriks[2][2];

        kodeFlipMiring[1][0] = kodeMatriks[1][0];
        kodeFlipMiring[1][1] = kodeMatriks[1][1];
        kodeFlipMiring[1][2] = kodeMatriks[1][2];

        kodeFlipMiring[2][0] = kodeMatriks[0][0];
        kodeFlipMiring[2][1] = kodeMatriks[0][1];
        kodeFlipMiring[2][2] = kodeMatriks[0][2];

        //Rumus Determinan
        // MASIH SALAH 
        int[] kodeDeterminanSilang = new int[3];
        kodeDeterminanSilang[2] = kodeMatriks[0][0] + kodeMatriks[1][1] + kodeMatriks[2][2] + kodeMatriks[0][1] + kodeMatriks[1][2] + kodeMatriks[2][1] + kodeMatriks[0][2] + kodeMatriks[1][0] + kodeMatriks[2][1]
                - (kodeMatriks[0][2] + kodeMatriks[1][1] + kodeMatriks[2][1] + kodeMatriks[0][0] + kodeMatriks[1][2] + kodeMatriks[2][1] + kodeMatriks[0][1] + kodeMatriks[1][0] + kodeMatriks[2][2]);

        //Hasil Semua Rumus
        int[][][] tantanganDariKode = {kodeAdjoin, kodeKafaktor, kodeRotasiDiputar, kodeFlipMiring};

        int[][] pilihanKodeMatriks = tantanganDariKode[tantangan - penguranganInput];
        System.out.println(Arrays.toString(pilihanKodeMatriks[0]));
        System.out.println(Arrays.toString(pilihanKodeMatriks[1]));
        System.out.println(Arrays.toString(pilihanKodeMatriks[2]));

        System.out.println("                                ");
        System.out.println("Tantangan Berhasil!!!");
        System.out.println("                                ");
        System.out.println(namaOrangTi + " telah menemukan " + jenisMatriks[0][tantangan - penguranganInput] + " yang membantunya " + isiMatriks[0][tantangan - penguranganInput] + "!");
        System.out.println("Kekuatan artefak mulai terungkap dihadapanmu " + namaOrangTi + "...");
        System.out.println("==================================================================================================");
        System.out.println("Penjaga Matriks memberikan teka-teki akhir: ");
        System.out.println("                                            ");
        System.out.println("Berapa determinan dari " + jenisMatriks[0][tantangan - penguranganInput] + " yang telah kamu pilih?");
        System.out.println("Hasil Determinan Artefak " + jenisMatriks[0][tantangan - penguranganInput] + ": " + kodeDeterminanSilang[2]);

    }

}
