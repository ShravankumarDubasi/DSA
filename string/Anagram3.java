package string;

public class Anagram3 {
    public static void main(String args[]){
        String a="aac";
        String b="caa";
        //boolean visited[]=new boolean[n1];
        boolean isAnagram=false;
        int[] al=new int[256];
        //int[] bl=new int[256];
        for(char item:a.toCharArray()){
            int index=(int) item;
            al[index]++;
        }
        for(char item:b.toCharArray()){
            int index=(int) item;
            al[index]--;
        }
        for(int i=0;i<256;i++){
            if(al[i]!=0){
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
