package ex_25_OOPS_Abstraction_Interface;

public class Lab180_Multiple_Inheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.money();
    }
}


interface Mother{
    void money();
}
interface Father{
    void money();
}

class Child implements Mother,Father{


    @Override
    public void money() {
        System.out.println("Child Money!");
    }
}