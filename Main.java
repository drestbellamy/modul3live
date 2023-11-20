package Tugas3;

import java.util.Scanner;

public class Main {
    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang
        System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

         // Menghitung luas persegi panjang
                 double luas = panjang * lebar;

                   // Menampilkan hasil
                           System.out.println("Luas persegi panjang: " + luas);
                       }
                   }

