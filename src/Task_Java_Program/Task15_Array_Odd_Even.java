package Task_Java_Program;

public class Task15_Array_Odd_Even {
    public static void main(String[] args) {
        int[] array = {67, 22, 78, 33, 11};

        for(int i =0; i<array.length; i++){
            if(array [i] %2 ==0){
                System.out.println("The even number " + array[i]);
            }else {
                System.out.println("The Odd Number " + array[i]);
            }
        }
    }
}
