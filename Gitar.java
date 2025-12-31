/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlatMusikPT12;

/**
 *
 * @author ANGGUN
 */
public class Gitar extends AlatMusik {
    public Gitar() {
        super("Gitar");
    }
    
    @Override
    public void mainkan() {
        System.out.println(jenis + " dimainkan dengan memetik senar, cocok untuk akord dan melodi.");
    }
}
