package Task_Java_Program.Task19_Encapsulation;

public class Qn2_ATB_Array {

    public static void main(String[] args) {
        ATB2[] students = new ATB2[3];

        students[0] = new ATB2("Nandhitha", 7, "Pramod");
        //System.out.println(students[0]);
        students[1] = new ATB2("Prem", 45, "Pramod");
        students[2] = new ATB2("Karthik", 55, "Pramod");

        for(ATB2 student : students){
            System.out.println(student);
        }
    }


}
class ATB2 {
    private String Studentname;
    private int studentcount;

    private String teacher_name;

    ATB2(String name1, int count1, String name2) {
        Studentname = name1;
        studentcount = count1;
        teacher_name = name2;
    }
    public String toString() {
        return "Student Name: " +Studentname +
                ", Student Count: " + studentcount +
                ", Teacher: " + teacher_name;
    }
}