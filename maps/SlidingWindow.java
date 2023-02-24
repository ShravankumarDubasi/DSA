package maps;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {
    public static void main(String[] args){
        Map<Integer,Integer> map=new HashMap<>();
        int[] ar={1,2,2,1,3,1,1,3};
        int n=ar.length;
        int k=4;
        for(int i=0;i<k;i++){
            map.put(ar[i],map.getOrDefault(ar[i],0)+1);
        }

        System.out.println(map.size());
        for(int i=k;i<n;i++){
            if(map.get(ar[i-k])==1){
                map.remove(ar[i-k]);

            }
            else{
                map.put(ar[i-k],map.get(ar[i-k])-1);
            }
            map.put(ar[i],map.getOrDefault(ar[i],0)+1);
            System.out.println(map.size());
        }

    }
}
