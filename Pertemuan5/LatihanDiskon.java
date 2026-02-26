package Pertemuan5;

public class LatihanDiskon {
     public static void main(String[] args) {

        double totalBelanja = 750000;
        double diskon = 0;
        double hargaAkhir;

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja : Rp " + totalBelanja);

        // Tentukan persentase diskon berdasarkan total belanja
        if (totalBelanja < 100000) {
            diskon = 0; // Tidak dapat diskon
        } else if (totalBelanja >= 100000 && totalBelanja <= 499999) {
            diskon = 0.05; // Diskon 5%
        } else if (totalBelanja >= 500000 && totalBelanja <= 999999) {
            diskon = 0.10; // Diskon 10%
        } else {
            diskon = 0.15; // Diskon 15% untuk belanja ≥ 1.000.000
        }

        // Hitung jumlah potongan harga
        double jumlahDiskon = totalBelanja * diskon;

        // Hitung harga setelah dikurangi diskon
        hargaAkhir = totalBelanja - jumlahDiskon;

        // Tampilkan hasil akhir
        System.out.println("Diskon (" + (diskon * 100) + "%) : Rp " + jumlahDiskon);
        System.out.println("Harga Akhir : Rp " + hargaAkhir);
        System.out.println("Anda Hemat : Rp " + jumlahDiskon);
    }
}
