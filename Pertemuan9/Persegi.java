package Pertemuan9;

public class Persegi {
    // atribut
    private int sisi;
    private int luas;
    private int keliling;

    // method menghitung luas
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    // method menghitung keliling
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    // method menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi : " + sisi + " cm");
        System.out.println("Luas : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }

    // method main
    public static void main(String[] args) {

        // membuat object
        Persegi p1 = new Persegi();

        // isi nilai sisi
        p1.sisi = 5;

        // panggil method
        p1.hitungLuas();
        p1.hitungKeliling();
        p1.tampilkanHasil();
    }
}
