package Pertemuan11;

public class LatihanProdukOverloading {

    static class Produk {
        String namaProduk;
        int harga;
        int stok;

        // Constructor 1: nama produk dan harga
        public Produk(String namaProduk, int harga) {
            this.namaProduk = namaProduk;
            this.harga = harga;
            this.stok = 0; // default
        }

        // Constructor 2: semua atribut
        public Produk(String namaProduk, int harga, int stok) {
            this.namaProduk = namaProduk;
            this.harga = harga;
            this.stok = stok;
        }

        // Method menampilkan informasi produk
        public void tampilkanInfo() {
            System.out.println("=== INFORMASI PRODUK ===");
            System.out.println("Nama Produk: " + namaProduk);
            System.out.println("Harga      : Rp " + harga);
            System.out.println("Stok       : " + stok);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Object 1 menggunakan constructor 1
        Produk produk1 = new Produk("Laptop ASUS", 8500000);

        // Object 2 menggunakan constructor 2
        Produk produk2 = new Produk("Mouse Logitech", 250000, 50);

        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
    }
}

