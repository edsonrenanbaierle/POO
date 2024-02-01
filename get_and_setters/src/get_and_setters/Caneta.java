/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package get_and_setters;

/**
 *
 * @author User
 */
public class Caneta {
    private float ponta;
    public String modelo;
    private String color;
    private boolean tampada;

    public Caneta(float ponta, String modelo, String color) {
        this.ponta = ponta;
        this.modelo = modelo;
        this.color = color;
        this.tampada = true;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    public void status() {
        System.out.println("Modelo da caneta é: " + this.modelo);
        System.out.println("Ponta da caneta é: " + this.ponta);
        System.out.println("Cor: " + this.color);
        System.out.println("Tampada: " + this.tampada);
    }
        
}
