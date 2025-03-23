package ex_10_for_loop;

public class Lab96_for_loop_Continue_EvenNumbers {
    public static void main(String[] args) {
        for(int i =0;i<=50;i++){
            if(i%2==0){
                System.out.println("Even->" +i);
            continue;
            }
            System.out.println("Odd->"+i);
        }
    }
}
