/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_final;

/**
 *
 * @author User
 */
public class Usuario extends Pessoa{
    private String login;
    private int totalAssistido;

    public Usuario(String name, int age, String sex, String login) {
        super(name, age, sex);
        this.totalAssistido = 0;
        this.login = login;
    }

    public String isLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
    
    public void viuMaisUm(){
        this.setTotalAssistido(this.getTotalAssistido() + 1);
    }
}
