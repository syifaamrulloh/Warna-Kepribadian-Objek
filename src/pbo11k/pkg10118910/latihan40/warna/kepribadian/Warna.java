/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan40.warna.kepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh 
 * Kelas:IF11K 
 * NIM  :10118910
 *
 * Description : Program kepribadian dengan warna favorit
 */
public class Warna {

    private String pilih,nama;
    
    public static void main(String[] args) {
      //inisialisasi Objek
      Warna wrn = new Warna();
      Kepribadian kbr= new Kepribadian();
      kbr.showk();
      Scanner input  = new Scanner(System.in);
      System.out.print("\nPILIH WARNA FAVORITMU : ");
        wrn.pilih = input.next().toUpperCase();
        System.out.print("NAMA KAMU : ");
        wrn.nama = input.next().toUpperCase();
        if((wrn.pilih.equals("MERAH")) || (wrn.pilih.equals("HIJAU")) || (wrn.pilih.equals("KUNING")) || (wrn.pilih.equals("BIRU")) || (wrn.pilih.equals("UNGU"))){
            System.out.println("\n========== HASIL TEST KEPRIBADIAN "+wrn.nama+" ==========");
            kbr.view(wrn.pilih);
        } else{
            System.out.println("\n========== HASIL TEST KEPRIBADIAN "+wrn.nama+" ==========");
            System.out.println("Oops... Belum teridentifikasi");
        }
      
    }
    
}
