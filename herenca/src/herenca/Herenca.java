/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenca;

/**
 *
 * @author User
 */
public class Herenca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Edson", 20, "Masculino");
        Aluno p2 = new Aluno("Tamires", 20, "Feminino");
        Funcionario p3 = new Funcionario("Caua", 20, "Masculino");
        Professor p4 = new Professor("Kurt", 57, "Masculino", "Banco de Dados");
        
        
        p2.setCurso("Economia");
        p3.setSetor("Funcionario");
        p4.setSalario(4000f);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
