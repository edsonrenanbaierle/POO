/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_final;

/**
 *
 * @author User
 */
public abstract class Pessoa {
    protected String name;
    protected int age;
    protected String sex;
    protected int experience;

    public Pessoa(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.experience = 0;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    
    public void ganharExperience() {
        this.setExperience(this.getExperience() + 1);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "name=" + name + ", age=" + age + ", sex=" + sex + ", experience=" + experience + '}';
    }
    
    
}
