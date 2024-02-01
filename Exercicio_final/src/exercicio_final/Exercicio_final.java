/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_final;

/**
 *
 * @author User
 */
public class Exercicio_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v1 = new Video("Batman vs Superman!");
        
        Usuario u1 = new Usuario("Edson", 20, "Masculino", "Edi");
        
        Vizulizacao vi1 = new Vizulizacao(v1, u1);
        vi1.avaliar();
        vi1.toString();
        
        System.out.println(v1.toString());
        System.out.println(u1.toString());
    }
    
}
