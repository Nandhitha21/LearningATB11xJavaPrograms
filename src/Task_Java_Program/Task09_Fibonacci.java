package Task_Java_Program;

import java.util.Scanner;

public class Task09_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
         int first = 0; int second =1;

         for(int i =1; i<=number; i++){
             int next = first+second;
             System.out.println(" " +next);
             first = second;
             second= next;
         }
         scanner.close();
    }

}
