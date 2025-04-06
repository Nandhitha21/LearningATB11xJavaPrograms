package Task_Java_Program.Task19_Encapsulation.Inheritance;

public class SIngle_Inheritance {
    public static void main(String[] args) {
        Developer d1 = new Developer();
        d1.work();
        d1.code();
    }
}

class Employee{
    void work(){
        System.out.println("Employee working");
    }

}
class Developer extends Employee{
    void code(){
        System.out.println("Developer is coding");
    }
}