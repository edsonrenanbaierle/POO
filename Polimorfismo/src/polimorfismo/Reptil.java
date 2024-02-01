/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author User
 */
public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando-se....");
    }

    @Override
    public void emitirSon() {
        System.out.println("Som de reptil!");
    }
    
    
}
