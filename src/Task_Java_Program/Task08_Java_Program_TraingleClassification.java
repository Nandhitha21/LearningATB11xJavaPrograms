package Task_Java_Program;

import java.util.Scanner;

public class Task08_Java_Program_TraingleClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of 1");

        int side1 = sc.nextInt();
        System.out.println("Enter the side length of 2");
        int side2 = sc.nextInt();
        System.out.println("Enter the side lenght of 3");
        int side3 = sc.nextInt();

        if
            (side1 == side2 && side2==side3){
                System.out.println("The triangle is equilateral");
        }else if (side1==side2 || side1==side3 || side2==side3){
            System.out.println("The traingle is isoscels");
        }else{
            System.out.println("The traingle is scalene");
        }

    }
}
