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

public class CekBilanganGenapGanjil {
    public static void main(String[] args) {
        
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM MENENTUKAN BILANGAN GENAP ATAU GANJIL ===");
        
        // Meminta input dari pengguna
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();
        
        // Menggunakan percabangan if-else
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah GENAP.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah GANJIL.");
        }
        
        // Menutup Scanner
        input.close();
    }
}
