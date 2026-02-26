package Pertemuan7;

public class LatihanRefleksi {
     public static void main(String[] args) {

        System.out.println("=== MENGGUNAKAN WHILE ===");

        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n");

        System.out.println("=== MENGGUNAKAN DO-WHILE ===");

        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);

        System.out.println("\n");

        System.out.println("=== MENGGUNAKAN FOR ===");

        for (int k = 1; k <= 5; k++) {
            System.out.print(k + " ");
        }
    }
}
