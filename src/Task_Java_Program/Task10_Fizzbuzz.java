package Task_Java_Program;

import java.util.Scanner;

public class Task10_Fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scanner.nextInt();
        for(int i =1; i<=n; i++ ){
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("Fizzzbuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");

            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }
    }
}

