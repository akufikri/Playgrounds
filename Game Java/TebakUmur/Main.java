package game.TebakUmur;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("*********************");
            System.out.println("=== Kalkulator Umur ===");
            System.out.println("*********************\n");

            System.out.print("Masukkan tahun lahir Anda: ");
            int tahunLahir = input.nextInt();

            int tahunSekarang = LocalDate.now().getYear();
            int umur = tahunSekarang - tahunLahir;

            System.out.println("\n************************");
            System.out.println("===== Hasil Perhitungan =====");
            System.out.println("************************");
            System.out.println("Tahun lahir Anda: " + tahunLahir);
            System.out.println("Tahun sekarang: " + tahunSekarang);
            System.out.println("Umur Anda adalah: " + umur + " tahun.\n");

            System.out.println("Terima kasih telah menggunakan Kalkulator Umur!");
            System.out.println("************************");
            input.close();
      }
}
