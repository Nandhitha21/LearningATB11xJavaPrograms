package ex_27_Static;

public class Lab187_Static {
     // you cannot call instant variable in static method
     public static void main(String[] args) {
         B.commonToAll();
         System.out.println(B.b);


         B b_ref = new B();
         b_ref.display();
         System.out.println(b_ref.a);




     }

}


class B{
    static {
        System.out.println("SIB, called once, class is loaded");
    }
    int a = 10;
    static int b = 10;

    void display(){
        System.out.println(b);
        System.out.println("Non static F(n)");
    }
    static void commonToAll(){
//        System.out.println(a);  // you cannot call instant variable in static method
        System.out.println("Static F(n)");
    }

//    static class C{
//        // Not useful
//    }
}
