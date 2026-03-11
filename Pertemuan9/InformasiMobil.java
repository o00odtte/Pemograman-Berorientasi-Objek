package Pertemuan9;

// Membuat class Mobil
class Mobil {

    // Atribut sesuai UML (- = private)
    private String merk;
    private String warna;
    private int tahun;
    private int kecepatan;

    // Constructor untuk mengisi data mobil
    public Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.kecepatan = 0;
    }

    // Method sesuai UML
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }

    public void percepat() {
        kecepatan += 20;
        System.out.println("Mobil dipercepat...");
    }

    public void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}

// Class utama (tidak diubah)
public class InformasiMobil {

    public static void main(String[] args) {

        // Membuat object mobil1
        Mobil mobil1 = new Mobil("Toyota Avanza", "Silver", 2020);

        // Menjalankan method
        mobil1.tampilkanSpesifikasi();
        mobil1.percepat();
        mobil1.percepat();
        mobil1.tampilkanKecepatan();
    }
}