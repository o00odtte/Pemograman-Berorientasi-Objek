package Pertemuan6;

public class LatihanHariBulan {
     public static void main(String[] args) {

        // Month bisa diganti 1-12 buat ngetes bulan lain
        int month = 4;

        String namaBulan = "";
        int jumlahHari = 0;

        System.out.println("=== JUMLAH HARI DALAM BULAN ===");

        // Switch dipakai karena pilihan bulannya (1-12)
        // Pakai FALL THROUGH biar case yang harinya sama digabung
        switch (month) {

            // =========================
            // BULAN 31 HARI (fall through)
            // =========================
            case 1:
                namaBulan = "Januari";
            case 3:
                if (month == 3) namaBulan = "Maret";
            case 5:
                if (month == 5) namaBulan = "Mei";
            case 7:
                if (month == 7) namaBulan = "Juli";
            case 8:
                if (month == 8) namaBulan = "Agustus";
            case 10:
                if (month == 10) namaBulan = "Oktober";
            case 12:
                if (month == 12) namaBulan = "Desember";
                jumlahHari = 31;
                break;

            // =========================
            // BULAN 30 HARI (fall through)
            // =========================
            case 4:
                namaBulan = "April";
            case 6:
                if (month == 6) namaBulan = "Juni";
            case 9:
                if (month == 9) namaBulan = "September";
            case 11:
                if (month == 11) namaBulan = "November";
                jumlahHari = 30;
                break;

            // =========================
            // FEBRUARI
            // =========================
            case 2:
                namaBulan = "Februari";
                jumlahHari = 28; // sesuai soal, abaikan kabisat
                break;

            // =========================
            // VALIDASI
            // =========================
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                return;
        }

        // Output akhir
        System.out.println("Bulan : " + namaBulan + " (bulan ke-" + month + ")");
        System.out.println("Jumlah hari: " + jumlahHari + " hari");
    }
}
