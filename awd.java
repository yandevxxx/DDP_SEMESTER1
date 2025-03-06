class PerhitunganPoinBelanja {
    private static final double nilaiAwalPoin = 100000;
    private double totalPoin;
    private static final double poinBeliMakanan = 0.05;
    private static final double poinBeliMinuman = 10;
    private int jumlahTransaksi;
    private int jenisTransaksi;

    public void setTransaksi(int jumlahTransaksi, int jenisTransaksi) {
        this.nilaiAwalPoin = nilaiAwalPoin;
        this.jumlahTransaksi = jumlahTransaksi;
        this.jenisTransaksi = jenisTransaksi;
    }

    public static double hitungNilaiPoin() {
        if (jenisTransaksi == 1) {
            totalPoin = nilaiAwalPoin + (jumlahTransaksi * poinBeliMakanan);
        } else {
            totalPoin = nilaiAwalPoin + (jumlahTransaksi * poinBeliMinuman);
        }
        return totalPoin;
    }
}


1. salah pada pada penggunaan variable nilaiAwalPoin di dalam method setTransaksi()
    variable nilaiAwalPoin adalah static final , berarti nilainya tidak bisa di ubah
    dalam method setTransaksi() , this.nilaiAwalPoin = nilaiAwalPoin;, tidak di perbolehkan karena final tidak dapat di ubah
    (baris yang salah bagian this.nilaiAwalPoin = nilaiAwalPoin dalam baris 10)

2. salah pada method hitungNilaiPoin() 
    Method static, mencoba mengakses variabel non-static yaitu variable jumlahTransaksi dan jenisTransaksi.
    Variabel totalPoin juga non-static, dicoba digunakan dalam method static.
    (baris yang salah dari baris 16 - 20)

3. salah pada deklarasi hitungNilaiPoin()
    hitungNilaiPoin() adalah static, tidak bisa langsung mengakses variabel instance jumlahTransaksi dan jenisTransaksi.
    (baris yang salah 15)


    kode yang benar
class PerhitunganPoinBelanja {
    private static final double nilaiAwalPoin = 100000;
    private double totalPoin;
    private static final double poinBeliMakanan = 0.05;
    private static final double poinBeliMinuman = 10;
    private int jumlahTransaksi;
    private int jenisTransaksi;

    public void setTransaksi(int jumlahTransaksi, int jenisTransaksi) {
        this.jumlahTransaksi = jumlahTransaksi;
        this.jenisTransaksi = jenisTransaksi;
    }

    public double hitungNilaiPoin() {
        if (jenisTransaksi == 1) {
            totalPoin = nilaiAwalPoin + (jumlahTransaksi * poinBeliMakanan);
        } else {
            totalPoin = nilaiAwalPoin + (jumlahTransaksi * poinBeliMinuman);
        }
        return totalPoin;
    }
}
    