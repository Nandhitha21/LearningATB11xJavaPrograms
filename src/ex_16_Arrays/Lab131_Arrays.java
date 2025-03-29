package ex_16_Arrays;

public class Lab131_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {91, 85, 67, 89, 77, 100, 69};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[3]);
       // System.out.println(marks[10]); // ArrayIndexOutOfBoundsException
    }
    // string is a function -> str.length() -> string is class
    // array is not function -> arr.length -> array is not a class
}
// arrays is a elements -> elements contains, int, strings, char, boolean
// string only has characters