package ex_11_While_loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab104_while_IQ {
    public static void main(String[] args) {
        // factorial program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial Program\n Enter the no whose factorial");
        int number = scanner.nextInt();

        int factorial =1;
        if(number<=0){
            System.out.println(factorial);

        }else{
            for(int i=1; i<=number; i++){
                factorial=factorial*i;
            }
            System.out.println("Factorial is ->" +factorial);
        }
    }
}
