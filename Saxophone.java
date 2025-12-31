/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlatMusikPT12;

/**
 *
 * @author ANGGUN
 */
public class Saxophone extends AlatMusik {
    public Saxophone() {
        super("Saxophone");
    }
    
    @Override
    public void mainkan() {
        System.out.println(jenis + " dimainkan dengan meniup mouthpiece dan menekan kunci, menghasilkan suara brass yang lembut.");
    }
}
