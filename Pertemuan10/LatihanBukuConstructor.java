package Pertemuan10;

public class LatihanBukuConstructor {
     static class Buku {
        String judul;
        String pengarang;
        int harga;

        // Constructor 1: tanpa parameter
        public Buku() {
            judul = "Belum diisi";
            pengarang = "Belum diisi";
            harga = 0;
        }

        // Constructor 2: 3 parameter (menggunakan this)
        public Buku(String judul, String pengarang, int harga) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.harga = harga;
        }

        // Method menampilkan informasi buku
        public void tampilkanInfo() {
            System.out.println("=== INFORMASI BUKU ===");
            System.out.println("Judul     : " + judul);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("Harga     : Rp " + harga);
            System.out.println();
        }
}


  public static void main(String[] args) {

        // 1 object dengan constructor default
        Buku buku1 = new Buku();

        // 2 object dengan constructor berparameter
        Buku buku2 = new Buku("Pemrograman Java", "Rudi Raharjo", 125000);
        Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        // Menampilkan semua informasi buku
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
    }
}

