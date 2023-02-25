package string;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String args[]){
        String a="aacc";
        String b="caca";
        //boolean visited[]=new boolean[n1];
         boolean isAnagram=false;
        int[] al=new int[256];
        int[] bl=new int[256];
        for(char item:a.toCharArray()){
                int index=(int) item;
                al[index]++;
            }
        for(char item:b.toCharArray()){
            int index=(int) item;
            bl[index]++;
        }
        for(int i=0;i<256;i++){
            if(al[i]!=bl[i]){
                isAnagram=false;
                break;
            }
            else{
                isAnagram=true;
            }
        }
        if(!isAnagram) {
            System.out.println("not aanagram");
        }
        else{
            System.out.println(" aanagram");
        }
    }
}
