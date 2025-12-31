/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program;

/**
 *
 * @author ANGGUN
 */
import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM KASIR SEDERHANA ===");
        
        // Input data dari pengguna
        System.out.print("Masukkan nama barang      : ");
        String namaBarang = input.nextLine();
        
        System.out.print("Masukkan harga satuan (Rp): ");
        double hargaSatuan = input.nextDouble();
        
        System.out.print("Masukkan jumlah beli      : ");
        int jumlahBeli = input.nextInt();
        
        // Menghitung total sebelum diskon
        double totalBayar = hargaSatuan * jumlahBeli;
        double diskon = 0;
        
        // Menentukan diskon (jika total > 100.000 maka diskon 10%)
        if (totalBayar > 100000) {
            diskon = totalBayar * 0.10;
            totalBayar -= diskon; // totalBayar dikurangi diskon
        }
        
        // Menampilkan hasil
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Harga Satuan  : Rp" + hargaSatuan);
        System.out.println("Jumlah Beli   : " + jumlahBeli);
        
        if (diskon > 0) {
            System.out.println("Diskon (10%)  : Rp" + diskon);
        } else {
            System.out.println("Diskon        : Tidak ada diskon");
        }
        
        System.out.println("Total Bayar   : Rp" + totalBayar);
        System.out.println("===============================");
        
        // Menutup Scanner
        input.close();
    }
}

