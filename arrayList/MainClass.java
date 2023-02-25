package arrayList;

import java.util.ArrayList;
import java.util.*;

public class MainClass {
    public static void main(String[] args){
        List<Integer> roll=new ArrayList<>();
        roll.add(20);
        roll.add(24);
        List<Integer> roll2=new ArrayList();
        roll2.add(24);


        roll.addAll(roll2);
        System.out.println(roll);

        roll.set(0,87);
        System.out.println(roll.get(0));
        roll.remove(0);
//        roll.clear();

//        roll.removeAll(roll2);
//        int d=roll.size();
//        System.out.println(roll.contains(20));
//        System.out.println(roll.isEmpty());
//        Object[] a =roll.toArray();
//        List<String> name=new ArrayList<>();
//        name.add("sravan");
//        String b[]=new String[name.size()];
//        name.toArray(b);
//        System.out.println(b[0]);
//
//        System.out.println(a[0]);






//        Pair<String,Integer> p1=new Pair("sravan",3);
//        p1.description();



    }
}
