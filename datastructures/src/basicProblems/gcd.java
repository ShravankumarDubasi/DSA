package DSA;

public class gcd {
    public static void main(String args[]){
        System.out.println(gcd(15,10));
        System.out.println(pow(10,2));

    }
    static int gcd(int a,int b){
        if(a%b==0) return b;
        else
            return gcd(b,a%b);
    }

    static int pow(int a,int b){
        if(b==0){
            return 1;

        }
        return pow(a,b-1)*a;
    }
}
