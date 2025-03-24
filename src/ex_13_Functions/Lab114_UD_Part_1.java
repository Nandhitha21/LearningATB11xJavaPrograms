package ex_13_Functions;

public class Lab114_UD_Part_1 {
    public static void main(String[] args) {
        //1.Without Parameters but without return type.
        //2, Without Parameters but with return type
        //3.With Parameters but without return type
        //4. Without Parameters but with return type

//1.Without Parameters but without return type
wp_wr_greet();
String msg = greet_with_hello();
        System.out.println(msg);
        greet_with_hello_wp_wr("Nandhitha",25 , 1000);
        greet_with_fullname("Nandhitha","Pari");
       int max = greet_with_hello_wp_wr(2 ,3,5);
        System.out.println(max);
}   static void wp_wr_greet(){
        System.out.println("Hi, How r u");}
    //, Without Parameters but with return type
static String greet_with_hello(){
    System.out.println("Hi");
    return "how r u";

    }
    //3.With Parameters but without return type
    static void greet_with_hello_wp_wr(String name , int age, int salary){
        System.out.println("Name :" + name + "\nAge:" +age +"\n Salary:" +salary);
    }
static void greet_with_fullname(String firstname , String secondname){
    System.out.println("Hi your name is" +firstname +secondname);}
//4. Without Parameters but with return type

    static int greet_with_hello_wp_wr(int a , int b, int c){
        return a+b+c;

    }

}