/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenca;

/**
 *
 * @author User
 */
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(String name, int idade, String sexo, String especialidade) {
        super(name, idade, sexo);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberAumento(float aumento) {
        this.setSalario(this.getSalario() + aumento);
    }
}


