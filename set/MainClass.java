package set;

import java.util.Collection;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.Set;

public class MainClass {
    public static void main(String[] args){
        Set<Integer> set=new HashSet<>();
        set.add(22);
        set.add(87);
        Set<Integer> set1=new HashSet<>();
        set1.add(26);
//        set1.add(87);
//        set.addAll(set1);
//        System.out.println(set);
//        set.retainAll(set1);
//        System.out.println(set);
        System.out.println(set.containsAll(set1));

    }
}
