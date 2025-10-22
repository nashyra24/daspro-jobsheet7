import java.util.Scanner;

public class SiakadWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Menginisialisasi variabel
        double nilai; 
        int i = 1, jml;

        System.out.print("Masukkan jumlah mahasiswa:"  );
        jml = sc.nextInt();

        //Perulangan while
        while (i <= jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

           //Validasi input nilai
           if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid! Masukkan nilai antara 0 - 100.\n");
            continue; // Lewatkan iterasi ini dan lanjutkan ke iterasi berikutnya
           }
             
           //Cek nilai tertinggi dan terendah
           if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahasiswa ke-" + i + " adalah A");
              } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B+");
              } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B");
              } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C+");
              } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C");
              } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah D");
              } else {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah E");
              }
              i++; 
           }
        sc.close();
    }
}