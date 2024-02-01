/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package encapsulamento;

/**
 *
 * @author User
 */
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean tocando;
    private boolean ligado;

    public ControleRemoto() {
        this.volume = 50;
        this.tocando = false;
        this.ligado = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        
        System.out.println("Encontrase ligado: " + this.getLigado());
        System.out.print("Volume: " + this.getVolume() + "\n");
        for(int x = 0; x <= this.getVolume(); x+=10){
            System.out.print("| ");
        }
        System.out.println("");
        System.out.println("Esta tocando: " + this.getTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() && this.getVolume() < 100) {
            this.setVolume(this.getVolume() + 5);
        }else {
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 5);
        }else {
            System.out.println("Impossivel diminuir o volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
    
    
    
}
