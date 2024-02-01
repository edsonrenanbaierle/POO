/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenca;

/**
 *
 * @author User
 */
public class Funcionario extends Pessoa{
    private String setor;
    private String trabalhando;

    public Funcionario(String name, int idade, String sexo) {
        super(name, idade, sexo);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public void mudarTrabalho(String novoTrabalho) {
        this.setTrabalhando(novoTrabalho);
    }
}
