package ex_16_Arrays;

import java.util.Arrays;

public class Lab134_Array_Print {
    public static void main(String[] args) {
        int marks []= {99, 89, 67, 55, 100};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("---------");

        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("-------");
        Arrays.sort(marks);
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

    }
}
