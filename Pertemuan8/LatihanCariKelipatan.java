package Pertemuan8;

public class LatihanCariKelipatan {
    public static void main(String[] args) {

        System.out.println("=== CARI KELIPATAN 7 ===");

        // Loop dari 1 sampai 50
        for (int i = 1; i <= 50; i++) {

            // Tampilkan angka yang lagi dicek
            System.out.println("Cek: " + i);

            // Cek apakah i kelipatan 7
            if (i % 7 == 0) {

                System.out.println("✓ Kelipatan 7 pertama: " + i);
                System.out.println("Pencarian selesai.");

                // Stop loop setelah ketemu
                break;
            }
        }
    }
}
