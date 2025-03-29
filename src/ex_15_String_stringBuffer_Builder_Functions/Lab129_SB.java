package ex_15_String_stringBuffer_Builder_Functions;

public class Lab129_SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.delete(5, 16);
        sb.replace(0,4, "C++");
        System.out.println(sb);
    }
}
