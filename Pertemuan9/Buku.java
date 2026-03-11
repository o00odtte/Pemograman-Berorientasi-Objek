package Pertemuan9;

class Buku {

    // atribut sesuai UML
    private String judul;
    private String pengarang;
    private int harga;

    // method sesuai UML (private)
    private void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga : Rp " + harga);
    }

    public static void main(String[] args) {

        // membuat object pertama
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Budi Raharjo";
        buku1.harga = 125000;

        // membuat object kedua
        Buku buku2 = new Buku();
        buku2.judul = "Algoritma dan Struktur Data";
        buku2.pengarang = "Rinaldi Munir";
        buku2.harga = 150000;

        // memanggil method tampilkanInfo
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
} 
  
