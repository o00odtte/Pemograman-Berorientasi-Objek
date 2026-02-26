package Pertemuan8;

public class LatihanMenuHarian {
     public static void main(String[] args) {

        System.out.println("=== MENU MAKAN 3 HARI ===");

        for (int hari = 1; hari <= 3; hari++) {

            System.out.println("Hari " + hari + ":");

            for (int waktu = 1; waktu <= 2; waktu++) {

                String namaWaktu = "";
                String menu = "";

                // Nama waktu
                if (waktu == 1) {
                    namaWaktu = "Pagi";
                } else {
                    namaWaktu = "Siang";
                }

                // Menu berdasarkan hari & waktu
                if (hari == 1 && waktu == 1) {
                    menu = "Nasi Goreng";
                } else if (hari == 1 && waktu == 2) {
                    menu = "Soto Ayam";
                } else if (hari == 2 && waktu == 1) {
                    menu = "Bubur Ayam";
                } else if (hari == 2 && waktu == 2) {
                    menu = "Mie Goreng";
                } else if (hari == 3 && waktu == 1) {
                    menu = "Roti Bakar";
                } else if (hari == 3 && waktu == 2) {
                    menu = "Nasi Uduk";
                }

                // Output
                System.out.println(namaWaktu + ": " + menu);
            }
        }
    }
}
