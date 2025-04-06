package Task_Java_Program.Task19_Encapsulation.Question4;

public class Method_Overriding {
    public static void main(String[] args) {
        Employee4 e1 = new Employee4();
        e1.work();

        System.out.println("------");

        Developer4 d1 = new Developer4();
        d1.work();
    }
}
class Employee4 {
    void work() {
        System.out.println("Employee is working...");
    }
}

// Child class
class Developer4 extends Employee4 {
    @Override
    void work() {
        System.out.println("Developer is writing code...");
    }
}
