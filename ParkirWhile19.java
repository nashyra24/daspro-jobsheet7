import java.util.Scanner;
public class ParkirWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int tarifPerJam = 3000;
        int jamParkir, totalKendaraan = 0;
        double totalPendapatan = 0;

        System.out.println("====== Program Parkir Kendaraan ======");

        while (true) {
            System.out.print("Masukkan jam parkir kendaraan (0 untuk selesai): ");
            jamParkir = sc.nextInt();

            // Validasi input
            if (jamParkir < 0) {
                System.out.println("Jam parkir tidak valid! Silakan masukkan ulang.\n");
                continue; // ulang input jika negatif
            }

            if (jamParkir == 0) {
                break; // keluar dari perulangan jika input 0
            }

            // Hitung total biaya parkir
            double totalBiaya = jamParkir * tarifPerJam;

            // Tampilkan hasil parkir
            System.out.println("-----------------------------------");
            System.out.println("Jam parkir       : " + jamParkir);
            System.out.println("Tarif per jam    : Rp " + tarifPerJam);
            System.out.println("Total biaya      : Rp " + totalBiaya);
            System.out.println("-----------------------------------\n");

            // Akumulasi total harian
            totalKendaraan++;
            totalPendapatan += totalBiaya;
        }

        // Output akhir
        System.out.println("====== Rekapitulasi Parkir Hari Ini ======");
        System.out.println("Total kendaraan parkir : " + totalKendaraan);
        System.out.println("Total pendapatan       : Rp " + totalPendapatan);
        System.out.println("===========================================");
        System.out.println("Terima kasih telah menggunakan program ini!");

        sc.close();
    }
    
}
