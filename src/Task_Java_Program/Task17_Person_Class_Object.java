package Task_Java_Program;

public class Task17_Person_Class_Object {
    public static void main(String[] args) {
        person p1 = new person();
        p1.eat();
        p1.is_married();
        p1.Person_details(33 , 55.5);
        p1.Person1_details("Nandhitha");

    }
}
 class person{
     String name;
     byte age;
     long mobile_num;
     boolean is_married;
     String gender;
     String address;
     String colour_eyes;
     float height;
     double weight;
     double salary;

     void eat(){
         System.out.println("Person is eating");
     }
     boolean is_married(){
         is_married=true;
         System.out.println("The person is married " +is_married);
         return is_married;
     }

     void Person_details(int age, double weight){
         System.out.println("The person age is" +age+ "\nThe Person weight is " +weight);
     }
  String Person1_details(String name){
      System.out.println("The Person name is" +name);
      return name;
  }
 }