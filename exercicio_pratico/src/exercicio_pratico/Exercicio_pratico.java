/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_pratico;

/**
 *
 * @author User
 */
public class Exercicio_pratico {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        p[0] = new Pessoa("Edson", 20, "Masculino");
        p[1] = new Pessoa("Gabriel", 21, "Masculino");
        p[2] = new Pessoa("Tamires", 20, "Feminino");
        
        Livro l[] = new Livro[3];
        l[0] = new Livro("Senhor dos Anéis", "J. R. R. Tolkien", 300, p[0]);
        l[1] = new Livro("O Hobbit", "J. R. R. Tolkien", 350, p[2]);
        l[1].abrir();
        l[1].fechar();
        l[1].folhear(20);
        l[1].detalhes();
    }
    
}
