package ex_30_Exception;

public class Lab202_Try_catch_Multiple {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("ARE YOU FOOL");
        }
        catch (Exception e){
            System.out.println("ARE YOU FOOL");
        }
        System.out.println("2");




    }
}
