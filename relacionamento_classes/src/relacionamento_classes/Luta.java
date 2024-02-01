/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package relacionamento_classes;
import java.util.Random;

/**
 *
 * @author User
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategory() == l2.getCategory() && l1 != l2){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar() {
        if(this.aprovado) {
            this.desafiante.apresentar();
            this.desafiado.apresentar();
            Random random = new Random();
            int valorAleatorio = random.nextInt(3);
            System.out.println("==========================================");
            switch (valorAleatorio) {
                case 0:
                    System.out.println("EMPATE!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                break;
                case 1:
                    System.out.println(this.desafiado.getName() + " Venceu a luta!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;
                case 2:
                    System.out.println(this.desafiante.getName() + " Venceu a luta!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                break;
            }
        }else {
            System.out.println("Luta não aprovada");
        }
    }
}
