//Zild Jian X TO
//1402024054

public class VoidRealm_1402024054 {

    public static void main(String[] output) {

        //variable bagian 1
        // Mengambil nama karakter dari output dan mengubahnya menjadi huruf kapital
        // output[0] adalah elemen pertama dari array output, yang berisi nama karakter.
        // toUpperCase() Metode ini mengubah semua huruf dalam string menjadi huruf kapital.
        String Noc = output[0].toUpperCase();

        // Mengambil nama senjata dari output dan mengubahnya menjadi huruf kecil
        // output[1] adalah elemen kedua dari array output, yang berisi nama senjata.
        // toLowerCase() Metode ini mengubah semua huruf dalam string menjadi huruf kecil.
        String Now = output[1].toLowerCase();

        // Mengambil umur karakter dari output , lalu di convert dari string ke int, dan mengonversi dari hari ke tahun
        // output[2] berisi umur karakter dalam hari.
        // Integer.parseInt() Metode ini mengonversi string menjadi integer. Setelah itu, nilai tersebut dibagi 365 untuk mengubahnya dari hari ke tahun.
        int ageInCharacter = Integer.parseInt(output[2]) / 365;

        // Mengambil era karakter dari output dan mengonversinya dari string menjadi integer
        // output[3] berisi era karakter, yang berupa string yang bisa diubah menjadi integer.
        // Integer.parseInt() Sekali lagi digunakan untuk mengonversi string menjadi integer.
        int eraInCharacter = Integer.parseInt(output[3]);

        //variable bagian 2
        // Mengambil karakter pertama dari Noc
        // Noc adalah string yang berisi Noc dengan huruf kapital.
        char codeOne = Noc.charAt(0);

        // Menghitung indeks karakter tengah dari nama karakter
        int codeTwo = (int) (Noc.length() / 2);

        // Mengambil karakter pada indeks tengah dan menyimpannya dalam variabel codeTwo 
        codeTwo = Noc.charAt(codeTwo);

        // Mengambil karakter terakhir dari nama karakter
        char kodeThree = Noc.charAt(Noc.length() - 1);

        //variable bagian 3
        // Menghitung nameOffCode dengan menjumlahkan umur karakter dan nilai ASCII dari codeTwo
        int nameOffCode = ageInCharacter + codeTwo;

        // Mengambil dua karakter pertama dari nama senjata, mengubahnya menjadi huruf kapital, 
        // dan menambahkan karakter berdasarkan perhitungan dari elemen output
        String nameUniqueWeap = Now.substring(0, 2).toUpperCase() + (char) (Integer.parseInt(output[3].substring(0, 2)) * 8);

        //variabel bagian 4
        // Mengambil nama karakter dari output
        String nameNaypos = output[0];

        // Mengambil nama senjata dari output dan mengubahnya menjadi huruf kapital
        String nameMacCharacter = output[1].toUpperCase();

        //bagian output 
        System.out.println("---------------------------------------------------------");
        System.out.println("                    Program VoidRealm                    ");
        System.out.println("         Dibuat oleh Zild Jian X TO / 1402024054         ");
        System.out.println("---------------------------------------------------------");

        System.out.println("Name                 : " + Noc);
        System.out.println("Weapon               : " + Now);
        System.out.println("Age                  : " + ageInCharacter + " Years Old");
        System.out.println("Era                  : " + eraInCharacter + " BC");

        System.out.println("---------------------------------------------------------");

        System.out.println("First Code           : " + codeOne);
        System.out.println("Second Code          : " + codeTwo);
        System.out.println("Third Code           : " + kodeThree);

        System.out.println("---------------------------------------------------------");

        System.out.println("Code Name           : " + nameOffCode + (char) (codeTwo) + codeOne + kodeThree);
        System.out.println("Unique Weapon       : " + nameUniqueWeap.toUpperCase());

        System.out.println("---------------------------------------------------------");

        System.out.println(nameNaypos + " berada di dunia void setelah memasuki portal misterius, ia juga mempunyai " + nameMacCharacter + " & " + nameUniqueWeap.toUpperCase() + "\n"
                + "dan berumur " + ageInCharacter + " tahun, nama panggilan code name dia adalah " + nameOffCode + (char) (codeTwo) + codeOne + kodeThree + ".");
    }
}
