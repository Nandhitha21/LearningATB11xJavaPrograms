package Task_Java_Program.Task19_Encapsulation;

import org.w3c.dom.ls.LSOutput;

import java.rmi.StubNotFoundException;
import java.sql.SQLOutput;

public class Qn_ATB_Getter_Setter {
    public static void main(String[] args) {

        ATB a2 = new ATB("Admin", 50, "Pramod");
        a2.setStudentname("Nandhitha",true );
        System.out.println(a2.getStudentname());
        a2.setStudentname("Prem", false);
        System.out.println(a2.getStudentname());
        System.out.println(a2.getTeacher_name());

        a2.setStudentcount(70,true);
        System.out.println(a2.getStudentcount());

        a2.setStudentcount(80, false);
        System.out.println(a2.getStudentcount());
    }

}

class ATB{
    private String Studentname;
    private int studentcount;

    private String teacher_name;

    ATB(String name1, int count1, String name2){
        Studentname = name1;
        studentcount = count1;
        teacher_name = name2;
    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname, boolean isAdmin) {
        if(isAdmin){
            this.Studentname = studentname;
        }else{
            System.out.println("Wrong Student name");
        }

    }

    public int getStudentcount() {
        return studentcount;
    }

    public boolean setStudentcount(int studentcount, boolean isCount) {
       if (isCount){
           this.studentcount = studentcount;
           return true;
       }else{
           System.out.println("The count is incorrect");
           return false;
       }

    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }



}