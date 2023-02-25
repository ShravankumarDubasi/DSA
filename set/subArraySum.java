package set;

import java.util.*;

public class subArraySum {
    public static void main(String[] args){
        int[] a={5,6,7,8,9};
        int target=6;
        String name="karthik";
        boolean found=false;
        Map<Integer,Integer> set=new HashMap<>() ;
        int xor=0;
        int count=0;
        int c=0;
        for (int i=0;i<a.length;i++) {
            xor = xor ^ a[i];
            if(xor==target){
                count++; 
            }
           if (set.get(xor ^ target)!=null) {
               count = count +  set.get(xor ^ target);

            }
            else if (!set.containsKey(xor)) {
                set.put(xor, 1);
            }

            else if (set.containsKey(xor)) {
                c = set.get(xor);
                c++;
            }
        }
        System.out.println(count+1);


    }
}
