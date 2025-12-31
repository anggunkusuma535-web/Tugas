/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlatMusikPT12;

/**
 *
 * @author ANGGUN
 */
public class Trumpet extends AlatMusik {
    public Trumpet() {
        super("Trumpet");
    }
    
    @Override
    public void mainkan() {
        System.out.println(jenis + " dimainkan dengan meniup mouthpiece dan menekan valve, menghasilkan suara brass yang nyaring.");
    }
}
