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

public class RataRataNilai {
    public static void main(String[] args) {
        
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM MENGHITUNG RATA-RATA NILAI TUGAS ===");
        
        // Deklarasi variabel untuk menyimpan nilai total
        double total = 0;
        double nilai; // variabel sementara untuk setiap input
        
        // Menginput 5 nilai menggunakan perulangan for
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai = input.nextDouble(); // membaca input dari pengguna
            total += nilai; // menambahkan ke total
        }
        
        // Menghitung rata-rata
        double rataRata = total / 5;
        
        // Menampilkan hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total nilai  : " + total);
        System.out.println("Rata-rata    : " + rataRata);
        
        // Menutup Scanner
        input.close();
    }
}


