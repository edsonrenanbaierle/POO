/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes_objetos;

/**
 *
 * @author User
 */
public class Classes_objetos {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.carga = 80;
        // c1.tampada = false;
        // c1.ponta = 0.5;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        
    }
    
}
