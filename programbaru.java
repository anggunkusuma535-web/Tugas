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

public class programbaru {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Membaca input string
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        // Membaca input integer
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        // Membaca input double
        System.out.print("Masukkan tinggi badan Anda (cm): ");
        double tinggi = input.nextDouble();

        // Menampilkan hasil input
        System.out.println("\n=== Data Anda ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");

        // Menutup Scanner agar tidak terjadi kebocoran memori
        input.close();
    }
}


