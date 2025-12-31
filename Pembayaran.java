/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANGGUN
 */
import java.util.Scanner;
public class Pembayaran {
    
  public static void main(String[] args) { 
  Scanner baca = new Scanner(System.in); 
 System.out.println("===== PROGRAM PEMBAYARAN ====="); 
 // Barang 1: Indomie 
 System.out.print("Masukkan jumlah Indomie (pcs): "); 
 int jmlIndomie = baca.nextInt(); 
 System.out.print("Masukkan harga Indomie per pcs: "); 
 double hrgIndomie = baca.nextDouble(); 
 // Barang 2: Telor 
 System.out.print("Masukkan jumlah Telor (pcs): "); 
 int jmlTelor = baca.nextInt(); 
 System.out.print("Masukkan harga Telor per pcs: "); 
 double hrgTelor = baca.nextDouble(); 
 // Barang 3: Shampoo 
 System.out.print("Masukkan jumlah Shampoo 800ml (pcs): ");  int jmlShampoo = baca.nextInt(); 
 System.out.print("Masukkan harga Shampoo 800ml per pcs: ");  double hrgShampoo = baca.nextDouble(); 
 // Barang 4: Keripik Singkong 
 System.out.print("Masukkan jumlah Keripik Singkong (pcs): ");  int jmlKeripik = baca.nextInt(); 
 System.out.print("Masukkan harga Keripik Singkong per pcs: ");  double hrgKeripik = baca.nextDouble(); 
 // Hitung total per barang 
 double totalIndomie = jmlIndomie * hrgIndomie; 
 double totalTelor = jmlTelor * hrgTelor; 
 double totalShampoo = jmlShampoo * hrgShampoo; 
 double totalKeripik = jmlKeripik * hrgKeripik; 
 // Hitung total semua 
 double totalBayar = totalIndomie + totalTelor + totalShampoo + totalKeripik;  // Cetak nota
 System.out.println("\n===== NOTA PEMBAYARAN =====");  System.out.println("Indomie (" + jmlIndomie + " pcs) = Rp" + totalIndomie);  System.out.println("Telor (" + jmlTelor + " pcs) = Rp" + totalTelor);  System.out.println("Shampoo 800ml (" + jmlShampoo + " pcs) = Rp" + totalShampoo);  System.out.println("Keripik Singkong (" + jmlKeripik + " pcs) = Rp" + totalKeripik);  System.out.println("----------------------------"); 
 System.out.println("TOTAL BAYAR = Rp" + totalBayar); 
 System.out.println("============================"); 
 baca.close(); 
 } 
  
}
 
 
