 
public class aw {

    public static void main(String[] args) {
        Mahasiswa mahasiswaTerdaftar[] = new Mahasiswa[3];

        mahasiswaTerdaftar[0] = new Mahasiswa("Ahmad Fauzi", "1402023005", 7);
        mahasiswaTerdaftar[0].penambahanMataKuliah("Matematika Diskrit", 4, 4);
        mahasiswaTerdaftar[0].penambahanMataKuliah("Agama 1", 4, 3);
        mahasiswaTerdaftar[0].penambahanMataKuliah("Dasar Dasar Pemrograman", 4, 0);
        mahasiswaTerdaftar[0].penambahanMataKuliah("Literasi Digital", 3, 1);
        mahasiswaTerdaftar[0].penambahanMataKuliah("Bahasa Indonesia", 2, 3);
        mahasiswaTerdaftar[0].penambahanMataKuliah("Bahasa Inggris", 2, 4);
        mahasiswaTerdaftar[0].penambahanMataKuliah("Pancasila", 2, 1);

        // Menambahkan mahasiswa kedua beserta mata kuliahnya
        mahasiswaTerdaftar[1] = new Mahasiswa("Fahira Putri", "1402024015", 7);
        mahasiswaTerdaftar[1].penambahanMataKuliah("Matematika Diskrit", 4, 4);
        mahasiswaTerdaftar[1].penambahanMataKuliah("Agama 1", 4, 3);
        mahasiswaTerdaftar[1].penambahanMataKuliah("Dasar Dasar Pemrograman", 4, 4);
        mahasiswaTerdaftar[1].penambahanMataKuliah("Literasi Digital", 3, 4);
        mahasiswaTerdaftar[1].penambahanMataKuliah("Bahasa Indonesia", 2, 1);
        mahasiswaTerdaftar[1].penambahanMataKuliah("Bahasa Inggris", 2, 3);
        mahasiswaTerdaftar[1].penambahanMataKuliah("Pancasila", 2, 2);

        // Menambahkan mahasiswa ketiga beserta mata kuliahnya
        mahasiswaTerdaftar[2] = new Mahasiswa("Fadhlurrahman", "1402021022", 12);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Dasar Dasar Pemrograman", 4, 3);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Matematika Diskrit", 4, 4);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Literasi Digital", 4, 4);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Agama 1", 3, 4);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Bahasa Inggris", 2, 3);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Bahasa Indonesia", 2, 4);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Pancasila", 2, 4);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Matematika Computer", 4, 3);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Basis Data", 4, 2);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Agama 2", 1, 4);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Kewarganegaraan", 2, 3);
        mahasiswaTerdaftar[2].penambahanMataKuliah("Sistem Operasi", 3, 4);

    }

}

class Mahasiswa {
    String namaMahasiswa;  
    String npmMahasiswa;  
    MataKuliah[] mataKuliahList; 
    int jumlahMataKuliah; 

    void penambahanMataKuliah(String nama, int sks, int nilai) {
        if (jumlahMataKuliah < mataKuliahList.length) { // pengecekan ruang batas mata kuliah 
            mataKuliahList[jumlahMataKuliah] = new MataKuliah(nama, sks, nilai); // Tambahkan mata kuliah ke dalam array yang tersedia 
            jumlahMataKuliah += 1; // Tambah jumlah mata kuliah yang diambil
        } else {
            System.out.println("Mata kuliah penuh, tidak bisa menambah lagi."); // Jika penuh mata kuliah penuh maka tidak bisa menambah lagi
        }
    }
}
