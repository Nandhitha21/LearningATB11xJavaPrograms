package Task_Java_Program;

public class Task14_Array_max_2 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 60};

        int largest = arr[0];
        int secondLargest = arr[0];

        // Find largest element first
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find second largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
    }
