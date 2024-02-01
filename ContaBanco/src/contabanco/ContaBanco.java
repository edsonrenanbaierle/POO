/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

/**
 *
 * @author User
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.abrirConta(1, "CP", "Edson");
        
        
        Conta p2 = new Conta();
        p2.abrirConta(2, "CC", "Caua");
      
        
        p1.despositar(100);
        
        p2.despositar(500);
        p2.sacar(1000);
        
        p1.fecharConta();
        
        p1.status();
        p2.status();
    }
    
}
