package ex_05_TypeCasting;

public class Lab45_TypeCasting_1 {
    public static void main(String[] args) {
        long name = 6756789009l;
        short name1 = (short) name; // explicit casting - narrowing

        System.out.println(name1);
    }
}
