package ex_27_Static;

public class Lab189_Static_WebAutomatiom {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(Automation.driver);

        Automation t2 = new Automation();
        Automation t3 = new Automation();

        System.out.println(t2.driver);
        System.out.println(t3.driver);



    }


}

class Automation{
    static String driver = "Chrome";
}
