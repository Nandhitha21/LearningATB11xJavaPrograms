package Task_Java_Program;

public class Task06_Java_Program_TO {
    public static void main(String[] args) {
        String num_1 = args[0];
        String num_2 = args[1];

        int num_3 = Integer.parseInt(num_1);
        int num_4 = Integer.parseInt(num_2);

        String max = (num_3 > num_4) ? "num_3 is greater" : "num_4 is greater" ;
        System.out.println(max);

    }
}


