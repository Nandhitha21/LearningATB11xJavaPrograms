package ex_30_Exception;

public class Lab199_String_NullPointer {
    public static void main(String[] args) {
        String name= null;
        name.trim(); // java.lang.NullPointerException
    }
}
