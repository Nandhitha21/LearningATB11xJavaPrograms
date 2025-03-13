package ex_06_Ternary_Operator;

public class Lab49_Interview_question {
    public static void main(String[] args) {
        // Nested ternary
        //result = condition ? expression1 : (condition2? expresssion2 : expression3)
        int number =6;

        String result = (number>5)?(number>9 ? "B": "C"): "BB" ;

        System.out.println(result);

        }
}

