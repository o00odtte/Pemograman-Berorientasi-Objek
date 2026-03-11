public class LatihanMobilConstructor {
     static class Mobil {
        String merk;
        String warna;
        int tahun;

        // Constructor 1: tanpa parameter
        public Mobil() {
            merk = "Belum diisi";
            warna = "Belum diisi";
            tahun = 0;
        }

        // Constructor 2: 1 parameter (merk saja)
        public Mobil(String merk) {
            this.merk = merk;
            warna = "Belum diisi";
            tahun = 0;
        }

        // Constructor 3: 3 parameter (semua atribut)
        public Mobil(String merk, String warna, int tahun) {
            this.merk = merk;
            this.warna = warna;
            this.tahun = tahun;
        }

        // Method menampilkan spesifikasi mobil
        public void tampilkanSpesifikasi() {
            System.out.println("=== SPESIFIKASI MOBIL ===");
            System.out.println("Merk  : " + merk);
            System.out.println("Warna : " + warna);
            System.out.println("Tahun : " + tahun);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Object 1: constructor tanpa parameter
        Mobil mobil1 = new Mobil();

        // Object 2: constructor dengan 1 parameter
        Mobil mobil2 = new Mobil("Toyota");

        // Object 3: constructor dengan 3 parameter
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

        // Menampilkan spesifikasi masing-masing mobil
        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}
