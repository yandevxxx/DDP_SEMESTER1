
import java.util.Scanner;

public class LatihanUk {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] aktivitas = {"1. Kuliah (10 Jam)", "2. Kerja (8 Jam)"};
        String print = "Nama Mahasiswa: " + args[0].toUpperCase() + "\nBerikut adalah aktivitas yang terlewat:\n" + aktivitas[0] + "\n" + aktivitas[1] + "\nPilih: ";
        System.out.print(print);
        int pilih1 = scan.nextInt();
        print = "\nWaktu Belajar		: ";
        System.out.print(print);
        int pilih2 = scan.nextInt();
        print = "Waktu Main		: ";
        System.out.print(print);
        int pilih3 = scan.nextInt();
        print = "Waktu Tidur		: ";
        System.out.print(print);
        int pilih4 = scan.nextInt();
        int jamKurang = (Integer.parseInt(aktivitas[pilih1 - 1].substring(aktivitas[pilih1 - 1].indexOf('(') + 1, aktivitas[pilih1 - 1].indexOf("J") - 1))) - (24 - (pilih2 + pilih3 + pilih4));
        print = "Waktu yang harus di relakan untuk melakukan aktivitas" + aktivitas[pilih1 - 1].substring(2, aktivitas[pilih1 - 1].indexOf(' ', aktivitas[pilih1 - 1].indexOf(' ') + 1)) + " adalah dengan menguranginya " + jamKurang + " Jam aktivitas saat ini.\n";
        System.out.print(print);
        print = args[0] + " juga ingin mengupgrade PC dengan tabungan yang ia miliki. \nIa menabung dalam bulan: ";
        System.out.print(print);
        int bulan = scan.nextInt();
        print = "Dalam " + bulan + " bulan ia menghasilkan: ";
        System.out.print(print);
        int tabung = scan.nextInt();
        print = "\nbantulah ia supaya bisa membeli komponen-komponen PC dengan tabungan.\nia menabung " + bulan + " bulan adalah " + tabung + " berapa lamakah ia harus menabung jika: \n\n";
        System.out.print(print);
        print = "CPU: RP";
        System.out.print(print);
        long cpu = scan.nextLong();
        print = "GPU: RP";
        System.out.print(print);
        long gpu = scan.nextLong();
        print = "RAM: RP";
        System.out.print(print);
        long ram = scan.nextLong();
        print = "SSD: RP";
        System.out.print(print);
        long ssd = scan.nextLong();
        int satuBulan = tabung / bulan;
        long nabungBulan = (cpu + gpu + ram + ssd) / satuBulan;
        print = "Jadi, waktu yang dibutuhkan untuk menabung membeli komponen tersebut adalah " + (nabungBulan + 1) + " Bulan.";
        System.out.print(print);
    }
}
