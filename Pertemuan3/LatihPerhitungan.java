package Pertemuan3;

public class LatihPerhitungan {
    public static void main(String[] args) {
        //deklarasi dan inisialisasi variabel saldoawal
        int saldoAwal =  1000000;
        //deklarasi dan inisialisasi variabel setoran
        int setoran = 500000;
        //deklarasi dan inisialisasi variabel penarikan
        int penarikan = 250000;

        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal              : " + saldoAwal);
        System.out.println("Setoran                 : " + setoran);
        //Menambahkan setoran ke saldoawal
        saldoAwal += setoran;
        //Menampilkan saldo setelah menambah setoran
        System.out.println("Saldo Setelah Setor     : " + saldoAwal );
        //Menampilkan penarikan
        System.out.println("Penarikan               : " + penarikan);
        //Mengurangi saldo dgn adanya penarikan
        saldoAwal -= penarikan;
        //Menampilkan saldo akhir
        System.out.println("Saldo Akhir             : " + saldoAwal);
    }
}

/*
Nama : Oktavia Namu Erdita
NIM : D1041241072
Jumat, 13 Februari 2026
*/