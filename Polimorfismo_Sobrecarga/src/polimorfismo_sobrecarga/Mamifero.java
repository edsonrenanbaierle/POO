/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo_sobrecarga;

/**
 *
 * @author User
 */
public class Mamifero extends Animal{
    private String corDoPelo;
   

    @Override
    public void emitirSom() {
        System.out.println("Som mamifero");
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
}
