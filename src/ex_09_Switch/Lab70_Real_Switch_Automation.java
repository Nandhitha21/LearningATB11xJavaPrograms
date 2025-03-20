package ex_09_Switch;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Lab70_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String browser = scanner.next();
        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("-------");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge":
                System.out.println("Execute the edge browser");
                break;
            default:
                System.out.println("I have no idea what browser is this");
        }
    }
}
