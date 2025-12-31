/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANGGUN
 */
import java.util.Scanner; 
public class Pajak {
    public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
// Deklarasi variabel 
String[] namaProduk = new String[5]; 
double[] hargaProduk = new double[5]; 
int[] jumlahProduk = new int[5]; 
double totalBelanja = 0; 
double diskon = 0; 
double pajak; 
double totalBayar; 
System.out.println("=== PROGRAM PEMBAYARAN TOKO ==="); System.out.println(); 
// Input data produk 
for (int i = 0; i < 5; i++) { 
System.out.print("Masukkan nama produk ke-" + (i+1) + " : "); namaProduk[i] = input.nextLine(); 
System.out.print("Masukkan harga satuan " + namaProduk[i] + " : "); hargaProduk[i] = input.nextDouble(); 
System.out.print("Masukkan jumlah " + namaProduk[i] + " : "); jumlahProduk[i] = input.nextInt(); 
input.nextLine(); // bersihkan buffer 
double subtotal = hargaProduk[i] * jumlahProduk[i]; 
totalBelanja += subtotal; 
System.out.println("Subtotal " + namaProduk[i] + " = Rp " + subtotal); System.out.println("-----------------------------"); 
} 
// Hitung diskon berdasarkan total belanja 
if (totalBelanja >= 500000) { 
diskon = totalBelanja * 0.1; // 10% 
} else if (totalBelanja >= 200000) { 
diskon = totalBelanja * 0.05; // 5% 
} else { 
diskon = 0; 
} 
// Pajak 11% 
pajak = (totalBelanja - diskon) * 0.11;
// Total bayar akhir 
totalBayar = totalBelanja - diskon + pajak; 
// Output hasil 
System.out.println("\n=== RINCIAN PEMBAYARAN ==="); 
for (int i = 0; i < 5; i++) { 
System.out.println(namaProduk[i] + " (" + jumlahProduk[i] + " pcs) = Rp " + (hargaProduk[i] * jumlahProduk[i])); 
} 
System.out.println("-----------------------------"); 
System.out.println("Total Belanja : Rp " + totalBelanja); 
System.out.println("Diskon : Rp " + diskon); 
System.out.println("Pajak (11%) : Rp " + pajak); 
System.out.println("-----------------------------"); 
System.out.println("Total Bayar : Rp " + totalBayar); 
System.out.println("============================="); 
System.out.println("Terima kasih telah berbelanja!"); 
input.close(); 
} 
}

