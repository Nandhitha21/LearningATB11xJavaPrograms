package ex_24_OOPS_Abstraction;

public class Lab177_Abstraction_Real {
    // Abstract is the incomplete class so can't create objects
}

abstract class Employee{

    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("DC");
    }

    Employee(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }


}

class C1 extends Employee{

    @Override
    double computePay() {
        return 0;
    }
}