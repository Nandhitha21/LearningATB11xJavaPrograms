package ex_32_Collection_Framework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab240_Dequeue {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(15);
        deck.push(10);
        System.out.println(deck);

    }
}
