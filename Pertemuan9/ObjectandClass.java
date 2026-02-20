package Pertemuan9;

// Membuat class Mobil 
class Mobil {
    //Atribut / variabel milik class Mobil
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    //Method untuk menambah kecepatan mobil
    public void percepat() {
        kecepatan += 10;
        System.out.println("Kecepatan sekarang : " + kecepatan + " km/jam");
    }

    //Method untuk menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Merk       : " + merk);
        System.out.println("Warna      : " + warna);
        System.out.println("Tahun      : " + tahun);
        System.out.println("Kecepatan  : " + kecepatan);
    }
}

//Class utama yang berisi method main
public class ObjectandClass {
    //Method main = titik awal program Java
    public static void main(String[] args) {
        //Membuat object mobil1 dari class Mobil
        Mobil mobil1 = new Mobil();

         //Mengisi nilai atribut object mobil1
        mobil1.merk = "Honda Civic R";
        mobil1.warna = "Rose Pink";
        mobil1.tahun = 2025;
        mobil1.kecepatan = 0; //kecepatan awal

        //Menjalankan method percepat(menambah kecepatan)
        mobil1.tampilkanInfo();
        mobil1.percepat();
    }
}