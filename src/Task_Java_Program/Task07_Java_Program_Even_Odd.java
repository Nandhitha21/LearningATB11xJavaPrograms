package Task_Java_Program;

import java.util.Scanner;

public class Task07_Java_Program_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number :");

        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println("The number "+ number + "is even");
        }
        else{
            System.out.println("The number "+ number +"is Odd");
        }

    }
}
