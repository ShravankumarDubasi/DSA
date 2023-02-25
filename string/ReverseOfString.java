package string;

public class ReverseOfString {
    public static void main(String args[]){
        String a=" my name is sravan  ";
        int i=a.length()-1;
        String ans="";

        while( i>=0){
            while(i>=0&&a.charAt(i)==' ')i--;
            int j=i;
            while(i<0) break;
            while(i>=0&&a.charAt(i)!=' ')i--;
            if(ans.isEmpty()){
                ans=ans.concat(a.substring(i+1,j+1));
            }
            else
            {
                ans=ans.concat(" "+a.substring(i+1,j+1));

            }

        }
        System.out.println(ans);
    }
}
