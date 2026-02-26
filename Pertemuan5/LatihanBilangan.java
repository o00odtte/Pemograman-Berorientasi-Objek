package Pertemuan5;

public class LatihanBilangan {
     public static void main(String[] args) {

        int number = 12; // Nilai untuk pengujian

        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);

        // Cek apakah angka ini positif, negatif, atau nol
        if (number > 0) {
            System.out.println("Jenis: Bilangan positif");

            // Kalau bukan nol, lanjut cek genap atau ganjil
            if (number % 2 == 0) {
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }

        } else if (number < 0) {
            System.out.println("Jenis: Bilangan negatif");

            // Meskipun negatif, tetap bisa dicek genap atau ganjil
            if (number % 2 == 0) {
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }

        } else { // Kondisi khusus kalau angkanya 0
            System.out.println("Jenis: Bilangan nol");
        }
    }
}
