package ex_15_String_stringBuffer_Builder_Functions;

public class Lab126_SB {
    public static void main(String[] args) {
        StringBuffer stringbuffer = new StringBuffer("Nandhitha");
        stringbuffer.append(" Pari");
        System.out.println(stringbuffer);// string buffer mutable
        System.out.println(stringbuffer.reverse());


        String s1 ="Hello";
        String s2 = "World";
        String s3 = s1+s2;
        System.out.println(s3);
        System.out.println(s1);
    }
}
