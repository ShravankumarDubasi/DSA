package set;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args){
        int i=0;
        char[] name="sravankumar".toCharArray();
        char[] name1=new char[10];
        Set<Character> s=new HashSet<>();
        for(char item:name){
            s.add(item);
        }
        for(char item:s){
            name1[i]=item;
            i++;

        }
        System.out.println(name1);
    }
}
