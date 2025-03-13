package ex_05_TypeCasting;

public class Lab44_Typecasting_Narrowing {
    public static void main(String[] args) {
        int val  =200;
        //byte b1 = val ; // invalid narrowing - > implicit

        byte b1 = (byte) val; // explicit narrowing is valid
        //Data loss will occur

        System.out.println(b1);
    }
}
