/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANGGUN
 */
import java.util.Scanner;

public class SegitigaPascal {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan jumlah baris: ");
        int n = input.nextInt();    
        
        for (int i = 0; i < n; i++){
            int nilai = 1; //nilai pertama setiap baris selalu 1
            for (int j = 0; j <= i; j++){
                 // gunakan if untuk menentukan apakah di posisi pertama atau tidak
                 if (j == 0 || j == i) {
                     nilai = 1;
                 } else {
                     //hitung nilai berdasarkan kombinasi pascal
                     nilai = nilai * (i - j + 1) / j;
                 }
                 System.out.print(nilai + "");
               }
                System.out.println();
        }
    }
}
