package Task_Java_Program;

public class Task18_DC_PC {
    public static void main(String[] args) {
        Person1 p1= new Person1();
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.address);
        System.out.println(p1.phone);
        System.out.println(p1.IsMale);

        Person1 p2= new Person1("PC",26,"Second");
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.address);

        Person1 p3= new Person1("CO", 123456);
        System.out.println(p3.name);
        System.out.println(p3.phone);

        p1.eat();

        p2.sleep();

        p3.walk();

        p1.doHome();



    }
}
class Person1 {
    // Attributes| Instance Variables| Member Variables | data members
    String name;
    int age;
    String address;
    long phone;
    boolean IsMale;

    // 1. Default Constructor
    Person1() {
        name = "Default Const";
        age = 1;
        address = "First";
        phone = 94784738l;
        IsMale = false;
    }

    // 2. Parameterized Constructor

    Person1(String name_pc_arg, int age_pc_arg, String address_pc_arg) {
        this.name = name_pc_arg;
        this.age = age_pc_arg;
        this.address = address_pc_arg;

    }

    // 3. Constructor Overloading
    Person1(String name_pc_arg, long phone_pc_arg) {
        this.name = name_pc_arg;
        this.phone = phone_pc_arg;
    }


    // 4. Methods

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    void walk() {
        System.out.println(this.name + " is walking");
    }

    void doHome() {
        System.out.println(this.name + " Iam doing Homework");
    }
}