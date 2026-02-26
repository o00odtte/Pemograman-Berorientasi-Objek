package Pertemuan8;

public class LatihanTotalGenap {
     public static void main(String[] args) {

        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");

        int total = 0;

        // Loop dari 1 sampai 20
        for (int i = 1; i <= 20; i++) {

            // Kalau ganjil, langsung skip
            if (i % 2 != 0) {
                continue;
            }

            // Kalau genap, tambahkan ke total
            total += i;

            System.out.println("Tambah: " + i + " -> Total: " + total);
        }

        System.out.println("---");
        System.out.println("Total akhir: " + total);
    }
}
