package ex_17_OOPS;

public class Lab149_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2;
        new Cat();

        c1.running();
        System.out.println(new Cat().name);


    }
}
class Cat{
    String name;

    void running(){
        System.out.println("Running");
    }

    void name(){
        System.out.println("Speaking");
    }

}