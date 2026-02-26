package Pertemuan7;

public class LatihanDeretGanjil {
    public static void main(String[] args) {

        // Mulai dari angka 1
        int angka = 1;

        System.out.println("=== BILANGAN GANJIL 1-15 ===");

        // Loop jalan selama angka masih <= 15
        while (angka <= 15) {

            // Cek apakah angka ganjil
            if (angka % 2 != 0) {
                System.out.print(angka + " ");
            }

            // Naikin angka biar gak infinite loop
            angka++;
        }
    }
}
