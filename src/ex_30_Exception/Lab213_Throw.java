package ex_30_Exception;

public class Lab213_Throw {
    public static void main(String[] args) {

    }

    static void divideByZero(int a ){
        // check some
        if (a == 0)
        {
            throw new ArithmeticException();
        }
    }
}
