package Pertemuan7;

public class LatihanValidasi {
     public static void main(String[] args) {

        System.out.println("=== VALIDASI NILAI UJIAN ===\n");

        int[] percobaan = {-10, 150, 85};

        int i = 0;
        int nilai;

        do {

            nilai = percobaan[i];
            System.out.println("Percobaan input: " + nilai);

            // Cek apakah nilai di luar range 0-100
            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0-100!\n");
            } else {
                System.out.println("✓ Nilai valid: " + nilai);
            }

            i++;

        } while ((nilai < 0 || nilai > 100) && i < percobaan.length);

    }
}
