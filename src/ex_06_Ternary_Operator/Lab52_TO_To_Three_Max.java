package ex_06_Ternary_Operator;

public class Lab52_TO_To_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        //Logic Building formula

        // Step 1 : Find inputs/Outputs
        //n1, n2, n3 -> int
        //O/P String -> max number

        // Step 2 - Rough logic , think about it
        //n1>n2, n1>n3n-> n1
        // n2 >n3 , n1> n1 -> n2


        int max = (n1>n2)?(n1>n3) ? n1 : n3 : ((n2>n3) ? n2:n3);

        System.out.println("Max is" + max);


    }
}
