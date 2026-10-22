import java.util.Scanner;

public class TugasBioskop26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalHargaPenjualan = 0;
        int jumlahTiket;

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        System.out.println("(Ketik 0 untuk mengakhiri transaksi harian)");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Transaksi harian selesai.");
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan angka positif.");
                continue;
            }

            double totalHargaTransaksi = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalHargaTransaksi -= (totalHargaTransaksi * diskon);
            
            totalTiketTerjual += jumlahTiket;
            totalHargaPenjualan += totalHargaTransaksi;

            System.out.println("Total bayar transaksi ini: Rp " + totalHargaTransaksi);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n=== REKAP PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual + " tiket");
        System.out.println("Total pendapatan hari ini: Rp " + totalHargaPenjualan);
    }
}