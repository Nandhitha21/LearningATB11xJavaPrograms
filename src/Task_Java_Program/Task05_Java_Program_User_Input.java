package Task_Java_Program;

public class Task05_Java_Program_User_Input {
    public static void main(String[] args) {
        String age_1 = args[0];
        String name_1= args[1];
        String salary_1= args[2];

        int age_2 = Integer.parseInt(age_1);
        System.out.println(age_2);
        System.out.println(name_1);
        System.out.println(salary_1);
    }
}
