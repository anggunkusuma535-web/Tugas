/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlatMusikPT12;

/**
 *
 * @author ANGGUN
 */
public class AlatMusik {
    
    // Method dasar yang akan di-override di kelas turunan
    public void mainkan() {
        System.out.println("Memainkan alat musik umum...");
    }

    // Variabel untuk menyimpan jenis alat musik
    public String jenis;
    
    public AlatMusik(String jenis) {
        this.jenis = jenis;
    }
}
