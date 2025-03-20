package ex_09_Switch;

import java.sql.SQLOutput;

public class Lab72_Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No ASCII match");
        }
    }
}
