package Oops;

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

// Single level
class Triangle extends Shape {

    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

// MultiLevel
// class EquilateralTriangle extends Triangle {
// public void area(int l, int h) {
// System.out.println(1 / 2 * l * h);
// }
// }

// Hierarchical

class EquilateralTriangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

// Hybrid:- all types of inheritance can see one program

// Multiple inheritance:-Uses Interface

public class singleInheri {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area(5);
    }
}
