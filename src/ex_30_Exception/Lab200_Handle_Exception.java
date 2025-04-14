package ex_30_Exception;

public class Lab200_Handle_Exception {
    public static void main(String[] args) {
        int a =0;
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}
