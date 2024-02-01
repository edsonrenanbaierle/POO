/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo_sobrecarga;

/**
 *
 * @author User
 */
public abstract class Animal {
    protected float weight;
    protected int age;
    protected String sex;
    
    public abstract void emitirSom();

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
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

    @Override
    public String toString() {
        return "Animal{" + "weight=" + weight + ", age=" + age + ", sex=" + sex + '}';
    }
    
}
