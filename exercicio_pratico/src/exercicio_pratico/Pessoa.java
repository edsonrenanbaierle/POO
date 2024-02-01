/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_pratico;

/**
 *
 * @author User
 */
public class Pessoa {
    private String name; 
    private int age;
    private String sex;

    public Pessoa(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int agr) {
        this.age = agr;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public void fazerAniversario() {
        this.setAge(this.getAge() + 1);
    }
    
}
