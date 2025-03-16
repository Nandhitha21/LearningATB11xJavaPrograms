package ex_08_if_condition;

public class Lab65_If_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        if (age>18){
            System.out.println("You can go to Goa");
        }else{
            System.out.println("You can't go to Goa");
        }

    }
}
