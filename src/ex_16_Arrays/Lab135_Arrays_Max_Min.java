package ex_16_Arrays;

public class Lab135_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] array ={25,56,34,43,56,77,88,65,14};
        // can we take input from user // yes
        // max and min
        int max_output = give_me_max(array);
        int min_output = give_me_min(array);
        System.out.println(max_output);
        System.out.println(min_output);

    }
    private static int give_me_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
        private static int give_me_min(int[] array){
            int min = array[0];
            for(int i=0; i<array.length; i++){
                if(array[i]< min){
                    min = array[i];
                }

            }
            return min;

    }

}
