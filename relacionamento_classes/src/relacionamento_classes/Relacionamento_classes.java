/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionamento_classes;

/**
 *
 * @author User
 */
public class Relacionamento_classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[7];
        
        l[0] = new Lutador("Pretty Boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("PutScript", "Brasil", 29, 1.69f,57.8f, 14, 2, 3);
        l[3] = new Lutador("SnapShadow", "EUA", 35, 1.65f,80.9f, 12, 2, 1);
        l[4] = new Lutador("Dead Code", "Australia", 28, 1.93f,81.6f, 13, 0, 2);
        l[5] = new Lutador("UFOCobol", "Brasil", 37, 1.70f,119.3f, 5, 4, 3);
        l[6] = new Lutador("Nerdaart", "EUA", 30, 1.81f,105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[4]);
        UEC01.lutar();
    }
    
}
