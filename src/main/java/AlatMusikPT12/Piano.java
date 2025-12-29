/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlatMusikPT12;

/**
 *
 * @author ANGGUN
 */
public class Piano extends AlatMusik {
    public Piano() {
        super("Piano"); // Memanggil constructor kelas induk
    }
    
    @Override
    public void mainkan() {
        System.out.println(jenis + " dimainkan dengan menekan tuts dan menghasilkan melodi.");
    }
}
