package model;

class Animal {
    private int age;
    private int weight;
    public void running(){
        System.out.println("Animal is running");
    };
    public void eating(){
        System.out.println("Animal is eating");
    };

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Felidae extends Animal {

    public Felidae(int age, int weight) {
        super(age, weight);
    }
    public void sound()
    {
        System.out.println("meowing meowing");
    }
}
class tiger extends Felidae{

    public tiger(int age, int weight) {
        super(age, weight);
    }
}
public class Main {
    public static void main(String[] args) {
        tiger obj = new tiger(25,25);
        obj.sound();
    }
}
