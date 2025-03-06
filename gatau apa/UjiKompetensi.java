
import java.util.Scanner;

public class UjiKompetensi {

    public static void main(String[] args) {
        Scanner Jian = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        Double x = Jian.nextDouble();
        String s = "tidak ada kehilangan presisi";

        // Check for precision loss
        if (x - x != 0) {
            System.out.println("Ada kehilangan presisi.");
        } else {
            System.out.println(s);
        }
    }
}
