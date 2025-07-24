package Oops;

abstract class Animal {
    abstract void walk();
    Animal(){
        System.out.println("You are creating new animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("Created a horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstra {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        //Run time error
        // Animal animal=new Animal();
        // animal.walk();
    }
}
