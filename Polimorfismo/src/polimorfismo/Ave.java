/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author User
 */
public class Ave extends Animal{
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    public void fazerNinho(){
        System.out.println("Fazendo ninho;;;");
    }

    @Override
    public void locomover() {
        System.out.println("Voando..");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando-se");
    }

    @Override
    public void emitirSon() {
        System.out.println("Som de ave");
    }
}
