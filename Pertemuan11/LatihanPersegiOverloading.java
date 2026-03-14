package Pertemuan11;

public class LatihanPersegiOverloading {

    static class PersegiPanjang {
        int panjang;
        int lebar;
        int luas;
        int keliling;

        // Constructor 1: persegi (satu sisi)
        public PersegiPanjang(int sisi) {
            panjang = sisi;
            lebar = sisi;
            hitung();
        }

        // Constructor 2: persegi panjang
        public PersegiPanjang(int panjang, int lebar) {

            // Validasi nilai tidak boleh negatif
            if (panjang <= 0 || lebar <= 0) {
                System.out.println("Nilai panjang atau lebar tidak valid!");
                this.panjang = 0;
                this.lebar = 0;
            } else {
                this.panjang = panjang;
                this.lebar = lebar;
            }

            hitung();
        }

        // Method menghitung luas dan keliling
        private void hitung() {
            luas = panjang * lebar;
            keliling = 2 * (panjang + lebar);
        }

        // Method menampilkan informasi
        public void tampilkanInfo() {
            System.out.println("=== DATA PERSEGI PANJANG ===");
            System.out.println("Panjang  : " + panjang);
            System.out.println("Lebar    : " + lebar);
            System.out.println("Luas     : " + luas);
            System.out.println("Keliling : " + keliling);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Object persegi
        PersegiPanjang p1 = new PersegiPanjang(5);

        // Object persegi panjang
        PersegiPanjang p2 = new PersegiPanjang(8, 4);

        p1.tampilkanInfo();
        p2.tampilkanInfo();
    }
}
