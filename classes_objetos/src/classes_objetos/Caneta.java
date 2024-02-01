package classes_objetos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Uma caneta de modelo: " + this.modelo);
        System.out.println("Uma caneta de cor: " + this.cor);
        System.out.println("Uma caneta de ponta: " + this.ponta);
        System.out.println("Uma caneta com carga atual de: " + this.carga + "%");
        System.out.println("A caneta encontra-se tampada? " + this.tampada);
    }
    
    public void rabiscar () {
        if(this.tampada == true) {
            System.out.println("Error caneta tampada!");
        }else {
            System.out.println("Rabiscando...");
        }
    }
    
    protected void tampar() {
        this.tampada= true;
    }
    
    protected void destampar() {
        this.tampada = false;
    }
    
}
