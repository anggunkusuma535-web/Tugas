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

public class KonversiSuhu {
    public static void main(String[] args) {
        
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM KONVERSI SUHU CELSIUS KE FAHRENHEIT ===");
        
        // Meminta pengguna memasukkan suhu dalam Celsius
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();
        
        // Menghitung konversi ke Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        // Menampilkan hasil konversi
        System.out.println("\n=== HASIL KONVERSI ===");
        System.out.println("Suhu dalam Celsius   : " + celsius + " °C");
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit + " °F");
        
        input.close();
    }
}
