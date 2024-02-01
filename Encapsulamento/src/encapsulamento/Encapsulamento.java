/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulamento;

/**
 *
 * @author User
 */
public class Encapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.menosVolume();
        c.play();
        
        c.abrirMenu();
    }
    
}
