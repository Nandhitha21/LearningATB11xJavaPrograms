package ex_32_Collection_Framework.Set;

import java.util.*;

public class Lab234_Set_PI {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("Dutta");
        System.out.println(hs);

    }
}
