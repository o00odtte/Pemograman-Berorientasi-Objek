package Pertemuan8;

public class LatihanKombinasiLoop {
     public static void main(String[] args) {
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");

        boolean ditemukan = false; 

        for (int baris = 1; baris <= 3 && !ditemukan; baris++) {

            for (int kolom = 1; kolom <= 5; kolom++) {

                System.out.println("Cek: [" + baris + "," + kolom + "]");

                if (baris == 2 && kolom == 3) {

                    System.out.println("Koordinat ditemukan!");
                    System.out.println("Pencarian selesai.");

                    ditemukan = true; 
                    break; 
                }
            }
        }
    }
}
