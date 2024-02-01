/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_pratico;

/**
 *
 * @author User
 */
public class Livro implements Publicacao{
    private String title;
    private String author;
    private int totPages;
    private int CurrentPage;
    private boolean open;
    private Pessoa reader;

    public Livro(String title, String author, int totPages, Pessoa reader) {
        this.title = title;
        this.author = author;
        this.totPages = totPages;
        this.CurrentPage = 0;
        this.open = false;
        this.reader = reader;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotPages() {
        return totPages;
    }

    public void setTotPages(int totPages) {
        this.totPages = totPages;
    }

    public int getCurrentPage() {
        return CurrentPage;
    }

    public void setCurrentPage(int CurrentPage) {
        this.CurrentPage = CurrentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Pessoa getReader() {
        return reader;
    }

    public void setReader(Pessoa reader) {
        this.reader = reader;
    }
    
    public void detalhes() {
        System.out.println("--------------------------------");
        System.out.println("Informações do livro!");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Total Pages: " + this.totPages);
        System.out.println("Current Page: " + this.CurrentPage);
        System.out.println("Open: " + this.open);
        System.out.println("The person reading: " + this.reader.getName());
    }

    @Override
    public void abrir() {
        this.setOpen(true);
    }

    @Override
    public void fechar() {
        this.setOpen(false);
    }

    @Override
    public void folhear(int page) {
        if(this.open == true){
            this.CurrentPage = page;
        }else {
            System.out.println("Livro Fechado");
        }
        
    }

    @Override
    public void avancarPag() {
        if(this.open == true){
            this.setCurrentPage(this.getCurrentPage() + 1);
        }else {
            System.out.println("Livro Fechado");
        }
        
    }

    @Override
    public void voltarPag() {
        if(this.open == true){
            this.setCurrentPage(this.getCurrentPage() - 1);
        }else {
            System.out.println("Livro Fechado");
        }
    }
}
