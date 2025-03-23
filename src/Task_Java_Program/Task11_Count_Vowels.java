package Task_Java_Program;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Task11_Count_Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels:" + vowels);
        System.out.println("Consonants:" + consonants);
    }

}
