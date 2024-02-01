/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exercicio_pratico;

/**
 *
 * @author User
 */
public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int page);
    public abstract void avancarPag();
    public abstract void voltarPag();
}
