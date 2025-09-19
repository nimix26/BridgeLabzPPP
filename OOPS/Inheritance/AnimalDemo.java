package BridgeLabzPPP.Inheritance;

// File: AnimalDemo.java
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) { super(name, age); }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Tweet Tweet!");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy", 3),
            new Cat("Luna", 2),
            new Bird("Kiwi", 1)
        };
        for (Animal a : animals) {
            a.showInfo();
            a.makeSound(); // polymorphism in action
            System.out.println();
        }
    }
}

