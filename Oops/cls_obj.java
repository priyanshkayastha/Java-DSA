package Oops;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non-para constructor

    // Student() {
    // System.out.println("constructor called");
    // }

    // parametrized
    // Student(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }

    // copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}

public class cls_obj {
    public static void main(String[] args) {
        // Pen pen1=new Pen();
        // pen1.color="blue";
        // pen1.type="gel";

        // Pen pen2=new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";

        // pen1.write();
        // pen1.printColor();

        // pen2.printColor();

        // Student s1 = new Student("Aman", 24);
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 17;

        Student s2 = new Student(s1);

        s2.printInfo();

    }
}