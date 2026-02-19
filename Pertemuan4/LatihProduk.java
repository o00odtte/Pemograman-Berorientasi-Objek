package Pertemuan4;

public class LatihProduk {
    public static void main(String[] args) {
        String namaProduk = "Laptop Asus";
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean statusTersedia = true;
        double nominalPajak = 0.11;
        int totalNilai = hargaSatuan * jumlahStok;
        double pajak = totalNilai * nominalPajak;

        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Satuan: Rp " + hargaSatuan);
        System.out.println("Jumlah Stok: " + jumlahStok);
        System.out.println("Status Tersedia: " + statusTersedia);
        System.out.println("---");
        System.out.println("Total Nilai Stok: " + totalNilai);
        System.out.println("Pajak (11%): " + (int)pajak);
    }
}

/*
Nama : Oktavia Namu Erdita
NIM : D1041241072
Matakuliah : PBO B
*/