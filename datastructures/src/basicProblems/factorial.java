package DSA;

import java.util.Scanner;

public class factorial {
    // tariling zeroes of a factorial number
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        long sum=1;
        for(int i=n;i>0;i--){
            sum=sum*i;
        }
        System.out.println(sum);
        int a=0;
        for(int i=5;i<=n;i=i*5){
            a+=n/i;
        }
        System.out.println(a);

    }
}
