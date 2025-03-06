import java.util.Arrays;

public class DDP {
    public static void main(String[] args) {
        // Variabel datum diinisialisasi dengan string input
        String datum = "ddp";  // Contoh input

        // Mengubah datum menjadi array karakter untuk memudahkan manipulasi
        char[] data = datum.toCharArray();

        int index = 0;

        // Loop menggunakan do-while
        do {
            char currentChar = data[index];  // Ambil karakter saat ini
            // Hitung jarak karakter terhadap 'a'
            int distanceFromA = currentChar - 'a';
            
            // Temukan karakter yang sesuai berdasarkan jarak dari 'z'
            char newChar = (char) ('z' - distanceFromA);
            
            // Ganti karakter di array
            data[index] = newChar;
            
            index++;  // Increment indeks
        } while (index < data.length);  // Loop sampai akhir array

        // Menampilkan hasil akhir
        System.out.println(new String(data));  // Output hasil konversi
    }
}
