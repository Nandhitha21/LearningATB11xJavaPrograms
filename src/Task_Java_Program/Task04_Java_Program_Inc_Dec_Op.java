package Task_Java_Program;

public class Task04_Java_Program_Inc_Dec_Op {
    public static void main(String[] args) {
        int a=10;
        int b =20;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        System.out.println(--b+ b++ + b--);
        System.out.println(b);
        //19 19 19
    }
}

//++a => ExpA =11 -> a=11 // increment first
// a++ -> ExpB = 11 -> 11; now a =12// Print first
//a++ -> ExpC = 12 -> 12

// 11+11+12 = 34

// -- b => A -> ExpA = 19
//b++ => ExpB -> 19, now b = 20;
//--b => ExC -> 20 -> b = 19;

//19+19+20 = 58
