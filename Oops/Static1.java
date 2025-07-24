package Oops;

class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newSchool";
    }
}

public class Static1 {
    public static void main(String[] args) {
        Student.school = "HBK";
        Student student1 = new Student();
        student1.name = "Jay";
        System.out.println(student1.school);
    }
}
