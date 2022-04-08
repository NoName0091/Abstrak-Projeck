/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstark;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Abstark {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		String pilih1;
        int pilih;
        int harga = 0;
        Scanner input = new Scanner(System.in);
        //pemanggilan object
        pesan obj = new pesan();
        System.out.println("SELAMAT DATANG DI CAFE RAKHA FAMILI");

        obj.merk();

        System.out.println("Silahkan pilih");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                obj.soda();
                break;

            case 2:
                obj.airmineral();
                break;
        }
        Scanner input1 = new Scanner(System.in);
        System.out.println("Silahkan pilih minuman");
        pilih1 = input1.nextLine();
        if (pilih1.equals("coca cola")) {
            harga = 8000;

        } else if (pilih1.equals("pepsi")) {
            harga = 5000;

        } else if (pilih1.equals("aqua")) {
            harga = 2000;

        } else if (pilih1.equals("cleo")) {
            harga = 3000;
        }
        System.out.println("===============================");
        System.out.println("Anda memilih minuman " + pilih1);
        System.out.println("Harga yang harus anda bayar adalah " + harga);
        System.out.println("Silahkan tunggu sebentar");
	}
	
}
