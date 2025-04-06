package Task_Java_Program.Task19_Encapsulation.Question4;

public class Method_Overloading {
    void greet() {
        System.out.println("Hello!");
    }

    // Method 2: One String parameter
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method 3: One String + one int parameter
    void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
      Method_Overloading obj = new Method_Overloading();
        obj.greet();                    // Calls Method 1
        obj.greet("Nandhitha");         // Calls Method 2
        obj.greet("Prem", 25);          // Calls Method 3
    }
}
