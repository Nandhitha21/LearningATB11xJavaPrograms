package ex_10_for_loop;

public class Lab95_For_loop_continue {
    public static void main(String[] args) {
        for(int i =0; i<50 ; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
