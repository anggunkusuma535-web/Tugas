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

public class FaktorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG FAKTORIAL MENGGUNAKAN WHILE ===");
        System.out.print("Masukkan bilangan N: ");
        int N = input.nextInt();

        // Variabel untuk menyimpan hasil faktorial
        long faktorial = 1;
        int i = N; // inisialisasi penghitung

        // Loop while untuk menghitung faktorial
        while (i > 0) {
            faktorial = faktorial * i; // kalikan hasil sebelumnya dengan i
            i--; // kurangi nilai i
        }

        System.out.println("---------------------------");
        System.out.println("Nilai N = " + N);
        System.out.println("Hasil " + N + "! = " + faktorial);

        input.close();
    }
}

