package Task_Java_Program;

public class Task04_Java_Program_Inc_Dec_Op {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        int b =20;
        System.out.println(--b + b++ + b--);
        System.out.println(b);
    }
}
// ++ a -> A-> EXP A = 11 -> a =11;
//a++ B -> Exp= 11 -> a=12;
//a++ -> ExpC =12, a =13;

// 11+11+12 = 34;

//--b -? ExpA -> ExpA = 19-> b =19;
//b++ -> B -> ExpB =19. b=20;
//b-- -> C -> ExpC = 20 -> b = 19

//19+19+20=58