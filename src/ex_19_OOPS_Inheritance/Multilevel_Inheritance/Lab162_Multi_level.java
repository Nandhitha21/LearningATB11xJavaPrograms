package ex_19_OOPS_Inheritance.Multilevel_Inheritance;

public class Lab162_Multi_level {
    public static void main(String[] args) {


//        Son s1 = new GrandFather();
//        Son s1 = new Father();
        Son amit = new Son();

        GrandFather g1 = new Son(); // Dynamic Dispatch
        g1.gf();
        g1.home();



        GrandFather g2 = new Father();
        g2.home();


        Father f2 = new Son();
        f2.home();
        // Father f3 = new GrandFather();

        // WebDriver driver = new ChromeDriver();






    }
}
