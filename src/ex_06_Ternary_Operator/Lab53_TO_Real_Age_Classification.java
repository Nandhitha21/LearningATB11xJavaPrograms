package ex_06_Ternary_Operator;

public class Lab53_TO_Real_Age_Classification {
    public static void main(String[] args) {
        //int age = 23;
        //take an input from user

        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);

        String result = (age<18)? "Minor" :((age<65)? "Adult" : "Senior");

        System.out.println(result);
    }
}
