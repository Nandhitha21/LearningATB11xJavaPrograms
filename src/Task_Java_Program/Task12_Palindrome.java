package Task_Java_Program;

import java.util.Scanner;

public class Task12_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();

        String rev ="";

        for(int i =str.length()-1; i>=0;i--){
            rev += str.charAt(i);
        }if (str.equals(rev)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }

}
