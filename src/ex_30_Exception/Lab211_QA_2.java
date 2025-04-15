package ex_30_Exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Lab211_QA_2 {

    public static void main(String[] args) {
        System.out.println("Starting");

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");

    }

}
