/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca_2;

/**
 *
 * @author User
 */
public class Tecnico extends Aluno{
    private String regitroProfissional;

    public String getRegitroProfissional() {
        return regitroProfissional;
    }

    public void setRegitroProfissional(String regitroProfissional) {
        this.regitroProfissional = regitroProfissional;
    }
    
    public void praticar() {
        System.out.println("Praticando...");
    }
}
