/**
 * Java. Level 1. Lesson 6
 *
 * @author Artem Belsky
 * @version dated June 18, 2019
 */

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Maxik", "black", 4);
        Dog dog = new Dog("Pirate", "Brown", 3);
        System.out.print(cat);
        System.out.print(cat.voice());
        System.out.print(dog);
        System.out.print(dog.voice());
    }
}

class Cat extends Animal{
    public Cat(String name, String color, int age) {
        super(name, color, age);
        //this.name = name;
        //this.color = color;
        //this.age = age;
    }

    @Override
    public String voice() {
        return "Meow" + "\n";
    }

}

class Dog extends Animal{
    public Dog(String name, String color, int age) {
        super(name, color, age);
        //this.name = name;
        //this.color = color;
        //this.age = age;
    }

    @Override
    public String voice() {
        return "Huf huf" + "\n";
    }

}

class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String voice() {
        return null + "\n";
    }

    @Override
    public String toString() {
        return name + ", " + color + ", " + age + "\n";
    }


/*
    public void animalInfo(){
        System.out.print("Животное: " + name);
    }

    public void run(){
        System.out.print("Животное побежало");
    }

    public void swim(){
        System.out.print("Животное поплыло");
    }


    public void jump(){
        System.out.print("Животное подпрыгнуло");
    }

 */
}





