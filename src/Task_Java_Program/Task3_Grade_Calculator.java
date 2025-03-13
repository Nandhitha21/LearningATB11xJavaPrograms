package Task_Java_Program;

public class Task3_Grade_Calculator {
    public static void main(String[] args) {
       /* Write a program that calculates and displays the letter grade for a given numerical score
        (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59
                */
            /*
    **Logic Building | Coding Interview Crack**
    1. Step 1 ->. Find the inputs and outputs - data types and what is exactly the output interviewer looking.
    2. Step 2 - Rough logic , brute force - > explain it side by side.
    3. Step 3 - Write the logic and present the solution (Dry Run)
    4. Step 4 - Optimize and discussion.
    5. Step 5 - Edge Cases and extra discussion*/

        int Grade = 65;

        String result = (Grade<60) ? "F" : ((Grade<70) ? "D" :((Grade<80) ? "C" : ((Grade<90)? "B" : "A")));
        System.out.println(result);

        String result1 = (Grade>89) ? "A" :((Grade>79)?"B": ((Grade>69)?"C":((Grade>59)?"D":"F")));
        System.out.println(result1);



    }
}
