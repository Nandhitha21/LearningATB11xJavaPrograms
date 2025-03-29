package ex_15_String_stringBuffer_Builder_Functions;

public class Lab125_StringBuffer_Buffer {
    public static void main(String[] args) {
        String s0 = "Nandhitha";
        String s1 = new String("Nandhitha");

        StringBuffer stringbuffer = new StringBuffer("Nandhitha");
        StringBuilder stringbuilder = new StringBuilder("Nandhitha");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringbuffer);
        System.out.println(stringbuilder);
    }
}
