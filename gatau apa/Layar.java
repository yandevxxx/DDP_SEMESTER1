// //praktikum 12

// import java.util.Scanner;
// public class Layar {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String masukan = sc.nextLine();
//         char pertama = masukan.charAt(0);
//         char sebelumterakhir = masukan.charAt(masukan.length() - 2);
//         char terakhir = masukan.charAt(masukan.length() - 1);
//         if (pertama == 'o') {
//             pertama = 'a';
//         }
//         if (pertama == 'O') {
//             pertama = 'A';
//         }
//         // Obat , obaT , kakikuku, 
//         if (terakhir == 't') {
//             terakhir = 'd';
//         }
//         if (terakhir == 'T') {
//             pertama = 'o';
//             terakhir = sebelumterakhir;
//         }
//         if (terakhir == 's') {
//             terakhir = 't';
//         }
//         if (terakhir == 'k') {
//             terakhir = 's';
//         }
//         if (sebelumterakhir == 'a') {
//             terakhir = sebelumterakhir;
//         }
//         System.out.println(pertama + masukan.substring(1, masukan.length() - 1) + terakhir);
//     }
// }
//praktikum 12
import java.util.Scanner;

public class Layar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nama Lengkap Anda : ");
        String masukan = sc.nextLine();

        char namaAkhir = masukan.charAt(masukan.length() - 1);
        char sebelumterakhir = masukan.charAt(masukan.length() - 2);
        char namaAwal = masukan.charAt(0);

        namaAkhir += 5;
        namaAwal -= 7;
        sebelumterakhir += 2;

        System.out.println("Keluaran : " + namaAwal + masukan.substring(1, masukan.length() - 2) + sebelumterakhir + namaAkhir);
    }
}
