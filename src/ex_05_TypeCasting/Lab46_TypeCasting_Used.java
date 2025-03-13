package ex_05_TypeCasting;

public class Lab46_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST =18.45f;

       // int total = course+GST; // narrow -implicit // invalid

        int total = course+(int)GST;// explicit - narrowing

        System.out.println(total);

        float total2 = course+GST; // widening
        System.out.println(total2);

    }
}
