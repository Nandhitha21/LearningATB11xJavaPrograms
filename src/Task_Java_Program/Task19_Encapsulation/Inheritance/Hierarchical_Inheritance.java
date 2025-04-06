package Task_Java_Program.Task19_Encapsulation.Inheritance;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.work();  // from Employee
        dev.code();  // from Developer

        System.out.println("-----------");

        Tester tester = new Tester();
        tester.work();  // from Employee
        tester.test();  // from Tester

    }
}
class Employee3{
    void work(){
        System.out.println("Employee is working");
    }
}
class Developer3 extends Employee3{
    void code(){
        System.out.println("Developer is coding");
    }
}
class Tester extends Employee3{
    void test(){
        System.out.println("Testing the Program");
    }
}