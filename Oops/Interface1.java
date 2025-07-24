package Oops;

interface Animal {
    int eyes = 2;// final and static

    void walk();

}
//Multiple inheritance
interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walked on 4 legs");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
