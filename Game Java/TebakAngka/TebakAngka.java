package game.TebakAngka;

import java.util.Scanner;

public class TebakAngka {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int angkaRandom = (int) (Math.random() * 100); // Menghasilkan angka random antara 0 dan 100
            int tebakan;
            int jumlahTebakan = 0;
            boolean tebakanBenar = false;

            System.out.println("Selamat datang di Game Tebak Angka!");
            System.out.println("Silakan tebak angka antara 0 dan 100.");

            while (!tebakanBenar) {
                  System.out.print("Masukkan tebakan Anda: ");
                  tebakan = input.nextInt();
                  jumlahTebakan++;

                  if (tebakan == angkaRandom) {
                        tebakanBenar = true;
                        System.out.println("Selamat! Anda menebak angka dengan benar setelah " + jumlahTebakan
                                    + " kali tebakan.");
                  } else if (tebakan < angkaRandom) {
                        System.out.println("Tebakan Anda terlalu rendah. Coba lagi.");
                  } else {
                        System.out.println("Tebakan Anda terlalu tinggi. Coba lagi.");
                  }
            }

            input.close();
      }
}
