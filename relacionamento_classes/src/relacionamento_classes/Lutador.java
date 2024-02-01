/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamento_classes;


public class Lutador {
    private String name; 
    private String nationalaty;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int wins;
    private int loses; 
    private int empaths;

    public Lutador(String name, String nationalaty, int age, float height, float weightFighter, int wins, int loses, int empaths) {
        this.name = name;
        this.nationalaty = nationalaty;
        this.age = age;
        this.height = height;
        this.setWeight(weightFighter);
        this.wins = wins;
        this.loses = loses;
        this.empaths = empaths;
    }

       

    public int getEmpaths() {
        return empaths;
    }

    public void setEmpaths(int empaths) {
        this.empaths = empaths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalaty() {
        return nationalaty;
    }

    public void setNationalaty(String nationalaty) {
        this.nationalaty = nationalaty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        if(this.weight <= 52.2) {
            System.out.println("Invalido");
        }else if(this.weight <= 70.3){
            this.category = "Leve";
        }else if(this.weight <= 83.9){
            this.category = "Médio";
        }else if(this.weight <= 120.2){
            this.category = "Pesado";
        }else {
            System.out.println("Invalido");
        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }
    
    public void apresentar() {
        System.out.println("----------------------------------");
        System.out.println("Nome:  " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Nacionalidade: " + this.nationalaty);
        System.out.println("Altura: " + this.height);
        System.out.println("Peso: " + this.weight);
        System.out.println("Categoria: " + this.category);
        System.out.println("Vitorias: " + this.wins);
        System.out.println("Derrotas: " + this.loses);
        System.out.println("Empates: " + this.empaths);
    }
    
    public void status() {
        System.out.println("-----------------------------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Peso de: " + this.weight);
        System.out.println("Com " + this.wins + " Vitórias");
        System.out.println("Com " + this.loses + " Derrotas");
        System.out.println("Alem de " + this.empaths + " Empates");
    }
    
    public void ganharLuta(){
        this.setWins(this.getWins() + 1);
    }
    
    public void perderLuta() {
        this.setLoses(this.getLoses() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpaths(this.getEmpaths() + 1);
    }
}
