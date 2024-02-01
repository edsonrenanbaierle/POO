/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_final;

/**
 *
 * @author User
 */
public class Vizulizacao {
    private Video filme;
    private Usuario pessoa;

    public Vizulizacao(Video filme, Usuario pessoa) {
        this.filme = filme;
        this.pessoa = pessoa;
        this.pessoa.setTotalAssistido(this.pessoa.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Usuario getPessoa() {
        return pessoa;
    }

    public void setPessoa(Usuario pessoa) {
        this.pessoa = pessoa;
    }
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int avaliacaoVideo) {
        this.filme.setAvaliacao(avaliacaoVideo);
    }
    
    public void avaliar(float avaliacao) {
        int nota;
        if(avaliacao <= 30) {
            nota = 3;
        }else if (avaliacao <= 50){
            nota = 5;
        }else if (avaliacao <= 90) {
            nota = 8;
        }else {
            nota = 10;
        }
        
        this.filme.setAvaliacao(nota);
    }

    @Override
    public String toString() {
        return "Vizulizacao{" + "filme=" + filme.toString() + ", pessoa=" + pessoa.toString() + '}';
    }
    
    
}
