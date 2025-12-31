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

public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENENTUKAN HURUF MUTU MAHASISWA ===");
        System.out.print("Masukkan nilai akhir (0–100): ");
        int nilai = input.nextInt();

        // Mengecek apakah nilai dalam rentang 0–100
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid! Harus antara 0 sampai 100.");
        } else {
            char hurufMutu;

            if (nilai >= 85 && nilai <= 100) {
                hurufMutu = 'A';
            } else if (nilai >= 70 && nilai <= 84) {
                hurufMutu = 'B';
            } else if (nilai >= 55 && nilai <= 69) {
                hurufMutu = 'C';
            } else if (nilai >= 40 && nilai <= 54) {
                hurufMutu = 'D';
            } else { // nilai < 40
                hurufMutu = 'E';
            }

            System.out.println("-----------------------------");
            System.out.println("Nilai akhir   : " + nilai);
            System.out.println("Huruf mutu    : " + hurufMutu);
        }

        input.close();
    }
}
