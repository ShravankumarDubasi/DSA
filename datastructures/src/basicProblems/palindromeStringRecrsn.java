package DSA;

public class palindromeStringRecrsn {
    public static void main(String args[]){

    }
    static boolean palindromeStr(String s,int l,int r){
        if(l>=r){
            return true;
        }
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return palindromeStr(s,l+1,r-1);
    }
}
