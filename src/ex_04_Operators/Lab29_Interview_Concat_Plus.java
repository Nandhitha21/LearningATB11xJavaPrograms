package ex_04_Operators;

public class Lab29_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Nandhitha";
        String second_name = "Pari";

        int a= 10;
        int b =20;

        System.out.println(first_name+second_name+a+b); // firts two operator is string it will treat all of them are sytring
        System.out.println(a+b+first_name+second_name);
        System.out.println(first_name+second_name+(a+b));
    }
}
