package ex_16_Arrays;

public class Lab138_SUM_OF_Array {
    public static void main(String[] args) {
        int numbers[] ={23,45,56};
        int sum =0;

       for(int i =0; i<numbers.length;i++){
            sum = sum+numbers[i];
        }
        System.out.println(sum);
        for(int n: numbers){// enhanced for loop
            sum= sum+n;
        }
        System.out.println(sum);
    }
}
