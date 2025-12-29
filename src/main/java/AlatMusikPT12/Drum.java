/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlatMusikPT12;

/**
 *
 * @author ANGGUN
 */
public class Drum extends AlatMusik {
    public Drum() {
        super("Drum");
    }
    
    @Override
    public void mainkan() {
        System.out.println(jenis + " dimainkan dengan memukul snare, tom, dan simbal untuk menciptakan ritme.");
    }
}
