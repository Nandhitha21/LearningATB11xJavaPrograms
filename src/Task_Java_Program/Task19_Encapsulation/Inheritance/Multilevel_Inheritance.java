package Task_Java_Program.Task19_Encapsulation.Inheritance;

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        FrontEndDeveloper f2 = new FrontEndDeveloper();
        f2.uIdesign();
        f2.code();
        f2.work();
    }
}
class Employee1{
    void work(){
        System.out.println("Employee working");
    }

}
class Developer1 extends Employee1{
    void code(){
        System.out.println("Developer is coding");
    }
}
class FrontEndDeveloper extends Developer1{
    void uIdesign(){
        System.out.println("FrontEnd Developer designing UI");
    }
}