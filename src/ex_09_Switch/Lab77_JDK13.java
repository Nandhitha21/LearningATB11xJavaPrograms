package ex_09_Switch;

public class Lab77_JDK13 {
    public static void main(String[] args) {
        int itemCode =003;

        switch (itemCode){
            case 001, 002, 003 :
                System.out.println("All of the items are electronic gadget");
                break;
            case 004, 005 , 006 :
                System.out.println("This i Mech");
            default:
                System.out.println("None");

        }
    }
}
