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

public class luaspersegipanjang {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PROGRAM MENGHITUNG LUAS PERSEGI PANJANG ===");
        
        System.out.print("Masukkan Panjang: ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukkan Lebar: ");
        double lebar = input.nextDouble();
        
        double luas = panjang * lebar;
        
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar  : " + lebar);
        System.out.println("Luas Persegi Panjang = " + luas);
        
        input.close();
    }
}
