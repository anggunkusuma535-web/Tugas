/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlatMusikPT12;

/**
 *
 * @author ANGGUN
 */
public class MainProgram {
    public static void main(String[] args) {
        
        System.out.println("=== Demonstrasi Polimorfisme Alat Musik ===");
        
        // Variabel referensi ALATMUSIK dapat menampung objek dari semua subkelas
        AlatMusik[] orkestra = new AlatMusik[6];
        
        // Mengisi array dengan objek subkelas yang berbeda
        orkestra[0] = new Piano();
        orkestra[1] = new Biola();
        orkestra[2] = new Gitar();
        orkestra[3] = new Drum();
        orkestra[4] = new Saxophone();
        orkestra[5] = new Trumpet();
        
        System.out.println("----------------------------------------");
        System.out.println("Orkestra mulai bermain:");
        System.out.println("----------------------------------------");
        
        // Java secara otomatis menentukan (saat runtime) method mana yang tepat 
        // untuk dipanggil berdasarkan jenis objek yang sebenarnya (Polimorfisme)
        for (AlatMusik alat : orkestra) {
            // Kita hanya memanggil 'alat.mainkan()', tetapi hasilnya berbeda-beda
            alat.mainkan();
        }
        
        System.out.println("----------------------------------------");
    }
}
