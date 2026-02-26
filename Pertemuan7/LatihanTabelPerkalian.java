package Pertemuan7;

public class LatihanTabelPerkalian {
    public static void main(String[] args) {

        int angka = 13;

        System.out.println("=== TABEL PERKALIAN " + angka + " ===");

        for (int i = 1; i <= 12; i++) {

            int hasil = angka * i;

            System.out.println(angka + " x " + i + " = " + hasil);
        }
    }
}
