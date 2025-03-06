// Nama : Zild Jian Xto 
// Npm  : 1402024054

public class GanjilGenap_1402024054 {

    public static void main(String[] Keluaran) {

        // saya membuat variabel nameBikeSaya dari output Keluaran[0]
        String nameBikeSaya = Keluaran[0];

        // membuat variabel plteKendaraanSaya dari output Keluaran[1]
        String plteKendaraanSaya = Keluaran[1];

        // disini saya Mengubah variabel plteKendaraanSaya yang dimana huruf pertama menjadi kapital dan sisanya menjadi huruf kecil
        plteKendaraanSaya = plteKendaraanSaya.substring(0, 1).toUpperCase() + plteKendaraanSaya.substring(1).toLowerCase();

        // Lalu Saya Memeriksa panjang plat kendaraan
        if (plteKendaraanSaya.length() > 4) {
            // lebih dari 4 karakter, ubah 3 karakter terakhir saya ubah menjadi huruf kapital
            plteKendaraanSaya = plteKendaraanSaya.substring(0, plteKendaraanSaya.length() - 3) + plteKendaraanSaya.substring(plteKendaraanSaya.length() - 3).toUpperCase();
        } else {
            // Dan pas 4 karakter / kurang dari 4 karakter, maka saya ubah seluruhnya menjadi huruf kapital
            plteKendaraanSaya = plteKendaraanSaya.toUpperCase();
        }

        // Mencari posisi spasi pertama dari isi di dalam variabel plteKendaraanSaya
        long spaceOneKendaraan = plteKendaraanSaya.indexOf(' ');

        // Mencari posisi spasi kedua, mulai pencarian setelah spasi pertama
        long spaceTwoKendaraan = plteKendaraanSaya.indexOf(' ', (int) spaceOneKendaraan + 1);

        String angkaPlteKendaraan;
        // Memeriksa apakah kedua spasi di dalam variable plteKendaraanSaya ada
        if (spaceOneKendaraan >= 0 && spaceTwoKendaraan >= 0) {
            // Jika ada, ambil isinya antara spasi satu dan spasi dua
            angkaPlteKendaraan = plteKendaraanSaya.substring((int) spaceOneKendaraan + 1, (int) spaceTwoKendaraan);
        } else {
            // Jika tidak ada, maka angkaPlteKendaraan menjadi string kosong
            angkaPlteKendaraan = "";
        }

        long pendendaanTilang = 50000;
        // Menghitung denda tilang berdasarkan panjang platkendaraan lalu di kali dengan isi variabel pendendaanTilang
        int dendaTilang = (int) pendendaanTilang * plteKendaraanSaya.length();
        String nulisDenda = "Rp." + dendaTilang;

        // Mengambil karakter terakhir dari angkaPlteKendaraan
        char plteAngkaTerkhir = angkaPlteKendaraan.charAt(angkaPlteKendaraan.length() - 1);

        // Mendeklarasikan variabel untuk menyimpan hasil pemeriksaan kesesuaian genap/ganjil
        String platJilNab;
        // Saya Memeriksa angka terakhir dari plat nomor genap atau ganjil
        if (plteAngkaTerkhir % 2 == 0) {
            // sisa pembagian dengan 2 adalah 0, maka di set genap
            platJilNab = "Genap";
        } else {
            // sisa pembagian dengan 2 bukan 0, maka di set ganjil
            platJilNab = "Ganjil";
        }

        // Ambil angka terakhir dari tanggal
        long tangalJilNap = Long.parseLong(Keluaran[2].substring(0, Keluaran[2].indexOf(' ')));

        // Menentukan apakah tanggal adalah genap atau ganjil
        String tangGenpGanjl;

        // Memeriksa apakah tanggal genap atau ganjil
        if (tangalJilNap % 2 == 0) {
            // pembagian tanggal dengan 2 adalah 0, maka tanggal genap
            tangGenpGanjl = "Genap";
        } else {
            // pembagian tanggal dengan 2 bukan 0, maka tanggal ganjil
            tangGenpGanjl = "Ganjil";
        }

        // Mendeklarasikan variabel untuk menyimpan hasil pemeriksaan kesesuaian genap/ganjil
        String platBenarGenap;

        // Saya Memeriksa apakah angka terakhir dari plat nomor genap atau ganjil
        if (plteAngkaTerkhir % 2 == tangalJilNap % 2) {
            // Jika angka terakhir genap, periksa apakah tanggal juga genap
            // Jika sama (keduanya genap), set platBenarGenap ke "Ya", jika tidak "Tidak"
            platBenarGenap = "Ya,";
        } else {
            // Jika angka terakhir ganjil, periksa apakah tanggal juga ganjil
            // Jika sama (keduanya ganjil), set platBenarGenap ke "Ya", jika tidak "Tidak"
            platBenarGenap = "Tidak,"; // Salah satu genap, yang lain ganjil
        }

        // Mengecek apakah hari besok akan terkena tilang atau tidak
        String time; // Mendeklarasikan variabel untuk menyimpan status tilang

        // Memeriksa apakah tanggal dan angka terakhir plat memiliki hasil yang sama
        if (tangalJilNap % 2 == plteAngkaTerkhir % 2) {
            // Jika keduanya genap atau keduanya ganjil
            time = "tidak kena tilang"; // Menyimpan status bahwa tidak akan terkena tilang
        } else {
            // Jika satu genap dan yang lain ganjil
            time = "kena tilang"; // Menyimpan status bahwa akan terkena tilang
        }

        // membuat variabel cekTertlangBsok yang dimana isinya di ambil dari variabel tangalJilNap di tambah 1.
        long cekTertlangBsok = tangalJilNap + 1;

        // Membandingkan nilai cekTertlangBsok dengan modulo 2 untuk menentukan genap atau ganjil
        String tertilangNoTelang;

        // Memeriksa cekTertlangBsok genap atau ganjil
        if ((cekTertlangBsok) % 2 == 0) {
            // Jika sisa pembagian cekTertlangBsok dengan 2 adalah 0, maka genap
            tertilangNoTelang = "Genap";
        } else {
            // Jika sisa pembagian cekTertlangBsok bukan 0, maka ganjil
            tertilangNoTelang = "Ganjil";
        }

        // Memprediksi akan kena tilang berdasarkan nilai cekTertlangBsok
        String prdctTingBesk;
        if ((cekTertlangBsok % 2) == 0) {
            // Jika cekTertlangBsok genap, maka tidak kena tilang
            prdctTingBesk = " " + "tidak kena tilang";
        } else {
            // Jika cekTertlangBsok ganjil, maka akan kena tilang
            prdctTingBesk = " " + "akan kena tilang";
        }

        // Array untuk menyimpan informasi tentang status tilang dan prediksi
        String[] haslTlgBesk = new String[2];

        // Menyimpan hasil ke dalam array
        haslTlgBesk[0] = time; // status tilang
        haslTlgBesk[1] = prdctTingBesk; // prediksi tilang besok

        // Variable di bawah ini hanya untuk keluaran 
        // dan mempermudah di bagian pada saat di keluarkan 
        String jnisPelgrn = "Melanggar aturan Ganjil Genap";
        String keluaranData = "Halo, Selamat Datang di Program Tilang Elektronik";
        String keluaranDataDua = "Silahkan Cek Data Kendaraan dibawah ini";
        String lineSatu = "====================================================";
        String lineDua = "=========================================================";

        String[] seluruhKeluaran = new String[12];
        seluruhKeluaran[0] = "Nama               : " + nameBikeSaya;
        seluruhKeluaran[1] = "Plat Kendaraan     : " + plteKendaraanSaya;
        seluruhKeluaran[2] = "Tanggal            : " + Keluaran[2];
        seluruhKeluaran[3] = "Jenis Pelanggaran  : " + jnisPelgrn;
        seluruhKeluaran[4] = "Denda              : " + nulisDenda;
        seluruhKeluaran[5] = "Anda kena tilang pada tanggal " + Keluaran[2];
        seluruhKeluaran[6] = "tanggal tersebut merupakan tanggal " + tangGenpGanjl;
        seluruhKeluaran[7] = "Angka terakhir plat anda adalah " + plteAngkaTerkhir;
        seluruhKeluaran[8] = "Apakah Plat anda merupakan plat " + tangGenpGanjl + "?" + "\t" + "\t" + ": " + platBenarGenap + " plat anda merupakan plat " + platJilNab;
        seluruhKeluaran[9] = "Apakah kendaraan anda kena tilang   : Kendaran Anda " + haslTlgBesk[0] + "\n" + "";
        seluruhKeluaran[10] = "Jika anda menggunakan kendaraan pada tanggal " + tertilangNoTelang;
        seluruhKeluaran[11] = "apakah kendaraan anda akan kena tilang besoknya ?   : Kendaran anda" + haslTlgBesk[1];

        System.out.println(lineSatu);
        System.out.println("=                    GanjilGenap                   =");
        System.out.println("=       Dibuat Oleh Zild Jian Xto / 1402024054     =");
        System.out.println(lineSatu);
        System.out.println(keluaranData + "\n" + keluaranDataDua);
        System.out.println(lineDua);
        System.out.println(seluruhKeluaran[0]);
        System.out.println(seluruhKeluaran[1]);
        System.out.println(seluruhKeluaran[2]);
        System.out.println(seluruhKeluaran[3]);
        System.out.println(seluruhKeluaran[4]);
        System.out.println(lineDua);
        System.out.println(seluruhKeluaran[5]);
        System.out.println(seluruhKeluaran[6]);
        System.out.println(seluruhKeluaran[7]);
        System.out.println(seluruhKeluaran[8]);
        System.out.println(lineDua);
        System.out.println(seluruhKeluaran[9]);
        System.out.println(seluruhKeluaran[10]);
        System.out.println(seluruhKeluaran[11]);
    }
}
