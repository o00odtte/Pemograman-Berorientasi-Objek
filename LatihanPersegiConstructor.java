public class LatihanPersegiConstructor {
     static class Persegi {
        int sisi;
        int luas;
        int keliling;

        // Constructor dengan 1 parameter + validasi
        public Persegi(int sisi) {

            if (sisi <= 0) {
                System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
                this.sisi = 1;
            } else {
                this.sisi = sisi;
            }

            // Hitung luas dan keliling langsung di constructor
            this.luas = this.sisi * this.sisi;
            this.keliling = 4 * this.sisi;
        }

        // Method menampilkan hasil
        public void tampilkanHasil() {
            System.out.println("=== PERSEGI ===");
            System.out.println("Sisi      : " + sisi + " cm");
            System.out.println("Luas      : " + luas + " cm²");
            System.out.println("Keliling  : " + keliling + " cm");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Object 1: sisi valid
        Persegi persegi1 = new Persegi(5);
        persegi1.tampilkanHasil(); // Tampilkan hasil object

        // Object 2: sisi invalid
        Persegi persegi2 = new Persegi(-3);
        persegi2.tampilkanHasil(); // Tampilkan hasil object
        
    }
}
