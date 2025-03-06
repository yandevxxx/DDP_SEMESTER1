// Nama : Zild Jian Xto 
// Npm  : 1402024054

public class SensusPenduduk_1402024054 {

    public static void main(String[] args) {

        // perhitungan jumlah pertumbuhan 
        int kelahirannya = Integer.parseInt(args[0]); // saya mengambil tipe data int (Ineteger) karna dari outuput menggunakan bilangan bulat dan juga type data ini adalah type standar
        int kematianPenduduknya = Integer.parseInt(args[1]); // saya mengambil tipe data int (Ineteger) karna dari outuput menggunakan bilangan bulat dan juga type data ini adalah type standar
        int imigrannya = Integer.parseInt(args[2]); // saya mengambil tipe data int (Ineteger) karna dari outuput menggunakan bilangan bulat dan juga type data ini adalah type standar
        int emigrannya = Integer.parseInt(args[3]); // saya mengambil tipe data int (Ineteger) karna dari outuput menggunakan bilangan bulat dan juga type data ini adalah type standar
        double hasilPertumbuhanPenduduk = (kelahirannya - kematianPenduduknya) + (imigrannya - emigrannya); // saya mengambil tipe data double karna yang diminta menjadi 825.0 dan juga type data ini adalah type standar

        // perhitungan Persentase Pertumbuhannya dari 2023 ke 2024
        int pendudukTahun2023 = 30000; // saya mengambil tipe data int (Ineteger) karna dari outuput menggunakan bilangan bulat dan juga type data ini adalah type standar
        int persentase = 100; // saya mengambil tipe data int (Ineteger) karna dari outuput menggunakan bilangan bulat dan juga type data ini adalah type standar
        double hasilPersentasePenduduk = hasilPertumbuhanPenduduk / pendudukTahun2023 * persentase; // saya mengambil tipe data double karna yang diminta menjadi 2.75 dan juga type data ini adalah type standar

        // perhitungan total penduduk 2024
        double seluruhPenduduk2024 = pendudukTahun2023 + hasilPertumbuhanPenduduk; // saya mengambil tipe data double supaya hasil menghitung jiwa lebih presisi

        System.out.println("================================================");
        System.out.println("         Program Sensus Penduduk Kota A         ");
        System.out.println("    Dibuat oleh [Zild Jian X TO]/[1402024054]   ");
        System.out.println("================================================");
        System.out.println("Jumlah kelahirannya Bayi     : " + kelahirannya + " Jiwa.");
        System.out.println("Jumlah Kematian Penduduk     : " + kematianPenduduknya + " Jiwa.");
        System.out.println("Jumlah imigrannya            : " + imigrannya + " Jiwa.");
        System.out.println("Jumlah emigrannya            : " + emigrannya + " Jiwa.");
        System.out.println("-------------------------------------------------");
        System.out.println("Pertumbuhan Penduduk       : " + "(" + kelahirannya + " - " + kematianPenduduknya + ")" + " + " + "(" + imigrannya + " - " + emigrannya + ")" + " = " + hasilPertumbuhanPenduduk);
        System.out.println("Persentase Pertumbuhannya  : " + hasilPertumbuhanPenduduk + " / " + pendudukTahun2023 + " * " + persentase + " = " + hasilPersentasePenduduk + "%");
        System.out.println("Total Penduduk             : " + pendudukTahun2023 + " + " + hasilPertumbuhanPenduduk + " = " + seluruhPenduduk2024 + " Jiwa.");
        System.out.println("-------------------------------------------------");
        System.out.println("Jadi, Jumlah pertumbuhan penduduk kota A dalam setahun mencapai " + hasilPertumbuhanPenduduk + " Jiwa, ");
        System.out.println("dengan persentase pertumbuhannya berkisar " + hasilPersentasePenduduk + "%.");
        System.out.println("Dan total penduduk kota A tahun 2024 adalah " + seluruhPenduduk2024 + " jiwa.");
    }
}
